package org.alfresco.governance.classification.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.alfresco.governance.classification.model.DeclassificationDateRecalculationProcessEntry;
import org.alfresco.governance.classification.model.Pagination;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DeclassificationDateRecalculationProcessPagingList
 */
@Validated

public class DeclassificationDateRecalculationProcessPagingList   {
  @JsonProperty("pagination")
  private Pagination pagination = null;

  @JsonProperty("entries")
  @Valid
  private List<DeclassificationDateRecalculationProcessEntry> entries = null;

  public DeclassificationDateRecalculationProcessPagingList pagination(Pagination pagination) {
    this.pagination = pagination;
    return this;
  }

  /**
   * Get pagination
   * @return pagination
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Pagination getPagination() {
    return pagination;
  }

  public void setPagination(Pagination pagination) {
    this.pagination = pagination;
  }

  public DeclassificationDateRecalculationProcessPagingList entries(List<DeclassificationDateRecalculationProcessEntry> entries) {
    this.entries = entries;
    return this;
  }

  public DeclassificationDateRecalculationProcessPagingList addEntriesItem(DeclassificationDateRecalculationProcessEntry entriesItem) {
    if (this.entries == null) {
      this.entries = new ArrayList<>();
    }
    this.entries.add(entriesItem);
    return this;
  }

  /**
   * Get entries
   * @return entries
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<DeclassificationDateRecalculationProcessEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<DeclassificationDateRecalculationProcessEntry> entries) {
    this.entries = entries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeclassificationDateRecalculationProcessPagingList declassificationDateRecalculationProcessPagingList = (DeclassificationDateRecalculationProcessPagingList) o;
    return Objects.equals(this.pagination, declassificationDateRecalculationProcessPagingList.pagination) &&
        Objects.equals(this.entries, declassificationDateRecalculationProcessPagingList.entries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pagination, entries);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeclassificationDateRecalculationProcessPagingList {\n");
    
    sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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

