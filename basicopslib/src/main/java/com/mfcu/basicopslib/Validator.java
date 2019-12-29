package com.mfcu.basicopslib;

public class Validator {
    public boolean verifyMobileNumber(String phoneNumber){
        if(phoneNumber.length() == 10)
            return true;
        return false;
    }
}
