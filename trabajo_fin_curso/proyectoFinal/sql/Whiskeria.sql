-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 01-06-2024 a las 00:20:05
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `Whiskeria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Cliente`
--

CREATE TABLE `Cliente` (
  `DNI` varchar(9) NOT NULL,
  `Nombre_Completo` varchar(50) NOT NULL,
  `Fecha_nacimiento` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `Cliente`
--

INSERT INTO `Cliente` (`DNI`, `Nombre_Completo`, `Fecha_nacimiento`) VALUES
('2659286G', 'Jose', '1900-03-09'),
('3552T', 'pepe', '2024-05-01'),
('6795252T', 'Jose', '1823-04-12'),
('8354821G', 'Pep', '1999-02-01'),
('9801945H', 'Pep', '2024-05-08');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Compra`
--

CREATE TABLE `Compra` (
  `ID` int(11) NOT NULL,
  `ID_Producto` int(11) NOT NULL,
  `DNI_Cliente` varchar(9) NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `ID_Tienda` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `Compra`
--

INSERT INTO `Compra` (`ID`, `ID_Producto`, `DNI_Cliente`, `Cantidad`, `ID_Tienda`) VALUES
(1, 7, '8354821G', 3, 2),
(2, 8, '8354821G', 3, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Producto`
--

CREATE TABLE `Producto` (
  `ID` int(11) NOT NULL,
  `Tipo_alcohol` varchar(50) NOT NULL,
  `Año_alcohol` int(11) NOT NULL,
  `Precio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `Producto`
--

INSERT INTO `Producto` (`ID`, `Tipo_alcohol`, `Año_alcohol`, `Precio`) VALUES
(1, 'Ron', 1900, 20000),
(7, 'wvww', 22, 1),
(8, 'qwfgeg', 1, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Tiendas`
--

CREATE TABLE `Tiendas` (
  `ID` int(11) NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Zona` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `Tiendas`
--

INSERT INTO `Tiendas` (`ID`, `Nombre`, `Zona`) VALUES
(1, 'vwwvwv', 'vwdwd'),
(2, 'eeee', 'eee'),
(3, 'htdjhtgd', 'htehte'),
(4, 'fffff', 'ffff');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Cliente`
--
ALTER TABLE `Cliente`
  ADD PRIMARY KEY (`DNI`);

--
-- Indices de la tabla `Compra`
--
ALTER TABLE `Compra`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `ID_Tienda` (`ID_Tienda`),
  ADD KEY `DNI_Cliente` (`DNI_Cliente`),
  ADD KEY `Producto` (`ID_Producto`) USING BTREE;

--
-- Indices de la tabla `Producto`
--
ALTER TABLE `Producto`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `Tiendas`
--
ALTER TABLE `Tiendas`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Compra`
--
ALTER TABLE `Compra`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `Producto`
--
ALTER TABLE `Producto`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `Tiendas`
--
ALTER TABLE `Tiendas`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Compra`
--
ALTER TABLE `Compra`
  ADD CONSTRAINT `compra_ibfk_5` FOREIGN KEY (`ID_Tienda`) REFERENCES `Tiendas` (`ID`),
  ADD CONSTRAINT `compra_ibfk_6` FOREIGN KEY (`DNI_Cliente`) REFERENCES `Cliente` (`DNI`),
  ADD CONSTRAINT `compra_ibfk_7` FOREIGN KEY (`ID_Producto`) REFERENCES `Producto` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
