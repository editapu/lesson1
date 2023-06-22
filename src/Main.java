import java.sql.SQLOutput;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!");
        System.out.println("sveikučiai");

//String pasisveikinimas ="sveikučiai"

        //00000000
        //00000001
        //00000010


        byte smallNum = 30;
        smallNum = 32;

        double suKableliu = 154.565487654;
        System.out.println("suKableliu");
        System.out.println(suKableliu);

        boolean isTasty = true;

        System.out.println(Math.round(3.4));

        System.out.println(Math.ceil(suKableliu));

        int rndNum = (int) Math.round(Math.random() * 18);

        System.out.println((int) 5.6541542);

        int min = 10;
        int max = 20;

        rndNum = min + (int) Math.round(Math.random() * (max - min));
        System.out.println(rndNum);
        String name = "Edita";
        String surname = "Pucinskaite";
        int birthYear = 1982;
        int year = 2023;

        System.out.println("Äš esu " + name + " " + surname + " gimiau " + birthYear + " ir sie metai yra " + year + ". Man yra " + (year - birthYear));


        System.out.println(year - birthYear);

        System.out.println(Math.round(4.455435665));
        System.out.println(Math.round(4.455435665 * 100) / 100.0);
        System.out.println("----------------------------------");

        double num = 4.455435665;
        System.out.println(num);

        double numMultiplied = num * 100;
        System.out.println(numMultiplied);

        int numRounded = (int) Math.round(numMultiplied);
        System.out.println(numRounded);

        double numDivided = numRounded / 100.0;
        System.out.println(numDivided);


        rndNum = min + (int) Math.round(Math.random() * (max - min));
        System.out.println(rndNum);


        String name1 = "Rapolas";
        String surname1 = "Vaiciunas";
        int birthYear1 = 2015;
        int year1 = 2023;
        System.out.println("Mano sunus" + "  " + name1 + "  " + surname1 + "  " + "gime" + " " + birthYear1 + ".");

        System.out.println(name1 + " " + "yra" + " " + (year1 - birthYear1) + " " + "metu");


        int a = 0;
        int b = 4;
        int rndNum21 = a + (int) Math.round(Math.random() * (b - a));
        int rndNum22 = a + (int) Math.round(Math.random() * (b - a));
        System.out.println(rndNum21);
        System.out.println(rndNum22);

        //jeigu num21 NERA lygus 0 IR num22 NERA lygus 0


        if (rndNum21 != 0 && rndNum22 != 0) {
            if (rndNum21 > rndNum22) {
                System.out.println((double) rndNum21 / rndNum22);
            } else {
                System.out.println((double) rndNum22 / rndNum21);
            }
        } else {
            System.out.println("dalyba is 0 negalima");
        }

        System.out.println("================ 3 ==================");


//3 užduotis

        int kintamasis1 = 0;
        int kintamasis2 = 13;
        int kintamasis3 = 25;
        int rndNum1 = kintamasis1 + (int) Math.round(Math.random() * (kintamasis3 - kintamasis2 - kintamasis1));
        int rndNum2 = kintamasis2 + (int) Math.round(Math.random() * (kintamasis3 - kintamasis2 - kintamasis1));
        int rndNum3 = kintamasis3 + (int) Math.round(Math.random() * (kintamasis3 - kintamasis2 - kintamasis1));

        rndNum1 = 20;
        rndNum2 = 5;
        rndNum3 = 10;
        System.out.println(rndNum1);
        System.out.println(rndNum2);
        System.out.println(rndNum3);
        System.out.println("result:");
//        a =4 b = 15 c = 27
//        a =27 b = 15 c = 4
//        a > b ir a < c false a
//        (b > a ir b < c) arba (b < a ir b > c) true b
//        c > a ir c < b false c

        if ((rndNum1 >= rndNum2 && rndNum1 <= rndNum3) || (rndNum1 <= rndNum2 && rndNum1 >= rndNum3)) {
            System.out.println(rndNum1);
        }

        if ((rndNum2 >= rndNum1 && rndNum2 <= rndNum3) || (rndNum2 <= rndNum1 && rndNum2 >= rndNum3)) {
            System.out.println(rndNum2);
        }

        if ((rndNum3 >= rndNum1 && rndNum3 <= rndNum2) || (rndNum3 <= rndNum1 && rndNum3 >= rndNum2)) {
            System.out.println(rndNum3);
        }

// 4 užduotis

        System.out.println("================ 4 ==================");

        int min41 = 1;
        int max42 = 10;

        int rndNum41 = min41 + (int) Math.round(Math.random() * (max42 - min41));
        int rndNum42 = min41 + (int) Math.round(Math.random() * (max42 - min41));


        int kra = min41 + (int) Math.round(Math.random() * (max42 - min41));
        int krb = min41 + (int) Math.round(Math.random() * (max42 - min41));
        int krc = min41 + (int) Math.round(Math.random() * (max42 - min41));

        System.out.println(kra);
        System.out.println(krb);
        System.out.println(krc);

        // a + b > c     7 + 10 > 5    17 > 5  TRUE
        // a + c > b     7 + 5 > 10    12 > 10  TRUE
        // b + c > a     10 + 5 > 7    15 > 7   TRUE

        if (kra + krb > krc && kra + krc > krb && krb + krc > kra) {
            System.out.println("trikampis gaunasi");
        } else {
            System.out.println("trikampis nesigauna");
        }

