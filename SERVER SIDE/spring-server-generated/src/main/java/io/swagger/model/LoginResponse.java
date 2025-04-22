package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.User;
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
 * LoginResponse
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-04-22T16:13:55.210790119Z[GMT]")


public class LoginResponse   {
  @JsonProperty("accessToken")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String accessToken = null;

  @JsonProperty("refreshToken")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String refreshToken = null;

  @JsonProperty("expiresIn")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer expiresIn = null;

  @JsonProperty("tokenType")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String tokenType = null;

  @JsonProperty("user")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private User user = null;


  public LoginResponse accessToken(String accessToken) { 

    this.accessToken = accessToken;
    return this;
  }

  /**
   * Get accessToken
   * @return accessToken
   **/
  
  @Schema(example = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9...", description = "")
  
  public String getAccessToken() {  
    return accessToken;
  }



  public void setAccessToken(String accessToken) { 
    this.accessToken = accessToken;
  }

  public LoginResponse refreshToken(String refreshToken) { 

    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * Get refreshToken
   * @return refreshToken
   **/
  
  @Schema(example = "d2ViLmFwcC5yZWZyZXNoVG9rZW4uLi4u", description = "")
  
  public String getRefreshToken() {  
    return refreshToken;
  }



  public void setRefreshToken(String refreshToken) { 
    this.refreshToken = refreshToken;
  }

  public LoginResponse expiresIn(Integer expiresIn) { 

    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * Get expiresIn
   * @return expiresIn
   **/
  
  @Schema(example = "3600", description = "")
  
  public Integer getExpiresIn() {  
    return expiresIn;
  }



  public void setExpiresIn(Integer expiresIn) { 
    this.expiresIn = expiresIn;
  }

  public LoginResponse tokenType(String tokenType) { 

    this.tokenType = tokenType;
    return this;
  }

  /**
   * Get tokenType
   * @return tokenType
   **/
  
  @Schema(example = "Bearer", description = "")
  
  public String getTokenType() {  
    return tokenType;
  }



  public void setTokenType(String tokenType) { 
    this.tokenType = tokenType;
  }

  public LoginResponse user(User user) { 

    this.user = user;
    return this;
  }

  /**
   * Get user
   * @return user
   **/
  
  @Schema(description = "")
  
@Valid
  public User getUser() {  
    return user;
  }



  public void setUser(User user) { 
    this.user = user;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginResponse loginResponse = (LoginResponse) o;
    return Objects.equals(this.accessToken, loginResponse.accessToken) &&
        Objects.equals(this.refreshToken, loginResponse.refreshToken) &&
        Objects.equals(this.expiresIn, loginResponse.expiresIn) &&
        Objects.equals(this.tokenType, loginResponse.tokenType) &&
        Objects.equals(this.user, loginResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, refreshToken, expiresIn, tokenType, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginResponse {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
