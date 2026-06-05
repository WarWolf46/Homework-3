public class Main {
    public static void main(String[] args) {
// Задача 1
        System.out.println("\tЗадача №1\n");
        int age = 25;
        byte temperature = 12;
        short year = 2026;
        long distance = 150000L;
        float price = 99.9f;
        double weight = 75.45;

        System.out.println("Значение переменной age с типом int равно " + age);
        System.out.println("Значение переменной temperature с типом byte равно " + temperature);
        System.out.println("Значение переменной year с типом short равно " + year);
        System.out.println("Значение переменной distance с типом long равно " + distance);
        System.out.println("Значение переменной price с типом float равно " + price);
        System.out.println("Значение переменной weight с типом double равно " + weight);

// Задача 2
        System.out.println("\tЗадача №2\n");
        double numberOne = 27.12;
        long numberTwo = 987678965549L;
        float numberThree = 2.786f;
        int numberFour = 569;
        short numberFive = -159;
        int numberSix = 27897;
        byte numberSeven = 67;

        System.out.println(numberOne);
        System.out.println(numberTwo);
        System.out.println(numberThree);
        System.out.println(numberFour);
        System.out.println(numberFive);
        System.out.println(numberSix);
        System.out.println(numberSeven);
// Задача 3
        System.out.println("\tЗадача №3\n");
        int studentsLyudmila = 23;
        int studentsAnna = 27;
        int studentsEkaterina = 30;

        int totalStudents = studentsLyudmila + studentsAnna + studentsEkaterina;

        int paperSheets = 480;

        int sheetsPerStudent = paperSheets / totalStudents;

        System.out.println("На каждого ученика рассчитано " +
                sheetsPerStudent + " листов бумаги");
// Задача 4
        System.out.println("\tЗадача №4\n");
        int bottlesPerTwoMinutes = 16;
        int minutes = 2;

        int bottlesPerMinute = bottlesPerTwoMinutes / minutes;

        int bottlesFor20Minutes = bottlesPerMinute * 20;
        System.out.println("За 20 минут машина произвела " +
                bottlesFor20Minutes + " штук бутылок");

        int bottlesPerDay = bottlesPerMinute * 60 * 24;
        System.out.println("За сутки машина произвела " +
                bottlesPerDay + " штук бутылок");

        int bottlesForThreeDays = bottlesPerDay * 3;
        System.out.println("За 3 дня машина произвела " +
                bottlesForThreeDays + " штук бутылок");

        int bottlesPerMonth = bottlesPerDay * 30;
        System.out.println("За 1 месяц машина произвела " +
                bottlesPerMonth + " штук бутылок");
// Задача 5
        System.out.println("\tЗадача №5\n");
        int totalPaintCans = 120;

        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;

        int paintPerClass = whitePaintPerClass + brownPaintPerClass;

        int classes = totalPaintCans / paintPerClass;

        int totalWhitePaint = classes * whitePaintPerClass;
        int totalBrownPaint = classes * brownPaintPerClass;

        System.out.println("В школе, где " + classes +
                " классов, нужно " + totalWhitePaint +
                " банок белой краски и " +
                totalBrownPaint + " банок коричневой краски");
// Задача 6
        System.out.println("\tЗадача №6\n");
        int bananas = 5;
        int bananaWeight = 80;

        int milk = 200;
        int milkWeightPer100Ml = 105;

        int iceCream = 2;
        int iceCreamWeight = 100;

        int eggs = 4;
        int eggWeight = 70;

        int totalBananaWeight = bananas * bananaWeight;
        int totalMilkWeight = milk / 100 * milkWeightPer100Ml;
        int totalIceCreamWeight = iceCream * iceCreamWeight;
        int totalEggWeight = eggs * eggWeight;

        int totalBreakfastWeight = totalBananaWeight +
                totalMilkWeight +
                totalIceCreamWeight +
                totalEggWeight;

        double totalBreakfastWeightKg = totalBreakfastWeight / 1000.0;

        System.out.println("Вес спортзавтрака в граммах: " +
                totalBreakfastWeight);

        System.out.println("Вес спортзавтрака в килограммах: " +
                totalBreakfastWeightKg);
// Задача 7
        System.out.println("\tЗадача №7\n");
        int weightToLoseKg = 7;

        int weightToLoseGramms = weightToLoseKg * 1000;

        int minLossPerDay = 250;
        int maxLossPerDay = 500;

        int daysAtMinSpeed = weightToLoseGramms / minLossPerDay;
        int daysAtMaxSpeed = weightToLoseGramms / maxLossPerDay;

        int averageLossPerDay = (minLossPerDay + maxLossPerDay) / 2;
        int averageDays = weightToLoseGramms / averageLossPerDay;

        System.out.println("Дней при потере 250 г/день: " + daysAtMinSpeed);
        System.out.println("Дней при потере 500 г/день: " + daysAtMaxSpeed);
        System.out.println("Среднее количество дней: " + averageDays);
 // Задача 8
        System.out.println("\tЗадача №8\n");
        int monthsInYear = 12;
        double increaseRate = 0.10;

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        // Маша
        double mashaNewSalary = mashaSalary + mashaSalary * increaseRate;
        double mashaYearDiff = (mashaNewSalary - mashaSalary) * monthsInYear;

        System.out.println("Маша теперь получает " + mashaNewSalary +
                " рублей. Годовой доход вырос на " + mashaYearDiff + " рублей");

        // Денис
        double denisNewSalary = denisSalary + denisSalary * increaseRate;
        double denisYearDiff = (denisNewSalary - denisSalary) * monthsInYear;

        System.out.println("Денис теперь получает " + denisNewSalary +
                " рублей. Годовой доход вырос на " + denisYearDiff + " рублей");

        // Кристина
        double kristinaNewSalary = kristinaSalary + kristinaSalary * increaseRate;
        double kristinaYearDiff = (kristinaNewSalary - kristinaSalary) * monthsInYear;

        System.out.println("Кристина теперь получает " + kristinaNewSalary +
                " рублей. Годовой доход вырос на " + kristinaYearDiff + " рублей");
    }
}