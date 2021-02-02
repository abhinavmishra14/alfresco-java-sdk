/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.10).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.alfresco.activiti.handler;

import org.alfresco.activiti.model.FormDefinitionRepresentation;
import org.alfresco.activiti.model.FormValueRepresentation;
import org.alfresco.activiti.model.IdentityLinkRepresentation;
import org.alfresco.activiti.model.ResultListDataRepresentationProcessDefinitionRepresentation;
import org.alfresco.activiti.model.ResultListDataRepresentationRuntimeDecisionTableRepresentation;
import org.alfresco.activiti.model.ResultListDataRepresentationRuntimeFormRepresentation;
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

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;

@Api(value = "ProcessDefinitions")
public interface ProcessDefinitionsApi {

    @ApiOperation(value = "Add a user or group involvement to a process definition", nickname = "createIdentityLinkUsingPOST", notes = "", response = IdentityLinkRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "process-definitions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = IdentityLinkRepresentation.class) })
    @RequestMapping(value = "/enterprise/process-definitions/{processDefinitionId}/identitylinks",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    ResponseEntity<IdentityLinkRepresentation> createIdentityLinkUsingPOST(@ApiParam(value = "processDefinitionId",required=true) @PathVariable("processDefinitionId") String processDefinitionId,@ApiParam(value = "identityLinkRepresentation" ,required=true )  @Valid @RequestBody IdentityLinkRepresentation identityLinkRepresentation);


    @ApiOperation(value = "Remove a user or group involvement from a process definition", nickname = "deleteIdentityLinkUsingDELETE", notes = "", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "process-definitions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No Content") })
    @RequestMapping(value = "/enterprise/process-definitions/{processDefinitionId}/identitylinks/{family}/{identityId}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteIdentityLinkUsingDELETE(@ApiParam(value = "Process definition ID",required=true) @PathVariable("processDefinitionId") String processDefinitionId,@ApiParam(value = "Identity type",required=true, allowableValues = "\"users\", \"groups\"") @PathVariable("family") String family,@ApiParam(value = "User or group ID",required=true) @PathVariable("identityId") String identityId);


    @ApiOperation(value = "Get a user or group involvement with a process definition", nickname = "getIdentityLinkTypeUsingGET", notes = "", response = IdentityLinkRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "process-definitions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IdentityLinkRepresentation.class) })
    @RequestMapping(value = "/enterprise/process-definitions/{processDefinitionId}/identitylinks/{family}/{identityId}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<IdentityLinkRepresentation> getIdentityLinkTypeUsingGET(@ApiParam(value = "Process definition ID",required=true) @PathVariable("processDefinitionId") String processDefinitionId,@ApiParam(value = "Identity type",required=true, allowableValues = "\"users\", \"groups\"") @PathVariable("family") String family,@ApiParam(value = "User or group ID",required=true) @PathVariable("identityId") String identityId);


    @ApiOperation(value = "List either the users or groups involved with a process definition", nickname = "getIdentityLinksForFamilyUsingGET", notes = "", response = IdentityLinkRepresentation.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "process-definitions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IdentityLinkRepresentation.class, responseContainer = "List") })
    @RequestMapping(value = "/enterprise/process-definitions/{processDefinitionId}/identitylinks/{family}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<List<IdentityLinkRepresentation>> getIdentityLinksForFamilyUsingGET(@ApiParam(value = "processDefinitionId",required=true) @PathVariable("processDefinitionId") String processDefinitionId,@ApiParam(value = "Identity type",required=true, allowableValues = "\"users\", \"groups\"") @PathVariable("family") String family);


    @ApiOperation(value = "List the users and groups involved with a process definition", nickname = "getIdentityLinksUsingGET", notes = "", response = IdentityLinkRepresentation.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "process-definitions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = IdentityLinkRepresentation.class, responseContainer = "List") })
    @RequestMapping(value = "/enterprise/process-definitions/{processDefinitionId}/identitylinks",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<List<IdentityLinkRepresentation>> getIdentityLinksUsingGET(@ApiParam(value = "processDefinitionId",required=true) @PathVariable("processDefinitionId") String processDefinitionId);


    @ApiOperation(value = "List the decision tables associated with a process definition", nickname = "getProcessDefinitionDecisionTablesUsingGET", notes = "", response = ResultListDataRepresentationRuntimeDecisionTableRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "process-definitions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultListDataRepresentationRuntimeDecisionTableRepresentation.class) })
    @RequestMapping(value = "/enterprise/process-definitions/{processDefinitionId}/decision-tables",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<ResultListDataRepresentationRuntimeDecisionTableRepresentation> getProcessDefinitionDecisionTablesUsingGET(@ApiParam(value = "processDefinitionId",required=true) @PathVariable("processDefinitionId") String processDefinitionId);


    @ApiOperation(value = "List the forms associated with a process definition", nickname = "getProcessDefinitionFormsUsingGET", notes = "", response = ResultListDataRepresentationRuntimeFormRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "process-definitions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultListDataRepresentationRuntimeFormRepresentation.class) })
    @RequestMapping(value = "/enterprise/process-definitions/{processDefinitionId}/forms",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<ResultListDataRepresentationRuntimeFormRepresentation> getProcessDefinitionFormsUsingGET(@ApiParam(value = "processDefinitionId",required=true) @PathVariable("processDefinitionId") String processDefinitionId);


    @ApiOperation(value = "Retrieve the start form for a process definition", nickname = "getProcessDefinitionStartFormUsingGET", notes = "", response = FormDefinitionRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "process-definitions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FormDefinitionRepresentation.class) })
    @RequestMapping(value = "/enterprise/process-definitions/{processDefinitionId}/start-form",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<FormDefinitionRepresentation> getProcessDefinitionStartFormUsingGET();


    @ApiOperation(value = "Retrieve a list of process definitions", nickname = "getProcessDefinitionsUsingGET", notes = "Get a list of process definitions (visible within the tenant of the user)", response = ResultListDataRepresentationProcessDefinitionRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "process-definitions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = ResultListDataRepresentationProcessDefinitionRepresentation.class) })
    @RequestMapping(value = "/enterprise/process-definitions",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<ResultListDataRepresentationProcessDefinitionRepresentation> getProcessDefinitionsUsingGET(@ApiParam(value = "latest") @Valid @RequestParam(value = "latest", required = false) Boolean latest,@ApiParam(value = "appDefinitionId") @Valid @RequestParam(value = "appDefinitionId", required = false) Long appDefinitionId,@ApiParam(value = "deploymentId") @Valid @RequestParam(value = "deploymentId", required = false) String deploymentId);


    @ApiOperation(value = "Retrieve field values (eg. the typeahead field)", nickname = "getRestFieldValuesUsingGET", notes = "", response = FormValueRepresentation.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "process-definitions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FormValueRepresentation.class, responseContainer = "List") })
    @RequestMapping(value = "/enterprise/process-definitions/{processDefinitionId}/start-form-values/{field}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<List<FormValueRepresentation>> getRestFieldValuesUsingGET();


    @ApiOperation(value = "Retrieve field values (eg. the table field)", nickname = "getRestTableFieldValuesUsingGET", notes = "", response = FormValueRepresentation.class, responseContainer = "List", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "process-definitions", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = FormValueRepresentation.class, responseContainer = "List") })
    @RequestMapping(value = "/enterprise/process-definitions/{processDefinitionId}/start-form-values/{field}/{column}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<List<FormValueRepresentation>> getRestTableFieldValuesUsingGET();

}
