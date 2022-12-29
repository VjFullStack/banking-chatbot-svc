package com.banking.chatbot.mapper;

import com.banking.chatbot.entities.Account;
import com.banking.chatbot.entities.Address;
import com.banking.chatbot.entities.Identification;
import com.banking.chatbot.model.AccountsBody;
import com.banking.chatbot.utils.Utility;

public class AccountCreationMapper {
    public static Account fromAccountsBody(AccountsBody accountsBody) {
        Account account = new Account();

        account.setId(Utility.generateAccountNo());
        account.setName(accountsBody.getName());
        account.setContact(accountsBody.getContact());
        if (accountsBody.getCurrentAddress() != null) {
            account.setCurrentAddress(mapAddresses(accountsBody.getCurrentAddress()));
        }
        if (accountsBody.getPermanentAddress() != null) {
            account.setPermanentAddress(mapAddresses(accountsBody.getPermanentAddress()));
        }
        if (accountsBody.getAccountType() != null) {
            account.setAccountType(accountsBody.getAccountType().toString());
        }
        account.setPanNumber(accountsBody.getPanNumber());
        if (accountsBody.getIdentification() != null) {
            account.setIdentification(mapIdentification(accountsBody.getIdentification()));
        }
        account.setOpenDate(accountsBody.getOpenDate());
        return account;
    }

    public static Address mapAddresses(com.banking.chatbot.model.Address address) {
        Address mappedAddress = new Address();
        if (address != null) {
            mappedAddress.setAddressLine1(address.getAddressLine1());
            mappedAddress.setAddressLine2(address.getAddressLine2());
            mappedAddress.setLandmark(address.getLandmark());
            mappedAddress.setCity(address.getCity());
            mappedAddress.setState(address.getState());
            mappedAddress.setPincode(address.getPincode());
        }
        return mappedAddress;

    }
    public static Identification mapIdentification(com.banking.chatbot.model.AccountsIdentification identification) {
        Identification mappedIdentification = new Identification();
        if(identification!=null) {
            mappedIdentification.setDriverLicense(identification.getDriverLicense());
            mappedIdentification.setPassport(identification.getPassport());
        }
        return mappedIdentification;
    }

}

