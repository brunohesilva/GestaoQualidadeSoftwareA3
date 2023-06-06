CREATE DATABASE farmajapa;
use farmajapa;

CREATE TABLE usuario (
idUsuario int AUTO_INCREMENT NOT NULL,
nomeUsuario varchar(50),
cpfUsuario varchar(20),
emailUsuario varchar(50),
senhaUsuario varchar(50),
PRIMARY KEY (idUsuario)
);

CREATE TABLE funcionario (
idFuncionario INT AUTO_INCREMENT NOT NULL,
nomeFuncionario varchar(50),
cpfFuncionario varchar(20),
emailFuncionario varchar(50),
senhaFuncionario varchar(50),
funcaoFuncionario varchar(50),
PRIMARY KEY (idFuncionario)
);

CREATE TABLE adm (
idAdm INT AUTO_INCREMENT NOT NULL,
nomeAdm varchar(50),
cpfAdm varchar(20),
emailAdm varchar(50),
senhaAdm varchar(50),
funcaoAdm varchar(50),
isAdm boolean,
PRIMARY KEY (idAdm)
);

CREATE TABLE receita (
idReceita INT AUTO_INCREMENT NOT NULL,
nomePaciente varchar(50),
nomeMedico varchar(50),
crmMedico int,
dataReceita varchar(15),
nomeRemedio varchar(100),
usoRemedio varchar(250),
PRIMARY KEY (idReceita)
);

CREATE TABLE produto (
idProduto INT AUTO_INCREMENT NOT NULL,
nomeProduto varchar(100),
descricaoProduto varchar(250),
marcaProduto varchar(50),
tipoProduto varchar(50),
necessarioReceita boolean,
possuiEstoque boolean,
PRIMARY KEY (idProduto)
);