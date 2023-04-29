package com.banking.chatbot.service;

import com.banking.chatbot.api.NotFoundException;
import com.banking.chatbot.entities.Address;
import com.banking.chatbot.repository.AddressRepository;
import com.banking.chatbot.utils.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AddressService {
    /**
     * Repository for accessing and manipulating address data in the database.
     */
    @Autowired
    AddressRepository addressRepository;

    /**
     * Gets the custom string representation of the address with the specified ID.
     *
     * @param addressId The ID of the address to retrieve the string representation for.
     * @return The custom string representation of the address with the specified ID.
     * @throws NotFoundException if the address with the specified ID is not found.
     */
    @Transactional(readOnly = true)
    public String getAddressString(Long addressId) throws NotFoundException {
        Optional<Address> optionalAddress = addressRepository.findById(addressId.toString());
        if (!optionalAddress.isPresent()) {
            throw new NotFoundException(404,"Address not found with ID: "+addressId);
        }

        Address address = optionalAddress.get();
        return Utility.getAddressString(optionalAddress.get());
    }
}

