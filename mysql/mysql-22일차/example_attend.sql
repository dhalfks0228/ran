CREATE DATABASE  IF NOT EXISTS `example` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `example`;
-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: example
-- ------------------------------------------------------
-- Server version	8.0.22

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

--
-- Table structure for table `attend`
--

DROP TABLE IF EXISTS `attend`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attend` (
  `at_num` int NOT NULL AUTO_INCREMENT,
  `at_st_num` int NOT NULL,
  `at_co_num` varchar(20) NOT NULL,
  `at_final` int DEFAULT '0',
  `at_mid` int DEFAULT '0',
  `at_attend` int DEFAULT '0',
  `at_hw` int DEFAULT '0',
  `at_repetition` char(1) DEFAULT NULL,
  `at_year` int DEFAULT NULL,
  `at_ternm` varchar(4) DEFAULT NULL,
  `at_score` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`at_num`),
  KEY `at_st_num` (`at_st_num`),
  KEY `at_co_num` (`at_co_num`),
  CONSTRAINT `at_co_num` FOREIGN KEY (`at_co_num`) REFERENCES `course` (`co_code`),
  CONSTRAINT `at_st_num` FOREIGN KEY (`at_st_num`) REFERENCES `student` (`std_num`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attend`
--

LOCK TABLES `attend` WRITE;
/*!40000 ALTER TABLE `attend` DISABLE KEYS */;
INSERT INTO `attend` VALUES (1,2020160001,'202021msc001',30,30,10,10,'n',2020,'2','B'),(2,2020160002,'202021msc001',40,35,5,10,'n',2020,'2','A'),(3,2020160001,'202021ipc002',40,40,10,10,'n',2020,'2','A'),(4,2020160002,'202021ipc002',24,34,6,7,'n',2020,'2','C'),(5,2020123001,'202021ipc002',10,10,10,10,'y',2020,'2','F'),(6,2020123020,'202021ipc002',35,35,10,10,'n',2020,'2','A'),(7,2019456001,'202021ipc001',15,15,10,10,'y',2020,'2','F'),(8,2019160123,'202021ipc001',25,25,10,0,'n',2020,'2','D');
/*!40000 ALTER TABLE `attend` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-17 17:13:52
