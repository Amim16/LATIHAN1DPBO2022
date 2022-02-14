<?php
include "TimBola.php";

// instansiasi dengan setter
$tim1 = new TimBola();

// set tim1
$tim1->setNama("Jupentus");
$tim1->setAsalNegara("Karawang");
$tim1->setSejak(2000);
$tim1->setPemain("Ronald");

// instansiasi dengan constructor
$tim2 = new TimBola("Barka", "Bekasi", 2002, "Messi");

// menampilkan output
echo "--- Tim 1 ---<br>";
echo "Nama Tim : ". $tim1->getNama(). "<br>";
echo "Asal Negara : ". $tim1->getAsalNegara(). "<br>";
echo "Tahun Berdiri : ". $tim1->getSejak(). "<br>";
echo "Pemain : ". $tim1->getPemain(). "<br>";

echo "<br>--- Tim 2 ---<br>";
echo "Nama Tim : ". $tim2->getNama(). "<br>";
echo "Asal Negara : ". $tim2->getAsalNegara(). "<br>";
echo "Tahun Berdiri : ". $tim2->getSejak(). "<br>";
echo "Pemain : ". $tim2->getPemain(). "<br>";

?>