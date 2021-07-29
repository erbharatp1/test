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
-- Table structure for table `passenger`
--

DROP TABLE IF EXISTS `passenger`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `passenger` (
  `passenger_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `email_id` varchar(255) DEFAULT NULL,
  `first_name` varchar(255) DEFAULT NULL,
  `last_name` varchar(255) DEFAULT NULL,
  `mobile_no` varchar(255) DEFAULT NULL,
  `booking_id` bigint(20) DEFAULT NULL,
  `passenger_list_booking_id` bigint(20) DEFAULT NULL,
  `age` bigint(20) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`passenger_id`),
  KEY `FKtco0omesfld1qi5sw76eomvt4` (`booking_id`),
  KEY `FKd1ua1sfiptv2m00k7w67worwj` (`passenger_list_booking_id`)
) ENGINE=MyISAM AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `passenger`
--

LOCK TABLES `passenger` WRITE;
/*!40000 ALTER TABLE `passenger` DISABLE KEYS */;
INSERT INTO `passenger` VALUES (1,'Hata','iambharat@hcl.com','Bharat','Patel','1234569852',NULL,1,27,'Male'),(2,'Indore','harsha@cts.com','Harsha','Patel','74125863',NULL,1,21,'Female'),(3,NULL,'arun@ihht.com','Arun',NULL,NULL,NULL,2,27,'Male'),(4,NULL,'John','Marry',NULL,NULL,NULL,2,27,'Male'),(5,NULL,'mask','Elon',NULL,NULL,NULL,2,45,'Male'),(6,NULL,'sandeep@hcl.com','Sandeep Patel',NULL,NULL,NULL,3,21,'Male'),(7,NULL,'meena@aajtk.com','Maanakshi Joshi',NULL,NULL,NULL,3,24,'Male'),(8,NULL,'raaz@tcs.com','Raaz Singh',NULL,NULL,NULL,3,24,'Male'),(9,NULL,'rani@google.com','Rani Patel',NULL,NULL,NULL,3,25,'Female'),(11,NULL,'abhay@hcl.vom','Abhay',NULL,NULL,NULL,6,23,'Male'),(12,NULL,NULL,'Varsha',NULL,NULL,NULL,7,NULL,NULL),(13,NULL,'arun@iiht.com','Arun Kumar',NULL,NULL,NULL,8,28,'Male'),(14,NULL,'galu@gmailc.om','Galu Patel',NULL,NULL,NULL,9,24,'Male'),(15,NULL,'dinesh@gmail.com','Dinesh patel',NULL,NULL,NULL,9,21,'Male'),(16,NULL,'golu@hcl.com','Golu',NULL,NULL,NULL,10,24,'Male'),(17,NULL,'sanchita@paypal.com','Sanchita patel',NULL,NULL,NULL,11,12,'Male'),(22,NULL,'anand@hcl.vcom','anand',NULL,NULL,NULL,15,26,'Male'),(20,NULL,'arun@gmail.com','Arun',NULL,NULL,NULL,13,28,'Male'),(21,NULL,'sive@hcl.com','Siva Raman',NULL,NULL,NULL,14,24,'Male'),(23,NULL,'gfgfg','bhas',NULL,NULL,NULL,16,55,'Male'),(24,NULL,'fgfff','tggf',NULL,NULL,NULL,16,34,'Male'),(25,NULL,'gfgf@fmzgd.vb','hyhh',NULL,NULL,NULL,16,34,'Female'),(26,NULL,'hhhdd','eedd',NULL,NULL,NULL,16,67,'Male'),(27,NULL,'fffff','ed',NULL,NULL,NULL,16,77,'Male');
/*!40000 ALTER TABLE `passenger` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-10 21:01:24
