-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: teacherdb
-- ------------------------------------------------------
-- Server version	5.7.19-log

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
-- Table structure for table `address`
--

DROP TABLE IF EXISTS `address`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `address` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CITY` varchar(45) DEFAULT NULL,
  `STREET` varchar(45) DEFAULT NULL,
  `HOUSE` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_idx` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `address`
--

LOCK TABLES `address` WRITE;
/*!40000 ALTER TABLE `address` DISABLE KEYS */;
INSERT INTO `address` VALUES (1,'11111','111111111d',111111),(2,'Polock','Lenina',25),(3,'Brest','Kirova',21),(4,'Mogilev','Cetkin',225),(5,'Necropolis','Hell',666),(6,'London','Baker',25),(7,'Brest','Hui',1),(8,'Minsk','Bangalor',21),(9,'Orsha','Porsha',22),(11,'aaaaaa','22222222',222221),(12,'aaaaaa','22222222',222221);
/*!40000 ALTER TABLE `address` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `economist`
--

DROP TABLE IF EXISTS `economist`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `economist` (
  `PERSON_ID` int(11) NOT NULL,
  `SALARY` int(11) NOT NULL,
  `ROLE` varchar(45) NOT NULL,
  KEY `person_id_idx` (`PERSON_ID`),
  CONSTRAINT `person_id` FOREIGN KEY (`PERSON_ID`) REFERENCES `person` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `economist`
--

LOCK TABLES `economist` WRITE;
/*!40000 ALTER TABLE `economist` DISABLE KEYS */;
INSERT INTO `economist` VALUES (7,222,'Assistant'),(8,600,'Assistant');
/*!40000 ALTER TABLE `economist` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `person`
--

DROP TABLE IF EXISTS `person`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `person` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(45) DEFAULT NULL,
  `SURNAME` varchar(45) DEFAULT NULL,
  `BIRTHDATE` date DEFAULT NULL,
  `AGE` int(11) DEFAULT NULL,
  `MOBILENUMBER` varchar(45) DEFAULT NULL,
  `ADDRESS_ID` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`),
  KEY `FK_ADDRESS_ID_idx` (`ADDRESS_ID`),
  CONSTRAINT `FK_ADDRESS_ID` FOREIGN KEY (`ADDRESS_ID`) REFERENCES `address` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `person`
--

LOCK TABLES `person` WRITE;
/*!40000 ALTER TABLE `person` DISABLE KEYS */;
INSERT INTO `person` VALUES (1,'Ed','Gayne','1990-12-12',42,'+375293661262',1),(2,'Nick','Dick','1923-02-02',35,'+375293135421',2),(3,'John','Long','2011-12-12',22,'+37532312341',3),(4,'Loh','Pidr','1992-12-11',44,'+37567586432',4),(5,'Sam','Loh','1990-09-11',25,'+375291311212',5),(6,'Kto','Loh','1992-02-01',44,'+375293777777',6),(7,'Sir','Her','2017-11-22',66,'1231254135135',4),(8,'Sir','Joe','1992-12-12',55,'+375267778899',8);
/*!40000 ALTER TABLE `person` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `specialisation`
--

DROP TABLE IF EXISTS `specialisation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `specialisation` (
  `ID` int(11) NOT NULL,
  `NAME` varchar(45) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `specialisation`
--

LOCK TABLES `specialisation` WRITE;
/*!40000 ALTER TABLE `specialisation` DISABLE KEYS */;
INSERT INTO `specialisation` VALUES (1,'MATH_TEACHER'),(2,'PHYSICS_TEACHER');
/*!40000 ALTER TABLE `specialisation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `Person_ID` int(11) NOT NULL,
  `COURSENUMBER` int(11) DEFAULT NULL,
  `SCHOLARSHIP` int(11) DEFAULT NULL,
  `FACULTYNAME` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`Person_ID`),
  CONSTRAINT `fk_Student_Person1` FOREIGN KEY (`Person_ID`) REFERENCES `person` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (4,1,200,'MATH'),(5,2,542,'PHYSICS'),(6,3,211,'MATH');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `students_have_teachers`
--

DROP TABLE IF EXISTS `students_have_teachers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `students_have_teachers` (
  `STUDENT_ID` int(11) NOT NULL,
  `TEACHER_ID` int(11) NOT NULL,
  PRIMARY KEY (`STUDENT_ID`,`TEACHER_ID`),
  KEY `fk_TEACHER_ID_idx` (`TEACHER_ID`),
  CONSTRAINT `fk_STUDENT_ID` FOREIGN KEY (`STUDENT_ID`) REFERENCES `student` (`Person_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_TEACHER_ID` FOREIGN KEY (`TEACHER_ID`) REFERENCES `teacher` (`PERSON_ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students_have_teachers`
--

LOCK TABLES `students_have_teachers` WRITE;
/*!40000 ALTER TABLE `students_have_teachers` DISABLE KEYS */;
INSERT INTO `students_have_teachers` VALUES (4,1),(5,1),(6,2),(5,3);
/*!40000 ALTER TABLE `students_have_teachers` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teacher` (
  `PERSON_ID` int(11) NOT NULL,
  `WORKEXPERIENCE` int(11) DEFAULT NULL,
  `PUBLICATIONS` int(11) DEFAULT NULL,
  `CATEGORY` int(11) DEFAULT NULL,
  `SPECIALISATION_ID` int(11) DEFAULT NULL,
  PRIMARY KEY (`PERSON_ID`),
  KEY `fk_TEACHER_Person1_idx` (`PERSON_ID`),
  KEY `fk_SPECIALISATION_ID_idx` (`SPECIALISATION_ID`),
  CONSTRAINT `fk_SPECIALISATION_ID` FOREIGN KEY (`SPECIALISATION_ID`) REFERENCES `specialisation` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_TEACHER_Person1` FOREIGN KEY (`PERSON_ID`) REFERENCES `person` (`ID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES (1,4,2,1,1),(2,3,13,2,2),(3,5,1,2,1);
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-11-24 15:53:16
