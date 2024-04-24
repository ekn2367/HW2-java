import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class iki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet yemek menüde bulunuyor? ");
        int menuItemCount = scanner.nextInt();

        List<String> bosList = new ArrayList<>();

        for (int i = 0; i < menuItemCount; i++) {
            System.out.println("\nYemek " + (i+1) + " bilgilerini girin:");
            System.out.print("Yemek adı: ");
            String mealName = scanner.next();
            System.out.print("Fiyatı: ");
            String mealPrice = scanner.next();
            System.out.print("Popülerlik derecesi (1-5 arası): ");
            String popularityRating = scanner.next();

            List<String> myList = new ArrayList<>();

            myList.add(mealName);
            myList.add(mealPrice);
            myList.add(popularityRating);

            bosList.addAll(myList);
            System.out.println("Liste içeriği: " + myList);
        }
    System.out.println("Menü:");
        System.out.println(bosList);
    }
}
