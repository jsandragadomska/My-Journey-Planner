CREATE SEQUENCE USER_SEQ
    START 1
    INCREMENT BY 1;

CREATE TABLE USER (
    ID              BIGINT PRIMARY KEY  not null,

    LOGIN           varchar(30)         not null,
    PASSWORD        varchar(30)         not null,
    EMAIL           varchar(50)         not null,
    ORIGINCOUNTRY        varchar(30)         not null,
    ORIGINCITY           varchar(30)         not null
);

CREATE SEQUENCE TRIP_SEQ
    START 1
    INCREMENT BY 1;

CREATE TABLE TRIP (
    ID              BIGINT PRIMARY KEY  not null,

    COUNTRY         varchar(30)         not null,
    CITY            varchar(30)         not null,
    FIRSTDAY        DATE                        ,
    LASTDAY         DATE
);