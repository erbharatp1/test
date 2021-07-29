-- MySQL dump 10.13  Distrib 8.0.17, for Win64 (x86_64)
--
-- Host: localhost    Database: fly_db
-- ------------------------------------------------------
-- Server version	8.0.17

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
-- Table structure for table `flight`
--

DROP TABLE IF EXISTS `flight`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `flight` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `carrier_name` varchar(255) DEFAULT NULL,
  `created_date` datetime DEFAULT NULL,
  `flight_model` varchar(255) DEFAULT NULL,
  `flight_number` varchar(255) DEFAULT NULL,
  `is_active` bit(1) DEFAULT NULL,
  `seat_capacity` bigint(20) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `user_id_update` bigint(20) DEFAULT NULL,
  `price` bigint(20) DEFAULT NULL,
  `active_status` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `flight`
--

LOCK TABLES `flight` WRITE;
/*!40000 ALTER TABLE `flight` DISABLE KEYS */;
INSERT INTO `flight` VALUES (2,'Hyderabad Airline','2021-07-04 22:25:45','12452','1234',_binary '\0',100,NULL,NULL,5000,'AC'),(4,'MI Airline','2021-07-04 22:23:50','MI1235',NULL,_binary '\0',121,NULL,NULL,1200,'AC'),(5,'Dubai Air','2021-07-04 22:25:03','ZX1234',NULL,_binary '\0',230,NULL,NULL,1234,'AC'),(6,'Vistara Airline','2021-07-03 19:33:40','XC1234',NULL,_binary '\0',121,NULL,NULL,6000,'AC'),(7,'Indigo Pro','2021-07-05 00:15:05','ING526',NULL,_binary '\0',101,NULL,NULL,2500,'AC'),(9,'Tata Air','2021-07-05 10:31:22','12SW2',NULL,_binary '\0',108,NULL,NULL,5200,'AC'),(10,'Speat Jet','2021-07-05 11:50:01','SD2234',NULL,_binary '\0',111,NULL,NULL,15200,'DE'),(15,'Exide Air','2021-07-10 20:03:11','Ex1234',NULL,NULL,100,NULL,NULL,4100,'AC');
/*!40000 ALTER TABLE `flight` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-10 21:01:22
