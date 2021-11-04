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
package org.alfresco.core.handler;

import org.alfresco.core.model.Error;
import org.alfresco.core.model.RatingBody;
import org.alfresco.core.model.RatingEntry;
import org.alfresco.core.model.RatingPaging;
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

@Api(value = "Ratings")
public interface RatingsApi {

    @ApiOperation(value = "Create a rating", nickname = "createRating", notes = "Create a rating for the node with identifier **nodeId**", response = RatingEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "ratings", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful response", response = RatingEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **ratingBodyCreate** is invalid "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 404, message = "**nodeId** does not exist "),
        @ApiResponse(code = 405, message = "Cannot rate a node of this type"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/nodes/{nodeId}/ratings",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<RatingEntry> createRating(@ApiParam(value = "The identifier of a node.",required=true) @PathVariable("nodeId") String nodeId,@ApiParam(value = "For \"myRating\" the type is specific to the rating scheme, boolean for the likes and an integer for the fiveStar.  For example, to \"like\" a file the following body would be used:  ```JSON   {     \"id\": \"likes\",     \"myRating\": true   } ``` " ,required=true )  @Valid @RequestBody RatingBody ratingBodyCreate,@ApiParam(value = "A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. ") @Valid @RequestParam(value = "fields", required = false) List<String> fields);


    @ApiOperation(value = "Delete a rating", nickname = "deleteRating", notes = "Deletes rating **ratingId** from node **nodeId**.", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "ratings", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successful response"),
        @ApiResponse(code = 400, message = "Invalid parameter: unknown rating scheme specified "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 404, message = "**nodeId** does not exist "),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/nodes/{nodeId}/ratings/{ratingId}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.DELETE)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> deleteRating(@ApiParam(value = "The identifier of a node.",required=true) @PathVariable("nodeId") String nodeId,@ApiParam(value = "The identifier of a rating.",required=true) @PathVariable("ratingId") String ratingId);


    @ApiOperation(value = "Get a rating", nickname = "getRating", notes = "Get the specific rating **ratingId** on node **nodeId**.", response = RatingEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "ratings", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = RatingEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: unknown rating scheme specified "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 404, message = "**nodeId** does not exist "),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/nodes/{nodeId}/ratings/{ratingId}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<RatingEntry> getRating(@ApiParam(value = "The identifier of a node.",required=true) @PathVariable("nodeId") String nodeId,@ApiParam(value = "The identifier of a rating.",required=true) @PathVariable("ratingId") String ratingId,@ApiParam(value = "A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. ") @Valid @RequestParam(value = "fields", required = false) List<String> fields);


    @ApiOperation(value = "List ratings", nickname = "listRatings", notes = "Gets a list of ratings for node **nodeId**.", response = RatingPaging.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "ratings", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = RatingPaging.class),
        @ApiResponse(code = 400, message = "Invalid parameter: value of **maxItems** or **skipCount** is invalid "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 404, message = "**nodeId** does not exist "),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/nodes/{nodeId}/ratings",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<RatingPaging> listRatings(@ApiParam(value = "The identifier of a node.",required=true) @PathVariable("nodeId") String nodeId,@Min(0)@ApiParam(value = "The number of entities that exist in the collection before those included in this list. If not supplied then the default value is 0. ", defaultValue = "0") @Valid @RequestParam(value = "skipCount", required = false, defaultValue="0") Integer skipCount,@Min(1)@ApiParam(value = "The maximum number of items to return in the list. If not supplied then the default value is 100. ", defaultValue = "100") @Valid @RequestParam(value = "maxItems", required = false, defaultValue="100") Integer maxItems,@ApiParam(value = "A list of field names.  You can use this parameter to restrict the fields returned within a response if, for example, you want to save on overall bandwidth.  The list applies to a returned individual entity or entries within a collection.  If the API method also supports the **include** parameter, then the fields specified in the **include** parameter are returned in addition to those specified in the **fields** parameter. ") @Valid @RequestParam(value = "fields", required = false) List<String> fields);

}
