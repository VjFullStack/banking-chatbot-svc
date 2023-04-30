package com.banking.chatbot.api;

import com.banking.chatbot.model.Address;
import com.banking.chatbot.repository.AddressRepository;
import com.banking.chatbot.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class AddressController implements AddressApi {

    @Autowired
    private AddressService addressService;


    @Override
    public ResponseEntity<String> getAddress(String accountNumber) {
        Optional<String> address = null;
        try {
            address = addressService.getAddress(accountNumber);
        } catch (NotFoundException e) {
            throw new RuntimeException(e);
        }


            return ResponseEntity.ok().body(address.get());

        }
    }


