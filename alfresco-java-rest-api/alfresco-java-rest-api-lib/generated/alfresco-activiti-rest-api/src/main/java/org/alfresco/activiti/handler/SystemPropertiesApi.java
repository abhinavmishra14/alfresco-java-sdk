/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.10).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.alfresco.activiti.handler;

import org.alfresco.activiti.model.GlobalDateFormatRepresentation;
import org.alfresco.activiti.model.PasswordValidationConstraints;
import org.alfresco.activiti.model.SystemPropertiesRepresentation;
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

@Api(value = "SystemProperties")
public interface SystemPropertiesApi {

    @ApiOperation(value = "Get global date format", nickname = "getGlobalDateFormatUsingGET", notes = "", response = GlobalDateFormatRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "system-properties", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = GlobalDateFormatRepresentation.class) })
    @RequestMapping(value = "/enterprise/system/properties/global-date-format/{tenantId}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<GlobalDateFormatRepresentation> getGlobalDateFormatUsingGET(@ApiParam(value = "tenantId",required=true) @PathVariable("tenantId") Long tenantId);


    @ApiOperation(value = "Get password validation constraints", nickname = "getPasswordValidationConstraintsUsingGET", notes = "", response = PasswordValidationConstraints.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "system-properties", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = PasswordValidationConstraints.class) })
    @RequestMapping(value = "/enterprise/system/properties/password-validation-constraints/{tenantId}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<PasswordValidationConstraints> getPasswordValidationConstraintsUsingGET(@ApiParam(value = "tenantId",required=true) @PathVariable("tenantId") Long tenantId);


    @ApiOperation(value = "Retrieve system properties", nickname = "getPropertiesUsingGET", notes = "Typical value is AllowInvolveByEmail", response = SystemPropertiesRepresentation.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "system-properties", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = SystemPropertiesRepresentation.class) })
    @RequestMapping(value = "/enterprise/system/properties",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<SystemPropertiesRepresentation> getPropertiesUsingGET();


    @ApiOperation(value = "Get involved users who can edit forms", nickname = "involvedUsersCanEditFormsUsingGET", notes = "", response = Boolean.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "system-properties", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Boolean.class) })
    @RequestMapping(value = "/enterprise/system/properties/involved-users-can-edit-forms/{tenantId}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    ResponseEntity<Boolean> involvedUsersCanEditFormsUsingGET(@ApiParam(value = "tenantId",required=true) @PathVariable("tenantId") Long tenantId);

}
