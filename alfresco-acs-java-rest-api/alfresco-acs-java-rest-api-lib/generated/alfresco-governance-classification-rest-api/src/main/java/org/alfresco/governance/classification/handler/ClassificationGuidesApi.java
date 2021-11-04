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

import org.alfresco.governance.classification.model.ClassificationGuideBody;
import org.alfresco.governance.classification.model.ClassificationGuideEntry;
import org.alfresco.governance.classification.model.ClassificationGuidePaging;
import org.alfresco.governance.classification.model.CombinedInstructionBody;
import org.alfresco.governance.classification.model.Error;
import org.alfresco.governance.classification.model.InstructionEntry;
import org.alfresco.governance.classification.model.SubtopicPaging;
import org.alfresco.governance.classification.model.TopicBody;
import org.alfresco.governance.classification.model.TopicEntry;
import org.alfresco.governance.classification.model.TopicPaging;
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

@Api(value = "ClassificationGuides")
public interface ClassificationGuidesApi {

    @ApiOperation(value = "Combined instructions", nickname = "combinedInstructions", notes = "Combines instructions from the given topics and the user defined instruction, if any.", response = InstructionEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "classification-guides", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An instruction that represents the combination of all the specified instructions.", response = InstructionEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **topicIds** is not a valid format. "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 404, message = "One or more **topicIds**, or a field from the classification information or security mark information has not been found."),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/combined-instructions",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<InstructionEntry> combinedInstructions(@ApiParam(value = "Instructions"  )  @Valid @RequestBody CombinedInstructionBody instructions);


