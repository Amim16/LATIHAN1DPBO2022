<?php
include "Mahasiswa.php";

// buat objek
$joni = new Mahasiswa();

// set joni
$joni->setNim(2000987);
$joni->setNama("Joni Niee");
$joni->setSex("Lakik");
$joni->setProdi("Ilkom");
$joni->setSemester(4);

// buat objek + set budi
$budi = new Mahasiswa(1990202, "Budi Setia", "Lakik", "Pilkom", 5);

// tampilkan output
echo "--- Mahasiswa 1 ---<br>";
echo "Nim : ". $joni->getNama(). "<br>";
echo "Nama : ". $joni->getNim(). "<br>";
echo "Jenis Kelamin : ". $joni->getSex(). "<br>";
echo "Prodi : ". $joni->getProdi(). "<br>";
echo "Semester : ". $joni->getSemester(). "<br>";

echo "<br>--- Mahasiswa 2 ---<br>";
echo "Nim : ". $budi->getNama(). "<br>";
echo "Nama : ". $budi->getNim(). "<br>";
echo "Jenis Kelamin : ". $budi->getSex(). "<br>";
echo "Prodi : ". $budi->getProdi(). "<br>";
echo "Semester : ". $budi->getSemester(). "<br>";

?>