CREATE DATABASE MI_BASE_DE_DATOS


CREATE TABLE Usuarios(
    Id_Usuario int NOT NULL,
    Nombre varchar(50) NOT NULL,
    Apellido varchar(50) NOT NULL,
    Id_Localidad int NOT NULL
) ;

CREATE TABLE Age(
    Id_Edad int NOT NULL,
    Edad number NOT NULL
) ;

CREATE TABLE Location(
    Id_Localidad int NOT NULL,
    Localidad varchar(50) NOT NULL
) ;

CREATE TABLE Account_State(
    Id_EstadoCuenta int NOT NULL,
    Estado "vigente" or "no vigente" NOT NULL
) ;

CREATE TABLE Civil_state(
    Id_EstadoCivil int NOT NULL,
    Estado varchar(50) NOT NULL
) ;

ALTER TABLE Usuarios
 ADD PRIMARY KEY (Id_Usuario);

ALTER TABLE Usuarios 
ADD FOREIGN KEY (Localidad)
 REFERENCES Location (Id_Localidad);

ALTER TABLE Usuarios 
ADD FOREIGN KEY (Estado)
 REFERENCES Location (Account_State);

ALTER TABLE Usuarios 
ADD FOREIGN KEY (Estado)
 REFERENCES Location (Civil_state);




