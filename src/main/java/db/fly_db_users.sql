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
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(50) DEFAULT NULL,
  `password` varchar(120) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKr43af9ap4edm43mmtq01oddj6` (`username`),
  UNIQUE KEY `UK6dotkott2kjsp8vw4d0m25fb7` (`email`)
) ENGINE=MyISAM AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'iambharat@hcl.com','$2a$10$A02Yi0AFDR2U2jIwpIeA6eEgcxi1zGsNx3K5brF7SibcObf8z41yq','bharatpatel'),(2,'erbharat@hcl.com','$2a$10$HBnx95nHeL/6sE0nJpYCgOeZ.Z7oDVw4/Pl/HYHW5h.c0PJn/bb9i','erbharat'),(3,'arun@iiht.com','$2a$10$Q5EWjKJWX5aou3VJJhgiUeOfxXDNpRdduFCztLoUKImAnk8bdD8am','arun'),(4,'admin@iiht.com','$2a$10$MQN9gjTkvr.Gd64duUNtOuYgmDNSwYOnCl9s.FmPBdbakouh2rdSy','admin'),(5,'anand@iiht.com','$2a$10$YtcPCRhNhLuOGec8/mYiIuv3xAbEu8//8/V.typKay5YRGnCMr5fa','anand'),(6,'bharat.patel@hcl.com','$2a$10$Ab3dGk4jrFV8o16k/MP6tOpozR/EuJ.br5eBlXuCnbiesJwqlV7/a','admin1'),(7,'iambharat.p@hcl.com','$2a$10$2deJ281x04gyyWkO9xVYKe7EpA.EZhE9PXaqZWvqSy9jqUj9kyzUu','iam'),(8,'and@hcl.com','$2a$10$xuSlI0bRDkDCOU2cZs5TFO4YoBOtrMOp55JxxjoWol9POUyVd8Qsq','and'),(9,'iamer@iiht.com','$2a$10$AGHikG0f7g5EgRp9z3fqs..ZWUZjv6lfvvyrpBvrLs.pJAjRoLrIi','iamer'),(10,'durgeshpatel@gmail.com','$2a$10$rNyTk9DLH1M8j7AqYglRGe8cKsIBcLgNAD9OF23ucXWkBo5eb0DYW','durgesh');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-10 21:01:23
