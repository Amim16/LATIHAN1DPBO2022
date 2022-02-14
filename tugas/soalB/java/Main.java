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

        /* tampilkan output */
        System.out.println("--- Tim 1 ---");
        System.out.println("Nama Tim : " + tim1.getNama());
        System.out.println("Asal Negara : " + tim1.getAsalNegara());
        System.out.println("Tahun Berdiri : " + tim1.getSejak());
        System.out.println("Pemain : " + tim1.getPemain());

        System.out.println("--- Tim 2 ---");
        System.out.println("Nama Tim : " + tim2.getNama());
        System.out.println("Asal Negara : " + tim2.getAsalNegara());
        System.out.println("Tahun Berdiri : " + tim2.getSejak());
        System.out.println("Pemain : " + tim2.getPemain());
    }
}