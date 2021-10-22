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

import com.alfresco.activiti.model.FormDefinitionRepresentation;
import com.alfresco.activiti.model.FormRepresentation;
import com.alfresco.activiti.model.FormRepresentationRes;
import com.alfresco.activiti.model.FormSaveRepresentation;
import com.alfresco.activiti.model.ResultListDataRepresentationFormRepresentation;
import com.alfresco.activiti.model.ResultListDataRepresentationRuntimeFormRepresentation;
import com.alfresco.activiti.model.RuntimeFormRepresentation;
import com.alfresco.activiti.model.ValidationErrorRepresentation;

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

@Api(value = "FormModels", description = "the FormModels API")
public interface FormModelsApi {

    @ApiOperation(value = "Get form content", nickname = "getFormEditorJsonUsingGET", notes = "", response = FormDefinitionRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "form-models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FormDefinitionRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/forms/{formId}/editorJson",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<FormDefinitionRepresentation> getFormEditorJsonUsingGET(@ApiParam(value = "formId", required=true) @PathVariable("formId") Long formId);


    @ApiOperation(value = "Get form history", nickname = "getFormHistoryUsingGET", notes = "", response = FormRepresentationRes.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "form-models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FormRepresentationRes.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/editor/form-models/{formId}/history/{formHistoryId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<FormRepresentationRes> getFormHistoryUsingGET(@ApiParam(value = "formId", required=true) @PathVariable("formId") Long formId, @ApiParam(value = "formHistoryId", required=true) @PathVariable("formHistoryId") Long formHistoryId);


    @ApiOperation(value = "Get a form model", nickname = "getFormUsingGET", notes = "", response = FormRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "form-models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FormRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/editor/form-models/{formId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<FormRepresentation> getFormUsingGET(@ApiParam(value = "formId", required=true) @PathVariable("formId") Long formId);


    @ApiOperation(value = "Get a form", nickname = "getFormUsingGET1", notes = "", response = RuntimeFormRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "form-models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = RuntimeFormRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/forms/{formId}",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<RuntimeFormRepresentation> getFormUsingGET1(@ApiParam(value = "formId", required=true) @PathVariable("formId") Long formId);


    @ApiOperation(value = "Get forms", nickname = "getFormsUsingGET", notes = "", response = FormRepresentationRes.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "form-models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FormRepresentationRes.class, responseContainer = "List") })
    @RequestMapping(value = "/activiti-app/api/enterprise/editor/form-models/values",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<List<FormRepresentationRes>> getFormsUsingGET(@NotNull @ApiParam(value = "formId", required = true) @Valid @RequestParam(value = "formId", required = true) String formId);


    @ApiOperation(value = "List form models", nickname = "getFormsUsingGET1", notes = "", response = ResultListDataRepresentationFormRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "form-models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultListDataRepresentationFormRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/editor/form-models",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<ResultListDataRepresentationFormRepresentation> getFormsUsingGET1();


    @ApiOperation(value = "Query forms", nickname = "getFormsUsingGET2", notes = "", response = ResultListDataRepresentationRuntimeFormRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "form-models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultListDataRepresentationRuntimeFormRepresentation.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/forms",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<ResultListDataRepresentationRuntimeFormRepresentation> getFormsUsingGET2(@ApiParam(value = "nameLike") @Valid @RequestParam(value = "nameLike", required = false) String nameLike, @ApiParam(value = "appId") @Valid @RequestParam(value = "appId", required = false) Long appId, @ApiParam(value = "tenantId") @Valid @RequestParam(value = "tenantId", required = false) Long tenantId, @ApiParam(value = "start") @Valid @RequestParam(value = "start", required = false) Integer start, @ApiParam(value = "sort") @Valid @RequestParam(value = "sort", required = false) String sort, @ApiParam(value = "order") @Valid @RequestParam(value = "order", required = false) String order, @ApiParam(value = "size") @Valid @RequestParam(value = "size", required = false) Integer size);


    @ApiOperation(value = "Update form model content", nickname = "saveFormUsingPUT", notes = "", response = FormRepresentationRes.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "form-models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FormRepresentationRes.class) })
    @RequestMapping(value = "/activiti-app/api/enterprise/editor/form-models/{formId}",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<FormRepresentationRes> saveFormUsingPUT(@ApiParam(value = "formId", required=true) @PathVariable("ID of the form to update") Long idOfTheFormToUpdate, @ApiParam(value = "" ) @Valid @RequestBody FormSaveRepresentation body);


    @ApiOperation(value = "Validate form model content", nickname = "validateModelUsingPUT1", notes = "The model content to be validated must be specified in the POST body", response = ValidationErrorRepresentation.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={ "form-models", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ValidationErrorRepresentation.class, responseContainer = "List") })
    @RequestMapping(value = "/activiti-app/api/enterprise/editor/form-models/{formId}/validate",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    ResponseEntity<List<ValidationErrorRepresentation>> validateModelUsingPUT1(@ApiParam(value = "formId", required=true) @PathVariable("formId") Long formId, @ApiParam(value = "" ) @Valid @RequestBody FormSaveRepresentation body);

}
