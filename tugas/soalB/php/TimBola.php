<?php

    class TimBola{
        private $nama = "",
                $asalNegara = "",
                $sejak = 0,
                $pemain = "";

        // constructor
        public function __construct($name = "", $country = "", $since = 0, $player = ""){
            $this->nama = $name;
            $this->asalNegara = $country;
            $this->sejak = $since;
            $this->pemain = $player;
        }

        // setter
        public function setNama($name){
            $this->nama = $name;
        }
        public function setAsalNegara($country){
            $this->asalNegara = $country;
        }
        public function setSejak($since){
            $this->sejak = $since;
        }
        public function setPemain($player){
            $this->pemain = $player;
        }
        
        // getter
        public function getNama(){
            return $this->nama;
        }
        public function getAsalNegara(){
            return $this->asalNegara;
        }
        public function getSejak(){
            return $this->sejak;
        }
        public function getPemain(){
            return $this->pemain;
        }
    }
    
?>