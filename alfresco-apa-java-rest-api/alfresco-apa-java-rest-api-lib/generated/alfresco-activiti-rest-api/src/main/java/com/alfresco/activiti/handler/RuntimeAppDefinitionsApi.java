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

import com.alfresco.activiti.model.AppDefinitionRepresentation;
import com.alfresco.activiti.model.ResultListDataRepresentationAppDefinitionRepresentation;
import com.alfresco.activiti.model.RuntimeAppDefinitionSaveRepresentation;

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

@Api(value = "RuntimeAppDefinitions", description = "the RuntimeAppDefinitions API")
public interface RuntimeAppDefinitionsApi {

    @ApiOperation(value = "Deploy a published app", nickname = "deployAppDefinitionsUsingPOST", notes = "Deploying an app allows the user to see it on his/her landing page. Apps must be published before they can be deployed.", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "runtime-app-definitions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @RequestMapping(value = "/activiti-app/api/enterprise/runtime-app-definitions",
        consumes = "application/json",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> deployAppDefinitionsUsingPOST(@ApiParam(value = "" ) @Valid @RequestBody RuntimeAppDefinitionSaveRepresentation body);


    @ApiOperation(value = "Get a runtime app", nickname = "getAppDefinitionUsingGET1", notes = "", response = AppDefinitionRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "runtime-app-definitions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AppDefinitionRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/runtime-app-definitions/{appDefinitionId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<AppDefinitionRepresentation> getAppDefinitionUsingGET1(@ApiParam(value = "appDefinitionId", required=true) @PathVariable("appDefinitionId") Long appDefinitionId);


    @ApiOperation(value = "List runtime apps", nickname = "getAppDefinitionsUsingGET", notes = "When a user logs in into Alfresco Process Services Suite, a landing page is displayed containing all the apps that the user is allowed to see and use. These are referred to as runtime apps.", response = ResultListDataRepresentationAppDefinitionRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "runtime-app-definitions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultListDataRepresentationAppDefinitionRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/runtime-app-definitions",
        produces = "application/json", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ResultListDataRepresentationAppDefinitionRepresentation> getAppDefinitionsUsingGET();

}
