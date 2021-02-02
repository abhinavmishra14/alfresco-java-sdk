package org.alfresco.activiti.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * GlobalDateFormatRepresentation
 */
@Validated

public class GlobalDateFormatRepresentation   {
  @JsonProperty("globalDateFormat")
  private String globalDateFormat = null;

  public GlobalDateFormatRepresentation globalDateFormat(String globalDateFormat) {
    this.globalDateFormat = globalDateFormat;
    return this;
  }

  /**
   * Get globalDateFormat
   * @return globalDateFormat
  **/
  @ApiModelProperty(value = "")


  public String getGlobalDateFormat() {
    return globalDateFormat;
  }

  public void setGlobalDateFormat(String globalDateFormat) {
    this.globalDateFormat = globalDateFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GlobalDateFormatRepresentation globalDateFormatRepresentation = (GlobalDateFormatRepresentation) o;
    return Objects.equals(this.globalDateFormat, globalDateFormatRepresentation.globalDateFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(globalDateFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GlobalDateFormatRepresentation {\n");
    
    sb.append("    globalDateFormat: ").append(toIndentedString(globalDateFormat)).append("\n");
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

