/**
 * NOTE: This class is auto generated by the swagger code generator program (2.4.10).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package org.alfresco.discovery.handler;

import org.alfresco.discovery.model.DiscoveryEntry;
import org.alfresco.discovery.model.Error;
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

@Api(value = "Discovery")
public interface DiscoveryApi {

    @ApiOperation(value = "Get repository information", nickname = "getRepositoryInformation", notes = "**Note:** this endpoint is available in Alfresco 5.2 and newer versions.  Retrieves the capabilities and detailed version information from the repository. ", response = DiscoveryEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "discovery", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = DiscoveryEntry.class),
        @ApiResponse(code = 501, message = "Discovery is disabled for the system"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/discovery",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<DiscoveryEntry> getRepositoryInformation();

}
