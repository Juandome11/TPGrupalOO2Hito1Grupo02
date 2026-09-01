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
-- GTID state at the beginning of the backup 
--



--
-- Table structure for table `cajero`
--

DROP TABLE IF EXISTS `cajero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cajero` (
  `idStaff` bigint NOT NULL,
  `turno` varchar(255) NOT NULL,
  `numeroCaja` int NOT NULL,
  PRIMARY KEY (`idStaff`),
  CONSTRAINT `FKbwrs3f9kmr31xy2wmodgvc4um` FOREIGN KEY (`idStaff`) REFERENCES `staff` (`idStaff`)
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
  `idStaff` bigint NOT NULL,
  `especialidad` varchar(255) NOT NULL,
  `certificado` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`idStaff`),
  CONSTRAINT `FK2h1siuh9gv1rb78d0e7q1rf46` FOREIGN KEY (`idStaff`) REFERENCES `staff` (`idStaff`)
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
  `idUnidadVenta` bigint NOT NULL,
  `cantCarpas` int NOT NULL,
  `tiempoArmado` int NOT NULL,
  PRIMARY KEY (`idUnidadVenta`),
  CONSTRAINT `FKog7wk4mn1g9k6cum1ylde56j9` FOREIGN KEY (`idUnidadVenta`) REFERENCES `unidadventa` (`idUnidadVenta`)
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
  `idDetallePedido` bigint NOT NULL AUTO_INCREMENT,
  `cantPlato` int NOT NULL,
  `idPedido` bigint NOT NULL,
  `idPlato` bigint NOT NULL,
  PRIMARY KEY (`idDetallePedido`),
  KEY `FKeodksqdsykury6uspvart8w7p` (`idPedido`),
  KEY `FKm5w2f8x1rh1i2fyjii39tnf6e` (`idPlato`),
  CONSTRAINT `FKeodksqdsykury6uspvart8w7p` FOREIGN KEY (`idPedido`) REFERENCES `pedido` (`idPedido`),
  CONSTRAINT `FKm5w2f8x1rh1i2fyjii39tnf6e` FOREIGN KEY (`idPlato`) REFERENCES `plato` (`idPlato`)
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
  `idFestival` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `temporada` varchar(255) NOT NULL,
  `fechaInicio` date NOT NULL,
  `fechaFin` date NOT NULL,
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
  `idUnidadVenta` bigint NOT NULL,
  `patente` varchar(255) NOT NULL,
  PRIMARY KEY (`idUnidadVenta`),
  CONSTRAINT `FKmjnjtikyyrdghuflmkcwv61tt` FOREIGN KEY (`idUnidadVenta`) REFERENCES `unidadventa` (`idUnidadVenta`)
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
  `idPedido` bigint NOT NULL AUTO_INCREMENT,
  `fechaTransaccion` time NOT NULL,
  `idUnidadVentaEntrega` bigint NOT NULL,
  `idFestivalPaso` bigint NOT NULL,
  PRIMARY KEY (`idPedido`),
  KEY `FK43dyxr29s5qxswes4tbwfyxhu` (`idUnidadVentaEntrega`),
  KEY `FKgq3f20bgmmqwgjbbwc4la2vtp` (`idFestivalPaso`),
  CONSTRAINT `FK43dyxr29s5qxswes4tbwfyxhu` FOREIGN KEY (`idUnidadVentaEntrega`) REFERENCES `unidadventa` (`idUnidadVenta`),
  CONSTRAINT `FKgq3f20bgmmqwgjbbwc4la2vtp` FOREIGN KEY (`idFestivalPaso`) REFERENCES `festival` (`idFestival`)
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
  `idPlato` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `precio` bigint NOT NULL,
  `costoProd` bigint NOT NULL,
  `idUnidadVenta` bigint DEFAULT NULL,
  PRIMARY KEY (`idPlato`),
  KEY `FKxyacvlotvruektopltptn2b1` (`idUnidadVenta`),
  CONSTRAINT `FKxyacvlotvruektopltptn2b1` FOREIGN KEY (`idUnidadVenta`) REFERENCES `unidadventa` (`idUnidadVenta`)
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
  `idStaff` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `apellido` varchar(255) NOT NULL,
  `dni` varchar(255) NOT NULL,
  `edad` int NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `fechaIngreso` date NOT NULL,
  `sueldoBase` bigint NOT NULL,
  `idUnidadVenta` bigint DEFAULT NULL,
  PRIMARY KEY (`idStaff`),
  UNIQUE KEY `UK_hbi156rodlf14wllc5l1jr541` (`dni`),
  KEY `FK5qnh3vdo9ajf9l6lkahh9vk81` (`idUnidadVenta`),
  CONSTRAINT `FK5qnh3vdo9ajf9l6lkahh9vk81` FOREIGN KEY (`idUnidadVenta`) REFERENCES `unidadventa` (`idUnidadVenta`)
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
  `idUnidadVenta` bigint NOT NULL AUTO_INCREMENT,
  `nombre` varchar(255) NOT NULL,
  `lugar` varchar(255) NOT NULL,
  `superficie` bigint NOT NULL,
  `codigo` varchar(10) NOT NULL,
  `idResponsableCargo` bigint NOT NULL,
  `idFestival` bigint NOT NULL,
  PRIMARY KEY (`idUnidadVenta`),
  UNIQUE KEY `UK_7jipfbqbg1vd3olsxde3os027` (`codigo`),
  KEY `FKidx2lbdo7xd3h5mhqtgyxmety` (`idResponsableCargo`),
  KEY `FK4qdwc6kjen1d65pu4td6i8907` (`idFestival`),
  CONSTRAINT `FK4qdwc6kjen1d65pu4td6i8907` FOREIGN KEY (`idFestival`) REFERENCES `festival` (`idFestival`),
  CONSTRAINT `FKidx2lbdo7xd3h5mhqtgyxmety` FOREIGN KEY (`idResponsableCargo`) REFERENCES `staff` (`idStaff`)
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

-- Dump completed on 2026-08-29  2:51:18
