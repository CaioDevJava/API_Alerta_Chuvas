create database ALERTA_CHUVAS;
USE ALERTA_CHUVAS;

CREATE TABLE DADOS_API
(
-- Vento Direção Horario
	VEN_DIR int,
-- Data da Medição
    DT_MEDICAO varchar(12),
-- Cidade onde esta a estação
    DC_NOME varchar(40),
-- Precipitação total diario
    CHUVA int,
-- Pressão Atmsférica ao nível da estação horaria
    PRE_INS float,
    VL_LATITUDE float,
-- Pressão Atmosférica minima na hora
    PRE_MIN float,
-- Umidade Relativa Maxima na hora
    UMD_MAX int,
-- Pressão Atmosférica Maxima na Hora
    PRE_MAX float,
-- Vento Velocidade Horaria
    VEN_VEL float,
-- Cidade/Estado da Estação
    UF varchar(3),
-- Temperatura Orvalho Minima na Hora
    PTO_MIN float,
-- Temperatura Máxima na Hora
    TEM_MAX float,
-- Radiação Global
    RAD_GLO float,
-- Temperatura do Ponto de Orvalho
    PTO_INS float,
-- Vento Rajada Maxima
    VEN_RAJ float,
-- Umidade Relativa do Ar Horaria
    UMD_INS int,
-- Codigo da Estação
    CD_ESTACAO varchar(15) PRIMARY KEY NOT NULL,
-- Umidade Relativa na Hora
    TEM_MIN int,
-- Longitude
    VL_LONGITUDE float,
-- Hora da Medição
    HR_MEDICAO int,
-- Umidade Relativa do ar minima diaria
    UMD_MIN int,
-- Temperatura Orvalho Maxima na Hora
    PTO_MAX float
)charset = utf8;

DROP TABLE DADOS;