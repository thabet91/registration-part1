package com.lifray.amf.validator;

import com.lifray.amf.exception.UserExtraValidationException;

import java.util.Date;

public interface UserValidator {
    public void validate(String   firstname, String lastname, String username, String password, String passwordConfirmation, Date birthday,
    		String email, long homePhone, long mobilePhone, String address1, String address2, String city, String state, int zipcode,String securityAnswer, boolean termsOfUse)
                throws UserExtraValidationException;
    
}
