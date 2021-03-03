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
package org.alfresco.governance.classification.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import org.alfresco.governance.classification.model.ClassificationGuidesBody;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The classification guide which the topic is contained in. This field is only returned when requested.
 */
@ApiModel(description = "The classification guide which the topic is contained in. This field is only returned when requested.")
@Validated

public class ClassificationGuidesInTopic   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("originatingOrganization")
  private String originatingOrganization = null;

  @JsonProperty("publishedOn")
  private LocalDate publishedOn = null;

  @JsonProperty("enabled")
  private Boolean enabled = false;

  @JsonProperty("hasTopics")
  private Boolean hasTopics = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("createdAt")
  private OffsetDateTime createdAt = null;

  public ClassificationGuidesInTopic name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClassificationGuidesInTopic originatingOrganization(String originatingOrganization) {
    this.originatingOrganization = originatingOrganization;
    return this;
  }

  /**
   * Get originatingOrganization
   * @return originatingOrganization
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getOriginatingOrganization() {
    return originatingOrganization;
  }

  public void setOriginatingOrganization(String originatingOrganization) {
    this.originatingOrganization = originatingOrganization;
  }

  public ClassificationGuidesInTopic publishedOn(LocalDate publishedOn) {
    this.publishedOn = publishedOn;
    return this;
  }

  /**
   * Get publishedOn
   * @return publishedOn
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public LocalDate getPublishedOn() {
    return publishedOn;
  }

  public void setPublishedOn(LocalDate publishedOn) {
    this.publishedOn = publishedOn;
  }

  public ClassificationGuidesInTopic enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Get enabled
   * @return enabled
  **/
  @ApiModelProperty(value = "")


  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public ClassificationGuidesInTopic hasTopics(Boolean hasTopics) {
    this.hasTopics = hasTopics;
    return this;
  }

  /**
   * Get hasTopics
   * @return hasTopics
  **/
  @ApiModelProperty(value = "")


  public Boolean isHasTopics() {
    return hasTopics;
  }

  public void setHasTopics(Boolean hasTopics) {
    this.hasTopics = hasTopics;
  }

  public ClassificationGuidesInTopic id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ClassificationGuidesInTopic createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassificationGuidesInTopic classificationGuidesInTopic = (ClassificationGuidesInTopic) o;
    return Objects.equals(this.name, classificationGuidesInTopic.name) &&
        Objects.equals(this.originatingOrganization, classificationGuidesInTopic.originatingOrganization) &&
        Objects.equals(this.publishedOn, classificationGuidesInTopic.publishedOn) &&
        Objects.equals(this.enabled, classificationGuidesInTopic.enabled) &&
        Objects.equals(this.hasTopics, classificationGuidesInTopic.hasTopics) &&
        Objects.equals(this.id, classificationGuidesInTopic.id) &&
        Objects.equals(this.createdAt, classificationGuidesInTopic.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, originatingOrganization, publishedOn, enabled, hasTopics, id, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassificationGuidesInTopic {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    originatingOrganization: ").append(toIndentedString(originatingOrganization)).append("\n");
    sb.append("    publishedOn: ").append(toIndentedString(publishedOn)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    hasTopics: ").append(toIndentedString(hasTopics)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
