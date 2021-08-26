package com.lifray.amf.util.validator;


import com.lifray.amf.exception.UserExtraValidationException;
import com.lifray.amf.service.UserExtraLocalService;
import com.lifray.amf.validator.UserValidator;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(
	     immediate = true, 
	     service = UserValidator.class
	 )
public class UserValidatorImpl implements UserValidator {
	private List<String> errors = new ArrayList<>();
	@Reference
	private UserExtraLocalService _userExtraLocalServicel;
	@Override
	public void validate(String firstname, String lastname, String username, String password,
			String passwordConfirmation, Date birthday, String email, long homePhone, long mobilePhone, String address1,
			String address2, String city, String state, int zipcode, String securityAnswer, boolean termsOfUse)
			throws UserExtraValidationException {
		errors.clear();
		if(!isUserValid(firstname, lastname, username, password, passwordConfirmation, birthday, email, homePhone, mobilePhone, address1, address2, city, state, zipcode, securityAnswer, termsOfUse))
		 throw new UserExtraValidationException(errors);
		
	}
	private boolean isUserValid (String firstname, String lastname, String username, String password,
			String passwordConfirmation, Date birthday, String email, long homePhone, long mobilePhone, String address1,
			String address2, String city, String state, int zipcode, String securityAnswer, boolean termsOfUse) {
		if(!termsOfUse) {
			errors.add("please accept the terms of use");
			return false;
		}
		boolean  isValid = true;
		isValid &= isFieldSizeValid(firstname, "firstname", 1, 50,true);
		isValid &= isFieldSizeValid(lastname, "firstname", 1, 50,true);
		isValid &= isFieldSizeValid(email, "email", 1, 255,true);
		isValid &= isFieldSizeValid(username, "username", 4, 16,true);
		isValid &= isUserNameDoesNotExist(username);
		isValid &= isFieldSizeValid(password, "password", 6, 255,true);
		isValid &= isPasswordFormatValid(password);
		isValid &= isFieldSizeValid(passwordConfirmation, "password confirmation", 6, 255,true);
		isValid &= isPasswordConfirmationEqualPassword(password, passwordConfirmation);
		isValid &= isFieldSizeValid(Long.toString(homePhone), "home phone", 10, 255,false);
		isValid &= isFieldSizeValid(Long.toString(mobilePhone), "mobile phone", 10, 255,false);
		isValid &= isFieldSizeValid(address1, "address 1", 1, 255,true);
		isValid &= isFieldSizeValid(address2, "address 2", 0, 255,false);
		isValid &= isFieldSizeValid(city, "city", 1, 255,true);
		isValid &= isFieldSizeValid(state, "state", 1, 255,true);
		isValid &= isFieldSizeValid(Integer.toString(zipcode), "zip code", 5, 255,true);
		isValid &= isOver13YearsOld(birthday);
		return isValid;
	}
	
	private boolean isFieldSizeValid (String field, String fieldName, int minSize, int maxSize, boolean required) {
		if(required && (field == null || field.equals(""))) {
			errors.add(fieldName+" is required");
			return false;
		}else if(field.length()>maxSize) {
			errors.add(fieldName+" must be under "+maxSize +" characters");
			return false;
		}else if(field.length()<minSize) {
			errors.add(fieldName+" must be at least "+minSize +" characters");
			return false;
		}else
			return true;
			
	}
	
	private boolean isUserNameDoesNotExist (String username) {
		if(_userExtraLocalServicel.fetchUserExtra(username)== null) {
			return true;
		}
		errors.add("username exist already");
		return false;
	}
    public boolean isPasswordFormatValid(String password)
    {
  
        if (true) {
            int count = 0;
  
            for (int i = 0; i <= 9; i++) {
  
                String str1 = Integer.toString(i);
  
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
            	errors.add("password must contain at least one number");
                return false;
            }
        }
  
        if (!(password.contains("@") || password.contains("#")
              || password.contains("!") || password.contains("~")
              || password.contains("$") || password.contains("%")
              || password.contains("^") || password.contains("&")
              || password.contains("*") || password.contains("(")
              || password.contains(")") || password.contains("-")
              || password.contains("+") || password.contains("/")
              || password.contains(":") || password.contains(".")
              || password.contains(", ") || password.contains("<")
              || password.contains(">") || password.contains("?")
              || password.contains("|"))) {
        	errors.add("password must contain at least one special character");
            return false;
        }
  
        if (true) {
            int count = 0;
            for (int i = 65; i <= 90; i++) {
                char c = (char)i;
                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
            	errors.add("password must contain at least one capital letter");
                return false;
            }
        }
  
        if (true) {
            int count = 0;
            for (int i = 90; i <= 122; i++) {
                char c = (char)i;
                String str1 = Character.toString(c);
                if (password.contains(str1)) {
                    count = 1;
                }
            }
            if (count == 0) {
            	errors.add("password must contain at least one lower case letter");
                return false;
            }
        }
  
        return true;
    }

    private boolean isOver13YearsOld(Date birthday) {
    	LocalDate now = LocalDate.now();
    	LocalDate birthdayLocal = LocalDate.ofEpochDay(birthday.getTime());
    	Period age = Period.between(birthdayLocal, now);
    	if(age.getYears()>=13)
    		return true;
    	return false;
    }
    
    private boolean isPasswordConfirmationEqualPassword(String password,String passwordConfirmation) {
    	if(passwordConfirmation.equals(password))
    		return true;
    	return false;
    }


}