    @ApiOperation(value = "Create a classification guide", nickname = "createClassificationGuide", notes = "Creates a new classification guide.", response = ClassificationGuideEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "classification-guides", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful response", response = ClassificationGuideEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: The **classificationGuide** is invalid "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user doesn't have permission to create classification guides"),
        @ApiResponse(code = 409, message = "There's already a classification guide with this name"),
        @ApiResponse(code = 422, message = "Couldn't create guide. Guide name can't end in a period or contain any of these characters \"*\\>&lt;?/|"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/classification-guides",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ClassificationGuideEntry> createClassificationGuide(@ApiParam(value = "Classification guide" ,required=true )  @Valid @RequestBody ClassificationGuideBody classificationGuide);


    @ApiOperation(value = "Create a subtopic", nickname = "createSubtopic", notes = "Creates a new subtopic of a topic.", response = TopicEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "classification-guides", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful response", response = TopicEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: The **topicId** is not in a valid format, the subtopic **topic** is invalid "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user doesn't have permission to create a subtopic under this topic"),
        @ApiResponse(code = 404, message = "\"**topicId** does not exist or the current user doesn't have permission to view the instruction for the parent topic\" "),
        @ApiResponse(code = 409, message = "Name clashes with an existing subtopic of this topic"),
        @ApiResponse(code = 422, message = "Parent topic already has an instruction and so cannot contain subtopics, or the supplied security marks would cause the user to lose access to the topic. "),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/topics/{topicId}/subtopics",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<TopicEntry> createSubtopic(@ApiParam(value = "The identifier for the topic",required=true) @PathVariable("topicId") String topicId,@ApiParam(value = "Subtopic" ,required=true )  @Valid @RequestBody TopicBody topic,@ApiParam(value = "Returns additional information about the topic. The following optional fields can be requested: * hasSubtopics - A flag indicating whether the topic already contains any subtopics. * instruction - Contains details of any instruction in the topic. * path - An ordered list of id-name pairs of all ancestor topics and the classification guide. * classificationGuide - The classification guide this topic is in. ") @Valid @RequestParam(value = "include", required = false) List<String> include);


    @ApiOperation(value = "Create a topic", nickname = "createTopic", notes = "Creates a new topic.", response = TopicEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "classification-guides", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Successful response", response = TopicEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: The **classificationGuideId** is not a valid format or the **topic** is invalid. "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user doesn't have permission to create a topic under this classification guide"),
        @ApiResponse(code = 404, message = "**classificationGuideId** does not exist"),
        @ApiResponse(code = 409, message = "Name clashes with an existing topic in this classification guide"),
        @ApiResponse(code = 422, message = "The supplied security marks would cause the user to lose access to the topic."),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/classification-guides/{classificationGuideId}/topics",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<TopicEntry> createTopic(@ApiParam(value = "The identifier for the classification guide",required=true) @PathVariable("classificationGuideId") String classificationGuideId,@ApiParam(value = "Topic" ,required=true )  @Valid @RequestBody TopicBody topic,@ApiParam(value = "Returns additional information about the topic. The following optional fields can be requested: * hasSubtopics - A flag indicating whether the topic already contains any subtopics. * instruction - Contains details of any instruction in the topic. * path - An ordered list of id-name pairs of all ancestor topics and the classification guide. * classificationGuide - The classification guide this topic is in. ") @Valid @RequestParam(value = "include", required = false) List<String> include);


    @ApiOperation(value = "Delete a classification guide", nickname = "deleteClassificationGuide", notes = "Deletes the classification guide with id **classificationGuideId**, including any topics and instructions.", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "classification-guides", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successful response"),
        @ApiResponse(code = 400, message = "Invalid parameter: **classificationGuideId** is not in a valid format "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to delete **classificationGuideId** or one of its descendents "),
        @ApiResponse(code = 404, message = "**classificationGuideId** does not exist"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/classification-guides/{classificationGuideId}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.DELETE)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> deleteClassificationGuide(@ApiParam(value = "The identifier for the classification guide",required=true) @PathVariable("classificationGuideId") String classificationGuideId);


    @ApiOperation(value = "Delete a topic", nickname = "deleteTopic", notes = "Deletes the topic with id  **topicId**, including any subtopics and instructions.", authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "classification-guides", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successful response"),
        @ApiResponse(code = 400, message = "Invalid parameter: **topicId** is not in a valid format "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to delete **topicId** or one of its descendents"),
        @ApiResponse(code = 404, message = "\"**topicId** does not exist or the current user doesn't have permission to view the instruction for this topic\" "),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/topics/{topicId}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.DELETE)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<Void> deleteTopic(@ApiParam(value = "The identifier for the topic",required=true) @PathVariable("topicId") String topicId);


    @ApiOperation(value = "List all classification guides", nickname = "listClassificationGuides", notes = "Gets all classification guides.", response = ClassificationGuidePaging.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "classification-guides", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "A paged array of classifications", response = ClassificationGuidePaging.class),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/classification-guides",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ClassificationGuidePaging> listClassificationGuides(@ApiParam(value = "Returns additional information about the guide. The following optional fields can be requested: * hasTopics - A flag indicating whether the guide already contains any topics. ") @Valid @RequestParam(value = "include", required = false) List<String> include,@Min(0)@ApiParam(value = "The number of entities that exist in the collection before those included in this list.") @Valid @RequestParam(value = "skipCount", required = false) Integer skipCount,@Min(1)@ApiParam(value = "The maximum number of items to return in the list.") @Valid @RequestParam(value = "maxItems", required = false) Integer maxItems,@ApiParam(value = "A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally acending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field. ") @Valid @RequestParam(value = "orderBy", required = false) List<String> orderBy,@ApiParam(value = "A string to restrict the returned objects by using a predicate. Supported operations are AND, NOT, and OR. Fields to filter on: * enabled - e.g. (enabled = true OR enabled = false) ") @Valid @RequestParam(value = "where", required = false) String where);


    @ApiOperation(value = "List all subtopics", nickname = "listSubtopics", notes = "Gets all subtopics of a topic.", response = SubtopicPaging.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "classification-guides", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An paged array of subtopics", response = SubtopicPaging.class),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 404, message = "**topicId** does not exist or the current user doesn't have permission to view the instruction for this topic"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/topics/{topicId}/subtopics",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<SubtopicPaging> listSubtopics(@ApiParam(value = "The identifier for the topic",required=true) @PathVariable("topicId") String topicId,@ApiParam(value = "Returns additional information about the topic. The following optional fields can be requested: * hasSubtopics - A flag indicating whether the topic already contains any subtopics. * instruction - Contains details of any instruction in the topic. * path - An ordered list of id-name pairs of all ancestor topics and the classification guide. * classificationGuide - The classification guide this topic is in. ") @Valid @RequestParam(value = "include", required = false) List<String> include,@Min(0)@ApiParam(value = "The number of entities that exist in the collection before those included in this list.") @Valid @RequestParam(value = "skipCount", required = false) Integer skipCount,@Min(1)@ApiParam(value = "The maximum number of items to return in the list.") @Valid @RequestParam(value = "maxItems", required = false) Integer maxItems,@ApiParam(value = "A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally acending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field. ") @Valid @RequestParam(value = "orderBy", required = false) List<String> orderBy,@ApiParam(value = "A string to restrict the returned objects by using a predicate. Supported operations are AND, NOT, and OR. Fields to filter on: * hasInstruction * hasSubtopics ") @Valid @RequestParam(value = "where", required = false) String where,@ApiParam(value = "Also include **source** in addition to **entries** with folder information on the parent guide/topic") @Valid @RequestParam(value = "includeSource", required = false) Boolean includeSource);


    @ApiOperation(value = "List all topics", nickname = "listTopics", notes = "Gets all topics.", response = TopicPaging.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "classification-guides", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "An paged array of topics", response = TopicPaging.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **classificationGuideId** is not in valid format "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 404, message = "**classificationGuideId** does not exist"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/classification-guides/{classificationGuideId}/topics",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<TopicPaging> listTopics(@ApiParam(value = "The identifier for the classification guide",required=true) @PathVariable("classificationGuideId") String classificationGuideId,@ApiParam(value = "Returns additional information about the topic. The following optional fields can be requested: * hasSubtopics - A flag indicating whether the topic already contains any subtopics. * instruction - Contains details of any instruction in the topic. * path - An ordered list of id-name pairs of all ancestor topics and the classification guide. * classificationGuide - The classification guide this topic is in. ") @Valid @RequestParam(value = "include", required = false) List<String> include,@Min(0)@ApiParam(value = "The number of entities that exist in the collection before those included in this list.") @Valid @RequestParam(value = "skipCount", required = false) Integer skipCount,@Min(1)@ApiParam(value = "The maximum number of items to return in the list.") @Valid @RequestParam(value = "maxItems", required = false) Integer maxItems,@ApiParam(value = "A string to control the order of the entities returned in a list. You can use the **orderBy** parameter to sort the list by one or more fields.  Each field has a default sort order, which is normally acending order. Read the API method implementation notes above to check if any fields used in this method have a descending default search order.  To sort the entities in a specific order, you can use the **ASC** and **DESC** keywords for any field. ") @Valid @RequestParam(value = "orderBy", required = false) List<String> orderBy,@ApiParam(value = "A string to restrict the returned objects by using a predicate. Supported operations are AND, NOT, and OR e.g. (instruction=true and hasSubtopics=false). Fields to filter on: * hasInstruction * hasSubtopics ") @Valid @RequestParam(value = "where", required = false) String where,@ApiParam(value = "Also include **source** in addition to **entries** with folder information on the parent guide/topic") @Valid @RequestParam(value = "includeSource", required = false) Boolean includeSource);


    @ApiOperation(value = "Get classification guide information", nickname = "showClassificationGuideById", notes = "Gets the classification guide with id **classificationGuideId**.", response = ClassificationGuideEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "classification-guides", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = ClassificationGuideEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **classificationGuideId** is not in valid format "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 404, message = "**classificationGuideId** does not exist"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/classification-guides/{classificationGuideId}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ClassificationGuideEntry> showClassificationGuideById(@ApiParam(value = "The identifier for the classification guide",required=true) @PathVariable("classificationGuideId") String classificationGuideId);


    @ApiOperation(value = "Get topic information", nickname = "showTopicById", notes = "Gets the topic with id **topicId**.", response = TopicEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "classification-guides", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = TopicEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **topicId** is not in a valid format "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 404, message = "**topicId** does not exist or the current user doesn't have permission to view the instruction for this topic"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/topics/{topicId}",
        produces = "application/json", 
        consumes = "",
        method = RequestMethod.GET)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<TopicEntry> showTopicById(@ApiParam(value = "The identifier for the topic",required=true) @PathVariable("topicId") String topicId,@ApiParam(value = "Returns additional information about the topic. The following optional fields can be requested: * hasSubtopics - A flag indicating whether the topic already contains any subtopics. * instruction - Contains details of any instruction in the topic. * path - An ordered list of id-name pairs of all ancestor topics and the classification guide. * classificationGuide - The classification guide this topic is in. ") @Valid @RequestParam(value = "include", required = false) List<String> include);


    @ApiOperation(value = "Update a classification guide", nickname = "updateClassificationGuide", notes = "Updates the classification guide with id **classificationGuideId**. For example, you can rename a classification guide.", response = ClassificationGuideEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "classification-guides", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = ClassificationGuideEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **classificationGuideId** is not in a valid format or the **classificationGuide** is invalid "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to update the guide with id **classificationGuideId**"),
        @ApiResponse(code = 404, message = "**classificationGuideId** does not exist"),
        @ApiResponse(code = 409, message = "Name clashes with an existing classification guide"),
        @ApiResponse(code = 422, message = "Couldn't edit guide. Guide name can't end in a period or contain any of these characters \"*\\>&lt;?/|"),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/classification-guides/{classificationGuideId}",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<ClassificationGuideEntry> updateClassificationGuide(@ApiParam(value = "The identifier for the classification guide",required=true) @PathVariable("classificationGuideId") String classificationGuideId,@ApiParam(value = "Classification guide" ,required=true )  @Valid @RequestBody ClassificationGuideBody classificationGuide);


    @ApiOperation(value = "Update a topic", nickname = "updateTopic", notes = "Updates the topic with id **topicId**.  Use this to rename a topic or to add, edit, or remove the instruction associated with it. ", response = TopicEntry.class, authorizations = {
        @Authorization(value = "basicAuth")
    }, tags={ "classification-guides", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = TopicEntry.class),
        @ApiResponse(code = 400, message = "Invalid parameter: **topicId** is not a valid format, the **topic** is invalid or if this is an attempt to add an instruction to a topic which has subtopics. "),
        @ApiResponse(code = 401, message = "Authentication failed"),
        @ApiResponse(code = 403, message = "Current user does not have permission to update the topic with id **topicId**"),
        @ApiResponse(code = 404, message = "**topicId** does not exist or the current user doesn't have permission to view the instruction for this topic"),
        @ApiResponse(code = 409, message = "Name clashes with an existing topic in this classification guide"),
        @ApiResponse(code = 422, message = "The supplied security marks would cause the user to lose access to the topic."),
        @ApiResponse(code = 200, message = "Unexpected error", response = Error.class) })
    @RequestMapping(value = "/topics/{topicId}",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.PUT)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<TopicEntry> updateTopic(@ApiParam(value = "The identifier for the topic",required=true) @PathVariable("topicId") String topicId,@ApiParam(value = "Topic" ,required=true )  @Valid @RequestBody TopicBody topic,@ApiParam(value = "Returns additional information about the topic. The following optional fields can be requested: * hasSubtopics - A flag indicating whether the topic already contains any subtopics. * instruction - Contains details of any instruction in the topic. * path - An ordered list of id-name pairs of all ancestor topics and the classification guide. * classificationGuide - The classification guide this topic is in. ") @Valid @RequestParam(value = "include", required = false) List<String> include);

}
