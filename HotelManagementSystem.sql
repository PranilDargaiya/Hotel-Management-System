-- MySQL dump 10.13  Distrib 5.6.38, for Win32 (AMD64)
--
-- Host: localhost    Database: Hotel_Management_System
-- ------------------------------------------------------
-- Server version	5.6.38-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `booked_rooms`
--

DROP TABLE IF EXISTS `booked_rooms`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `booked_rooms` (
  `RoomNo` varchar(4) DEFAULT NULL,
  `CheckInDate` date DEFAULT NULL,
  `CheckOutDate` date DEFAULT NULL,
  `No_Of_Days` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booked_rooms`
--

LOCK TABLES `booked_rooms` WRITE;
/*!40000 ALTER TABLE `booked_rooms` DISABLE KEYS */;
/*!40000 ALTER TABLE `booked_rooms` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_information`
--

DROP TABLE IF EXISTS `customer_information`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer_information` (
  `FirstName` varchar(25) DEFAULT NULL,
  `LastName` varchar(25) DEFAULT NULL,
  `EmailID` varchar(50) NOT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `SecurityQuestion` varchar(50) DEFAULT NULL,
  `SecurityAnswer` varchar(50) DEFAULT NULL,
  `DateOfBirth` date DEFAULT NULL,
  `ContactNo` varchar(11) DEFAULT NULL,
  PRIMARY KEY (`EmailID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_information`
--

LOCK TABLES `customer_information` WRITE;
/*!40000 ALTER TABLE `customer_information` DISABLE KEYS */;
INSERT INTO `customer_information` VALUES ('Himank','Arya','himankarya12@gmail..com','Katrina123','Favourite Actor/Actress.','Salman','1995-12-14','7067059932'),('Pranil','Dargaiya','p.daragiya@gmail.com','Pranil123456789','Favourite Place.','London','2000-12-18','8602848078'),('Pranil','Dargaiya','p.dargaiya@gmail.com','Pranil123456789','Favourite Teacher.','Kanupriya Joshi','2000-12-18','8602848078'),('Sandhya','Dargaiya','sdargaiya@gmail.com','789456123','Favourite Singer','Shaan','2017-11-17','9893894236');
/*!40000 ALTER TABLE `customer_information` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `room_details`
--

DROP TABLE IF EXISTS `room_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `room_details` (
  `RoomNo` varchar(4) DEFAULT NULL,
  `RoomType` varchar(50) DEFAULT NULL,
  `AC_NonAC` varchar(6) DEFAULT NULL,
  `Price` int(15) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `room_details`
--

LOCK TABLES `room_details` WRITE;
/*!40000 ALTER TABLE `room_details` DISABLE KEYS */;
INSERT INTO `room_details` VALUES ('M201','Luxury Grande Room King Bed Sea View','AC',20250),('M202','Luxury Grande Room King Bed City View','AC',23000),('M203','Taj Club 1 Room King Bed City View','AC',20700),('M204','Taj Club 2 Room King Bed Sea View','AC',23400),('M205','Executive Suite 1 Bedroom King Bed City View','AC',36000),('M206','Executive Suite 2 Bedroom King Bed Sea View','AC',39500),('M207','Luxury Suite 1 Bedroom King Bed City View','AC',54000),('M208','Grande Luxury Suite 1 Bedroom King Bed City View','AC',81000),('M209','Grande Luxury Suite 1 Bedroom King Bed Sea View','AC',94000);
/*!40000 ALTER TABLE `room_details` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-11  0:49:13
