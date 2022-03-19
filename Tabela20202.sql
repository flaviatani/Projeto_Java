 create database db20202;
create table db20202.usuarios (
 id BIGINT NOT NULL AUTO_INCREMENT, 
 login VARCHAR(255), 
 senha VARCHAR(255), 
 status VARCHAR(255), 
 tipo VARCHAR(255), 
 primary key (id));
 
create table db20202.pessoas ( 
id BIGINT NOT NULL AUTO_INCREMENT, 
nome VARCHAR(255), 
cpf VARCHAR(255), 
tipo VARCHAR(255), 
email VARCHAR(255), 
primary key (id));

create table db20202.usuarios_pessoas ( 
id BIGINT NOT NULL AUTO_INCREMENT, 
idUsuario BIGINT, 
idPessoa BIGINT, 
observacao VARCHAR(255), 
primary key (id));

ALTER TABLE db20202.usuarios_pessoas ADD CONSTRAINT FK_PES_USU_ID FOREIGN KEY (IDPESSOA) REFERENCES db20202.PESSOAS (ID); 
ALTER TABLE db20202.usuarios_pessoas ADD CONSTRAINT FK_USU_PES_ID FOREIGN KEY (IDUSUARIO) REFERENCES db20202.USUARIOS (ID);

INSERT INTO `db20202`.`pessoas` (`id`, `nome`, `cpf`, `tipo`, `email`) VALUES ('1', 'Marcos ', '13508122859', 'Prof', 'meuemail@gmail.com'); 
INSERT INTO `db20202`.`pessoas` (`id`, `nome`, `cpf`, `tipo`, `email`) VALUES ('2', 'Juliana', '123456789', 'Func', 'email@gmail.com');

INSERT INTO `db20202`.`usuarios` (`id`, `login`, `senha`, `status`, `tipo`) VALUES ('1', 'BITTENCOURT', 'ABFABF010101', 'ATIVO', 'ADM'); 
INSERT INTO `db20202`.`usuarios` (`id`, `login`, `senha`, `status`, `tipo`) VALUES ('2', 'SCURACCHIO', 'ABFABF010101', 'ATIVO', 'VISITANTE');

INSERT INTO `db20202`.`usuarios_pessoas` (`id`, `idPessoa`, `idUsuario`, `observacao`) VALUES ('1', '1', '1', 'TESTE 1'); 
INSERT INTO `db20202`.`usuarios_pessoas` (`id`, `idPessoa`, `idUsuario`, `observacao`) VALUES ('2', '2', '2', 'TESTE 2');

create table db20202.funcionarios (
  id BIGINT NOT NULL AUTO_INCREMENT,
  nome VARCHAR(255),
  funcao VARCHAR(255),
  id_pessoa VARCHAR(255),
  primary key (id));

create table db20202.unidadetrab (
  id BIGINT NOT NULL AUTO_INCREMENT,
  nome_unidae VARCHAR(255),
  responsavelunidadetrab VARCHAR(255),
  primary key (id));

create table db20202.fun_unidade (
  id BIGINT NOT NULL AUTO_INCREMENT,
  idfuncionario BIGINT, 
  idunidade BIGINT,
  desempenho VARCHAR(255),
  primary key (id));

ALTER TABLE db20202.fun_unidade ADD CONSTRAINT FK_tb1 FOREIGN KEY (IDFUNCIONARIO) REFERENCES db20202.FUNCIONARIOS (ID);
ALTER TABLE db20202.fun_unidade ADD CONSTRAINT FK_tb2 FOREIGN KEY (IDUNIDADE) REFERENCES db20202.UNIDADETRAB (ID);

