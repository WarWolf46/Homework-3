public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("\tЗадача №1\n");

        int userAge = 25;
        byte roomTemperature = 12;
        short currentYear = 2026;
        long distanceToPoint = 150000L;
        float productPrice = 99.9f;
        double userWeight = 75.45;

        System.out.println("Значение переменной userAge с типом int равно " + userAge);
        System.out.println("Значение переменной roomTemperature с типом byte равно " + roomTemperature);
        System.out.println("Значение переменной currentYear с типом short равно " + currentYear);
        System.out.println("Значение переменной distanceToPoint с типом long равно " + distanceToPoint);
        System.out.println("Значение переменной productPrice с типом float равно " + productPrice);
        System.out.println("Значение переменной userWeight с типом double равно " + userWeight);


        // Задача 2
        System.out.println("\n\tЗадача №2\n");

        double numberOne = 27.12;
        long numberTwo = 987_678_965_549L;
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
        System.out.println("\n\tЗадача №3\n");

        int lyudaStudents = 23;
        int annaStudents = 27;
        int katiaStudents = 30;

        int totalStudents = lyudaStudents + annaStudents + katiaStudents;
        int totalPaperSheets = 480;

        int sheetsPerStudent = totalPaperSheets / totalStudents;

        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");


        // Задача 4
        System.out.println("\n\tЗадача №4\n");

        int bottlesPerTwoMinutes = 16;
        int minutesInterval = 2;

        int bottlesPerMinute = bottlesPerTwoMinutes / minutesInterval;

        int minutesIn20 = 20;
        int bottlesFor20Minutes = bottlesPerMinute * minutesIn20;
        System.out.println("За 20 минут машина произвела " + bottlesFor20Minutes + " штук бутылок");

        int minutesInDay = 60 * 24;
        int bottlesPerDay = bottlesPerMinute * minutesInDay;
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");

        int daysIn3Days = 3;
        int bottlesForThreeDays = bottlesPerDay * daysIn3Days;
        System.out.println("За 3 дня машина произвела " + bottlesForThreeDays + " штук бутылок");

        int daysInMonth = 30;
        int bottlesPerMonth = bottlesPerDay * daysInMonth;
        System.out.println("За 1 месяц машина произвела " + bottlesPerMonth + " штук бутылок");


        // Задача 5
        System.out.println("\n\tЗадача №5\n");

        int totalPaintCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;

        int totalCansPerClass = whiteCansPerClass + brownCansPerClass;
        int numberOfClasses = totalPaintCans / totalCansPerClass;

        int totalWhiteCans = numberOfClasses * whiteCansPerClass;
        int totalBrownCans = numberOfClasses * brownCansPerClass;

        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " +
                totalWhiteCans + " банок белой краски и " +
                totalBrownCans + " банок коричневой краски");


        // Задача 6
        System.out.println("\n\tЗадача №6\n");

        int bananasCount = 5;
        int bananaWeight = 80;

        int milkPortions = 2; // 200 мл / 100 мл
        int milkPortionWeight = 105;

        int iceCreamCount = 2;
        int iceCreamWeight = 100;

        int eggsCount = 4;
        int eggWeight = 70;

        int totalBananaWeight = bananasCount * bananaWeight;
        int totalMilkWeight = milkPortions * milkPortionWeight;
        int totalIceCreamWeight = iceCreamCount * iceCreamWeight;
        int totalEggWeight = eggsCount * eggWeight;

        int totalBreakfastWeightGrams = totalBananaWeight + totalMilkWeight + totalIceCreamWeight + totalEggWeight;
        double totalBreakfastWeightKg = totalBreakfastWeightGrams / 1000.0;

        System.out.println("Вес спортзавтрака в граммах: " + totalBreakfastWeightGrams);
        System.out.println("Вес спортзавтрака в килограммах: " + totalBreakfastWeightKg);



        // Задача 7

        System.out.println("\n\tЗадача №7\n");

        int weightToLoseKg = 7;
        int weightToLoseGrams = weightToLoseKg * 1000;

        int minLossPerDay = 250;
        int maxLossPerDay = 500;

        int daysAtMinSpeed = weightToLoseGrams / minLossPerDay;
        int daysAtMaxSpeed = weightToLoseGrams / maxLossPerDay;

        int averageDays = (daysAtMinSpeed + daysAtMaxSpeed) / 2;

        System.out.println("Дней при потере 250 г/день: " + daysAtMinSpeed);
        System.out.println("Дней при потере 500 г/день: " + daysAtMaxSpeed);
        System.out.println("Среднее количество дней: " + averageDays);


        // Задача 8
        System.out.println("\n\tЗадача №8\n");

        int monthsInYear = 12;

        // Маша
        int mashaSalary = 67760;
        int mashaRaise = mashaSalary * 10 / 100; // 10% от зарплаты
        int mashaNewSalary = mashaSalary + mashaRaise;
        int mashaYearDiff = mashaRaise * monthsInYear;
        System.out.println("Маша теперь получает " + mashaNewSalary + " рублей. Годовой доход вырос на " + mashaYearDiff + " рублей");

        // Денис
        int denisSalary = 83690;
        int denisRaise = denisSalary * 10 / 100;
        int denisNewSalary = denisSalary + denisRaise;
        int denisYearDiff = denisRaise * monthsInYear;
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на " + denisYearDiff + " рублей");

        // Кристина
        int kristinaSalary = 76230;
        int kristinaRaise = kristinaSalary * 10 / 100;
        int kristinaNewSalary = kristinaSalary + kristinaRaise;
        int kristinaYearDiff = kristinaRaise * monthsInYear;
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на " + kristinaYearDiff + " рублей");
    }
}