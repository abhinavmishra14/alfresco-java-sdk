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
 * NOTE: This class is auto generated by the swagger code generator program (3.0.29).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.alfresco.activiti.handler;

import com.alfresco.activiti.model.ModelRepresentation;
import com.alfresco.activiti.model.ResultListDataRepresentationModelRepresentation;

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
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.cloud.openfeign.CollectionFormat;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@Api(value = "ModelsHistory", description = "the ModelsHistory API")
public interface ModelsHistoryApi {

    @ApiOperation(value = "List a model's historic versions", nickname = "getModelHistoryCollectionUsingGET", notes = "", response = ResultListDataRepresentationModelRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "models-history", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultListDataRepresentationModelRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/models/{modelId}/history",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ResultListDataRepresentationModelRepresentation> getModelHistoryCollectionUsingGET(@ApiParam(value = "modelId", required=true) @PathVariable("modelId") Long modelId, @ApiParam(value = "includeLatestVersion") @Valid @RequestParam(value = "includeLatestVersion", required = false) Boolean includeLatestVersion);


    @ApiOperation(value = "Get a historic version of a model", nickname = "getProcessModelHistoryUsingGET", notes = "", response = ModelRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "models-history", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ModelRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/models/{modelId}/history/{modelHistoryId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ModelRepresentation> getProcessModelHistoryUsingGET(@ApiParam(value = "modelId", required=true) @PathVariable("modelId") Long modelId, @ApiParam(value = "modelHistoryId", required=true) @PathVariable("modelHistoryId") Long modelHistoryId);

}
