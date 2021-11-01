create index IX_268ED4CA on UserEvents_UserEvent (eventType);
create index IX_C0648750 on UserEvents_UserEvent (groupId);
create index IX_53FE58D4 on UserEvents_UserEvent (userId);
create unique index IX_F14EBC10 on UserEvents_UserEvent (uuid_[$COLUMN_LENGTH:75$], groupId);