/*============================================================
	Ficheiro: ucandb_script.sql 
  	Autor: Edson Paulo Gregório - 20973                     
  	Descrição: Script SQL para gerar a base de dados      
*============================================================*/

DROP DATABASE IF EXISTS ucandb;
CREATE DATABASE ucandb;
USE ucandb;

CREATE TABLE user
(
	pk_user SERIAL,
	username VARCHAR (50) NOT NULL,
	password VARCHAR (50) NOT NULL,
	access_level VARCHAR(25) NOT NULL,
	PRIMARY KEY (pk_user)
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
	full_name VARCHAR(50) NOT NULL,
	gender CHAR(1) NOT NULL,
	phone VARCHAR(20) not null,
	birth_date date NOT NULL,
	fk_user INTEGER NOT NULL,
	fk_address INTEGER NOT NULL,
	PRIMARY KEY (pk_person),
	FOREIGN KEY (fk_user) REFERENCES user (pk_user),
	FOREIGN KEY (fk_address) REFERENCES locality (pk_locality)
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
  	name VARCHAR(50) NOT NULL,
  	image VARCHAR(60) NOT NULL,
  	exprires_at DATE NOT NULL,
  	description VARCHAR(50),
  	price FLOAT NOT NULL,
  	fk_supplier INTEGER NOT NULL,
  	fk_category INTEGER NOT NULL,
  	PRIMARY KEY (pk_product),
  	FOREIGN KEY (fk_supplier) REFERENCES supplier (pk_supplier),
  	FOREIGN KEY (fk_category) REFERENCES category (pk_category)
);

CREATE TABLE warehouse
(
	pk_warehouse SERIAL,
	fk_product INTEGER NOT NULL,
  	product_quantity INTEGER NOT NULL DEFAULT(0),
  	updated_at DATE NOT NULL,
	PRIMARY KEY (pk_warehouse),
	FOREIGN KEY (fk_product) REFERENCES product (pk_product)
);

CREATE TABLE order
(
  	pk_order SERIAL,
  	fk_customer INTEGER NOT NULL,
  	ordered_at DATE NOT NULL,
	total_amount FLOAT NOT NULL,
	fk_delivery_address INTEGER NOT NULL,
  	PRIMARY KEY (pk_order),
  	FOREIGN KEY (fk_customer) REFERENCES customer (pk_customer),
	FOREIGN KEY (fk_delivery_address) REFERENCES locality (pk_locality)
);

CREATE TABLE item_order
(
  	fk_order INTEGER NOT NULL,
  	fk_product INTEGER NOT NULL,
  	quantity INTEGER NOT NULL,
	amount FLOAT NOT NULL,
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


 