-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: case_study_db
-- ------------------------------------------------------
-- Server version	8.0.20

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
-- Table structure for table `todolist`
--

DROP TABLE IF EXISTS `todolist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `todolist` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `USER_ID` int DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_TODOLIST_USER_ID` (`USER_ID`),
  CONSTRAINT `FK_TODOLIST_USER_ID` FOREIGN KEY (`USER_ID`) REFERENCES `users` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `todolist`
--

LOCK TABLES `todolist` WRITE;
/*!40000 ALTER TABLE `todolist` DISABLE KEYS */;
INSERT INTO `todolist` VALUES (1,NULL),(2,NULL);
/*!40000 ALTER TABLE `todolist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `todolist_todotask`
--

DROP TABLE IF EXISTS `todolist_todotask`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `todolist_todotask` (
  `TodoList_ID` int NOT NULL,
  `tasks_ID` int NOT NULL,
  PRIMARY KEY (`TodoList_ID`,`tasks_ID`),
  KEY `FK_TODOLIST_TODOTASK_tasks_ID` (`tasks_ID`),
  CONSTRAINT `FK_TODOLIST_TODOTASK_tasks_ID` FOREIGN KEY (`tasks_ID`) REFERENCES `todotask` (`ID`),
  CONSTRAINT `FK_TODOLIST_TODOTASK_TodoList_ID` FOREIGN KEY (`TodoList_ID`) REFERENCES `todolist` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `todolist_todotask`
--

LOCK TABLES `todolist_todotask` WRITE;
/*!40000 ALTER TABLE `todolist_todotask` DISABLE KEYS */;
/*!40000 ALTER TABLE `todolist_todotask` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `todotask`
--

DROP TABLE IF EXISTS `todotask`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `todotask` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `DONEDATE` varchar(255) DEFAULT NULL,
  `ISCOMPLETE` tinyint(1) DEFAULT '0',
  `TDESC` varchar(255) DEFAULT NULL,
  `TNAME` varchar(255) DEFAULT NULL,
  `USERNAME` varchar(255) DEFAULT NULL,
  `listId` int NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_TODOTASK_listId` (`listId`),
  CONSTRAINT `FK_TODOTASK_listId` FOREIGN KEY (`listId`) REFERENCES `todolist` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `todotask`
--

LOCK TABLES `todotask` WRITE;
/*!40000 ALTER TABLE `todotask` DISABLE KEYS */;
INSERT INTO `todotask` VALUES (2,'2021-04-10',0,'working out helps ','Gym','jamal',1),(3,'2021-04-12',0,'help me please this is tough ','another todo','jamal',1),(6,'1021-04-11',0,'please stop','yooo','jamal',1),(7,'2021-06-11',0,'that task just got updated ','updated task','newperson',2);
/*!40000 ALTER TABLE `todotask` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userrole`
--

DROP TABLE IF EXISTS `userrole`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userrole` (
  `ID` int NOT NULL,
  `ROLE` varchar(50) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userrole`
--

LOCK TABLES `userrole` WRITE;
/*!40000 ALTER TABLE `userrole` DISABLE KEYS */;
/*!40000 ALTER TABLE `userrole` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `email` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `ROLE` varchar(255) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `TODOLIST_ID` int DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_users_TODOLIST_ID` (`TODOLIST_ID`),
  CONSTRAINT `FK_users_TODOLIST_ID` FOREIGN KEY (`TODOLIST_ID`) REFERENCES `todolist` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'jamal@jamal.com','12345','user','jamal',1),(2,'myemail@aol.com','password','user','newperson',2);
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

-- Dump completed on 2021-04-09 15:45:01
