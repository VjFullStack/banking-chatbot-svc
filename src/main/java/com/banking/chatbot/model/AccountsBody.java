package com.banking.chatbot.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import org.threeten.bp.LocalDate;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import java.util.Objects;

/**
 * AccountsBody
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-03-11T07:21:13.475411845Z[GMT]")


public class AccountsBody   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("contact")
  private String contact = null;

  @JsonProperty("current_address")
  private Address currentAddress = null;

  @JsonProperty("permanent_address")
  private Address permanentAddress = null;

  /**
   * Gets or Sets accountType
   */
  public enum AccountTypeEnum {
    DEPOSIT("deposit"),
    
    SAVINGS("savings");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AccountTypeEnum fromValue(String text) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("account_type")
  private AccountTypeEnum accountType = null;

  @JsonProperty("pan_number")
  private String panNumber = null;

  @JsonProperty("identification")
  private AccountsIdentification identification = null;

  @JsonProperty("open_date")
  private LocalDate openDate = null;

  @JsonProperty("balance")
  private Double balance = null;

  public AccountsBody name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AccountsBody contact(String contact) {
    this.contact = contact;
    return this;
  }

  /**
   * Get contact
   * @return contact
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public AccountsBody currentAddress(Address currentAddress) {
    this.currentAddress = currentAddress;
    return this;
  }

  /**
   * Get currentAddress
   * @return currentAddress
   **/
  @Schema(description = "")
  
    @Valid
    public Address getCurrentAddress() {
    return currentAddress;
  }

  public void setCurrentAddress(Address currentAddress) {
    this.currentAddress = currentAddress;
  }

  public AccountsBody permanentAddress(Address permanentAddress) {
    this.permanentAddress = permanentAddress;
    return this;
  }

  /**
   * Get permanentAddress
   * @return permanentAddress
   **/
  @Schema(required = true, description = "")
      @NotNull

    @Valid
    public Address getPermanentAddress() {
    return permanentAddress;
  }

  public void setPermanentAddress(Address permanentAddress) {
    this.permanentAddress = permanentAddress;
  }

  public AccountsBody accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Get accountType
   * @return accountType
   **/
  @Schema(required = true, description = "")
      @NotNull

    public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  public AccountsBody panNumber(String panNumber) {
    this.panNumber = panNumber;
    return this;
  }

  /**
   * Get panNumber
   * @return panNumber
   **/
  @Schema(required = true, description = "")
      @NotNull

    public String getPanNumber() {
    return panNumber;
  }

  public void setPanNumber(String panNumber) {
    this.panNumber = panNumber;
  }

  public AccountsBody identification(AccountsIdentification identification) {
    this.identification = identification;
    return this;
  }

  /**
   * Get identification
   * @return identification
   **/
  @Schema(description = "")
  
    @Valid
    public AccountsIdentification getIdentification() {
    return identification;
  }

  public void setIdentification(AccountsIdentification identification) {
    this.identification = identification;
  }

  public AccountsBody openDate(LocalDate openDate) {
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

  public AccountsBody balance(Double balance) {
    this.balance = balance;
    return this;
  }

  /**
   * Get balance
   * minimum: 0
   * @return balance
   **/
  @Schema(description = "")
  
  @DecimalMin("0")  public Double getBalance() {
    return balance;
  }

  public void setBalance(Double balance) {
    this.balance = balance;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsBody accountsBody = (AccountsBody) o;
    return Objects.equals(this.name, accountsBody.name) &&
        Objects.equals(this.contact, accountsBody.contact) &&
        Objects.equals(this.currentAddress, accountsBody.currentAddress) &&
        Objects.equals(this.permanentAddress, accountsBody.permanentAddress) &&
        Objects.equals(this.accountType, accountsBody.accountType) &&
        Objects.equals(this.panNumber, accountsBody.panNumber) &&
        Objects.equals(this.identification, accountsBody.identification) &&
        Objects.equals(this.openDate, accountsBody.openDate) &&
        Objects.equals(this.balance, accountsBody.balance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, contact, currentAddress, permanentAddress, accountType, panNumber, identification, openDate, balance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsBody {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    currentAddress: ").append(toIndentedString(currentAddress)).append("\n");
    sb.append("    permanentAddress: ").append(toIndentedString(permanentAddress)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    panNumber: ").append(toIndentedString(panNumber)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    openDate: ").append(toIndentedString(openDate)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
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
