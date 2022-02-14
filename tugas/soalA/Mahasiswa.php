<?php

class Mahasiswa{
    private $nim  = "",
            $nama = "",
            $sex = "",
            $prodi = "",
            $semester = 0;

    // constructor
    public function __construct($newNim = "", $newNama = "", $newSex = "", $newProdi = "", $newSemester = 0){
        $this->nim = $newNim;
        $this->nama = $newNama;
        $this->sex = $newSex;
        $this->prodi = $newProdi;
        $this->semester = $newSemester;
    }

    // setter
    public function setNim($newNim){
        $this->nim = $newNim;
    }
    public function setNama($newNama){
        $this->nama = $newNama;
    }
    public function setSex($newSex){
        $this->sex = $newSex;
    }
    public function setProdi($newProdi){
        $this->prodi = $newProdi;
    }
    public function setSemester($newSemester){
        $this->semester = $newSemester;
    }

    // getter
    public function getNim(){
        return $this->nim;
    }
    public function getNama(){
        return $this->nama;
    }
    public function getSex(){
        return $this->sex;
    }
    public function getProdi(){
        return $this->prodi;
    }
    public function getSemester(){
        return $this->semester;
    }
}

?>