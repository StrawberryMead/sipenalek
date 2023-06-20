-- MySQL dump 10.13  Distrib 5.5.62, for Win64 (AMD64)
--
-- Host: 127.0.0.1    Database: sipenalek
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.27-MariaDB

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
-- Table structure for table `ms_employee`
--

DROP TABLE IF EXISTS `ms_employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ms_employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nik` varchar(255) NOT NULL,
  `name` varchar(50) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `ms_pos_id` int(11) NOT NULL,
  `ms_role_id` int(11) NOT NULL,
  `is_active` int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  KEY `ms_pos_id` (`ms_pos_id`),
  KEY `ms_role_id` (`ms_role_id`),
  CONSTRAINT `ms_employee_ibfk_1` FOREIGN KEY (`ms_pos_id`) REFERENCES `ms_pos` (`id`),
  CONSTRAINT `ms_employee_ibfk_2` FOREIGN KEY (`ms_role_id`) REFERENCES `ms_role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ms_employee`
--

LOCK TABLES `ms_employee` WRITE;
/*!40000 ALTER TABLE `ms_employee` DISABLE KEYS */;
INSERT INTO `ms_employee` VALUES (1,'0000000000000000','SiPenalek','Genderless',1,1,1),(2,'1234567890123456','Rustaman','Pria',2,2,1),(3,'9876543210987654','Budi','Pria',3,3,1),(4,'1111111111111111','Siswanto','Pria',4,4,1),(5,'2222222222222222','Siska','Wanita',5,5,1),(6,'3333333333333333','Juwita','Wanita',5,5,1),(7,'4444444444444444','Hani','Wanita',5,5,1),(8,'5555555555555555','Rahma','Waria',5,5,1);
/*!40000 ALTER TABLE `ms_employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ms_pos`
--

DROP TABLE IF EXISTS `ms_pos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ms_pos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `is_active` int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ms_pos`
--

LOCK TABLES `ms_pos` WRITE;
/*!40000 ALTER TABLE `ms_pos` DISABLE KEYS */;
INSERT INTO `ms_pos` VALUES (1,'Application Admin',1),(2,'Proyek Manager',1),(3,'Budget Manager',1),(4,'Kepala Divisi',1),(5,'Pegawai',1);
/*!40000 ALTER TABLE `ms_pos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ms_role`
--

DROP TABLE IF EXISTS `ms_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ms_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ms_role`
--

LOCK TABLES `ms_role` WRITE;
/*!40000 ALTER TABLE `ms_role` DISABLE KEYS */;
INSERT INTO `ms_role` VALUES (1,'Admin'),(2,'PIC'),(3,'Budget'),(4,'Approver'),(5,'Employee');
/*!40000 ALTER TABLE `ms_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ms_user`
--

DROP TABLE IF EXISTS `ms_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ms_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uname` varchar(50) NOT NULL,
  `pass` varchar(50) DEFAULT NULL,
  `ms_employee_id` int(11) NOT NULL,
  `is_active` int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (`id`),
  KEY `ms_employee_id` (`ms_employee_id`),
  CONSTRAINT `ms_user_ibfk_1` FOREIGN KEY (`ms_employee_id`) REFERENCES `ms_employee` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ms_user`
--

LOCK TABLES `ms_user` WRITE;
/*!40000 ALTER TABLE `ms_user` DISABLE KEYS */;
INSERT INTO `ms_user` VALUES (1,'sipenalek','123456',1,1),(2,'rustaman','123456',2,1),(3,'budi','123456',3,1),(4,'siswanto','123456',4,1);
/*!40000 ALTER TABLE `ms_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prj_project_comment`
--

DROP TABLE IF EXISTS `prj_project_comment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prj_project_comment` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `project_id` int(11) NOT NULL,
  `commenter_name` varchar(50) NOT NULL,
  `comment` varchar(255) NOT NULL,
  `response` varchar(255) NOT NULL,
  `created_date` date DEFAULT curdate(),
  PRIMARY KEY (`id`),
  KEY `project_id` (`project_id`),
  CONSTRAINT `prj_project_comment_ibfk_1` FOREIGN KEY (`project_id`) REFERENCES `prj_project_main` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prj_project_comment`
--

LOCK TABLES `prj_project_comment` WRITE;
/*!40000 ALTER TABLE `prj_project_comment` DISABLE KEYS */;
INSERT INTO `prj_project_comment` VALUES (12,6,'Rustaman','Harap Disetujui','Ajukan','2023-06-18'),(13,7,'Rustaman','Harap Disetujui','Ajukan','2023-06-18'),(14,8,'Rustaman','Harap Disetujui','Ajukan','2023-06-18'),(15,9,'Rustaman','Harap Disetujui','Ajukan','2023-06-18'),(16,10,'Rustaman','Harap Disetujui','Ajukan','2023-06-18'),(17,6,'Budi','Saya Setuju','Approved','2023-06-18'),(18,7,'Budi','Harap Direvisi','Revisi','2023-06-18'),(19,8,'Budi','Lanjut','Approved','2023-06-18'),(20,8,'Siswanto','Lakukan Secepatnya','Approved','2023-06-18');
/*!40000 ALTER TABLE `prj_project_comment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prj_project_main`
--

DROP TABLE IF EXISTS `prj_project_main`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `prj_project_main` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `project_number` varchar(255) NOT NULL,
  `project_name` varchar(255) NOT NULL,
  `amount` varchar(255) NOT NULL,
  `pm_id` int(11) NOT NULL,
  `pm_name` varchar(50) NOT NULL,
  `spe_id` int(11) NOT NULL,
  `spe_name` varchar(50) NOT NULL,
  `project_date` varchar(50) DEFAULT NULL,
  `notes` varchar(255) NOT NULL,
  `status` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `pm_id` (`pm_id`),
  KEY `spe_id` (`spe_id`),
  CONSTRAINT `prj_project_main_ibfk_1` FOREIGN KEY (`pm_id`) REFERENCES `ms_employee` (`id`),
  CONSTRAINT `prj_project_main_ibfk_2` FOREIGN KEY (`spe_id`) REFERENCES `ms_employee` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prj_project_main`
--

LOCK TABLES `prj_project_main` WRITE;
/*!40000 ALTER TABLE `prj_project_main` DISABLE KEYS */;
INSERT INTO `prj_project_main` VALUES (6,'2023/ATK/Payung','Pengadaan Payung ATK 2023','200,000,000',2,'Rustaman',6,'Juwita','14 Mei 2023','Pengadaan ATK dengan Kontrak Payung','Approval Project'),(7,'2023/IT/Tender','Pengadaan Laptop 2023','230,000,000',2,'Rustaman',8,'Rahma','25 Desember 2022','Pengadaan Laptop Divisi IT','Revisi'),(8,'2023/Renovasi/Direct','Renovasi Gedung Pulo Gadung','456,000,000',2,'Rustaman',7,'Hani','10 Oktober 2023','Renovasi Gedung Pulo Gadung','Aktif'),(9,'2023/ODOO/Direct','Pembelian Aplikasi ODOO','300,000,000',2,'Rustaman',6,'Juwita','02 MARET 2023','Kontrak Odoo Div. Procurement','Approval Budget'),(10,'2023/SAP/Payung','Kontrak Payung SAP','1,200,000,000',2,'Rustaman',6,'Juwita','03 Januari 2023','Kontrak Payung SAP Div. Procurement','Approval Budget');
/*!40000 ALTER TABLE `prj_project_main` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'sipenalek'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-18  3:20:33
