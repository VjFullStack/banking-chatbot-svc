package com.banking.chatbot.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.LocalDate;

import javax.validation.Valid;
import java.util.Objects;

/**
 * InlineResponse201Account
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-27T05:52:23.176Z[GMT]")


public class InlineResponse201Account   {
  @JsonProperty("number")
  private String number = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    DEPOSIT("deposit"),
    
    SAVINGS("savings");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("type")
  private TypeEnum type = null;

  @JsonProperty("open_date")
  private LocalDate openDate = null;

  public InlineResponse201Account number(String number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   * @return number
   **/
  @Schema(description = "")
  
    public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public InlineResponse201Account type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   **/
  @Schema(description = "")
  
    public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public InlineResponse201Account openDate(LocalDate openDate) {
    this.openDate = openDate;
    return this;
  }

  /**
   * Get openDate
   * @return openDate
   **/
  @Schema(description = "")
  
    @Valid
    public LocalDate getOpenDate() {
    return openDate;
  }

  public void setOpenDate(LocalDate openDate) {
    this.openDate = openDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse201Account inlineResponse201Account = (InlineResponse201Account) o;
    return Objects.equals(this.number, inlineResponse201Account.number) &&
        Objects.equals(this.type, inlineResponse201Account.type) &&
        Objects.equals(this.openDate, inlineResponse201Account.openDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, type, openDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse201Account {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    openDate: ").append(toIndentedString(openDate)).append("\n");
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
