package com.banking.chatbot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * TransferBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-11T07:21:13.475411845Z[GMT]")


public class TransferBody   {
  @JsonProperty("from_account")
  private String fromAccount = null;

  @JsonProperty("to_account")
  private String toAccount = null;

  @JsonProperty("amount")
  private BigDecimal amount = null;

  public TransferBody fromAccount(String fromAccount) {
    this.fromAccount = fromAccount;
    return this;
  }

  /**
   * Get fromAccount
   * @return fromAccount
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getFromAccount() {
    return fromAccount;
  }

  public void setFromAccount(String fromAccount) {
    this.fromAccount = fromAccount;
  }

  public TransferBody toAccount(String toAccount) {
    this.toAccount = toAccount;
    return this;
  }

  /**
   * Get toAccount
   * @return toAccount
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getToAccount() {
    return toAccount;
  }

  public void setToAccount(String toAccount) {
    this.toAccount = toAccount;
  }

  public TransferBody amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * minimum: 0
   * @return amount
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
  @DecimalMin("0")  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransferBody transferBody = (TransferBody) o;
    return Objects.equals(this.fromAccount, transferBody.fromAccount) &&
        Objects.equals(this.toAccount, transferBody.toAccount) &&
        Objects.equals(this.amount, transferBody.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromAccount, toAccount, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransferBody {\n");
    
    sb.append("    fromAccount: ").append(toIndentedString(fromAccount)).append("\n");
    sb.append("    toAccount: ").append(toIndentedString(toAccount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
