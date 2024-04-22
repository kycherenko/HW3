public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        byte a = 3;
        short b = 130;
        int c = 35000;
        float d = 35.5f;
        double e = 12.463544441;
        long f = 2150000000L;
        System.out.println("Значение переменной a с типом byte равно " + a);
        System.out.println("Значение переменной a с типом short равно " + b);
        System.out.println("Значение переменной a с типом int равно " + c);
        System.out.println("Значение переменной a с типом float равно " + d);
        System.out.println("Значение переменной a с типом double равно " + e);
        System.out.println("Значение переменной a с типом long равно " + f);
        System.out.println(" ");

        System.out.println("Task 2");
        float q = 27.12f;
        long w = 987678965549L;
        float r = 2.786f;
        short t = 569;
        short v = -159;
        int i = 27897;
        byte y = 67;
        System.out.println(q);
        System.out.println(w);
        System.out.println(r);
        System.out.println(t);
        System.out.println(v);
        System.out.println(i);
        System.out.println(y);
        System.out.println(" ");

        System.out.println("Task 3");
        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short paper = 480;
        System.out.println("На каждого ученика рассчитано " + paper / (lp + as + ea) + " листов бумаги");
        System.out.println(" ");

        System.out.println("Task 4");
        int min = 16/2;
        int min20 = min * 20;
        int day = min * 24 * 60;
        int day3 = day * 3;
        int month = day * 31;
        System.out.println("За 20 минут машина произвела " + min20 + " штук бутылок");
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + day3 + " штук бутылок");
        System.out.println( "За месяц машина произвела " + month + " штук бутылок");
        System.out.println(" ");

        System.out.println("Task 5");
        int white = 2;
        int brown = 4;
        int room = 120 / (white + brown);
        System.out.println("В школе, где " + room + " классов, нужно " + room * white +
                " банок белой краски и " + room * brown + " банок коричневой краски");
        System.out.println(" ");

        System.out.println("Task 6");
        int banana = 5*80;
        int milk = 2*105;
        int ice = 2*100;
        int egg = 4*70;
        double gr = banana+milk+ice+egg;
        double kg = gr / 1000;
        System.out.println(gr + " гр");
        System.out.println(kg + " кг");
        System.out.println(" ");

        System.out.println("Task 7");
        int weight = 7*1000;
        int minWeight = weight / 250;
        int maxWeight = weight / 500;
        int average = (minWeight + maxWeight) /2;
        System.out.println(average + " дней");
        System.out.println(" ");

        System.out.println("Task 8");
        int masha = 67760;
        int denis = 83690;
        int kris = 76230;
        double mashaPromotion = masha * 1.1;
        double denisPromotion = denis * 1.1;
        double krisPromotion = kris * 1.1;
        double mashaYearP = mashaPromotion * 12;
        double denisYearP = denisPromotion * 12;
        double krisYearP = krisPromotion * 12;
        int mashaYearM = masha * 12;
        int denisYearM = denis * 12;
        int krisYearM = kris * 12;
        System.out.println("Маша теперь получает " + mashaYearM + " рублей. " +
                "Годовой доход вырос на " + (mashaYearP - mashaYearM) + " рублей");
        System.out.println("Денис теперь получает " + denisYearM + " рублей. " +
                "Годовой доход вырос на " + (denisYearP - denisYearM) + " рублей");
        System.out.println("Кристина теперь получает " + krisYearM + " рублей. " +
                "Годовой доход вырос на " + (krisYearP - krisYearM) + " рублей");
    }
}