package com.banking.chatbot.utils;

import com.banking.chatbot.entities.Address;

import java.util.Random;

/**
 * Utility class with utility methods.
 *
 * @author Viraj Salokhe
 */
public class Utility {
    /**
     * Generates a random 10-digit account number.
     *
     * @return The generated account number.
     */
    public static Long generateAccountNo() {
        Random random = new Random();
        int numDigits = 10;
        long min = (long) Math.pow(10, numDigits - 1);  // Minimum long number with 10 digits
        long max = (long) Math.pow(10, numDigits) - 1;  // Maximum long number with 10 digits
        return min + ((long) (random.nextDouble() * (max - min)));  // Generate a random long number between the minimum and maximum values
    }

    public static String  getAddressString(Address address) {
        StringBuilder sb = new StringBuilder();
        sb.append(address.getAddressLine1()).append(", ");
        if (address.getAddressLine2() != null && !address.getAddressLine2().isEmpty()) {
            sb.append(address.getAddressLine2()).append(", ");
        }
        if (address.getLandmark() != null && !address.getLandmark().isEmpty()) {
            sb.append(address.getLandmark()).append(", ");
        }
        sb.append(address.getCity()).append(", ");
        sb.append(address.getState()).append(" - ");
        sb.append(address.getPincode());
        return sb.toString();
    }
}

