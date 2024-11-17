import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(" Задача №1 ");

        byte cat = 1;

        System.out.println(" Значение переменной cat с типом byte равно " + cat);


        short dog = 31111;

        System.out.println(" Значение переменной dog с типом short равно " + dog);

        int parrot = 2147483646;

        System.out.println(" Значение переменной parrot с типом int равно " + parrot);

        long snake = 212247483646L;

        System.out.println(" Значение переменной snake с типом long равно " + snake);

        float turtle = 123123.31f;

        System.out.println(" Значение переменной turtle с типом float равно " + turtle);

        double monkey = 1.222222222;

        System.out.println(" Значение переменной monkey с типом double равно " + monkey);


        System.out.println(" Задача №2 ");

        float romul = 27.12f;

        System.out.println("Первая переменная имеет тип float, равная " + romul);

        long sobaka = 987678965549L;

        System.out.println("Вторая переменная имеет тип long, равная " + sobaka);

        float riki = 2.786f;

        System.out.println("Третья переменная имеет тип float, равная " + riki);

        short stuzha = 569;

        System.out.println("Четвертая переменная имеет тип short, равная " + stuzha);

        short zhizha = -159;

        System.out.println("Пятая переменная имеет тип short, равная " + zhizha);

        short nosok = 27897;

        System.out.println("Шестая переменная имеет тип short, равная " + nosok);

        byte nos = 67;

        System.out.println("Седьмая переменная имеет тип byte, равная " + nos);

        System.out.println(" Задача №3 ");

        byte ludmilla = 23;
        byte anna = 27;
        byte ekaterina = 30;
        short allSheet = 480;
        int sheetForAll = allSheet / (ludmilla + anna + ekaterina);

        System.out.println("На каждого ученика рассчитано " + sheetForAll + " листов бумаги");

        System.out.println(" Задача №4 ");

        byte bottleForTwoMinutes = 16;
        int bottleForOneMinute = bottleForTwoMinutes / 2;

        int bottleFor20Minutes = bottleForOneMinute * 20;

        System.out.println("За 20 минут машина произвела " + bottleFor20Minutes + " штук бутылок ");

        int bottleForDay = bottleForOneMinute * 60 * 24;

        System.out.println("За сутки машина произвела " + bottleForDay + " штук бутылок ");

        int bottleFor3Day = bottleForDay * 3;
        System.out.println("За 3 дня машина произвела " + bottleFor3Day + " штук бутылок ");

        int bottleForMonth = bottleFor3Day * 10;
        System.out.println("За месяц машина произвела " + bottleForMonth + " штук бутылок ");

        System.out.println(" Задача №5 ");

        byte allPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;

        byte numberOfClasses = (byte) (allPaint / (whitePaint + brownPaint));

        byte allWhitePaint = (byte) (numberOfClasses * whitePaint);

        byte allBrownPaint = (byte) (allPaint - allWhitePaint);

        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + allWhitePaint + " банок белой краски и " + allBrownPaint + " банок коричневой краски");

        System.out.println(" Задача №6 ");

        byte bananQuantity = 5;
        byte oneBananWeight = 70;
        int bananInMixer = bananQuantity * oneBananWeight;

        byte milkQantity = 2;

        byte oneMilkWegiht = 105;

        int milkInMixer = milkQantity * oneMilkWegiht;

        byte plombirQantity = 2;

        byte onePlombirWeight = 100;

        int plombirInMixer = plombirQantity * onePlombirWeight;

        byte eggQantity = 4;

        byte oneEggWeight = 70;

        double eggInMixer = eggQantity * oneEggWeight;

        double milkshake = eggInMixer + plombirInMixer + milkInMixer + bananInMixer;

        int grPerKg = 1000;

        double milkshakeKilo = milkshake / grPerKg;

        System.out.println("Спортзавтрак весит " + milkshake + " грамм " + " или " + milkshakeKilo + " кг");

        System.out.println(" Задача №7 ");

        int needLooseWeightKg = 7;
        int grammPerKg = 1000;
        int needLooseWeight = needLooseWeightKg * grammPerKg;

        int firstDiet = 250;
        int secondDiet = 500;

        int cycleOfLoosingFirst = needLooseWeight / firstDiet;
        int cycleOfLoosingSecond = needLooseWeight / secondDiet;
        int middleCyclingOfLoosing = (cycleOfLoosingFirst + cycleOfLoosingSecond) / 2;

        System.out.println("При похудении на 250 граммов в день, уйдет " + cycleOfLoosingFirst + " дней");
        System.out.println("При похудении на 500 граммов в день, уйдет " + cycleOfLoosingSecond + " дней");
        System.out.println("Дней в среднем - " + middleCyclingOfLoosing);


        System.out.println(" Задача №8 ");

        int mashaPayment = 67760;
        int denisPayment = 83690;
        int kristinaPayment = 76230;

        double mashaPovishenie = mashaPayment * 1.1;
        double mashaRazhnica = (mashaPovishenie * 12) - (mashaPayment * 12);

        System.out.println(" Маша теперь получает" + mashaPovishenie + "  рублей. Годовой доход вырос на " + mashaRazhnica + "  рублей» ");

        double denisPovishenie = denisPayment * 1.1;
        double denisRazhnica = (denisPovishenie * 12) - (denisPayment * 12);
        System.out.println(" Денис теперь получает" + denisPovishenie + "  рублей. Годовой доход вырос на " + denisRazhnica + " рублей» ");

        double kristinaPovishenie = kristinaPayment * 1.1;
        double kristinaRazhnica = (kristinaPovishenie * 12) - (kristinaPayment * 12);

        System.out.println(" Кристина теперь получает" + kristinaPovishenie + "  рублей. Годовой доход вырос на " + kristinaRazhnica + " рублей» ");


    }


}

