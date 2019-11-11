-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 06, 2018 at 04:37 PM
-- Server version: 10.1.28-MariaDB
-- PHP Version: 7.1.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `peramalan_garam_d`
--

-- --------------------------------------------------------

--
-- Table structure for table `hsl_produksi`
--

CREATE TABLE `hsl_produksi` (
  `id_hsl_produksi` int(11) NOT NULL,
  `id_pml_lahan` int(11) NOT NULL,
  `garam` int(11) NOT NULL,
  `pembungkusan_garam` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hsl_produksi`
--

INSERT INTO `hsl_produksi` (`id_hsl_produksi`, `id_pml_lahan`, `garam`, `pembungkusan_garam`) VALUES
(11, 11, 1735, 1735),
(12, 12, 1715, 1715),
(13, 13, 1690, 1690),
(14, 14, 1660, 1660),
(15, 15, 1730, 1730),
(16, 16, 1730, 1730),
(17, 17, 1720, 1720),
(18, 18, 1750, 1750),
(19, 19, 1800, 1800),
(20, 20, 1900, 1900),
(21, 21, 2000, 2000),
(22, 22, 1900, 1900);

-- --------------------------------------------------------

--
-- Table structure for table `jual_garam`
--

CREATE TABLE `jual_garam` (
  `id_jual_garam` int(22) NOT NULL,
  `id_total_jual_garam` int(22) NOT NULL,
  `total_jual_garam` int(22) NOT NULL,
  `jual_garam` int(22) NOT NULL,
  `t_total_jual_garam` int(22) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `jual_garam`
--

INSERT INTO `jual_garam` (`id_jual_garam`, `id_total_jual_garam`, `total_jual_garam`, `jual_garam`, `t_total_jual_garam`) VALUES
(11, 1, 20500, 2200, 22700),
(12, 12, 22700, 1730, 24430),
(13, 13, 24430, 1700, 26130),
(14, 14, 26130, 1600, 27730),
(15, 15, 27730, 1610, 29340),
(16, 16, 29340, 1700, 31040),
(17, 17, 31040, 1710, 32750),
(18, 18, 32750, 1700, 34450),
(19, 19, 34450, 1690, 36140),
(20, 20, 36140, 1700, 37840),
(21, 21, 37840, 1750, 39590),
(22, 22, 39590, 1900, 41490);

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `id_karyawan` int(11) NOT NULL,
  `jabatan_karyawan` varchar(11) NOT NULL,
  `nama_karyawan` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`id_karyawan`, `jabatan_karyawan`, `nama_karyawan`) VALUES
(1, 'manajer', 'wildan'),
(3, 'produksi', 'haris');

-- --------------------------------------------------------

--
-- Table structure for table `k_produksi`
--

CREATE TABLE `k_produksi` (
  `id_k_produksi` int(22) NOT NULL,
  `id_ramal` int(22) NOT NULL,
  `k_produksi` int(22) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `k_produksi`
--

INSERT INTO `k_produksi` (`id_k_produksi`, `id_ramal`, `k_produksi`) VALUES
(11, 11, 1735),
(12, 12, 1715),
(13, 13, 1690),
(15, 14, 1660),
(16, 15, 1730),
(17, 16, 1730),
(18, 17, 1720),
(19, 18, 1750),
(20, 19, 1800),
(21, 20, 1900),
(22, 21, 2000),
(23, 22, 1900);

-- --------------------------------------------------------

--
-- Table structure for table `penjualan`
--

CREATE TABLE `penjualan` (
  `id_penjualan` int(11) NOT NULL,
  `id_hsl_produksi` int(11) NOT NULL,
  `pembungkusan_garam` int(11) NOT NULL,
  `total_jual` int(11) NOT NULL,
  `sisa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penjualan`
--

INSERT INTO `penjualan` (`id_penjualan`, `id_hsl_produksi`, `pembungkusan_garam`, `total_jual`, `sisa`) VALUES
(11, 11, 1735, 1730, 5),
(12, 12, 1715, 1700, 15),
(13, 13, 1690, 1600, 90),
(14, 14, 1660, 1610, 50),
(15, 15, 1730, 1700, 30),
(16, 16, 1730, 1710, 20),
(17, 17, 1720, 1700, 20),
(18, 18, 1750, 1690, 60),
(19, 19, 1800, 1700, 100),
(20, 20, 1900, 1750, 150),
(21, 21, 2000, 1900, 100),
(22, 22, 1900, 1800, 100);

-- --------------------------------------------------------

--
-- Table structure for table `pml_lahan`
--

CREATE TABLE `pml_lahan` (
  `id_pml_lahan` int(11) NOT NULL,
  `bulan_pml_lahan` enum('Januari','Februari','Maret','April','Mei','Juni','Juli','Agustus','September','Oktober','November','Desember') NOT NULL,
  `slr_utama` enum('Rusak','Tidak') NOT NULL,
  `bozem` enum('Rusak','Tidak') NOT NULL,
  `pintu_air` enum('Rusak','Tidak') NOT NULL,
  `phb_evaporator` enum('Rusak','Tidak') NOT NULL,
  `meja_kts` enum('Rusak','Tidak') NOT NULL,
  `tahun_pml_lahan` int(22) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pml_lahan`
--

INSERT INTO `pml_lahan` (`id_pml_lahan`, `bulan_pml_lahan`, `slr_utama`, `bozem`, `pintu_air`, `phb_evaporator`, `meja_kts`, `tahun_pml_lahan`) VALUES
(11, 'Januari', 'Tidak', 'Tidak', 'Tidak', 'Tidak', 'Tidak', 2018),
(12, 'Februari', 'Tidak', 'Tidak', 'Tidak', 'Tidak', 'Tidak', 2018),
(13, 'Maret', 'Tidak', 'Tidak', 'Tidak', 'Tidak', 'Tidak', 2018),
(14, 'April', 'Tidak', 'Tidak', 'Tidak', 'Tidak', 'Tidak', 2018),
(15, 'Mei', 'Tidak', 'Tidak', 'Tidak', 'Tidak', 'Tidak', 2018),
(16, 'Juni', 'Tidak', 'Tidak', 'Tidak', 'Tidak', 'Tidak', 2018),
(17, 'Juli', 'Tidak', 'Tidak', 'Tidak', 'Tidak', 'Tidak', 2018),
(18, 'Agustus', 'Tidak', 'Tidak', 'Tidak', 'Tidak', 'Tidak', 2018),
(19, 'September', 'Tidak', 'Tidak', 'Tidak', 'Tidak', 'Tidak', 2018),
(20, 'Oktober', 'Tidak', 'Tidak', 'Tidak', 'Tidak', 'Tidak', 2018),
(21, 'November', 'Tidak', 'Tidak', 'Tidak', 'Tidak', 'Tidak', 2018),
(22, 'Desember', 'Tidak', 'Tidak', 'Tidak', 'Tidak', 'Tidak', 2018);

-- --------------------------------------------------------

--
-- Table structure for table `prd_waktu`
--

CREATE TABLE `prd_waktu` (
  `id_prd_waktu` int(22) NOT NULL,
  `id_total_prd_waktu` int(22) NOT NULL,
  `total_prd_waktu` int(22) NOT NULL,
  `prd_waktu` int(22) NOT NULL,
  `t_total_prd_waktu` int(22) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `prd_waktu`
--

INSERT INTO `prd_waktu` (`id_prd_waktu`, `id_total_prd_waktu`, `total_prd_waktu`, `prd_waktu`, `t_total_prd_waktu`) VALUES
(11, 1, 66, 12, 78),
(12, 12, 78, 13, 91),
(13, 13, 91, 14, 105),
(14, 14, 105, 15, 120),
(15, 15, 120, 16, 136),
(16, 16, 136, 17, 153),
(17, 17, 153, 18, 171),
(18, 18, 171, 19, 190),
(19, 19, 190, 20, 210),
(20, 20, 210, 21, 231),
(21, 21, 231, 22, 253),
(22, 22, 253, 23, 276);

-- --------------------------------------------------------

--
-- Table structure for table `prd_waktu2`
--

CREATE TABLE `prd_waktu2` (
  `id_prd_waktu2` int(22) NOT NULL,
  `id_prd_waktu` int(22) NOT NULL,
  `prd_waktu` int(22) NOT NULL,
  `prd_waktu2` int(22) NOT NULL,
  `id_total_prd_waktu2` int(22) NOT NULL,
  `total_prd_waktu2` int(22) NOT NULL,
  `t_total_prd_waktu2` int(22) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `prd_waktu2`
--

INSERT INTO `prd_waktu2` (`id_prd_waktu2`, `id_prd_waktu`, `prd_waktu`, `prd_waktu2`, `id_total_prd_waktu2`, `total_prd_waktu2`, `t_total_prd_waktu2`) VALUES
(11, 11, 12, 144, 1, 506, 650),
(12, 12, 13, 169, 12, 650, 819),
(13, 13, 14, 196, 13, 819, 1015),
(14, 14, 15, 225, 14, 1015, 1240),
(15, 15, 16, 256, 15, 1240, 1496),
(16, 16, 17, 289, 16, 1496, 1785),
(17, 17, 18, 324, 17, 1785, 2109),
(18, 18, 19, 361, 18, 2109, 2470),
(19, 19, 20, 400, 19, 2470, 2870),
(20, 20, 21, 441, 20, 2870, 3311),
(21, 21, 22, 484, 21, 3311, 3795),
(22, 22, 23, 529, 22, 3795, 4324);

-- --------------------------------------------------------

--
-- Table structure for table `ramal`
--

CREATE TABLE `ramal` (
  `id_ramal` int(22) NOT NULL,
  `bulan` enum('Januari','Februari','Maret','April','Mei','Juni','Juli','Agustus','September','Oktober','November','Desember') NOT NULL,
  `tahun` int(22) NOT NULL,
  `id_prd_waktu` int(22) NOT NULL,
  `t_total_prd_waktu` int(22) NOT NULL,
  `prd_waktu` int(22) NOT NULL,
  `id_jual_garam` int(22) NOT NULL,
  `t_total_jual_garam` int(22) NOT NULL,
  `rata_prd_waktu` int(22) NOT NULL,
  `rata_jual_garam` int(22) NOT NULL,
  `id_xy` int(22) NOT NULL,
  `t_total_xy` int(22) NOT NULL,
  `id_prd_waktu2` int(22) NOT NULL,
  `t_total_prd_waktu2` int(22) NOT NULL,
  `b` int(22) NOT NULL,
  `a` int(22) NOT NULL,
  `hasil_ramalan` int(22) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ramal`
--

INSERT INTO `ramal` (`id_ramal`, `bulan`, `tahun`, `id_prd_waktu`, `t_total_prd_waktu`, `prd_waktu`, `id_jual_garam`, `t_total_jual_garam`, `rata_prd_waktu`, `rata_jual_garam`, `id_xy`, `t_total_xy`, `id_prd_waktu2`, `t_total_prd_waktu2`, `b`, `a`, `hasil_ramalan`) VALUES
(11, 'Januari', 2018, 11, 78, 12, 11, 22700, 7, 1892, 11, 144000, 11, 650, -25, 2053, 1730),
(12, 'Februari', 2018, 12, 91, 13, 12, 24430, 7, 1879, 12, 166490, 12, 819, -25, 2053, 1705),
(13, 'Maret', 2018, 13, 105, 14, 13, 26130, 8, 1866, 13, 190290, 13, 1015, -25, 2054, 1679),
(14, 'April', 2018, 14, 120, 15, 14, 27730, 8, 1849, 14, 214290, 14, 1240, -27, 2064, 1633),
(15, 'Mei', 2018, 15, 136, 16, 15, 29340, 9, 1834, 15, 240050, 15, 1496, -27, 2067, 1600),
(16, 'Juni', 2018, 16, 153, 17, 16, 31040, 9, 1826, 16, 268950, 16, 1785, -26, 2056, 1596),
(17, 'Juli', 2018, 17, 171, 18, 17, 32750, 10, 1819, 17, 299730, 17, 2109, -24, 2043, 1596),
(18, 'Agustus', 2018, 18, 190, 19, 18, 34450, 10, 1813, 18, 332030, 18, 2470, -22, 2032, 1594),
(19, 'September', 2018, 19, 210, 20, 19, 36140, 11, 1807, 19, 365830, 19, 2870, -21, 2022, 1592),
(20, 'Oktober', 2018, 20, 231, 21, 20, 37840, 11, 1802, 20, 401530, 20, 3311, -19, 2012, 1592),
(21, 'November', 2018, 21, 253, 22, 21, 39590, 12, 1800, 21, 440030, 21, 3795, -17, 1998, 1601),
(22, 'Desember', 2018, 22, 276, 23, 22, 41490, 12, 1804, 22, 483730, 22, 4324, -14, 1972, 1636);

-- --------------------------------------------------------

--
-- Table structure for table `total_jual_garam`
--

CREATE TABLE `total_jual_garam` (
  `id_total_jual_garam` int(22) NOT NULL,
  `total_jual_garam` int(22) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `total_jual_garam`
--

INSERT INTO `total_jual_garam` (`id_total_jual_garam`, `total_jual_garam`) VALUES
(1, 20500),
(12, 22700),
(13, 24430),
(14, 26130),
(15, 27730),
(16, 29340),
(17, 31040),
(18, 32750),
(19, 34450),
(20, 36140),
(21, 37840),
(22, 39590),
(23, 41490);

-- --------------------------------------------------------

--
-- Table structure for table `total_prd_waktu`
--

CREATE TABLE `total_prd_waktu` (
  `id_total_prd_waktu` int(22) NOT NULL,
  `total_prd_waktu` int(22) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `total_prd_waktu`
--

INSERT INTO `total_prd_waktu` (`id_total_prd_waktu`, `total_prd_waktu`) VALUES
(1, 66),
(12, 78),
(13, 91),
(14, 105),
(15, 120),
(16, 136),
(17, 153),
(18, 171),
(19, 190),
(20, 210),
(21, 231),
(22, 253),
(23, 276);

-- --------------------------------------------------------

--
-- Table structure for table `total_prd_waktu2`
--

CREATE TABLE `total_prd_waktu2` (
  `id_total_prd_waktu2` int(22) NOT NULL,
  `total_prd_waktu2` int(22) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `total_prd_waktu2`
--

INSERT INTO `total_prd_waktu2` (`id_total_prd_waktu2`, `total_prd_waktu2`) VALUES
(1, 506),
(12, 650),
(13, 819),
(14, 1015),
(15, 1240),
(16, 1496),
(17, 1785),
(18, 2109),
(19, 2470),
(20, 2870),
(21, 3311),
(22, 3795),
(23, 4324);

-- --------------------------------------------------------

--
-- Table structure for table `total_xy`
--

CREATE TABLE `total_xy` (
  `id_total_xy` int(22) NOT NULL,
  `total_xy` int(22) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `total_xy`
--

INSERT INTO `total_xy` (`id_total_xy`, `total_xy`) VALUES
(1, 117600),
(12, 144000),
(13, 166490),
(14, 190290),
(15, 214290),
(16, 240050),
(17, 268950),
(18, 299730),
(19, 332030),
(20, 365830),
(21, 401530),
(22, 440030),
(23, 483730);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `id_karyawan` int(11) NOT NULL,
  `username` varchar(11) NOT NULL,
  `password` varchar(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `id_karyawan`, `username`, `password`) VALUES
(1, 1, 'manajer', 'manajer'),
(3, 3, 'produksi', 'produksi');

-- --------------------------------------------------------

--
-- Table structure for table `xy`
--

CREATE TABLE `xy` (
  `id_xy` int(22) NOT NULL,
  `id_prd_waktu` int(22) NOT NULL,
  `prd_waktu` int(22) NOT NULL,
  `id_jual_garam` int(22) NOT NULL,
  `jual_garam` int(22) NOT NULL,
  `xy` int(22) NOT NULL,
  `id_total_xy` int(22) NOT NULL,
  `total_xy` int(22) NOT NULL,
  `t_total_xy` int(22) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `xy`
--

INSERT INTO `xy` (`id_xy`, `id_prd_waktu`, `prd_waktu`, `id_jual_garam`, `jual_garam`, `xy`, `id_total_xy`, `total_xy`, `t_total_xy`) VALUES
(11, 11, 12, 11, 2200, 26400, 1, 117600, 144000),
(12, 12, 13, 12, 1730, 22490, 12, 144000, 166490),
(13, 13, 14, 13, 1700, 23800, 13, 166490, 190290),
(14, 14, 15, 14, 1600, 24000, 14, 190290, 214290),
(15, 15, 16, 15, 1610, 25760, 15, 214290, 240050),
(16, 16, 17, 16, 1700, 28900, 16, 240050, 268950),
(17, 17, 18, 17, 1710, 30780, 17, 268950, 299730),
(18, 18, 19, 18, 1700, 32300, 18, 299730, 332030),
(19, 19, 20, 19, 1690, 33800, 19, 332030, 365830),
(20, 20, 21, 20, 1700, 35700, 20, 365830, 401530),
(21, 21, 22, 21, 1750, 38500, 21, 401530, 440030),
(22, 22, 23, 22, 1900, 43700, 22, 440030, 483730);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `hsl_produksi`
--
ALTER TABLE `hsl_produksi`
  ADD PRIMARY KEY (`id_hsl_produksi`),
  ADD KEY `id_pml_lahan` (`id_pml_lahan`);

--
-- Indexes for table `jual_garam`
--
ALTER TABLE `jual_garam`
  ADD PRIMARY KEY (`id_jual_garam`),
  ADD KEY `id_total_jual_garam` (`id_total_jual_garam`);

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`id_karyawan`);

--
-- Indexes for table `k_produksi`
--
ALTER TABLE `k_produksi`
  ADD PRIMARY KEY (`id_k_produksi`),
  ADD KEY `id_ramal` (`id_ramal`);

--
-- Indexes for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD PRIMARY KEY (`id_penjualan`),
  ADD KEY `id_hsl_produksi` (`id_hsl_produksi`);

--
-- Indexes for table `pml_lahan`
--
ALTER TABLE `pml_lahan`
  ADD PRIMARY KEY (`id_pml_lahan`);

--
-- Indexes for table `prd_waktu`
--
ALTER TABLE `prd_waktu`
  ADD PRIMARY KEY (`id_prd_waktu`),
  ADD KEY `id_total_prd_waktu` (`id_total_prd_waktu`);

--
-- Indexes for table `prd_waktu2`
--
ALTER TABLE `prd_waktu2`
  ADD PRIMARY KEY (`id_prd_waktu2`),
  ADD KEY `id_prd_waktu` (`id_prd_waktu`),
  ADD KEY `id_total_prd_waktu2` (`id_total_prd_waktu2`);

--
-- Indexes for table `ramal`
--
ALTER TABLE `ramal`
  ADD PRIMARY KEY (`id_ramal`),
  ADD KEY `id_prd_waktu` (`id_prd_waktu`),
  ADD KEY `id_jual_garam` (`id_jual_garam`),
  ADD KEY `id_xy` (`id_xy`),
  ADD KEY `id_prd_waktu2` (`id_prd_waktu2`);

--
-- Indexes for table `total_jual_garam`
--
ALTER TABLE `total_jual_garam`
  ADD PRIMARY KEY (`id_total_jual_garam`);

--
-- Indexes for table `total_prd_waktu`
--
ALTER TABLE `total_prd_waktu`
  ADD PRIMARY KEY (`id_total_prd_waktu`);

--
-- Indexes for table `total_prd_waktu2`
--
ALTER TABLE `total_prd_waktu2`
  ADD PRIMARY KEY (`id_total_prd_waktu2`);

--
-- Indexes for table `total_xy`
--
ALTER TABLE `total_xy`
  ADD PRIMARY KEY (`id_total_xy`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`),
  ADD KEY `id_karyawan` (`id_karyawan`);

--
-- Indexes for table `xy`
--
ALTER TABLE `xy`
  ADD PRIMARY KEY (`id_xy`),
  ADD KEY `id_prd_waktu` (`id_prd_waktu`),
  ADD KEY `id_jual_garam` (`id_jual_garam`),
  ADD KEY `id_total_xy` (`id_total_xy`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `hsl_produksi`
--
ALTER TABLE `hsl_produksi`
  MODIFY `id_hsl_produksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `jual_garam`
--
ALTER TABLE `jual_garam`
  MODIFY `id_jual_garam` int(22) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `karyawan`
--
ALTER TABLE `karyawan`
  MODIFY `id_karyawan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `k_produksi`
--
ALTER TABLE `k_produksi`
  MODIFY `id_k_produksi` int(22) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `penjualan`
--
ALTER TABLE `penjualan`
  MODIFY `id_penjualan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `pml_lahan`
--
ALTER TABLE `pml_lahan`
  MODIFY `id_pml_lahan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `prd_waktu`
--
ALTER TABLE `prd_waktu`
  MODIFY `id_prd_waktu` int(22) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `prd_waktu2`
--
ALTER TABLE `prd_waktu2`
  MODIFY `id_prd_waktu2` int(22) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `ramal`
--
ALTER TABLE `ramal`
  MODIFY `id_ramal` int(22) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `total_jual_garam`
--
ALTER TABLE `total_jual_garam`
  MODIFY `id_total_jual_garam` int(22) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `total_prd_waktu`
--
ALTER TABLE `total_prd_waktu`
  MODIFY `id_total_prd_waktu` int(22) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `total_prd_waktu2`
--
ALTER TABLE `total_prd_waktu2`
  MODIFY `id_total_prd_waktu2` int(22) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `total_xy`
--
ALTER TABLE `total_xy`
  MODIFY `id_total_xy` int(22) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `xy`
--
ALTER TABLE `xy`
  MODIFY `id_xy` int(22) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `hsl_produksi`
--
ALTER TABLE `hsl_produksi`
  ADD CONSTRAINT `hsl_produksi_ibfk_1` FOREIGN KEY (`id_pml_lahan`) REFERENCES `pml_lahan` (`id_pml_lahan`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `jual_garam`
--
ALTER TABLE `jual_garam`
  ADD CONSTRAINT `jual_garam_ibfk_1` FOREIGN KEY (`id_total_jual_garam`) REFERENCES `total_jual_garam` (`id_total_jual_garam`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `k_produksi`
--
ALTER TABLE `k_produksi`
  ADD CONSTRAINT `k_produksi_ibfk_1` FOREIGN KEY (`id_ramal`) REFERENCES `ramal` (`id_ramal`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `penjualan`
--
ALTER TABLE `penjualan`
  ADD CONSTRAINT `penjualan_ibfk_1` FOREIGN KEY (`id_hsl_produksi`) REFERENCES `hsl_produksi` (`id_hsl_produksi`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `prd_waktu`
--
ALTER TABLE `prd_waktu`
  ADD CONSTRAINT `prd_waktu_ibfk_1` FOREIGN KEY (`id_total_prd_waktu`) REFERENCES `total_prd_waktu` (`id_total_prd_waktu`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `prd_waktu2`
--
ALTER TABLE `prd_waktu2`
  ADD CONSTRAINT `prd_waktu2_ibfk_1` FOREIGN KEY (`id_total_prd_waktu2`) REFERENCES `total_prd_waktu2` (`id_total_prd_waktu2`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `prd_waktu2_ibfk_2` FOREIGN KEY (`id_prd_waktu`) REFERENCES `prd_waktu` (`id_prd_waktu`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `ramal`
--
ALTER TABLE `ramal`
  ADD CONSTRAINT `ramal_ibfk_1` FOREIGN KEY (`id_prd_waktu`) REFERENCES `prd_waktu` (`id_prd_waktu`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ramal_ibfk_2` FOREIGN KEY (`id_jual_garam`) REFERENCES `jual_garam` (`id_jual_garam`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ramal_ibfk_3` FOREIGN KEY (`id_xy`) REFERENCES `xy` (`id_xy`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `ramal_ibfk_4` FOREIGN KEY (`id_prd_waktu2`) REFERENCES `prd_waktu2` (`id_prd_waktu2`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`id_karyawan`) REFERENCES `karyawan` (`id_karyawan`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `xy`
--
ALTER TABLE `xy`
  ADD CONSTRAINT `xy_ibfk_1` FOREIGN KEY (`id_prd_waktu`) REFERENCES `prd_waktu` (`id_prd_waktu`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `xy_ibfk_2` FOREIGN KEY (`id_jual_garam`) REFERENCES `jual_garam` (`id_jual_garam`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `xy_ibfk_3` FOREIGN KEY (`id_total_xy`) REFERENCES `total_xy` (`id_total_xy`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
