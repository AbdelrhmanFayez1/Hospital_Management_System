create database HospitalManagement;
use HospitalManagement;

create table Doctor(
ssn varchar (255) primary key,
name VARCHAR(255) NOT NULL,
specialization VARCHAR(255) NOT NULL
);

create table patients(
ssn varchar(255) primary key,
name varchar (255) not null,
medical_insurance VARCHAR(255)  NULL,
date_of_admittance DATE NOT NULL,
date_of_checking_out Date  NULL
);


CREATE TABLE test(
test_id VARCHAR(255) PRIMARY KEY,
test_name VARCHAR(255) NOT NULL,
result VARCHAR(255) NOT NULL,
date DATE NOT NULL ,
time timestamp NOT NULL 
);



CREATE TABLE doctor_patient(
patient_ssn VARCHAR(255)FOREIGN KEY (patient_ssn)REFERENCES patients(ssn),
doctor_ssn VARCHAR(255)FOREIGN KEY (doctor_ssn) REFERENCES Doctor(ssn),
);

CREATE TABLE doctor_test(
doctor_ssn VARCHAR(255),
test_id VARCHAR(255),
CONSTRAINT doctor_ssn1 FOREIGN KEY (doctor_ssn) REFERENCES doctor(ssn),
CONSTRAINT test_id1 FOREIGN KEY (test_id) REFERENCES test(test_id) 
);

CREATE TABLE patient_test(
patient_ssn VARCHAR(255),
test_id VARCHAR(255),
CONSTRAINT patient_ssn2 FOREIGN KEY (patient_ssn) REFERENCES patients(ssn) ,
CONSTRAINT test_id2 FOREIGN KEY (test_id) REFERENCES test(test_id)
);


