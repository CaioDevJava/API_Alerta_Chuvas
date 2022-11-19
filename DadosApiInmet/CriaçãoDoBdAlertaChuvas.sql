create database ALERTA_CHUVAS;
USE ALERTA_CHUVAS;

drop table DADOS_API;
desc DADOS_API;
CREATE TABLE DADOS_API
(
-- Chave Primaria
	COD_PK int PRIMARY KEY NOT NULL auto_increment,
-- Vento Direção Horario
	VEN_DIR varchar(50),
-- Data da Medição
    DT_MEDICAO varchar(15),
-- Cidade onde esta a estação
    DC_NOME varchar(40),
-- Precipitação total diario
    CHUVA varchar(50),
-- Pressão Atmsférica ao nível da estação horaria
    PRE_INS varchar(50),
    VL_LATITUDE varchar(50),
-- Pressão Atmosférica minima na hora
    PRE_MIN varchar(50),
-- Umidade Relativa Maxima na hora
    UMD_MAX varchar(50),
-- Pressão Atmosférica Maxima na Hora
    PRE_MAX varchar(50),
-- Vento Velocidade Horaria
    VEN_VEL varchar(50),
-- Cidade/Estado da Estação
    UF varchar(5),
-- Temperatura Orvalho Minima na Hora
    PTO_MIN varchar(50),
-- Temperatura Máxima na Hora
    TEM_MAX varchar(50),
-- Radiação Global
    RAD_GLO varchar(50),
-- Temperatura do Ponto de Orvalho
    PTO_INS varchar(50),
-- Vento Rajada Maxima
    VEN_RAJ varchar(50),
-- Temperatura do Ar Bulbo Seco Horaria
	TEM_INS varchar(50),
-- Umidade Relativa do Ar Horaria
    UMD_INS varchar(50),
-- Codigo da Estação
    CD_ESTACAO varchar(15),
-- Umidade Relativa na Hora
    TEM_MIN varchar(50),
-- Longitude
    VL_LONGITUDE varchar(50),
-- Hora da Medição
    HR_MEDICAO varchar(50),
-- Umidade Relativa do ar minima diaria
    UMD_MIN varchar(50),
-- Temperatura Orvalho Maxima na Hora
    PTO_MAX varchar(50)
)charset = utf8;

INSERT INTO DADOS_API (VEN_DIR, DT_MEDICAO, DC_NOME,CHUVA,PRE_INS, 
VL_LATITUDE,PRE_MIN, UMD_MAX, PRE_MAX, VEN_VEL,UF, PTO_MIN, TEM_MAX, RAD_GLO, PTO_INS,
VEN_RAJ, TEM_INS, UMD_INS, CD_ESTACAO, TEM_MIN, VL_LONGITUDE, HR_MEDICAO, UMD_MIN,PTO_MAX)
 VALUES (45, 2022-09-27, "BRASILIA", 0, 889.2, -15.78944444,888.2,66,889.2,1.3,
 "DF",12.2,21.5,280.398,12.4,3.4,21.5,56,"A001", 18.9,47.92583332,1000,56,12.8);
 
 Select * from DADOS_API;
 delete from DADOS_API 
 where DT_MEDICAO = 2000-01-01;