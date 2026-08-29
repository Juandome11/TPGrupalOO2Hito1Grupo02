CREATE DATABASE  IF NOT EXISTS `bd_epicentro_gourmet` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `bd_epicentro_gourmet`;
-- MySQL dump 10.13  Distrib 8.0.46, for Win64 (x86_64)
--
-- Host: localhost    Database: bd_epicentro_gourmet
-- ------------------------------------------------------
-- Server version	26.7.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
SET @MYSQLDUMP_TEMP_LOG_BIN = @@SESSION.SQL_LOG_BIN;
SET @@SESSION.SQL_LOG_BIN= 0;

--
-- GTID state at the beginning of the backup 
--



--
-- Table structure for table `cajero`
--

DROP TABLE IF EXISTS `cajero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cajero` (
  `idCajero` int NOT NULL,
  `turno` varchar(30) NOT NULL,
  `numeroCaja` int NOT NULL,
  PRIMARY KEY (`idCajero`),
  CONSTRAINT `fk_cajero` FOREIGN KEY (`idCajero`) REFERENCES `staff` (`idStaff`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cajero`
--

LOCK TABLES `cajero` WRITE;
/*!40000 ALTER TABLE `cajero` DISABLE KEYS */;
/*!40000 ALTER TABLE `cajero` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cocinero`
--

DROP TABLE IF EXISTS `cocinero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cocinero` (
  `idCocinero` int NOT NULL,
  `especialidad` varchar(30) NOT NULL,
  `certificado` varchar(45) NOT NULL,
  `bonusSueldo` int NOT NULL,
  PRIMARY KEY (`idCocinero`),
  CONSTRAINT `fk_cocinero` FOREIGN KEY (`idCocinero`) REFERENCES `staff` (`idStaff`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cocinero`
--

LOCK TABLES `cocinero` WRITE;
/*!40000 ALTER TABLE `cocinero` DISABLE KEYS */;
/*!40000 ALTER TABLE `cocinero` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `desarmable`
--

DROP TABLE IF EXISTS `desarmable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `desarmable` (
  `idDesarmable` int NOT NULL,
  `tiempoArmado` int NOT NULL,
  PRIMARY KEY (`idDesarmable`),
  CONSTRAINT `fk_desarmable` FOREIGN KEY (`idDesarmable`) REFERENCES `unidadventa` (`idUnidadVenta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `desarmable`
--

LOCK TABLES `desarmable` WRITE;
/*!40000 ALTER TABLE `desarmable` DISABLE KEYS */;
/*!40000 ALTER TABLE `desarmable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detallepedido`
--

DROP TABLE IF EXISTS `detallepedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detallepedido` (
  `idDetallePedido` int NOT NULL AUTO_INCREMENT,
  `pedido` int NOT NULL,
  `plato` int NOT NULL,
  `cantida` int NOT NULL,
  PRIMARY KEY (`idDetallePedido`),
  KEY `fk_detallePedido_1_idx` (`pedido`),
  KEY `fk_detallePedido_2_idx` (`plato`),
  CONSTRAINT `fk_detallePedido_1` FOREIGN KEY (`pedido`) REFERENCES `pedido` (`idPedido`),
  CONSTRAINT `fk_detallePedido_2` FOREIGN KEY (`plato`) REFERENCES `plato` (`idPlato`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detallepedido`
--

LOCK TABLES `detallepedido` WRITE;
/*!40000 ALTER TABLE `detallepedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `detallepedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `festival`
--

DROP TABLE IF EXISTS `festival`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `festival` (
  `idFestival` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `temporada` varchar(45) NOT NULL,
  `fechaInicio` date DEFAULT NULL,
  `fechaFin` date DEFAULT NULL,
  PRIMARY KEY (`idFestival`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `festival`
--

LOCK TABLES `festival` WRITE;
/*!40000 ALTER TABLE `festival` DISABLE KEYS */;
/*!40000 ALTER TABLE `festival` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `foodtrack`
--

DROP TABLE IF EXISTS `foodtrack`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `foodtrack` (
  `idFoodTrack` int NOT NULL,
  `patente` varchar(30) NOT NULL,
  PRIMARY KEY (`idFoodTrack`),
  CONSTRAINT `fk_foodTrack` FOREIGN KEY (`idFoodTrack`) REFERENCES `unidadventa` (`idUnidadVenta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `foodtrack`
--

LOCK TABLES `foodtrack` WRITE;
/*!40000 ALTER TABLE `foodtrack` DISABLE KEYS */;
/*!40000 ALTER TABLE `foodtrack` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pedido`
--

DROP TABLE IF EXISTS `pedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pedido` (
  `idPedido` int NOT NULL AUTO_INCREMENT,
  `unidadVenta` int NOT NULL,
  `festival` int NOT NULL,
  `fechaTransaccion` date DEFAULT NULL,
  PRIMARY KEY (`idPedido`),
  KEY `fk_pedido_idx` (`festival`),
  CONSTRAINT `fk_pedido` FOREIGN KEY (`festival`) REFERENCES `festival` (`idFestival`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pedido`
--

LOCK TABLES `pedido` WRITE;
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `plato`
--

DROP TABLE IF EXISTS `plato`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `plato` (
  `idPlato` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `precio` int NOT NULL,
  `costoProd` int NOT NULL,
  PRIMARY KEY (`idPlato`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plato`
--

LOCK TABLES `plato` WRITE;
/*!40000 ALTER TABLE `plato` DISABLE KEYS */;
/*!40000 ALTER TABLE `plato` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `staff`
--

DROP TABLE IF EXISTS `staff`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `staff` (
  `idStaff` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `apellido` varchar(45) NOT NULL,
  `dni` varchar(45) NOT NULL,
  `fechaNacimiento` date DEFAULT NULL,
  `fechaIngreso` date DEFAULT NULL,
  `sueldoBase` int NOT NULL,
  `unidadVenta` int NOT NULL,
  PRIMARY KEY (`idStaff`),
  KEY `fk_staff_idx` (`unidadVenta`),
  CONSTRAINT `fk_staff` FOREIGN KEY (`unidadVenta`) REFERENCES `unidadventa` (`idUnidadVenta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `staff`
--

LOCK TABLES `staff` WRITE;
/*!40000 ALTER TABLE `staff` DISABLE KEYS */;
/*!40000 ALTER TABLE `staff` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `unidadventa`
--

DROP TABLE IF EXISTS `unidadventa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `unidadventa` (
  `idUnidadVenta` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `lugar` varchar(45) NOT NULL,
  `responsable` int NOT NULL,
  `superficie` int NOT NULL,
  `codigo` varchar(45) NOT NULL,
  `festival` int NOT NULL,
  PRIMARY KEY (`idUnidadVenta`),
  KEY `fk_unidadVeta_idx` (`festival`),
  KEY `fk_unidadVenta_2_idx` (`responsable`),
  CONSTRAINT `fk_unidadVenta_2` FOREIGN KEY (`responsable`) REFERENCES `staff` (`idStaff`),
  CONSTRAINT `fk_unidadVeta` FOREIGN KEY (`festival`) REFERENCES `festival` (`idFestival`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `unidadventa`
--

LOCK TABLES `unidadventa` WRITE;
/*!40000 ALTER TABLE `unidadventa` DISABLE KEYS */;
/*!40000 ALTER TABLE `unidadventa` ENABLE KEYS */;
UNLOCK TABLES;
SET @@SESSION.SQL_LOG_BIN = @MYSQLDUMP_TEMP_LOG_BIN;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-08-29  1:21:44
