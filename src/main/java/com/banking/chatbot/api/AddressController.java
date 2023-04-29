//package com.banking.chatbot.api;
//
//import com.banking.chatbot.model.Address;
//import com.banking.chatbot.repository.AddressRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.Optional;
//
//@RestController
//public class AddressController implements AddressApi {
//
//    private final AddressRepository addressRepository;
//
//    @Autowired
//     public AddressController(AddressRepository addressRepository) {
//        this.addressRepository = addressRepository;
//
//    }
//
//    @Override
//    public ResponseEntity<Address> getAddress(String accountNumber) {
//        Optional<Address> address = addressRepository.findById(accountNumber);
//
//        if (address.isPresent()) {
//            return ResponseEntity.ok().body(address.get());
//        } else {
//            throw new NotFoundException("Address not found for account number: " + accountNumber);
//        }
//    }
//}
//
