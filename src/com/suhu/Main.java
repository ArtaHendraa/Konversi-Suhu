package com.suhu;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner userInput;
        double celsius, fahrenheit, kelvin;
        String pilihan;
        boolean isContinue = true;

        userInput = new Scanner(System.in);

        while(isContinue){
            clearScreen();
            System.out.println("Daftar Menu");
            System.out.println("1. Mengonversi Suhu Dari Celsius --> Fahrenheit\n");
            System.out.println("2. Mengonversi Suhu Dari Fahrenheit --> Celsius\n");
            System.out.println("3. Mengonversi Suhu Dari Celsius --> Kelvin\n");
            System.out.println("4. Mengonversi Suhu Dari Fahrenheit --> Kelvin\n");
            System.out.println("5. Mengonversi Suhu Dari Kelvin --> Celsius\n");
            System.out.println("6. Mengonversi Suhu Dari Kelvin --> Fahrenheit\n");

            System.out.print("Pilih Menu : ");
            pilihan = userInput.next();

            switch(pilihan){
                case "1":
                    System.out.println("========================");
                    System.out.println(" Celsius --> Fahrenheit");
                    System.out.println("========================");
                    
                    System.out.print("Masukan Nilai Celsius : ");
                    celsius = userInput.nextDouble();
                    fahrenheit = (celsius * 1.8) + 32;
                    System.out.println(celsius + "° Celsius = " + fahrenheit + "° Fahrenheit");
                    break;
                case "2":
                    System.out.println("========================");
                    System.out.println(" Fahrenheit --> Celsius");
                    System.out.println("========================");
                    
                    System.out.print("Masukan Nilai Fahrenheit : ");
                    fahrenheit = userInput.nextDouble();
                    celsius = (fahrenheit - 32) * 5/9;
                    System.out.println(fahrenheit + "° Fahrenheit = " + celsius + "° Celsius");
                    break;
                case "3":
                    System.out.println("====================");
                    System.out.println(" Celsius --> kelvin");
                    System.out.println("====================");

                    System.out.print("Masukan Nilai Celsius : ");
                    celsius = userInput.nextDouble();
                    kelvin = celsius + 273.15;
                    System.out.println(celsius + "° Celsius = " + kelvin + "° Kelvin");
                    break;
                case "4":
                    System.out.println("========================");
                    System.out.println(" Fahrenheit --> Kelvin ");
                    System.out.println("========================");

                    System.out.print("Masukan Nilai Fahrenheit : ");
                    fahrenheit = userInput.nextDouble();
                    kelvin = (fahrenheit - 32) * (5.0/9.0) + 273.15;
                    System.out.println(fahrenheit + "° Fahrenheit = " + kelvin + "° Kelvin");
                    break;
                case "5":
                    System.out.println("=====================");
                    System.out.println(" Kelvin --> Celsius ");
                    System.out.println("=====================");

                    System.out.print("Masukan Nilai Kelvin : ");
                    kelvin = userInput.nextDouble();
                    celsius = kelvin - 273.15;
                    System.out.println(kelvin + "° Kelvin = " + celsius + "° Celsius");
                    break;
                case "6":
                    System.out.println("========================");
                    System.out.println(" Kelvin --> Fahrenheit ");
                    System.out.println("========================");

                    System.out.print("Masukan Nilai Kelvin : ");
                    kelvin = userInput.nextDouble();
                    fahrenheit = (kelvin - 273.15) * (9.0 / 5.0) + 32;
                    System.out.println(kelvin + "° Kelvin = " + fahrenheit + "° Fahrenheit");
                    break;
                default:
                    System.out.println("Pilihan tidak ada");
                    break;
                }
            isContinue = getYesOrNO("Apakah Anda Ingin Melanjutkan Pengkonversian? : ");
        }
        userInput.close();

    }
    public static void clearScreen() {
        try{
            if (System.getProperty("os.name").contains("windows")){
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033\143");
            }
        } catch (Exception e){
            System.err.println("Maaf, Terminal Tidak Bisa Di Bersihkan!");
        }
    }

    public static boolean getYesOrNO(String massage){
        Scanner terminalInput = new Scanner(System.in);
        System.out.println("\n" + massage + "(yes/no)? ");
        String userChoice = terminalInput.next();
        
        while (!userChoice.equalsIgnoreCase("yes") && !userChoice.equalsIgnoreCase("no")){
            System.err.println("please choice yes or no");
            System.out.println("\n" + massage + "(yes/no)? ");
            userChoice = terminalInput.next();
//             terminalInput.close();
        }
        return userChoice.equalsIgnoreCase("yes");
    }
}
