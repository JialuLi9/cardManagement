CREATE DATABASE  IF NOT EXISTS `card_directory`;
USE `card_directory`;

--
-- Table structure for table `card`
--

DROP TABLE IF EXISTS `card`;

CREATE TABLE `card` (
  `id` int NOT NULL AUTO_INCREMENT,
  `card_type` varchar(45) DEFAULT NULL,
  `cardholder_name` varchar(45) DEFAULT NULL,
  `card_number` varchar(45) DEFAULT NULL,
  `pin` varchar(4) DEFAULT NULL,
  `CVR` varchar(3) DEFAULT NULL,
  `bank_name` varchar(45) DEFAULT NULL,
  `expire_date` varchar(45) DEFAULT NULL,
  `limited` varchar(45) DEFAULT NULL,
  
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `card`
--

INSERT INTO `card` VALUES 
	(1,'Debit','Andrews','346513982','0827','156','TD bank','27/08','1000'),
	(2,'Debit','Gupta','24561097','0936','213','TD bank','22/10','2000'),
	(3,'Credit','Emma','78945861','2801','479','ICBC bank','24/01','5000');

