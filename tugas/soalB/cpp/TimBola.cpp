#include <iostream>
#include <string>

using namespace std;

class TimBola{
    private:
        /* atribut */
        string nama, asalNegara, pemain;
        int sejak;

    public:
        /* constructor */
        TimBola(){
            this->nama = this->asalNegara = this->pemain = "";
            this->sejak = 0;
        }

        /* constructor dengan parameter */
        TimBola(string name, string country, int since, string player){
            this->nama = name;
            this->asalNegara = country;
            this->sejak = since;
            this->pemain = player;
        }

        /* setter */
        void setNama(string name){
            this->nama = name;
        }
        void setAsalNegara(string country){
            this->asalNegara = country;
        }
        void setSejak(int since){
            this->sejak = since;
        }
        void setPemain(string player){
            this->pemain = player;
        }

        /* getter */
        string getNama(){
            return this->nama;
        }
        string getAsalNegara(){
            return this->asalNegara;
        }
        int getSejak(){
            return this->sejak;
        }
        string getPemain(){
            return this->pemain;
        }
        
        ~ TimBola(){}
};

