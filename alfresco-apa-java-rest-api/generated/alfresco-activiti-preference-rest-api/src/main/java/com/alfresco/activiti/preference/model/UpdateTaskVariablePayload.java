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
package com.alfresco.activiti.preference.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateTaskVariablePayload
 */
@Validated


public class UpdateTaskVariablePayload   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  /**
   * Gets or Sets payloadType
   */
  public enum PayloadTypeEnum {
    UPDATETASKVARIABLEPAYLOAD("UpdateTaskVariablePayload");

    private String value;

    PayloadTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PayloadTypeEnum fromValue(String text) {
      for (PayloadTypeEnum b : PayloadTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("payloadType")
  private PayloadTypeEnum payloadType = null;

  @JsonProperty("taskId")
  private String taskId = null;

  @JsonProperty("value")
  private Object value = null;

  public UpdateTaskVariablePayload id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @ApiModelProperty(value = "")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public UpdateTaskVariablePayload name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @ApiModelProperty(value = "")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateTaskVariablePayload payloadType(PayloadTypeEnum payloadType) {
    this.payloadType = payloadType;
    return this;
  }

  /**
   * Get payloadType
   * @return payloadType
   **/
  @ApiModelProperty(value = "")
  
    public PayloadTypeEnum getPayloadType() {
    return payloadType;
  }

  public void setPayloadType(PayloadTypeEnum payloadType) {
    this.payloadType = payloadType;
  }

  public UpdateTaskVariablePayload taskId(String taskId) {
    this.taskId = taskId;
    return this;
  }

  /**
   * Get taskId
   * @return taskId
   **/
  @ApiModelProperty(value = "")
  
    public String getTaskId() {
    return taskId;
  }

  public void setTaskId(String taskId) {
    this.taskId = taskId;
  }

  public UpdateTaskVariablePayload value(Object value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @ApiModelProperty(value = "")
  
    public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateTaskVariablePayload updateTaskVariablePayload = (UpdateTaskVariablePayload) o;
    return Objects.equals(this.id, updateTaskVariablePayload.id) &&
        Objects.equals(this.name, updateTaskVariablePayload.name) &&
        Objects.equals(this.payloadType, updateTaskVariablePayload.payloadType) &&
        Objects.equals(this.taskId, updateTaskVariablePayload.taskId) &&
        Objects.equals(this.value, updateTaskVariablePayload.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, payloadType, taskId, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateTaskVariablePayload {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    payloadType: ").append(toIndentedString(payloadType)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
