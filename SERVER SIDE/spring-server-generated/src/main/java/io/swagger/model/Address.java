package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
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
 * Address
 */
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-04-22T16:13:55.210790119Z[GMT]")


public class Address   {
  @JsonProperty("streetName")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String streetName = null;

  @JsonProperty("streetNumber")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String streetNumber = null;

  @JsonProperty("city")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String city = null;

  /**
   * Codigo de Pais de 2 Caracteres
   */
  public enum CountryCodeEnum {
    AR("AR"),
    
    BR("BR"),
    
    CH("CH"),
    
    MX("MX"),
    
    UK("UK");

    private String value;

    CountryCodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CountryCodeEnum fromValue(String text) {
      for (CountryCodeEnum b : CountryCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("countryCode")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private CountryCodeEnum countryCode = null;

  @JsonProperty("zipCode")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String zipCode = null;


  public Address streetName(String streetName) { 

    this.streetName = streetName;
    return this;
  }

  /**
   * Nombre de Calle
   * @return streetName
   **/
  
  @Schema(example = "San Martin", description = "Nombre de Calle")
  
  public String getStreetName() {  
    return streetName;
  }



  public void setStreetName(String streetName) { 
    this.streetName = streetName;
  }

  public Address streetNumber(String streetNumber) { 

    this.streetNumber = streetNumber;
    return this;
  }

  /**
   * Numero de Calle
   * @return streetNumber
   **/
  
  @Schema(example = "2345", description = "Numero de Calle")
  
  public String getStreetNumber() {  
    return streetNumber;
  }



  public void setStreetNumber(String streetNumber) { 
    this.streetNumber = streetNumber;
  }

  public Address city(String city) { 

    this.city = city;
    return this;
  }

  /**
   * Ciudad/Localidad
   * @return city
   **/
  
  @Schema(example = "San Justo", description = "Ciudad/Localidad")
  
  public String getCity() {  
    return city;
  }



  public void setCity(String city) { 
    this.city = city;
  }

  public Address countryCode(CountryCodeEnum countryCode) { 

    this.countryCode = countryCode;
    return this;
  }

  /**
   * Codigo de Pais de 2 Caracteres
   * @return countryCode
   **/
  
  @Schema(description = "Codigo de Pais de 2 Caracteres")
  
@Size(min=2,max=2)   public CountryCodeEnum getCountryCode() {  
    return countryCode;
  }



  public void setCountryCode(CountryCodeEnum countryCode) { 
    this.countryCode = countryCode;
  }

  public Address zipCode(String zipCode) { 

    this.zipCode = zipCode;
    return this;
  }

  /**
   * Codigo Postal
   * @return zipCode
   **/
  
  @Schema(example = "2734", description = "Codigo Postal")
  
  public String getZipCode() {  
    return zipCode;
  }



  public void setZipCode(String zipCode) { 
    this.zipCode = zipCode;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.streetName, address.streetName) &&
        Objects.equals(this.streetNumber, address.streetNumber) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.countryCode, address.countryCode) &&
        Objects.equals(this.zipCode, address.zipCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(streetName, streetNumber, city, countryCode, zipCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
    sb.append("    zipCode: ").append(toIndentedString(zipCode)).append("\n");
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
