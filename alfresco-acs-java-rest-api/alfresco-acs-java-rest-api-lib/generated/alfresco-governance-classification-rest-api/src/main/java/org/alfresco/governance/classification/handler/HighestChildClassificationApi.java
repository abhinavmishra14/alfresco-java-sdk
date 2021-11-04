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
/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.10).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.alfresco.governance.classification.handler;

import org.alfresco.governance.classification.model.ClassificationLevelEntry;
import org.alfresco.governance.classification.model.Error;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.cloud.openfeign.CollectionFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Api(value = "HighestChildClassification")
public interface HighestChildClassificationApi {

    @ApiOperation(value = "Get highest classification item in the category or folder", nickname = "showHighestChildClassification", notes = "Gets the classification level of the highest classified child for **containerNodeId**.", response = ClassificationLevelEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "highest-child-classification", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = ClassificationLevelEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **containerNodeId** is not in valid format "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to read **containerNodeId**"),
        @ApiResponse(code = 404, message = "**containerNodeId** does not exist"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/highest-child-classification/{containerNodeId}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ClassificationLevelEntry> showHighestChildClassification(@ApiParam(value = "The identifier of a container. You can use the following aliases: **-filePlan-**, **-unfiled-** ",required=true) @PathVariable("containerNodeId") String containerNodeId);

}
