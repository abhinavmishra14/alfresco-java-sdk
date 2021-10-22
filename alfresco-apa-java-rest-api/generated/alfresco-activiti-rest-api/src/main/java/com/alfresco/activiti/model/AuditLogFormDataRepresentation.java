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
package com.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AuditLogFormDataRepresentation
 */
@Validated


public class AuditLogFormDataRepresentation   {
  @JsonProperty("fieldId")
  private String fieldId = null;

  @JsonProperty("fieldName")
  private String fieldName = null;

  @JsonProperty("value")
  private String value = null;

  public AuditLogFormDataRepresentation fieldId(String fieldId) {
    this.fieldId = fieldId;
    return this;
  }

  /**
   * Get fieldId
   * @return fieldId
   **/
  @ApiModelProperty(value = "")
  
    public String getFieldId() {
    return fieldId;
  }

  public void setFieldId(String fieldId) {
    this.fieldId = fieldId;
  }

  public AuditLogFormDataRepresentation fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }

  /**
   * Get fieldName
   * @return fieldName
   **/
  @ApiModelProperty(value = "")
  
    public String getFieldName() {
    return fieldName;
  }

  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }

  public AuditLogFormDataRepresentation value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Get value
   * @return value
   **/
  @ApiModelProperty(value = "")
  
    public String getValue() {
    return value;
  }

  public void setValue(String value) {
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
    AuditLogFormDataRepresentation auditLogFormDataRepresentation = (AuditLogFormDataRepresentation) o;
    return Objects.equals(this.fieldId, auditLogFormDataRepresentation.fieldId) &&
        Objects.equals(this.fieldName, auditLogFormDataRepresentation.fieldName) &&
        Objects.equals(this.value, auditLogFormDataRepresentation.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldId, fieldName, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditLogFormDataRepresentation {\n");
    
    sb.append("    fieldId: ").append(toIndentedString(fieldId)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
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
