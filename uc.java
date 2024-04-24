import java.util.Scanner;

public class uc {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] urunler = {"Mouse", "Mouse Pad", "Kulaklık", "Klavye"};
        double[] fiyatlar = {450, 245, 750.99, 1230.99};
        int index = -99;
        String secim = " ";
        Boolean devam = true;

        System.out.println("Stokta olan ürünler: ");
        for (int i = 0; i < urunler.length; i++) {
            System.out.println(urunler[i]);
        }
            do {
                System.out.println("---------");
                System.out.print("Hangi ürünü almak istiyorsunuz?: ");
                secim = scanner.nextLine();
                for (int i = 0; i < urunler.length; i++) {
                    if (urunler[i].equals(secim)) {
                        index = i;
                        break;
                    }
                }
                if (index == -99) {
                    System.out.println("Hatalı ürün seçtiniz.");
                    return;
                }

                System.out.print("Üründen kaç adet almak istiyorsunuz?: ");
                int miktar = scanner.nextInt();
                scanner.nextLine();
                double ürünFiyatı = fiyatlar[index];

                System.out.println("Seçtiğiniz ürün:" + urunler[index]);
                System.out.println("Miktar:" + miktar);
                System.out.println("Fiyat:" + ürünFiyatı + " TL.");
                System.out.println("Fiyatı " + ürünFiyatı + " TL. olan " + urunler[index] + " adlı üründen " + miktar + " adet sepete eklendi.");

            }while(true);

        }
    }