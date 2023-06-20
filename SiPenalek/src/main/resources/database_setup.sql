DROP TABLE IF EXISTS prj_project_comment;
DROP TABLE IF EXISTS prj_project_main;
DROP TABLE IF EXISTS ms_user;
DROP TABLE IF EXISTS ms_employee;
DROP TABLE IF EXISTS ms_role;
DROP TABLE IF EXISTS ms_pos;

CREATE TABLE ms_pos (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(50) NOT NULL,
  is_active int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE ms_role (
  id int(11) NOT NULL AUTO_INCREMENT,
  name varchar(50) NOT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE ms_employee (
  id int(11) NOT NULL AUTO_INCREMENT,
  nik varchar(255) NOT NULL,
  name varchar(50) NOT NULL,
  gender varchar(10) NOT NULL,
  ms_pos_id int(11) NOT NULL,
  ms_role_id int(11) NOT NULL,
  is_active int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (id),
  KEY ms_pos_id (ms_pos_id),
  KEY ms_role_id (ms_role_id),
  CONSTRAINT ms_employee_ibfk_1 FOREIGN KEY (ms_pos_id) REFERENCES ms_pos (id),
  CONSTRAINT ms_employee_ibfk_2 FOREIGN KEY (ms_role_id) REFERENCES ms_role (id)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE ms_user (
  id int(11) NOT NULL AUTO_INCREMENT,
  uname varchar(50) NOT NULL,
  pass varchar(50) DEFAULT NULL,
  ms_employee_id int(11) NOT NULL,
  is_active int(11) NOT NULL DEFAULT 0,
  PRIMARY KEY (id),
  KEY ms_employee_id (ms_employee_id),
  CONSTRAINT ms_user_ibfk_1 FOREIGN KEY (ms_employee_id) REFERENCES ms_employee (id)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE prj_project_main (
  id int(11) NOT NULL AUTO_INCREMENT,
  project_number varchar(255) NOT NULL,
  project_name varchar(255) NOT NULL,
  amount varchar(255) NOT NULL,
  pm_id int(11) NOT NULL,
  pm_name varchar(50) NOT NULL,
  spe_id int(11) NOT NULL,
  spe_name varchar(50) NOT NULL,
  project_date varchar(50) DEFAULT NULL,
  notes varchar(255) NOT NULL,
  status varchar(255) NOT NULL,
  PRIMARY KEY (id),
  KEY pm_id (pm_id),
  KEY spe_id (spe_id),
  CONSTRAINT prj_project_main_ibfk_1 FOREIGN KEY (pm_id) REFERENCES ms_employee (id),
  CONSTRAINT prj_project_main_ibfk_2 FOREIGN KEY (spe_id) REFERENCES ms_employee (id)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

CREATE TABLE prj_project_comment (
  id int(11) NOT NULL AUTO_INCREMENT,
  project_id int(11) NOT NULL,
  commenter_name varchar(50) NOT NULL,
  comment varchar(255) NOT NULL,
  response varchar(255) NOT NULL,
  created_date date DEFAULT CURRENT_DATE,
  PRIMARY KEY (id),
  KEY project_id (project_id),
  CONSTRAINT prj_project_comment_ibfk_1 FOREIGN KEY (project_id) REFERENCES prj_project_main (id)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

INSERT INTO ms_pos VALUES (1,'Application Admin',1),(2,'Proyek Manager',1),(3,'Budget Manager',1),(4,'Kepala Divisi',1),(5,'Pegawai',1);
INSERT INTO ms_role VALUES (1,'Admin'),(2,'PIC'),(3,'Budget'),(4,'Approver'),(5,'Employee');
INSERT INTO ms_employee VALUES (1,'0000000000000000','SiPenalek','Pria',1,1,1),(2,'1234567890123456','Rustaman','Pria',2,2,1),(3,'9876543210987654','Budi','Pria',3,3,1),(4,'1111111111111111','Siswanto','Pria',4,4,1),(5,'2222222222222222','Siska','Wanita',5,5,1),(6,'3333333333333333','Juwita','Wanita',5,5,1),(7,'4444444444444444','Hani','Wanita',5,5,1),(8,'5555555555555555','Rahma','Wanita',5,5,1);
INSERT INTO ms_user VALUES (1,'sipenalek','123456',1,1),(2,'rustaman','123456',2,1),(3,'budi','123456',3,1),(4,'siswanto','123456',4,1);
INSERT INTO prj_project_main VALUES (6,'2023/ATK/Payung','Pengadaan Payung ATK 2023','200,000,000',2,'Rustaman',6,'Juwita','14 Mei 2023','Pengadaan ATK dengan Kontrak Payung','Approval Project'),(7,'2023/IT/Tender','Pengadaan Laptop 2023','230,000,000',2,'Rustaman',8,'Rahma','25 Desember 2022','Pengadaan Laptop Divisi IT','Revisi'),(8,'2023/Renovasi/Direct','Renovasi Gedung Pulo Gadung','456,000,000',2,'Rustaman',7,'Hani','10 Oktober 2023','Renovasi Gedung Pulo Gadung','Aktif'),(9,'2023/ODOO/Direct','Pembelian Aplikasi ODOO','300,000,000',2,'Rustaman',6,'Juwita','02 MARET 2023','Kontrak Odoo Div. Procurement','Approval Budget'),(10,'2023/SAP/Payung','Kontrak Payung SAP','1,200,000,000',2,'Rustaman',6,'Juwita','03 Januari 2023','Kontrak Payung SAP Div. Procurement','Approval Budget');
INSERT INTO prj_project_comment VALUES (12,6,'Rustaman','Harap Disetujui','Ajukan','2023-06-18'),(13,7,'Rustaman','Harap Disetujui','Ajukan','2023-06-18'),(14,8,'Rustaman','Harap Disetujui','Ajukan','2023-06-18'),(15,9,'Rustaman','Harap Disetujui','Ajukan','2023-06-18'),(16,10,'Rustaman','Harap Disetujui','Ajukan','2023-06-18'),(17,6,'Budi','Saya Setuju','Approved','2023-06-18'),(18,7,'Budi','Harap Direvisi','Revisi','2023-06-18'),(19,8,'Budi','Lanjut','Approved','2023-06-18'),(20,8,'Siswanto','Lakukan Secepatnya','Approved','2023-06-18');
