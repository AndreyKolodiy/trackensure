CREATE DATABASE trackensure
WITH OWNER = postgres
ENCODING = 'UTF8'
CONNECTION LIMIT = -1;

CREATE SCHEMA "garage";

SET search_path
TO "garage";

CREATE TABLE "garage" (
	"id" serial NOT NULL,
	"name" varchar(255) NOT NULL,
	"company" varchar(255) NOT NULL,
	"city" varchar(255) NOT NULL,
	"country" varchar(255) NOT NULL,
	CONSTRAINT "garage_pk" PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);

INSERT INTO garage.garage
 (name, company, city, country)
 VALUES
 ('Chips', 'Mega Chips', 'Odessa', 'Ukraine'),
 ('Apple', 'Apple', 'Odessa', 'Ukraine'),
 ('Kitchen', 'Bosh', 'Kiev', 'Ukraine'),
 ('Furniture', 'Mebel one', 'Odessa', 'Ukraine'),
 ('Gun', 'Osamm Bi company', 'Baghdad', 'Iraq');
