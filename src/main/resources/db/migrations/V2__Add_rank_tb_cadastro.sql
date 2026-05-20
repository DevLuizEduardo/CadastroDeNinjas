-- V2: Migrations para adicionar coluna Rank na tabela cadastro

ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);