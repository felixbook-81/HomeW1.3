public class Main {
    public static void main(String[] args) {

        //      1 Задача

        int a = 40000;
        System.out.println("Значение переменной a c типом int равно "+ a);
        byte b = 22;
        System.out.println("Значение переменной b c типом byte равно "+ b);
        short s = 5000;
        System.out.println("Значение переменной s c типом short равно "+ s);
        long L = 32432423;
        System.out.println("Значение переменной L c типом long равно "+ L);
        float c = 3.75f;
        System.out.println("Значение переменной c c типом float равно "+ c);
        double D = 1.3333344343434;
        System.out.println("Значение переменной D c типом double равно "+ D);


        //      2 Задача

        float fit = 27.12f;
        long Lon = 987678965549L;
        double Don = 2.786;
        int alt = 569;
        short sid =(-159);
        int h =  27897;
        byte v = 67;


        //     3 Задача

        int class1 = 23;
        int class2 = 27;
        int class3 = 30;
        int totalPaper= 480;
        int sum=class1+class2+class3;
        int result = totalPaper/sum;
        System.out.println("На каждого ученика рассчитано " + result + " листов бумаги");


        //     4 Задача

        byte performance = 16;
        byte clock=2;
        int butelIn1min=performance/clock;
        int performanceMashin=butelIn1min*20;
        int dayTime= butelIn1min * (24*60);
        int sumDay = dayTime * 3;
        int month= dayTime*30;
        System.out.println("За 20 мин машина произвела "+performanceMashin + " штук бутылок");
        System.out.println("За сутки мин машина произвела "+ dayTime + " штук бутылок");
        System.out.println("За 3 дня машина произвела "+ sumDay + " штук бутылок");
        System.out.println("За 1 месяц машина произвела "+ month + " штук бутылок");

        //      5 Задача

        int total= 120;

        int whitePaint =2;
        int brownPaint = 4;
        int room = whitePaint + brownPaint;//узнаем сколько всего банок нужно для класса

        int totalRoom = total / room;//узнаем сколко классов в школе
        int totalPaintWhite=whitePaint * totalRoom;// узнаем кол-во каждой банки
        int totalPaintBrown=brownPaint * totalRoom;// узнаем кол-во каждой банки

        System.out.println("В школе, где " + totalRoom + " классов, нужно " +totalPaintWhite+ " банок белой краски и " +  totalPaintBrown + " банок коричневой краски");


        //    6 Задача

        int banan = 80;// за 1 банан
        int milk = 105;// за 100 мл.л
        int egg = 70;// 1 яйцо в граммах
        int iceBox = 100;// 1 брикет мороженного в граммах


        int babnanas = 5;
        int iceTotal = iceBox * 2;
        int eggTotal = egg * 4;
        int milkTotal = milk*2 ;
        int weight1= babnanas * banan;
        int TotalWeight=weight1 + milkTotal + eggTotal + iceTotal;
        System.out.println(TotalWeight + " грамм");
        int grPerKg = 1000;
        float TotalWeightKg = TotalWeight/(float)grPerKg;

        //    7 Задача

        int totalWeightKg = 7;
        int loseWeight    = 250;
        int loseWeight2   = 500;


        float totalWeightGm=totalWeightKg*1000f;
        float weightLossDay=totalWeightGm / loseWeight ;
        float weightLossDay2= totalWeightGm / loseWeight2 ;
        float TotalDayMed = (loseWeight+loseWeight2) / 20;
        float TotalDay = totalWeightGm / TotalDayMed;

        System.out.println("При "+ loseWeight + " гр. спортсмен будет терять "+weightLossDay+ " грамм"  );
        System.out.println("При "+ loseWeight2 + " гр. спортсмен будет терять "+weightLossDay2+ " грамм"  );
        System.out.println(TotalDay+ "  - всего дней для похудения");

        //     8   Задача

        int oldSalaryM = 67760;
        int oldSalaryD = 83690;
        int oldSalaryK = 76230;
        double Procent =1.1;
        double newSalaryM = oldSalaryM*Procent;
        double newSalaryD = oldSalaryD*Procent;
        double newSalaryK = oldSalaryK*Procent;

        double annualOldSalaryM = 12*oldSalaryM;
        double annualOldSalaryD = 12*oldSalaryD;
        double annualOldSalaryK = 12*oldSalaryK;

        double annualnewSalaryM = 12*newSalaryM;
        double annualnewSalaryD = 12*newSalaryD;
        double annualnewSalaryK = 12*newSalaryK;


        System.out.println("Маша теперь получает "+annualnewSalaryM + " рублей. Годовой доход вырос на "+(annualnewSalaryM - annualOldSalaryM  )+" рублей");
        System.out.println("Денис теперь получает "+annualnewSalaryD + " рублей. Годовой доход вырос на "+(annualnewSalaryD - annualOldSalaryD  )+" рублей");
        System.out.println("Кристина теперь получает "+annualnewSalaryK + " рублей. Годовой доход вырос на "+(annualnewSalaryK - annualOldSalaryK  )+" рублей");


    }
}


