-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 19, 2024 at 08:19 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `2210010116`
--

-- --------------------------------------------------------

--
-- Table structure for table `table_berita`
--

CREATE TABLE `table_berita` (
  `id_berita` int(11) NOT NULL,
  `tanggal_post` date NOT NULL,
  `gambar` varchar(70) NOT NULL,
  `judul` varchar(200) NOT NULL,
  `konten` text NOT NULL,
  `id_comment` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `table_datakota`
--

CREATE TABLE `table_datakota` (
  `id_kota` int(5) NOT NULL,
  `nama_kec` varchar(50) NOT NULL,
  `kota` varchar(50) NOT NULL,
  `kodepos` varchar(10) NOT NULL,
  `deskripsi` varchar(350) NOT NULL,
  `latitude` varchar(50) NOT NULL,
  `longlatitude` varchar(50) NOT NULL,
  `id_wisata` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `table_datawisata`
--

CREATE TABLE `table_datawisata` (
  `id_wisata` int(10) NOT NULL,
  `nama_wisata` varchar(50) NOT NULL,
  `alamat` varchar(250) NOT NULL,
  `wilayah` varchar(50) NOT NULL,
  `fasilitas` varchar(50) NOT NULL,
  `tipe_wisata` varchar(50) NOT NULL,
  `detail` varchar(250) NOT NULL,
  `latitude` varchar(50) NOT NULL,
  `longlatitude` varchar(50) NOT NULL,
  `id_admin` int(11) NOT NULL,
  `id_comment` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `table_komentar`
--

CREATE TABLE `table_komentar` (
  `id_comment` int(5) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `komentar` text NOT NULL,
  `date` date NOT NULL,
  `art_url` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `table_berita`
--
ALTER TABLE `table_berita`
  ADD PRIMARY KEY (`id_comment`);

--
-- Indexes for table `table_datakota`
--
ALTER TABLE `table_datakota`
  ADD PRIMARY KEY (`id_wisata`);

--
-- Indexes for table `table_datawisata`
--
ALTER TABLE `table_datawisata`
  ADD PRIMARY KEY (`id_comment`);

--
-- Indexes for table `table_komentar`
--
ALTER TABLE `table_komentar`
  ADD PRIMARY KEY (`id_comment`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `table_komentar`
--
ALTER TABLE `table_komentar`
  ADD CONSTRAINT `table_komentar_ibfk_1` FOREIGN KEY (`id_comment`) REFERENCES `table_berita` (`id_comment`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
