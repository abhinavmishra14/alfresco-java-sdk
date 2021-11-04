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
package com.alfresco.activiti.audit.handler;

import com.alfresco.activiti.audit.model.CleanupQueryProcessInstancesJobRequest;
import com.alfresco.activiti.audit.model.EntryResponseContentOfJobExecution;

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

@Api(value = "CleanupQueryProcessInstancesJobExecutionController", description = "the CleanupQueryProcessInstancesJobExecutionController API")
public interface CleanupQueryProcessInstancesJobExecutionControllerApi {

    @ApiOperation(value = "launch", nickname = "launchUsingPOST", notes = "", response = EntryResponseContentOfJobExecution.class, tags={ "cleanup-query-process-instances-job-execution-controller", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = EntryResponseContentOfJobExecution.class),
        @ApiResponse(code = 201, message = "Created"),
        @ApiResponse(code = 401, message = "Unauthorized"),
        @ApiResponse(code = 403, message = "Forbidden"),
        @ApiResponse(code = 404, message = "Not Found") })
    @RequestMapping(value = "/admin/v1/batch/jobs/executions/cleanup-query-process-instance-history-job",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    @CollectionFormat(feign.CollectionFormat.CSV)
    ResponseEntity<EntryResponseContentOfJobExecution> launchUsingPOST(@ApiParam(value = "" ) @Valid @RequestBody CleanupQueryProcessInstancesJobRequest body);

}
