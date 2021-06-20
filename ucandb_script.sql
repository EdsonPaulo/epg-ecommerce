/*============================================================
	Ficheiro: ucandb_script.sql 
  	Autor: Edson Paulo Gregório - 20973                     
  	Descrição: Script SQL para gerar a base de dados      
*============================================================*/

DROP DATABASE IF EXISTS ucandb;
CREATE DATABASE ucandb;
USE ucandb;

CREATE TABLE account
(
	pk_account SERIAL,
	username VARCHAR (50) NOT NULL,
	password VARCHAR (50) NOT NULL,
	access_level NOT NULL,
	PRIMARY KEY (pk_account)
);

CREATE TABLE locality
(
	pk_locality SERIAL,
	designation VARCHAR (50) NOT NULL,
	fk_locality INTEGER,
	PRIMARY KEY (pk_locality),
	FOREIGN KEY (fk_locality) REFERENCES locality (pk_locality)
);

CREATE TABLE person
(
	pk_person SERIAL,
	name VARCHAR(50) NOT NULL,
	gender VARCHAR(30) NOT NULL,
	phone VARCHAR(20) not null,
	birthdate date NOT NULL,
	fk_account INTEGER NOT NULL,
	fk_locality INTEGER NOT NULL,
	PRIMARY KEY (pk_person),
	FOREIGN KEY (fk_account) REFERENCES account (pk_account),
	FOREIGN KEY (fk_locality) REFERENCES locality (pk_locality)
);

CREATE TABLE employee
(
  	pk_employee SERIAL,
  	fk_person INTEGER NOT NULL,
	PRIMARY KEY (pk_employee),
	FOREIGN KEY (fk_person) REFERENCES person (pk_person)
);

CREATE TABLE customer
(
	pk_customer SERIAL,
	fk_person INTEGER NOT NULL,
	PRIMARY KEY (pk_customer),
	FOREIGN KEY (fk_person) REFERENCES person (pk_person)
);

CREATE TABLE supplier
(
  	pk_supplier SERIAL,
  	name VARCHAR(50) NOT NULL,
  	PRIMARY KEY (pk_supplier)
);

CREATE TABLE category
(
	pk_category SERIAL,
	designation VARCHAR(50) NOT NULL,
	fk_category INTEGER,
	PRIMARY KEY (pk_category),
	FOREIGN KEY (fk_category) REFERENCES category (pk_category)
);

CREATE TABLE product
(
  	pk_product SERIAL,
  	name VARCHAR(50) NULL,
  	image VARCHAR(60) NULL,
  	data_product VARCHAR(50) NULL,
  	description VARCHAR(50) NULL,
  	price float NOT NULL,
  	fk_supplier INTEGER NOT NULL,
  	fk_category INTEGER not null,
  	PRIMARY KEY (pk_product),
  	FOREIGN KEY (fk_supplier) REFERENCES supplier (pk_supplier),
  	FOREIGN KEY (fk_category) REFERENCES  category (pk_category)
);

CREATE TABLE warehouse
(
	pk_montra SERIAL,
	fk_product INTEGER NOT NULL,
	PRIMARY KEY (pk_montra),
	FOREIGN KEY (fk_product) REFERENCES product (pk_product)
);

CREATE TABLE order
(
  	pk_order SERIAL,
  	fk_customer INTEGER NOT NULL,
  	created_at DATE NOT NULL,
  	PRIMARY KEY (pk_order),
  	FOREIGN KEY (fk_customer) REFERENCES customer (pk_customer)
);

CREATE TABLE item_order
(
  	fk_order INTEGER NOT NULL,
  	fk_product INTEGER NOT NULL,
  	quantity INTEGER NOT NULL,
	total float NOT NULL,
  	FOREIGN KEY (fk_product) REFERENCES product (pk_product),
  	FOREIGN KEY (fk_order) REFERENCES order (pk_order)
);

CREATE TABLE montra
(
	pk_montra SERIAL,
	fk_product INTEGER NOT NULL,
  	quantity INTEGER NOT NULL,
	PRIMARY KEY (pk_montra),
	FOREIGN KEY (fk_product) REFERENCES product (pk_product)
);


 