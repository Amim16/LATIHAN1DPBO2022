#include<bits/stdc++.h>
#include "TimBola.cpp"

using namespace std;

int main(){
    // Cara 1 : instansiasi dengan memanggil setter
    TimBola tim1;
    tim1.setNama("Jupentus");
    tim1.setAsalNegara("Karawang");
    tim1.setSejak(2000);
    tim1.setPemain("Ronald");

    // Cara 2 : instansiasi dengan memakai constructor dari objek
    TimBola tim2("Barka", "Bekasi", 2002, "Jojo");

    /* instanisiasi dengan inputan */
    int n,
        i, // iterator
        since;
    string name, country, player;

    cout << "Masukkan banyak data yang diinginkan : ";
    cin >> n; // input banyak data
    TimBola arrTim[n];

    for(i=0;i<n;i++){
        cin >> name >> country >> since >> player;

        arrTim[i].setNama(name);
        arrTim[i].setAsalNegara(country);
        arrTim[i].setSejak(since);
        arrTim[i].setPemain(player);
    }

    // tampilkan output
    cout << endl << "--- Tim 1 ---" << endl;
    cout << "Nama Tim : " << tim1.getNama() << endl;
    cout << "Asal Negara : " << tim1.getAsalNegara() << endl;
    cout << "Tahun Berdiri : " << tim1.getSejak() << endl;
    cout << "Pemain : " << tim1.getPemain() << endl;

    cout << endl << "--- Tim 2 ---" << endl;
    cout << "Nama Tim : " << tim2.getNama() << endl;
    cout << "Asal Negara : " << tim2.getAsalNegara() << endl;
    cout << "Tahun Berdiri : " << tim2.getSejak() << endl;
    cout << "Pemain : " << tim2.getPemain() << endl;

    cout << endl << "--- Data Tim dengan inputan user ---" << endl;
    for(i=0;i<n;i++){
        cout << endl << "--- Inputan Tim " << i+1 << " ---" << endl;
        cout << "Nama Tim : " << arrTim[i].getNama() << endl;
        cout << "Asal Negara : " << arrTim[i].getAsalNegara() << endl;
        cout << "Tahun Berdiri : " << arrTim[i].getSejak() << endl;
        cout << "Pemain : " << arrTim[i].getPemain() << endl;
    }

    return 0;
}