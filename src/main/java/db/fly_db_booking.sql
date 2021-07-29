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
-- Table structure for table `booking`
--

DROP TABLE IF EXISTS `booking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `booking` (
  `booking_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_date` date DEFAULT NULL,
  `destination` varchar(255) DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `flight_id` bigint(20) DEFAULT NULL,
  `journey_from_date` date DEFAULT NULL,
  `journey_to_date` date DEFAULT NULL,
  `meal_one_preference` varchar(255) DEFAULT NULL,
  `meal_round_preference` varchar(255) DEFAULT NULL,
  `no_of_passengers` bigint(20) DEFAULT NULL,
  `origin` varchar(255) DEFAULT NULL,
  `pnr_no` bigint(20) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `ticket_status` varchar(255) DEFAULT NULL,
  `trip` varchar(255) DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `user_id_update` bigint(20) DEFAULT NULL,
  `depature` varchar(255) DEFAULT NULL,
  `departure_time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`booking_id`)
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking`
--

LOCK TABLES `booking` WRITE;
/*!40000 ALTER TABLE `booking` DISABLE KEYS */;
INSERT INTO `booking` VALUES (1,'2021-07-06','Mumbai',1000,2,'2021-07-02','2021-07-02','Veg','None',2,'Noida',33170,9000,'APR','RT',1,NULL,'12:56',NULL),(2,'2021-07-07','Indore',1000,9,'2021-07-01',NULL,'Non-Veg',NULL,3,'Jabalpur',85152,14600,'APR','OT',1,NULL,'2021-07-10',NULL),(3,'2021-07-07','Indore',500,10,'2021-07-06',NULL,'None',NULL,4,'Jabalpur',78193,60300,'APR','OT',1,NULL,'2021-07-16',NULL),(6,'2021-07-08','Mumbai',500,2,'2021-07-06',NULL,'Veg',NULL,1,'Noida',3757,4500,'APR','OT',1,NULL,'2021-07-17',NULL),(7,'2021-07-08','Mumbai',200,2,'2021-07-17',NULL,'Veg',NULL,1,'Noida',63531,4800,'APR','OT',1,NULL,NULL,NULL),(8,'2021-07-09','Indore',800,10,'2021-07-16',NULL,'Non-Veg',NULL,1,'Jabalpur',54767,14400,'APR','OT',7,NULL,NULL,NULL),(9,'2021-07-09','Indore',1000,10,'2021-07-16',NULL,'Non-Veg',NULL,2,'Jabalpur',39535,29400,'APR','OT',7,NULL,NULL,NULL),(10,'2021-07-09','Indore',1000,9,'2021-07-10',NULL,'Non-Veg',NULL,1,'Jabalpur',23742,4200,'APR','OT',7,NULL,NULL,'18:57'),(11,'2021-07-09','Indore',1000,9,'2021-07-10',NULL,NULL,NULL,1,'Jabalpur',97776,4200,'APR','OT',7,NULL,NULL,'18:57'),(15,'2021-07-10','Mumbai',1500,2,'2021-07-17','2021-07-16','Veg','Veg',1,'Noida',75962,3500,'APR','OT',8,NULL,NULL,NULL),(13,'2021-07-10','Ahmedabad',500,5,'2021-07-14',NULL,'Non-Veg',NULL,1,'Nagpur',7301,734,'APR','OT',7,NULL,NULL,NULL),(14,'2021-07-10','Mumbai',1000,2,'2021-07-17',NULL,'Veg',NULL,1,'Noida',28072,4000,'APR','OT',7,NULL,NULL,NULL),(16,'2021-07-10','Mumbai',1000,2,'2021-07-17',NULL,'Non-Veg',NULL,5,'Noida',18668,24000,'APR','OT',10,NULL,NULL,NULL);
/*!40000 ALTER TABLE `booking` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-10 21:01:28
