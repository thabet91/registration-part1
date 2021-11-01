create table UserEvents_UserEvent (
	uuid_ VARCHAR(75) null,
	userEventId LONG not null primary key,
	userId LONG,
	userName VARCHAR(75) null,
	userIP VARCHAR(75) null,
	eventDate DATE null,
	eventType INTEGER,
	groupId LONG
);