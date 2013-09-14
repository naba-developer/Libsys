CREATE DATABASE IF NOT EXISTS libsys;

USE libsys;

CREATE TABLE IF NOT EXISTS Borrowers (
	B_id varchar(30) NOT NULL,
	B_name varchar(300) NOT NULL,
	B_email varchar(300) NOT NULL,
	B_phno varchar(300) NOT NULL,
	B_address varchar(400) NOT NULL,
	B_sex varchar(40) NOT NULL,
	PRIMARY KEY (B_id)
) TYPE=INNODB
;

CREATE TABLE IF NOT EXISTS Books (
	Book_id varchar(30) NOT NULL,
	Book_title varchar(300) NOT NULL ,
	Book_author varchar (300) NOT NULL,
	Book_publisher varchar(300) NOT NULL,
	Book_edition varchar(30)NOT NULL,
	Book_price varchar(300) NOT NULL,
	Book_availaible varchar(30) NOT NULL,
	PRIMARY KEY (Book_id)
) TYPE=INNODB
;

CREATE TABLE IF NOT EXISTS Transactions (
	B_id varchar(30) NOT NULL,
	Book_id varchar(30)NOT NULL,
	Borrow_date date  NOT NULL,
	Due_date date  NOT NULL,
	Return_date date ,
	FOREIGN KEY (B_id) REFERENCES Borrowers(B_id),
	FOREIGN KEY (Book_id) REFERENCES Books(Book_id)
	) TYPE=INNODB
;

CREATE TABLE IF NOT EXISTS Fines (
	Fine_time varchar(300) NOT NULL,
	B_id varchar(30) NOT NULL,
	Fine_amount int NOT NULL ,
	Fine_paid varchar(30) NOT NULL,
	Fine_reason varchar(300) NOT NULL,
	PRIMARY KEY (Fine_time),
	FOREIGN KEY (B_id) REFERENCES Borrowers(B_id)
	) TYPE=INNODB
;
CREATE TABLE IF NOT EXISTS Images (
	B_id  varchar(30)NOT NULL,
	image MEDIUMBLOB NOT NULL,
	PRIMARY KEY(B_id),
	FOREIGN KEY (B_id) REFERENCES Borrowers(B_id) 
	) TYPE=INNODB
;





