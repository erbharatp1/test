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
-- Table structure for table `passengers_next`
--

DROP TABLE IF EXISTS `passengers_next`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `passengers_next` (
  `passenger_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `email_id` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `mobile_no` varchar(255) DEFAULT NULL,
  `booking_id` bigint(20) DEFAULT NULL,
  `passenger_list_booking_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`passenger_id`),
  KEY `FKirpk7g0ucg6uog6rs9q4itg9` (`booking_id`),
  KEY `FKne2iyb777o6gvtdi26e2smary` (`passenger_list_booking_id`),
  CONSTRAINT `FKirpk7g0ucg6uog6rs9q4itg9` FOREIGN KEY (`booking_id`) REFERENCES `booking_next` (`booking_id`),
  CONSTRAINT `FKne2iyb777o6gvtdi26e2smary` FOREIGN KEY (`passenger_list_booking_id`) REFERENCES `booking_next` (`booking_id`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passengers_next`
--

LOCK TABLES `passengers_next` WRITE;
/*!40000 ALTER TABLE `passengers_next` DISABLE KEYS */;
INSERT INTO `passengers_next` VALUES (1,'qaws2345','AZSXDC','AZSX','AZSXDC','234567',NULL,NULL),(2,'hata','tinku@gmail.com','Tinku','patel','123456987',NULL,NULL),(3,'hata','gmail.com','bharat','patel','45631178',NULL,NULL),(33,'ffdfdd','4552','4152','415263','45433',NULL,NULL),(34,'ffdfdfdfdf','fddfdffd','dfdss','cvccc','34333',NULL,NULL),(35,'west bangal','ver@hcl.com','ved','kumar','34567890',NULL,NULL),(36,'hari','hari','hari','hari','3456',NULL,NULL),(39,'5','3','1','2','4',NULL,NULL),(40,'0','8','6','7','9',NULL,NULL),(41,'RRFFF','FFFF','ZXX','ASSS','7744',NULL,NULL),(42,'hata','anand@gmail.com','Arun','patel','741258963',NULL,NULL),(43,'Damoh','john@gmail.com','John','John','74125896',NULL,NULL),(44,'12 hatta','iambart@gmail.com','BHarat','Patel','748596321',NULL,NULL),(45,'Jabalpur','arun@gmail.com','Arun','Singh','741258963214',NULL,NULL),(46,'Hata','hata@gmail.com','hata','hata','741258963',NULL,48),(47,'damoh','damoh@gmail.com','hata','damoh','741258963',NULL,49),(48,'bhaart','bhara@gmail.com','bharat','bharat','741258963',NULL,49),(49,'USA','john@gmail.com','John','Merry','7894563214',NULL,50),(50,'DC USA','Herry@gmail.com','Herry','john','7412589630',NULL,50);
/*!40000 ALTER TABLE `passengers_next` ENABLE KEYS */;
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
