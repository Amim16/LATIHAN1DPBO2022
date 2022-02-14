import java.util.*;

public class Main {
    public static void main(String[] args) {
      
        /* instansiasi dengan setter */
        TimBola tim1 = new TimBola();

        // set tim1
        tim1.setNama("Jupentus");
        tim1.setAsalNegara("Karawang");
        tim1.setSejak(2000);
        tim1.setPemain("Ronald");

        /* instansiasi dengan constructor */
        TimBola tim2 = new TimBola("Barka", "Bekasi", 2002, "Ucup");

        /* meminta inputan user */
        int n = 0;
        Scanner sc = new Scanner(System.in);
        try{
            n = sc.nextInt();
        }catch(Exception e){}

        // alokasi objek sebanyak n dalam bentuk array
        TimBola[] arrTim = new TimBola[n];

        int i, since = 0; 
        String name = "x", country = "-", player = "-";

        // input data sebanyak n
        for(i=0;i<n;i++){
            try{
                name = sc.next();
            }catch(Exception e){}

            try{
                country = sc.next();
            }catch(Exception e){}

            try{
                since = sc.nextInt();
            }catch(Exception e){}

            try{
                player = sc.next();
            }catch(Exception e){}

            // instansiasi tiap objek
            arrTim[i] = new TimBola(name, country, since, player);
        }

        /* tampilkan output */
        System.out.println("\n--- Tim 1 ---");
        System.out.println("Nama Tim : " + tim1.getNama());
        System.out.println("Asal Negara : " + tim1.getAsalNegara());
        System.out.println("Tahun Berdiri : " + tim1.getSejak());
        System.out.println("Pemain : " + tim1.getPemain());

        System.out.println("\n--- Tim 2 ---");
        System.out.println("Nama Tim : " + tim2.getNama());
        System.out.println("Asal Negara : " + tim2.getAsalNegara());
        System.out.println("Tahun Berdiri : " + tim2.getSejak());
        System.out.println("Pemain : " + tim2.getPemain());

        System.out.println("\n--{ Output data inputan user }--");

        for(i=0;i<n;i++){
            System.out.println("\n--- Tim " + (i+1) + " Inputan User ---");
            System.out.println("Nama Tim : " + arrTim[i].getNama());
            System.out.println("Asal Negara : " + arrTim[i].getAsalNegara());
            System.out.println("Tahun Berdiri : " + arrTim[i].getSejak());
            System.out.println("Pemain : " + arrTim[i].getPemain());
        }
    }
}