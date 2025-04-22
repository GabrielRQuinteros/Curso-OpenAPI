package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.PagedResponsePageable;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * PagedResponse
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-04-22T16:13:55.210790119Z[GMT]")


public class PagedResponse   {
  @JsonProperty("pageable")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private PagedResponsePageable pageable = null;

  @JsonProperty("totalPages")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer totalPages = null;

  @JsonProperty("last")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Boolean last = null;


  public PagedResponse pageable(PagedResponsePageable pageable) { 

    this.pageable = pageable;
    return this;
  }

  /**
   * Get pageable
   * @return pageable
   **/
  
  @Schema(description = "")
  
@Valid
  public PagedResponsePageable getPageable() {  
    return pageable;
  }



  public void setPageable(PagedResponsePageable pageable) { 
    this.pageable = pageable;
  }

  public PagedResponse totalPages(Integer totalPages) { 

    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   * @return totalPages
   **/
  
  @Schema(description = "")
  
  public Integer getTotalPages() {  
    return totalPages;
  }



  public void setTotalPages(Integer totalPages) { 
    this.totalPages = totalPages;
  }

  public PagedResponse last(Boolean last) { 

    this.last = last;
    return this;
  }

  /**
   * Get last
   * @return last
   **/
  
  @Schema(description = "")
  
  public Boolean isLast() {  
    return last;
  }



  public void setLast(Boolean last) { 
    this.last = last;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PagedResponse pagedResponse = (PagedResponse) o;
    return Objects.equals(this.pageable, pagedResponse.pageable) &&
        Objects.equals(this.totalPages, pagedResponse.totalPages) &&
        Objects.equals(this.last, pagedResponse.last);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageable, totalPages, last);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PagedResponse {\n");
    
    sb.append("    pageable: ").append(toIndentedString(pageable)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
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