// 5 užduotis

        int min51 = 0;
        int max52 = 2;

        int sk1 = min51 + (int) Math.round(Math.random() * (max52 - min51));
        int sk2 = min51 + (int) Math.round(Math.random() * (max52 - min51));
        int sk3 = min51 + (int) Math.round(Math.random() * (max52 - min51));
        int sk4 = min51 + (int) Math.round(Math.random() * (max52 - min51));

        System.out.println(sk1);
        System.out.println(sk2);
        System.out.println(sk3);
        System.out.println(sk4);
        System.out.println("----------------");

        int zeros = 0;
        int ones = 0;
        int twos = 0;

        if (sk1 == 0) {
            zeros++;
        }

        if (sk2 == 0) {
            zeros++;
        }

        if (sk3 == 0) {
            zeros++;
        }

        if (sk4 == 0) {
            zeros++;
        }

        System.out.println(zeros);     // 0 = 1

        if (sk1 == 1) {
            ones++;
        }

        if (sk2 == 1) {
            ones++;
        }

        if (sk3 == 1) {
            ones++;
        }

        if (sk4 == 1) {
            ones++;
        }

        System.out.println(ones);  // 1 = 3


        if (sk1 == 2) {
            twos++;
        }

        if (sk2 == 2) {
            twos++;
        }

        if (sk3 == 2) {
            twos++;
        }

        if (sk4 == 2) {
            twos++;
        }
        System.out.println(twos);    // 2 = 1

// 6 užduotis

        int min61 = -10;
        int max62 = 10;

        int nr1 = min61 + (int) Math.round(Math.random() * (max62 - min61));
        int nr2 = min61 + (int) Math.round(Math.random() * (max62 - min61));
        int nr3 = min61 + (int) Math.round(Math.random() * (max62 - min61));

        System.out.println(nr1);
        System.out.println(nr2);
        System.out.println(nr3);

        if (nr1 < 0) {
            System.out.println("[" + nr1 + "]");
        }

        if (nr2 < 0) {
            System.out.println("(" + nr2 + ")");
        }

        if (nr3 < 0) {
            System.out.println("{" + nr3 + "}");
        }


        if (nr1 == 0) {
            System.out.println("[" + nr1 + "]");
        }

        if (nr2 == 0) {
            System.out.println("(" + nr2 + ")");
        }

        if (nr3 == 0) {
            System.out.println("{" + nr3 + "}");
        }

        if (nr1 > 0) {
            System.out.println("[" + nr1 + "]");
        }

        if (nr2 > 0) {
            System.out.println("(" + nr2 + ")");
        }

        if (nr3 > 0) {
            System.out.println("{" + nr3 + "}");
        }


// STRINGAI

        // 1 užduotis

        String starName = "Kevin";
        System.out.println(starName.length());  // 5


        String starSurname = "Costner";
        System.out.println(starSurname.length());  // 7

        if (starName.length() < starSurname.length()) {
            System.out.println(starName);
        } else {
            System.out.println(starSurname);
        }
        // 2 užduotis


        String word = "Whitney";
        System.out.println(word.toUpperCase());

        String word2 = "Houston";
        System.out.println(word2.toLowerCase());

        System.out.println(word.toUpperCase() + " " + word2.toLowerCase());


        // 3 užduotis

        String word3 = "Kevin";
        System.out.println(word3.charAt(0));

        String word31 = "Costner";
        System.out.println(word31.charAt(0));

        String initials = "" + word3.charAt(0) + word31.charAt(0);


        System.out.println(initials);


        // 4 užduotis

        String word4 = "Kevin"; // 5 - 3 -- 2;
        System.out.println(word4.length() - 3);
        System.out.println(word4.substring(word4.length() - 3));

        String word41 = "Costner";  // 7 - 3 -- 5
        System.out.println(word41.length() - 5);
        System.out.println(word41.substring(word41.length() - 5));


// 5 užduotis

        String Paris = "An American in Paris";
        System.out.println(Paris.replaceAll("a", "*").replace("A", "*"));

        // 6 užduotis

        String amerika = "An American in Paris";
        System.out.println(amerika.replace("a", " ").replace("e", " ").replace("i", " ").replace("A", " "));

        String food = "Breakfast at Tiffany's";
        System.out.println(food.replace("e", " ").replace("a", " ").replace("i", " ").replace("y", " "));

        String space = " 2001: A Space Odyssey";
        System.out.println(space.replace("e", " ").replace("a", " ").replace("i", " ").replace("y", " ").replace("A", " ").replace("O", " "));

        String life = "It's a Wonderful Life";
        System.out.println(life.replace("e", " ").replace("a", " ").replace("i", " ").replace("I", " ").replace("o", " ").replace("u", " "));


        // 7 užduotis  ???

        String starWars = "Star Wars: Episode " + " ".repeat((int) (Math.random() * 10)) + ((int) (Math.random() * 7) + 1) + " - A New Hope";
        System.out.println(starWars);
        System.out.println(starWars.substring(starWars.length() - 4,starWars.length() - 3));


// 8 užduotis

        String letter = "Don't Be a Menace to South Central While Drinking Your Juice in the Hood";

        String word1 = "Don't";
        System.out.println(word1.length());

        String word22 = "Be";
        System.out.println(word22.length());

        String word33 = "a";
        System.out.println(word33.length());

        String word44 = "Menace";
        System.out.println(word44.length());

        String word5 = "to";
        System.out.println(word5.length());

        String word6 = "South";
        System.out.println(word6.length());

        String word7 = "Central";
        System.out.println(word7.length());

        String word8 = "While";
        System.out.println(word8.length());

        String word9 = "Drinking";
        System.out.println(word8.length());

        String word10 = "Your";
        System.out.println(word10.length());

        String word111 = "Juice";
        System.out.println(word111.length());

        String word12 = "in";
        System.out.println(word12.length());

        String word13 = "the";
        System.out.println(word13.length());

        String word14 = "Hood";
        System.out.println(word14.length());


//if (word1<=5) {
//
//}







    }
}