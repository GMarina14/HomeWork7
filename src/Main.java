public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Task 1");
        int savingsTotal = 0;
        int savingsPerMonth = 15000;
        int month = 0;
        int savingsGoal = 2_459_000;

        while (savingsTotal <= savingsGoal) {
            savingsTotal += savingsPerMonth;
            System.out.println("Month number " + (month + 1) + ", savings amount = " + savingsTotal + " rubles.");
            month++;
        }
        System.out.println("You need " + month + " months to save " + savingsTotal + " rubles.");
        System.out.println();
    }

    public static void task2() {
        System.out.println("Task 2");
        int number = 1;
        while (number <= 10) {
            System.out.print(number + " ");

            number++;
        }

        System.out.println();

        number--;

        for (; number > 0; number--) {
            System.out.print(number + " ");
        }

        System.out.println();
        System.out.println();
    }

    public static void task3() {
        System.out.println("Task 3");
        int population = 12_000_000;
        int birthRateInMln = 17;
        int mortalityRateInMln = 8;
        int year = 1;
        int thousand=1000;

        while (year <= 10) {
            population += ((population / thousand)*(birthRateInMln - mortalityRateInMln));
            System.out.println("Year N" + year + ", population of the country is " + population);
            year++;
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Task 4");
        double rate = 1.07;
        int savings = 15000;
        int savingGoal = 12_000_000;
        int month = 1;

        while (savings <= savingGoal) {
            savings *= rate;
            System.out.println("Month number " + month + ", savings amount = " + savings + " rubles.");
            month++;
        }
        System.out.println("Vasily needs " + month + " months with current interest rate to save 12 mln");
        System.out.println();
    }

    public static void task5() {
        System.out.println("Task 5");
        double rate = 1.07;
        int savings = 15000;
        int savingGoal = 12_000_000;
        int month = 1;

        while (savings <= savingGoal) {
            savings *= rate;
            if (month % 6 == 0) {
                System.out.println("Month number " + month + ", savings amount = " + savings + " rubles.");
            }
            month++;
        }
        System.out.println("Vasily needs " + month + " months with current interest rate to save 12 mln");
        System.out.println();
    }

    public static void task6() {
        System.out.println("Task 6");
        int periodOfSavingsTotal = 9 * 12;
        double rate = 1.07;
        int savings = 15000;
        int month = 1;

        do {
            savings *= rate;
            if (month % 6 == 0) {
                System.out.println("Month number " + month + ", savings amount = " + savings + " rubles.");
            }
            month++;
        } while (month <= periodOfSavingsTotal);

        System.out.println();
        System.out.println("Vasily after 9 years saved " + savings + " rubles.");
        System.out.println();
    }

    public static void task7() {
        System.out.println("Task 7");
        int friday = 3;
        int daysInMonth = 31;

        for (int i = 1; i <= daysInMonth; i++) {
            if (i % friday == 0) {
                System.out.println("It's friday today " + i + "th. The report needs to be prepared");
                friday += 7;
            }
        }

        System.out.println();
    }

    public static void task8() {
        System.out.println("Task 8");
        int periodicityOfComet = 79;
        int startingPeriod = 1823;
        int endingPeriod = 2123;
        int currentYear = 2023;
        System.out.print("The world faced the comet in ");

        while (startingPeriod <= endingPeriod) {
            if (startingPeriod % periodicityOfComet == 0) {
                if (startingPeriod <= currentYear) {
                    System.out.println(startingPeriod + " year ");
                } else {
                    System.out.println("Next time the world will see the comet in " + startingPeriod + " year");
                }
            }
            startingPeriod++;
        }
    }
}
