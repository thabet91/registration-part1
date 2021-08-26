package com.liferay.amf.constants;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FieldConstants {
	public static final String FIRSTNAME ="first_name";
	public static final String LASTNAME ="last_name";
	public static final String USERNAME ="username";
	public static final String EMAIL_ADDRESS ="email_address";
	public static final String MALE ="male";
	public static final String BIRTH_DAY ="b_day";
	public static final String BIRT_MONTH ="b_month";
	public static final String BIRTH_YEAR ="b_year";
	public static final String PASSWORD ="password1";
	public static final String PASSWORD_CONFIRMATION ="password2";
	public static final String MOBILE_PHONE ="mobile_phone";
	public static final String HOME_PHONE ="home_phone";
	public static final String ADDRESS_1 ="address";
	public static final String ADDRESS_2 ="address2";
	public static final String CITY ="city";
	public static final String STATE ="state";
	public static final String ZIP_CODE ="zip";
	public static final String SECURITY_QUESTION ="security_question";
	public static final String SECURITY_QUESTION_ANSWER ="security_answer";
	public static final String TERMS_OF_USE ="accepted_tou";
	public static final List<String> SECURITY_QUESTIONS;
	static{
		SECURITY_QUESTIONS = new ArrayList<>();
		SECURITY_QUESTIONS.add("What is your mother's maiden name?");
		SECURITY_QUESTIONS.add("What is the make of your first car?");
		SECURITY_QUESTIONS.add("What is your high school mascot?");
		SECURITY_QUESTIONS.add("Who is your favorite actor?");
		
	}
}
