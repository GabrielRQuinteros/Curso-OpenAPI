package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.model.BeersBrewery;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.UUID;
import org.springframework.validation.annotation.Validated;
import org.openapitools.jackson.nullable.JsonNullable;
import io.swagger.configuration.NotUndefined;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Objeto Cerveza
 */
@Schema(description = "Objeto Cerveza")
@Validated
@NotUndefined
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2025-04-22T16:13:55.210790119Z[GMT]")


public class Beer   {
  @JsonProperty("id")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private UUID id = null;

  @JsonProperty("name")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private String name = null;

  /**
   * Tipo de Cerveza
   */
  public enum StyleEnum {
    ALE("ALE"),
    
    PALE_ALE("PALE_ALE"),
    
    IPA("IPA"),
    
    WHEAT("WHEAT"),
    
    LAGER("LAGER");

    private String value;

    StyleEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StyleEnum fromValue(String text) {
      for (StyleEnum b : StyleEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("style")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private StyleEnum style = null;

  @JsonProperty("price")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Float price = null;

  /**
   * Moneda en que Cotiza la Cerveza
   */
  public enum CurrencyEnum {
    ARS("ARS"),
    
    USD("USD");

    private String value;

    CurrencyEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CurrencyEnum fromValue(String text) {
      for (CurrencyEnum b : CurrencyEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("currency")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private CurrencyEnum currency = null;

  @JsonProperty("stock")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private Integer stock = null;

  @JsonProperty("brewery")

  @JsonInclude(JsonInclude.Include.NON_ABSENT)  // Exclude from JSON if absent
  @JsonSetter(nulls = Nulls.FAIL)    // FAIL setting if the value is null
  private BeersBrewery brewery = null;


  public Beer id(UUID id) { 

    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  
  @Schema(accessMode = Schema.AccessMode.READ_ONLY, description = "")
  
@Valid
  public UUID getId() {  
    return id;
  }



  public void setId(UUID id) { 
    this.id = id;
  }

  public Beer name(String name) { 

    this.name = name;
    return this;
  }

  /**
   * Nombre de Cerveza
   * @return name
   **/
  
  @Schema(description = "Nombre de Cerveza")
  
  public String getName() {  
    return name;
  }



  public void setName(String name) { 
    this.name = name;
  }

  public Beer style(StyleEnum style) { 

    this.style = style;
    return this;
  }

  /**
   * Tipo de Cerveza
   * @return style
   **/
  
  @Schema(description = "Tipo de Cerveza")
  
  public StyleEnum getStyle() {  
    return style;
  }



  public void setStyle(StyleEnum style) { 
    this.style = style;
  }

  public Beer price(Float price) { 

    this.price = price;
    return this;
  }

  /**
   * Precio por Litro de Cerveza
   * @return price
   **/
  
  @Schema(description = "Precio por Litro de Cerveza")
  
  public Float getPrice() {  
    return price;
  }



  public void setPrice(Float price) { 
    this.price = price;
  }

  public Beer currency(CurrencyEnum currency) { 

    this.currency = currency;
    return this;
  }

  /**
   * Moneda en que Cotiza la Cerveza
   * @return currency
   **/
  
  @Schema(description = "Moneda en que Cotiza la Cerveza")
  
  public CurrencyEnum getCurrency() {  
    return currency;
  }



  public void setCurrency(CurrencyEnum currency) { 
    this.currency = currency;
  }

  public Beer stock(Integer stock) { 

    this.stock = stock;
    return this;
  }

  /**
   * Stock de la Cerveza en litros
   * @return stock
   **/
  
  @Schema(description = "Stock de la Cerveza en litros")
  
  public Integer getStock() {  
    return stock;
  }



  public void setStock(Integer stock) { 
    this.stock = stock;
  }

  public Beer brewery(BeersBrewery brewery) { 

    this.brewery = brewery;
    return this;
  }

  /**
   * Get brewery
   * @return brewery
   **/
  
  @Schema(description = "")
  
@Valid
  public BeersBrewery getBrewery() {  
    return brewery;
  }



  public void setBrewery(BeersBrewery brewery) { 
    this.brewery = brewery;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Beer beer = (Beer) o;
    return Objects.equals(this.id, beer.id) &&
        Objects.equals(this.name, beer.name) &&
        Objects.equals(this.style, beer.style) &&
        Objects.equals(this.price, beer.price) &&
        Objects.equals(this.currency, beer.currency) &&
        Objects.equals(this.stock, beer.stock) &&
        Objects.equals(this.brewery, beer.brewery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, style, price, currency, stock, brewery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Beer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    style: ").append(toIndentedString(style)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    brewery: ").append(toIndentedString(brewery)).append("\n");
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
