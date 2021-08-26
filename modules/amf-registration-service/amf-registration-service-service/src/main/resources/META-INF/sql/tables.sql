create table AMF_UserExtra (
	uuid_ VARCHAR(75) null,
	username VARCHAR(75) not null primary key,
	userId LONG,
	mobilePhone LONG,
	homePhone LONG,
	securityQuestion VARCHAR(75) null,
	securityQuestionAnswer VARCHAR(75) null
);