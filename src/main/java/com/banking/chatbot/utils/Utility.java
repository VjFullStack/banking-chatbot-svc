package com.banking.chatbot.utils;

import java.util.Random;

public class Utility {

    public static Long generateAccountNo()
    {
        Random random = new Random();
        int numDigits = 10;
        long min = (long) Math.pow(10, numDigits - 1);  // Minimum long number with 10 digits
        long max = (long) Math.pow(10, numDigits) - 1;  // Maximum long number with 10 digits
        return min + ((long) (random.nextDouble() * (max - min)));  // Generate a random long number between the minimum and maximum values
    }
}
