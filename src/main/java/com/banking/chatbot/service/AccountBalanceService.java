package com.banking.chatbot.service;

import com.banking.chatbot.api.NotFoundException;
import com.banking.chatbot.entities.Account;
//import com.banking.chatbot.repository.AccountRepository;
import com.banking.chatbot.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AccountBalanceService {
    /**
     * Repository for accessing and manipulating account data in the database.
     */
    @Autowired
    AccountRepository accountRepository;

    /**
     * Gets the balance of the account with the specified account number.
     *
     * @param accountNumber The account number to retrieve the balance for.
     * @return The balance of the account with the specified account number, formatted as a string.
     * @throws NotFoundException if the account with the specified account number is not found.
     */
    @Transactional(readOnly = true)
    public String getAccountBalance(String accountNumber) throws NotFoundException {
        Optional<Account> optionalAccount = accountRepository.findById(accountNumber);
        if (!optionalAccount.isPresent()) {
            throw new NotFoundException(404,"Account not found with number: " + accountNumber);
        }

        Account account = optionalAccount.get();
        return account.getBalance().toString();
    }
}
