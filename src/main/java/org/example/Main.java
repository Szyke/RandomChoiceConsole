//Main.java dosyası org.example klasörünün içinde bulunuyorsa bu kodu ekleyin :  package org.example;
package org.example;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Kaç Seçenek Olacak?");
        int choiceNumber = 0;

        try {
            choiceNumber = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Lütfen geçerli bir sayı girin.");
            scanner.close();
            return;
        }

        if (choiceNumber < 2) {
            System.out.println("Seçenek Sayısı 2'den az olamaz");
        } else {
            String[] list = new String[choiceNumber];
            for (int i = 0; i < choiceNumber; i++) {
                System.out.println((i + 1) + ". Seçeneği Girin");
                list[i] = scanner.next();
            }
            System.out.println("Seçim yapılıyor...");
            int number = random.nextInt(choiceNumber);
            String choice = list[number];
            System.out.println("Seçilen Seçenek: " + choice);
        }

        scanner.close();
    }
}
