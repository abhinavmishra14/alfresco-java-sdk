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

import com.alfresco.activiti.model.AppDeploymentRepresentation;
import com.alfresco.activiti.model.ResultListDataRepresentationAppDeploymentRepresentation;

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

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;

@Api(value = "RuntimeAppDeployments", description = "the RuntimeAppDeployments API")
public interface RuntimeAppDeploymentsApi {

    @ApiOperation(value = "Remove an app deployment", nickname = "deleteAppDeploymentUsingDELETE", notes = "", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "runtime-app-deployments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @RequestMapping(value = "/activiti-app/api/enterprise/runtime-app-deployments/{appDeploymentId}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteAppDeploymentUsingDELETE(@ApiParam(value = "appDeploymentId", required=true) @PathVariable("appDeploymentId") Long appDeploymentId);


    @ApiOperation(value = "Export the app archive for a deployment", nickname = "exportAppDefinitionUsingGET1", notes = "", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "runtime-app-deployments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK") })
    @RequestMapping(value = "/activiti-app/api/enterprise/export-app-deployment/{deploymentId}",
        method = RequestMethod.GET)
    ResponseEntity<Void> exportAppDefinitionUsingGET1(@ApiParam(value = "deploymentId", required=true) @PathVariable("deploymentId") String deploymentId);


    @ApiOperation(value = "Query app deployments", nickname = "getAppDefinitionsUsingGET1", notes = "", response = ResultListDataRepresentationAppDeploymentRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "runtime-app-deployments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultListDataRepresentationAppDeploymentRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/runtime-app-deployments",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<ResultListDataRepresentationAppDeploymentRepresentation> getAppDefinitionsUsingGET1(@ApiParam(value = "nameLike") @Valid @RequestParam(value = "nameLike", required = false) String nameLike, @ApiParam(value = "tenantId") @Valid @RequestParam(value = "tenantId", required = false) Long tenantId, @ApiParam(value = "latest") @Valid @RequestParam(value = "latest", required = false) Boolean latest, @ApiParam(value = "start") @Valid @RequestParam(value = "start", required = false) Integer start, @ApiParam(value = "sort") @Valid @RequestParam(value = "sort", required = false) String sort, @ApiParam(value = "order") @Valid @RequestParam(value = "order", required = false) String order, @ApiParam(value = "size") @Valid @RequestParam(value = "size", required = false) Integer size);


    @ApiOperation(value = "Get an app deployment", nickname = "getAppDeploymentUsingGET", notes = "", response = AppDeploymentRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "runtime-app-deployments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AppDeploymentRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/runtime-app-deployments/{appDeploymentId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<AppDeploymentRepresentation> getAppDeploymentUsingGET(@ApiParam(value = "appDeploymentId", required=true) @PathVariable("appDeploymentId") Long appDeploymentId);


    @ApiOperation(value = "Get an app by deployment ID or DMN deployment ID", nickname = "getRuntimeAppDeploymentByDeploymentUsingGET", notes = "Either a deploymentId or a dmnDeploymentId must be provided", response = AppDeploymentRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "runtime-app-deployments", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = AppDeploymentRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/runtime-app-deployment",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<AppDeploymentRepresentation> getRuntimeAppDeploymentByDeploymentUsingGET(@ApiParam(value = "deploymentId") @Valid @RequestParam(value = "deploymentId", required = false) String deploymentId, @ApiParam(value = "dmnDeploymentId") @Valid @RequestParam(value = "dmnDeploymentId", required = false) Long dmnDeploymentId);

}
