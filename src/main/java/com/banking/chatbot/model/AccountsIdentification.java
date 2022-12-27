package com.banking.chatbot.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

import java.util.Objects;

/**
 * AccountsIdentification
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-27T05:52:23.176Z[GMT]")


public class AccountsIdentification   {
  @JsonProperty("driver_license")
  private String driverLicense = null;

  @JsonProperty("passport")
  private String passport = null;

  public AccountsIdentification driverLicense(String driverLicense) {
    this.driverLicense = driverLicense;
    return this;
  }

  /**
   * Get driverLicense
   * @return driverLicense
   **/
  @Schema(description = "")
  
    public String getDriverLicense() {
    return driverLicense;
  }

  public void setDriverLicense(String driverLicense) {
    this.driverLicense = driverLicense;
  }

  public AccountsIdentification passport(String passport) {
    this.passport = passport;
    return this;
  }

  /**
   * Get passport
   * @return passport
   **/
  @Schema(description = "")
  
    public String getPassport() {
    return passport;
  }

  public void setPassport(String passport) {
    this.passport = passport;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountsIdentification accountsIdentification = (AccountsIdentification) o;
    return Objects.equals(this.driverLicense, accountsIdentification.driverLicense) &&
        Objects.equals(this.passport, accountsIdentification.passport);
  }

  @Override
  public int hashCode() {
    return Objects.hash(driverLicense, passport);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountsIdentification {\n");
    
    sb.append("    driverLicense: ").append(toIndentedString(driverLicense)).append("\n");
    sb.append("    passport: ").append(toIndentedString(passport)).append("\n");
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
