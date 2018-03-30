//mustafacantoptas.com

import java.io.*;
import java.util.Scanner;

public class kelimebul {
    private static boolean devam= false;
    public static void main(String args[]) throws IOException {
       while(true) {
           boolean devam=false;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Kelimenizi girip yanınızdaki arkadaşınıza verin :) ");
            String kelime = scanner.nextLine();
            int i, tahmin = 0, anahtar = 0, dogru = 0;
            String bulunan[] = new String[kelime.length()];
            //mustafacantoptas.com
            System.out.println("Kelimeyi bulmak için 5 yanlış hakkınız var.");
            BufferedReader klavye = new BufferedReader(new InputStreamReader(System.in));

            for (i = 0; i < kelime.length(); i++) {
                bulunan[i] = "_ ";

            }

            finish:
            while (tahmin < 6) {
                System.out.println("Bir harf giriniz (Kalan hakkiniz " + (5 - tahmin) + ") : ");
                String harf = klavye.readLine();
                tahmin++;
                for (i = 0; i < kelime.length(); i++) {
                    if (kelime.charAt(i) == harf.charAt(0)) {
                        bulunan[i] = harf + " ";
                        anahtar = 1;//mcantpts
                        dogru++;
                        if (dogru == kelime.length()) {
                            System.out.println("kelime \n" + kelime + "...************************Tebrikler***************...\n");
                            break finish;
                        }

                    }
                }
                if (anahtar == 1) {
                    anahtar = 0;
                    tahmin--;
                }
                for (i = 0; i < kelime.length(); i++) {
                    System.out.print(bulunan[i]);

                }
                System.out.println();
            }
            if (dogru != kelime.length()) {
                System.out.println("Uzgunum... Dogru yanit " + kelime);
            }

           System.out.println("******DEVAM ETMEK İSTERMİSİNİZ ? :)  ('Evet' / 'Hayır')");

           String cevap = scanner.nextLine();
           if(cevap.equals("Evet")){
               devam = true;
           }else if ( cevap=="Hayır") {
               System.out.println("Lütfen 2 kelime dışında girmeyiniz");
               devam= false;
               break ;
           }else{
               System.out.println("Tanımsız kelime girişi yaptınız! ");
               break ;
           }

        }
    }
}
//MCT
