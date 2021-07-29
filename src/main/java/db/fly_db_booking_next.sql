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
-- Table structure for table `booking_next`
--

DROP TABLE IF EXISTS `booking_next`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `booking_next` (
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
  PRIMARY KEY (`booking_id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booking_next`
--

LOCK TABLES `booking_next` WRITE;
/*!40000 ALTER TABLE `booking_next` DISABLE KEYS */;
INSERT INTO `booking_next` VALUES (33,'2021-07-04','Mumbai',200,7,'2021-07-02',NULL,NULL,'Veg',2,'Noida',12345,5000,'APR','OT',1,NULL),(34,'2021-07-04','Mumbai',200,1,'2021-07-10','2021-07-09','Veg','Veg',2,'Noida',12345,2000,'APR','RT',1,NULL),(35,'2021-07-04','Mumbai',200,2,'2021-07-03',NULL,NULL,'Veg',1,'Noida',12345,5000,'APR','OT',1,NULL),(36,'2021-07-04','Mumbai',200,1,'2021-07-02',NULL,NULL,'Veg',1,'Noida',12345,1000,'APR','OT',3,NULL),(37,'2021-07-04','Mumbai',200,1,'2021-07-03',NULL,NULL,'Veg',1,'Noida',53063,1000,'APR','OT',1,NULL),(39,'2021-07-04','Mumbai',200,7,'2021-07-02',NULL,NULL,'Veg',1,'Noida',68886,2500,'APR','OT',3,NULL),(40,'2021-07-04','Mumbai',200,7,'2021-07-02',NULL,'Veg',NULL,1,'Noida',84330,2500,'APR','OT',1,NULL),(42,'2021-07-04','Mumbai',200,2,'2021-07-01',NULL,'Non-Veg',NULL,2,'Noida',1094,10000,'APR','OT',3,NULL),(43,'2021-07-04','Mumbai',200,2,'2021-07-03',NULL,'Veg',NULL,1,'Noida',12345,5000,'APR','OT',1,NULL),(44,'2021-07-04','Mumbai',200,1,'2021-07-02',NULL,'Veg',NULL,1,'Noida',12345,1000,'APR','OT',1,NULL),(45,'2021-07-04','Mumbai',200,2,'2021-07-02','2021-07-02','Veg','Non-Veg',1,'Noida',12345,5000,'APR','RT',3,NULL),(47,'2021-07-05','Mumbai',200,2,'2021-07-05',NULL,'Non-Veg',NULL,1,'Noida',38632,4800,'APR','OT',3,NULL),(48,'2021-07-06','Jabalpur',450,10,'2021-07-06','2021-07-06','VEG','string',1,'string',34516,48520,'PEN','OT',0,0),(49,'2021-07-06','Jabalpur',450,10,'2021-07-06','2021-07-06','VEG','VEG',2,'Hyderabad',29862,48520,'PEN','OT',0,0),(50,'2021-07-06','Mumbai',1000,2,'2021-07-02',NULL,'Veg',NULL,2,'Noida',71327,9000,'APR','OT',1,NULL);
/*!40000 ALTER TABLE `booking_next` ENABLE KEYS */;
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
