import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println( " Задача №1 ");

        byte cat = 1 ;

        System.out.println( " Значение переменной cat с типом byte равно " + cat ) ;


        short dog = 31111 ;

        System.out.println( " Значение переменной dog с типом short равно " + dog ) ;

        int parrot = 2147483646 ;

        System.out.println( " Значение переменной parrot с типом int равно " + parrot ) ;

        long snake = 212247483646L ;

        System.out.println( " Значение переменной snake с типом long равно " + snake ) ;

        float turtle = 123123.31f ;

        System.out.println( " Значение переменной turtle с типом float равно " + turtle ) ;

        double monkey = 1.222222222 ;

        System.out.println( " Значение переменной monkey с типом double равно " + monkey) ;


        System.out.println( " Задача №2 ");

        float romul = 27.12f ;

        System.out.println("Первая переменная имеет тип float, равная " + romul );

        long sobaka = 987678965549L ;

        System.out.println("Вторая переменная имеет тип long, равная " + sobaka);

        float riki = 2.786f ;

        System.out.println("Третья переменная имеет тип float, равная " + riki);

        short stuzha = 569 ;

        System.out.println("Четвертая переменная имеет тип short, равная " + stuzha);

        short zhizha = -159 ;

        System.out.println("Пятая переменная имеет тип short, равная " + zhizha);

        short nosok = 27897 ;

        System.out.println("Шестая переменная имеет тип short, равная " + nosok);

        byte nos = 67 ;

        System.out.println("Седьмая переменная имеет тип byte, равная " + nos);

        System.out.println( " Задача №3 ");

        byte ludmilla = 23 ;
        byte anna = 27 ;
        byte ekaterina = 30 ;
        short allSheet = 480;
        int sheetForAll = allSheet / (ludmilla + anna + ekaterina) ;

        System.out.println("На каждого ученика рассчитано " + sheetForAll + " листов бумаги" );

        System.out.println( " Задача №4 ");

        byte bottleForTwoMinutes = 16 ;
        int bottleForOneMinute = bottleForTwoMinutes / 2 ;

        int bottleFor20Minutes = bottleForOneMinute * 20 ;

        System.out.println("За 20 минут машина произвела " + bottleFor20Minutes + " штук бутылок " );

        int bottleForDay = bottleForOneMinute * 60 * 24 ;

        System.out.println("За сутки машина произвела " + bottleForDay + " штук бутылок " );

        int bottleFor3Day = bottleForDay * 3 ;
        System.out.println("За 3 дня машина произвела " + bottleFor3Day + " штук бутылок " );

        int bottleForMonth = bottleFor3Day * 10 ;
        System.out.println("За месяц машина произвела " + bottleForMonth + " штук бутылок " );

        System.out.println( " Задача №5 ");

        byte allPaint = 120 ;
        byte whitePaint = 2 ;
        byte brownPaint = 4 ;

        byte numberOfClasses = (byte) (allPaint / (whitePaint + brownPaint ));
















    }










}

