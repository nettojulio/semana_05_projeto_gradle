CREATE TABLE colaboradores (
	matricula_re integer not null unique primary key,
	nome varchar(60) not null,
	departamento varchar(60) not null,
	salario double not null,
	adicionais double,
	outros_descontos double
);