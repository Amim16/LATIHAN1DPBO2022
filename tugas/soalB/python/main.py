from TimBola import TimBola

# instansiasi dengan constructor
tim1 = TimBola("Barka", "Bekasi", 2002, "Mesii")

# instansiasi dengan setter
tim2 = TimBola()
tim2.setNama("Jupentus")
tim2.setAsalNegara("Karawang")
tim2.setSejak(2000)
tim2.setPemain("Ronald")

# instansiasi dengan inputan user
n = int(input()) # meminta inputan untuk banyak data

# alokasi & instansiasi objek array
arrTim = [TimBola() for i in range(n)]

# menginput data dan instansiasi dengan setter
for i in range(n):
    name = input()
    country = input()
    since = input()
    player = input()

    arrTim[i].setNama(name)
    arrTim[i].setAsalNegara(country)
    arrTim[i].setSejak(since)
    arrTim[i].setPemain(player)

# tampilkan output
print("--- Tim 1 ---")
print("Nama Tim : %s" % (tim1.getNama()))
print("Asal Negara : %s" % (tim1.getAsalNegara()))
print("Tahun Berdiri : %s" % (tim1.getSejak()))
print("Pemain : %s" % (tim1.getPemain()))

print("--- Tim 2 ---")
print("Nama Tim : %s" % (tim2.getNama()))
print("Asal Negara : %s" % (tim2.getAsalNegara()))
print("Tahun Berdiri : %s" % (tim2.getSejak()))
print("Pemain : %s" % (tim2.getPemain()))

# tampilkan output array objek
for i in range(n):
    print("--- Tim %d ---" % (i+1))
    print("Nama Tim : %s" % (arrTim[i].getNama()))
    print("Asal Negara : %s" % (arrTim[i].getAsalNegara()))
    print("Tahun Berdiri : %s" % (arrTim[i].getSejak()))
    print("Pemain : %s" % (arrTim[i].getPemain()))


