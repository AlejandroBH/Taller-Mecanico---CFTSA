-- ==============================================================
-- | CREACION DE TABLAS PRINCIPALES                             |
-- ==============================================================
DROP SCHEMA IF EXISTS taller_mecanico;
CREATE SCHEMA taller_mecanico;
USE taller_mecanico;

CREATE TABLE cliente (
    idCliente INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    rut VARCHAR(20) NOT NULL UNIQUE,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    telefono VARCHAR(20),
    email VARCHAR(100)
)  ENGINE=INNODB;

CREATE TABLE vehiculo (
    idVehiculo INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    idCliente INT NOT NULL,
    patente VARCHAR(20) NOT NULL UNIQUE,
    marca VARCHAR(50) NOT NULL,
    modelo VARCHAR(50) NOT NULL,
    anio INT NOT NULL,
    kilometraje INT NOT NULL CHECK(kilometraje >= 0)
)  ENGINE=INNODB;

CREATE TABLE usuario (
    idUsuario INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    passwordHash VARCHAR(255) NOT NULL,
    rol VARCHAR(20) NOT NULL
)  ENGINE=INNODB;

CREATE TABLE repuesto (
    idRepuesto INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    stock INT NOT NULL CHECK(stock >= 0),
    precioUnitario DECIMAL(10 , 2 ) NOT NULL CHECK(precioUnitario >=0)
)  ENGINE=INNODB;

CREATE TABLE automovil (
    idVehiculo INT NOT NULL PRIMARY KEY,
    numeroPuertas INT NOT NULL CHECK (numeroPuertas > 0)
)  ENGINE=INNODB;

CREATE TABLE camioneta(
	idVehiculo INT NOT NULL PRIMARY KEY,
    capacidadCarga DECIMAL(10,2) NOT NULL CHECK(capacidadCarga > 0)
)ENGINE=INNODB;

CREATE TABLE motocicleta (
    idVehiculo INT NOT NULL PRIMARY KEY,
    cilindrada INT NOT NULL CHECK(cilindrada > 0)
)  ENGINE=INNODB;

CREATE TABLE mecanico (
    idUsuario INT NOT NULL UNIQUE,
    idMecanico INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    rut VARCHAR(20) NOT NULL UNIQUE,
    nombre VARCHAR(100) NOT NULL,
    apellido VARCHAR(100) NOT NULL,
    especialidad VARCHAR(100) NOT NULL
)  ENGINE=INNODB;

CREATE TABLE orden_trabajo (
    idOrden INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    idVehiculo INT NOT NULL,
    idMecanico INT NOT NULL,
    fechaIngreso DATE NOT NULL,
    fechaEntrega DATE NOT NULL,
    descripcionTrabajo VARCHAR(255) NOT NULL,
    estado VARCHAR(50) NOT NULL
)  ENGINE=INNODB;

CREATE TABLE detalle_orden_repuesto (
    idOrden INT NOT NULL,
    idRepuesto INT NOT NULL,
    cantidad INT NOT NULL CHECK (cantidad > 0),
    precioAplicado DECIMAL(10 , 2 ) NOT NULL CHECK (precioAplicado > 0),
    PRIMARY KEY (idOrden , idRepuesto)
)  ENGINE=INNODB;

-- ==============================================================
-- | ESTABLECEMOS LLAVES FORANEAS                               |
-- ==============================================================
ALTER TABLE vehiculo ADD CONSTRAINT fk_vehiculo_idcliente FOREIGN KEY (idCliente) REFERENCES cliente(idCliente);
ALTER TABLE automovil ADD CONSTRAINT fk_automovil_idvehiculo FOREIGN KEY (idVehiculo) REFERENCES vehiculo(idVehiculo);
ALTER TABLE camioneta ADD CONSTRAINT fk_camioneta_idvehiculo FOREIGN KEY (idVehiculo) REFERENCES vehiculo(idVehiculo);
ALTER TABLE motocicleta ADD CONSTRAINT fk_motocicleta_idvehiculo FOREIGN KEY (idVehiculo) REFERENCES vehiculo(idVehiculo);
ALTER TABLE mecanico ADD CONSTRAINT fk_mecanico_idusuario FOREIGN KEY (idUsuario) REFERENCES usuario(idUsuario);
ALTER TABLE orden_trabajo ADD CONSTRAINT fk_orden_trabajo_idvehiculo FOREIGN KEY(idVehiculo) REFERENCES vehiculo(idVehiculo);
ALTER TABLE orden_trabajo ADD CONSTRAINT fk_orden_trabajo_idmecanico FOREIGN KEY(idMecanico) REFERENCES mecanico(idMecanico);
ALTER TABLE detalle_orden_repuesto ADD CONSTRAINT fk_detalle_orden_repuesto_idorden FOREIGN KEY(idOrden) REFERENCES orden_trabajo(idOrden);
ALTER TABLE detalle_orden_repuesto ADD CONSTRAINT fk_detalle_orden_repuesto_idrepuesto FOREIGN KEY(idRepuesto) REFERENCES repuesto(idRepuesto);