package com.banking.chatbot.api;

import com.banking.chatbot.model.AccountsBody;
import com.banking.chatbot.model.InlineResponse200;
import com.banking.chatbot.model.InlineResponse201;
import com.banking.chatbot.model.Transaction;
import com.banking.chatbot.service.AccountCreationService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.threeten.bp.LocalDate;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-12-27T05:52:23.176Z[GMT]")
@RestController
public class AccountsApiController implements AccountsApi {

    private static final Logger log = LoggerFactory.getLogger(AccountsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    private AccountCreationService accountCreationService;

    @org.springframework.beans.factory.annotation.Autowired
    public AccountsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }


    /**
     * Creates a new account in the database.
     *
     * @param body the request body containing the account information
     * @return a response with the created account and a success message, or an error status if something went wrong
     */
//    public ResponseEntity<InlineResponse201> createAccount(@Valid @RequestBody AccountsBody body) {
//        try {
//            accountCreationService.createAccount(body);
//            return ResponseEntity.status(HttpStatus.CREATED)
//                    .body(objectMapper.readValue("{\n  \"message\" : \"success\",\n  \"account\" : {\n    \"open_date\" : \"2000-01-23\",\n    \"number\" : \"number\",\n    \"type\" : \"deposit\"\n  }\n}", InlineResponse201.class));
//        } catch (IOException e) {
//            log.error("Couldn't serialize response for content type application/json", e);
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//        }
//    }

    @Override
    public ResponseEntity<InlineResponse201> accountsPost(AccountsBody body) {
        try {
          String accountNumber=  accountCreationService.createAccount(body);
          String accounttype = body.getAccountType().toString();
            return ResponseEntity.status(HttpStatus.CREATED)
                    .body(objectMapper.readValue("{\n  \"message\" : \"success\",\n  \"account\" : {\n    \"open_date\" : \"2000-01-23\",\n    \"number\" : " + accountNumber + ",\n    \"type\" : \"" +accounttype+ "\"\n  }\n}", InlineResponse201.class));
        } catch (IOException e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @Override
    public ResponseEntity<InlineResponse200> accountsAccountNumberBalanceGet(String accountNumber) {
        return null;
    }

    @Override
    public ResponseEntity<List<Transaction>> accountsAccountNumberTransactionsGet(String accountNumber, LocalDate startDate, LocalDate endDate, Integer limit) {
        return null;
    }

    @Override
    public ResponseEntity<Transaction> accountsAccountNumberTransactionsTransactionIdGet(String accountNumber, String transactionId) {
        return null;
    }
}
