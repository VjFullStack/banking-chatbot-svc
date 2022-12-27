package com.banking.chatbot.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * InlineResponse400
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-27T05:52:23.176Z[GMT]")


public class InlineResponse400   {
  /**
   * Gets or Sets message
   */
  public enum MessageEnum {
    ERROR("error");

    private String value;

    MessageEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static MessageEnum fromValue(String text) {
      for (MessageEnum b : MessageEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("message")
  private MessageEnum message = null;

  public InlineResponse400 message(MessageEnum message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
   **/
  @Schema(description = "")
  
    public MessageEnum getMessage() {
    return message;
  }

  public void setMessage(MessageEnum message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse400 inlineResponse400 = (InlineResponse400) o;
    return Objects.equals(this.message, inlineResponse400.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse400 {\n");
    
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
