CREATE DATABASE IF NOT EXISTS Stocksim;

USE Stocksim;
DROP TABLE IF EXISTS Round;
Drop table if exists Phase;
DROP TABLE IF EXISTS Company;
DROP TABLE IF EXISTS Client;


CREATE TABLE Company (
	Company_Name varchar(30) NOT NULL,
	Face_Value int NOT NULL,
	Market_Share int NOT NULL,
	Max_Shares int NOT NULL,
	Old_Value  int,
	Total_Shares_Bought int,
	PRIMARY KEY (Company_Name)
) TYPE=INNODB
;

CREATE TABLE Client (
	Client_Name varchar(30) NOT NULL,
	Stock_Balance int NOT NULL ,
	Money_Balance int NOT NULL
) TYPE=INNODB
;

CREATE TABLE Round (
	Company_Name varchar(30) NOT NULL,
	Client_Name varchar(30) NOT NULL,
	Shares int  NOT NULL,
	FOREIGN KEY (Company_Name) REFERENCES Company(Company_Name)
	) TYPE=INNODB
;
CREATE TABLE Phase (
	Company_Name varchar(30) NOT NULL,
	Client_Name varchar(30) NOT NULL,
	Shares int  NOT NULL,
	FOREIGN KEY (Company_Name) REFERENCES Company(Company_Name)
	
	) TYPE=INNODB
;






