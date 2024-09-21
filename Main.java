//Kodu kendi Main.Java dosyanızda kullanacaksınız. Bu kodu en üst satıra yapıştırın. Kod: package org.example;   Çevrimiçi bir düzenleyici kullanıyorsanız koda dokunmayın.
//You will use the code in your own Main.Java file. Paste this code on the top line. Code: package org.example;  If you're using an online editor, don't touch the code.
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("How Many Options Will There Be? (Kaç Seçenek Olacak?)");
        int choiceNumber = 0;

        try {
            choiceNumber = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Please enter a valid number.(Lütfen geçerli bir sayı girin.)");
            scanner.close();
            return;
        }

        if (choiceNumber < 2) {
            System.out.println("Number of Options cannot be less than 2.(Seçenek Sayısı 2'den az olamaz.)");
        } else {
            String[] list = new String[choiceNumber];
            for (int i = 0; i < choiceNumber; i++) {
                System.out.println((i + 1) + ". Enter Option(Seçeneği Girin)");
                list[i] = scanner.next();
            }
            System.out.println("The election is being held...(Seçim yapılıyor...)");
            int number = random.nextInt(choiceNumber);
            String choice = list[number];
            System.out.println("Selected Option:(Seçilen Seçenek:) " + choice);
        }

        scanner.close();
    }
}
