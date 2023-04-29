package com.banking.chatbot.repository;

import com.banking.chatbot.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, String> {
}
