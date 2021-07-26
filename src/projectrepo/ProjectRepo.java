package projectrepo;

import java.util.Scanner;

public class ProjectRepo {

    public static void main(String[] args) {
     
        int hargaBarang, komisi1, komisi2, komisi3, uangJasa1, uangJasa2, uangJasa3;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan harga barang = Rp ");
        hargaBarang = scan.nextInt();
        uangJasa1 = 10000;
        uangJasa2 = 20000;
        uangJasa3 = 30000;
        
        if(hargaBarang==200000){
            komisi1 = hargaBarang*10/100;
            System.out.println("komisi = Rp " + komisi1 + " + uang jasa = Rp " + uangJasa1);
            int totalKomisi1 = komisi1+uangJasa1;
            System.out.println("TOTAL KOMISI = Rp " + totalKomisi1);
        }else if(hargaBarang>200000 && hargaBarang<=500000){
            komisi2 = hargaBarang*15/100;
            System.out.println("komisi = Rp " + komisi2 + " + uang jasa = Rp " + uangJasa2);
            int totalKomisi2 = komisi2+uangJasa2;
            System.out.println("TOTAL KOMISI = Rp " + totalKomisi2);
        }else if(hargaBarang>500000){
            komisi3 = hargaBarang*20/100;
            System.out.println("komisi = Rp " + komisi3 + " + uang jasa = Rp " + uangJasa3);
            int totalKomisi3 = komisi3+uangJasa3;
            System.out.println("TOTAL KOMISI = Rp " + totalKomisi3);
        }else{
        }
        
    }
    
}

