/*
 * Copyright 2021-2021 Alfresco Software, Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.alfresco.event.sdk.model;

import java.net.URI;
import java.time.ZonedDateTime;

/**
 * Event's attributes conforming to
 * <a href="https://github.com/cloudevents/spec/blob/v1.0/spec.md">CloudEvents</a> <i>v1.0</i> specification.
 *
 * @author Jamal Kaabi-Mofrad
 */
public interface EventAttributes {

    /**
     * @return The ID of the event, generated by the producer.
     */
    String getId();

    /**
     * @return The type of an event which has happened.
     */
    String getType();

    /**
     * @return The context in which an event happened. E.g. The instance of a DBP component that produced the event.
     */
    URI getSource();

    /**
     * @return The schema that {@code data} adheres to.
     */
    URI getDataschema();

    /**
     * @return The CloudEvents specification version
     */
    String getSpecversion();

    /**
     * @return The timestamp of when the occurrence happened.
     */
    ZonedDateTime getTime();

    /**
     * @return The content type of the data attribute adhering to the <a href="https://tools.ietf.org/html/rfc2046">RFC2046</a>
     */
    String getDatacontenttype();
}