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
package org.alfresco.activiti.handler;

import org.alfresco.activiti.model.SSOUserAccountCredentialsRepresentation;

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

@Api(value = "IntegrationSso", description = "the IntegrationSso API")
public interface IntegrationSsoApi {

    @ApiOperation(value = "SSO Authorization", nickname = "confirmAuthorisationUsingGET2", notes = "Returns SSO OAuth HTML Page", tags={ "integration-sso", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 400, message = "Error while calling SSO"),
        @ApiResponse(code = 403, message = "SSO module is not enabled"),
        @ApiResponse(code = 409, message = "No credentials stored to access sso or credentials are invalid or expired") })
    @RequestMapping(value = "/activiti-app/api/enterprise/integration/sso/confirm-auth-request",
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> confirmAuthorisationUsingGET2(@NotNull @ApiParam(value = "serviceId", required = true) @Valid @RequestParam(value = "serviceId", required = true) String serviceId, @NotNull @ApiParam(value = "session_state", required = true) @Valid @RequestParam(value = "session_state", required = true) String sessionState, @NotNull @ApiParam(value = "code", required = true) @Valid @RequestParam(value = "code", required = true) String code);


    @ApiOperation(value = "Delete account information", nickname = "deleteRepositoryAccountUsingDELETE1", notes = "", tags={ "integration-sso", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK"),
        @ApiResponse(code = 403, message = "SSO module is not enabled"),
        @ApiResponse(code = 404, message = "No SSO account exists") })
    @RequestMapping(value = "/activiti-app/api/enterprise/integration/sso/{repositoryId}/account",
        method = RequestMethod.DELETE)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> deleteRepositoryAccountUsingDELETE1(@ApiParam(value = "repositoryId", required=true) @PathVariable("repositoryId") Long repositoryId);


    @ApiOperation(value = "Get account information", nickname = "getRepositoryAccountUsingGET1", notes = "", tags={ "integration-sso", })
    @ApiResponses(value = { 
        @ApiResponse(code = 401, message = "User does not have sufficient permission or an error occurred", response = SSOUserAccountCredentialsRepresentation.class),
        @ApiResponse(code = 403, message = "SSO module is not enabled") })
    @RequestMapping(value = "/activiti-app/api/enterprise/integration/sso/{repositoryId}/account",
        produces = "*/*", 
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> getRepositoryAccountUsingGET1(@ApiParam(value = "repositoryId", required=true) @PathVariable("repositoryId") Long repositoryId);

}
