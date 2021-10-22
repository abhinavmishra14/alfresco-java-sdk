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
package com.alfresco.activiti.modeling.model;

import java.util.Objects;
import com.alfresco.activiti.modeling.model.Project;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ModelRes
 */
@Validated


public class ModelRes   {
  @JsonProperty("content")
  private byte[] content = null;

  @JsonProperty("contentType")
  private String contentType = null;

  @JsonProperty("createdBy")
  private Object createdBy = null;

  @JsonProperty("creationDate")
  private OffsetDateTime creationDate = null;

  @JsonProperty("extensions")
  private Object extensions = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("lastModifiedBy")
  private Object lastModifiedBy = null;

  @JsonProperty("lastModifiedDate")
  private OffsetDateTime lastModifiedDate = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("projects")
  @Valid
  private List<Project> projects = null;

  /**
   * Gets or Sets scope
   */
  public enum ScopeEnum {
    GLOBAL("GLOBAL"),
    
    PROJECT("PROJECT");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ScopeEnum fromValue(String text) {
      for (ScopeEnum b : ScopeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("scope")
  private ScopeEnum scope = null;

  @JsonProperty("template")
  private String template = null;

  @JsonProperty("type")
  private String type = null;

  @JsonProperty("version")
  private String version = null;

  public ModelRes content(byte[] content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
   **/
  @ApiModelProperty(value = "")
  
    public byte[] getContent() {
    return content;
  }

  public void setContent(byte[] content) {
    this.content = content;
  }

  public ModelRes contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

  /**
   * Get contentType
   * @return contentType
   **/
  @ApiModelProperty(value = "")
  
    public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public ModelRes createdBy(Object createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   * @return createdBy
   **/
  @ApiModelProperty(value = "")
  
    public Object getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Object createdBy) {
    this.createdBy = createdBy;
  }

  public ModelRes creationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * Get creationDate
   * @return creationDate
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(OffsetDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public ModelRes extensions(Object extensions) {
    this.extensions = extensions;
    return this;
  }

  /**
   * Get extensions
   * @return extensions
   **/
  @ApiModelProperty(value = "")
  
    public Object getExtensions() {
    return extensions;
  }

  public void setExtensions(Object extensions) {
    this.extensions = extensions;
  }

  public ModelRes id(String id) {
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

  public ModelRes lastModifiedBy(Object lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  /**
   * Get lastModifiedBy
   * @return lastModifiedBy
   **/
  @ApiModelProperty(value = "")
  
    public Object getLastModifiedBy() {
    return lastModifiedBy;
  }

  public void setLastModifiedBy(Object lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }

  public ModelRes lastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

  /**
   * Get lastModifiedDate
   * @return lastModifiedDate
   **/
  @ApiModelProperty(value = "")
  
    @Valid
    public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }

  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }

  public ModelRes name(String name) {
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

  public ModelRes projects(List<Project> projects) {
    this.projects = projects;
    return this;
  }

  public ModelRes addProjectsItem(Project projectsItem) {
    if (this.projects == null) {
      this.projects = new ArrayList<>();
    }
    this.projects.add(projectsItem);
    return this;
  }

  /**
   * Get projects
   * @return projects
   **/
  @ApiModelProperty(value = "")
      @Valid
    public List<Project> getProjects() {
    return projects;
  }

  public void setProjects(List<Project> projects) {
    this.projects = projects;
  }

  public ModelRes scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }

  /**
   * Get scope
   * @return scope
   **/
  @ApiModelProperty(value = "")
  
    public ScopeEnum getScope() {
    return scope;
  }

  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }

  public ModelRes template(String template) {
    this.template = template;
    return this;
  }

  /**
   * Get template
   * @return template
   **/
  @ApiModelProperty(value = "")
  
    public String getTemplate() {
    return template;
  }

  public void setTemplate(String template) {
    this.template = template;
  }

  public ModelRes type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @ApiModelProperty(value = "")
  
    public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ModelRes version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   **/
  @ApiModelProperty(value = "")
  
    public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelRes modelRes = (ModelRes) o;
    return Objects.equals(this.content, modelRes.content) &&
        Objects.equals(this.contentType, modelRes.contentType) &&
        Objects.equals(this.createdBy, modelRes.createdBy) &&
        Objects.equals(this.creationDate, modelRes.creationDate) &&
        Objects.equals(this.extensions, modelRes.extensions) &&
        Objects.equals(this.id, modelRes.id) &&
        Objects.equals(this.lastModifiedBy, modelRes.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, modelRes.lastModifiedDate) &&
        Objects.equals(this.name, modelRes.name) &&
        Objects.equals(this.projects, modelRes.projects) &&
        Objects.equals(this.scope, modelRes.scope) &&
        Objects.equals(this.template, modelRes.template) &&
        Objects.equals(this.type, modelRes.type) &&
        Objects.equals(this.version, modelRes.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, contentType, createdBy, creationDate, extensions, id, lastModifiedBy, lastModifiedDate, name, projects, scope, template, type, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelRes {\n");
    
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    projects: ").append(toIndentedString(projects)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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