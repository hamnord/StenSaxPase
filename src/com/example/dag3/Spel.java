package com.example.dag3;

import java.util.Scanner;

public class Spel {
    public static void main(String[] args) {

        int antalSpel = 0;
        int arrAntal = 3;

        int randomTecken = (int) (Math.random() * arrAntal);

        String[] tecken = new String[3];
        tecken[0] = "sten";
        tecken[1] = "sax";
        tecken[2] = "påse";

        Scanner scan = new Scanner(System.in);

        System.out.println("::.................................:: \n" +
                "::           VÄLKOMMEN             ::"+
                "\n::              till               ::\n" +
                "::         Sten,sax,påse!          ::\n" +
                "::.................................::" + "\n" +
                "I det här spelet möter du datorn i ett klassiskt spel av sten,sax,påse \n" +
                "Reglerna går till såhär: \nSten slår sax men blir plockad av påse, sax blir slagen av sten \n" +
                "men klipper påse, påse plockar sten men blir klippt av sax" + "\n"
                + ".................................:");

        for (int antalGanger = 0; antalGanger <= 100; antalGanger++) {

            System.out.print(" Välj mellan sten, sax eller påse: ");
            String inputTecken = scan.nextLine();

            if (inputTecken.equals(tecken[0])) {
                System.out.println("::::::::::::::::::::::::::::::::::::::: \n::         Du valde: " + inputTecken + "            ::");
            } else if (inputTecken.equals(tecken[1])) {
                System.out.println("::::::::::::::::::::::::::::::::::::::: \n::         Du valde: " + inputTecken + "             ::");
            }
            if (inputTecken.equals(tecken[2])) {
                System.out.println("::::::::::::::::::::::::::::::::::::::: \n::         Du valde: " + inputTecken + "            ::");
            }

            do {


                if (randomTecken == 0 && inputTecken.equals(tecken[1])) {
                    System.out.println(":: Datorn valde Sten, du förlorade!  ::\n:::::::::::::::::::::::::::::::::::::::");
                    antalSpel++;
                }
                else if (randomTecken == 0 && inputTecken.equals(tecken[2])) {
                    System.out.println("::   Datorn valde Sten, du vann!     ::\n:::::::::::::::::::::::::::::::::::::::");
                    antalSpel++;
                }
                if (randomTecken == 1 && inputTecken.equals(tecken[2])) {
                    System.out.println(":: Datorn valde sax, du förlorade!   ::\n:::::::::::::::::::::::::::::::::::::::");
                    antalSpel++;
                }
                else if (randomTecken == 1 && inputTecken.equals(tecken[0])) {
                    System.out.println("::   Datorn valde sax, du vann!      ::\n:::::::::::::::::::::::::::::::::::::::");
                    antalSpel++;
                }
                if (randomTecken == 2 && inputTecken.equals(tecken[0])) {
                    System.out.println(":: Datorn valde påse, du förlorade!  ::\n:::::::::::::::::::::::::::::::::::::::");
                    antalSpel++;
                }
                else if (randomTecken == 2 && inputTecken.equals(tecken[1])) {
                    System.out.println("::   Datorn valde påse, du vann!     ::\n:::::::::::::::::::::::::::::::::::::::");
                    antalSpel++;
                }
                if (randomTecken == 0 && inputTecken.equals(tecken[0])) {
                    System.out.println("Ni båda valde sten!? det blev oavgjort! \n:::::::::::::::::::::::::::::::::::::::");
                    antalSpel++;
                }
                else if (randomTecken == 1 && inputTecken.equals(tecken[1])) {
                    System.out.println(" Ni båda valde sax!? det blev oavgjort! \n:::::::::::::::::::::::::::::::::::::::");
                    antalSpel++;
                }
                if (randomTecken == 2 && inputTecken.equals(tecken[2])) {
                    System.out.println("Ni båda valde sax!? det blev oavgjort! \n:::::::::::::::::::::::::::::::::::::::");
                    antalSpel++;
                }

            }

            while (antalGanger == antalSpel);
            System.out.println("      Du har spelat: " + antalSpel + " spel." + "\n ... ... ... ... ... ... ... ...");

            if(antalGanger == 2) {
                System.out.print("Vill du avsluta spel? Y/N: ");
                String avslutaSpel = scan.nextLine();

            if(avslutaSpel.equals("Y")){
                System.out.println("\n Du har valt att avsluta spelet. Va på tiden \n                 HEJDÅ!");
                break;
            }
            else if(avslutaSpel.equals("N")) {
                System.out.println("\n    Ja ja, vi kör igen då...");
                }
            }


        }
    }

}