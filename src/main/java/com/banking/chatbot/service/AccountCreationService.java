package com.banking.chatbot.service;

import com.banking.chatbot.entities.Account;
import com.banking.chatbot.mapper.AccountCreationMapper;
import com.banking.chatbot.model.AccountsBody;
import com.banking.chatbot.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service class responsible for creating a new account in the database.
 *
 * @author Viraj Salokhe
 */
@Service
public class AccountCreationService {
    // ... other code

    /**
     * Repository for accessing and manipulating account data in the database.
     */
    @Autowired
    AccountRepository accountRepository;

    /**
     * Creates a new account in the database using the data provided in the given {@link AccountsBody}.
     *
     * @param accountsBody The request body containing the data for the new account.
     * @return The ID of the newly created account.
     */

    @Transactional
    public String createAccount(AccountsBody accountsBody) {
        Account account = AccountCreationMapper.fromAccountsBody(accountsBody);
        // Save the account to the database using the AccountRepository
        accountRepository.save(account);
        return String.valueOf(account.getId());
    }
}

