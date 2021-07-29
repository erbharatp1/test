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
-- Table structure for table `scheduled_flight`
--

DROP TABLE IF EXISTS `scheduled_flight`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `scheduled_flight` (
  `schedule_flight_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `arrival` date DEFAULT NULL,
  `available_seats` bigint(20) DEFAULT NULL,
  `date_create` date DEFAULT NULL,
  `departure` date DEFAULT NULL,
  `destination` varchar(255) DEFAULT NULL,
  `flight_id` bigint(20) DEFAULT NULL,
  `source_airport` varchar(255) DEFAULT NULL,
  `update_date` date DEFAULT NULL,
  `user_id` bigint(20) DEFAULT NULL,
  `user_id_update` bigint(20) DEFAULT NULL,
  `arrival_time` varchar(255) DEFAULT NULL,
  `departure_time` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`schedule_flight_id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `scheduled_flight`
--

LOCK TABLES `scheduled_flight` WRITE;
/*!40000 ALTER TABLE `scheduled_flight` DISABLE KEYS */;
INSERT INTO `scheduled_flight` VALUES (3,'2021-07-11',120,NULL,'2021-07-11','Bengelore',1,'Hyderabad',NULL,NULL,NULL,'14:25','14:25'),(4,'2021-07-18',100,NULL,'2021-07-17','Mumbai',2,'Noida',NULL,NULL,NULL,'06:25','04:25'),(9,'2021-07-25',450,NULL,'2021-07-04','Mumbai',7,'Noida',NULL,NULL,NULL,'14:25','17:25'),(10,'2021-07-18',120,NULL,'2021-07-03','Noida',2,'Mumbai',NULL,NULL,NULL,'14:45','14:25'),(11,'2021-07-25',50,NULL,'2021-07-03','Mumbai',2,'Noida',NULL,NULL,NULL,'14:25','18:25'),(12,'2021-07-18',20,NULL,'2021-07-11','Mumbai',1,'Noida',NULL,NULL,NULL,'14:25','15:25'),(14,'2021-07-15',123,NULL,'2021-07-06','Indore',5,'Dubai',NULL,NULL,NULL,'02:39','02:38'),(15,'2021-07-07',120,NULL,'2021-07-06','Mumbai',10,'Pune',NULL,NULL,NULL,'15:54','14:53'),(16,'2021-07-22',100,NULL,'2021-07-10','Indore',9,'Jabalpur',NULL,NULL,NULL,'17:57','18:57'),(17,'2021-07-16',120,NULL,'2021-07-16','Indore',1,'Jabalpur',NULL,NULL,NULL,'22:20','20:17'),(18,'2021-07-22',121,NULL,'2021-07-14','Ahmedabad',5,'Nagpur','2021-07-10',NULL,NULL,'02:37','05:38');
/*!40000 ALTER TABLE `scheduled_flight` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-10 21:01:26
