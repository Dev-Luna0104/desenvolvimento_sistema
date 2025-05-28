
PASTA formularioBanco

drop database if exists banco;
create database banco;

use banco;

create table cadastro (codigo int primary key, nome varchar(100), telefone varchar(60), email varchar(100)); 

INSERT INTO cadastro (codigo,nome,telefone,email) VALUES (1,'Maria','(14) 3227-1212','maria@etec.sp.gov.br');
INSERT INTO cadastro (codigo,nome,telefone,email) VALUES (2,'Luiz','(14) 3232-4477','luiz@etec.sp.gov.br');
INSERT INTO cadastro (codigo,nome,telefone,email) VALUES (3,'Carlos','(14) 3231-1234','carlos@etec.sp.gov.br');


//----------------------------------------------------------------------------------//

pasta formulario_Produto_Banco

DROP DATABASE IF EXISTS banco;
CREATE DATABASE banco;
USE banco;

CREATE TABLE produtos (
    numero INT not null PRIMARY KEY, 
    produto VARCHAR(100), 
    quantidade INT NOT NULL, 
    valUnitario double NOT NULL,
    subTotal INT
);


INSERT INTO produtos (numero, produto, quantidade, valUnitario) 
VALUES (1, 'Batata', 50, 1.5);

INSERT INTO produtos (numero, produto, quantidade, valUnitario) 
VALUES (1, 'Batata', 50, 1.5);


UPDATE produtos 
SET subTotal = quantidade * valUnitario 
WHERE numero = 1; 