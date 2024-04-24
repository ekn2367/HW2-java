import java.util.Scanner;
public class bir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet ürün satıldı? ");
        int urunMiktari = scanner.nextInt();

        String[] urunAdi = new String[urunMiktari];
        double[] urunFiyati = new double[urunMiktari];
        int satisSayisi = 0;
        double satisMiktari = 0.0;

        for (int i = 0; i < urunMiktari; i++) {
            System.out.println(" Ürün " + (i+1) + " bilgilerini girin:");
            System.out.print("Ürün adı: ");
            urunAdi[i] = scanner.next();
            System.out.print("Fiyatı: ");
            urunFiyati[i] = scanner.nextDouble();
            System.out.print("Satış miktarı: ");
            int miktar = scanner.nextInt();


            satisSayisi += miktar;
            satisMiktari += miktar * urunFiyati[i];
        }

        System.out.println(" Toplam Satış Sayısı: " + satisSayisi);
        System.out.println(" Toplam Satış Miktarı: " + satisMiktari + " TL");

    }
}