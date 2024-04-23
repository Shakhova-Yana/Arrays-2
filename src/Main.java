public class Main {
    public static void main(String[] args) {
//Task1
        System.out.println("\nTask 1");
        int[] salaries = {15_000, 35_000, 50_000, 80_000};
        int sunSalaries = 0;
        for (int salary : salaries) {
            sunSalaries += salary;
        }
        {
            System.out.printf("Сумма трат за месяц составила %s рублей%n", sunSalaries);
        }
//Task2
        System.out.println("\nTask 2");
        int[] costsInWeeks = {10_000, 5_000, 15_000, 20_000};

        int minSalary = costsInWeeks[0];
        int maxSalary = costsInWeeks[0];

        for (int i : costsInWeeks) {
            if (i > maxSalary) {
                maxSalary = i;
            }
            if (i < minSalary) {
                minSalary = i;
            }
        }

        {
            System.out.printf("Максимальная сумма трат за неделю составила %s рублей%n" +
                    "Минимальная сумма трат за неделю составила %s рублей%n", maxSalary, minSalary);
        }
//Task3
        System.out.println("\nTask 3");
        int[] costsPerMonthByWeek = {10_000, 5_000, 15_000, 20_000};

        int sunSalariesTwo = 0;
        for (int salary : costsPerMonthByWeek) {
            sunSalariesTwo += salary;
        }
        {
            double averageSalaryPerMonth = (double) sunSalariesTwo / costsPerMonthByWeek.length;
            System.out.printf("Средняя сумма трат за месяц составила %s рублей", averageSalaryPerMonth);
        }
    }
}