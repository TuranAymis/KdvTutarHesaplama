import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double price, total, priceWithVat, vat = 20;

        System.out.print("Tutar girini: ");
        price = scan.nextDouble();

        priceWithVat = price * (vat / 100);
        total = priceWithVat + price;

        System.out.println("KDV oranı: %" + vat);
        System.out.println("KDV Tutarı: " + priceWithVat);
        System.out.println("Ödenecek Tutar: " + total);

    }
}