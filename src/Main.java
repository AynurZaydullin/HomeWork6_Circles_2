public class Main {
    public static void main(String[] args) {
        //Задание по разделу Циклы. Часть 2.
        //Домашняя работа - 1.
        //Задание 1.
        System.out.println("Задание по разделу Циклы. Часть 2.");
        System.out.println("Домашняя работа - 1.");
        System.out.println("Задание 1.");
        double initialDepositAmount = 15_000;
        double targetAmountForDeposit = 2_459_000;
        double currentDepositAmount = 0;
        double percent = 0.01;
        int countMonth = 0;
        while (currentDepositAmount < targetAmountForDeposit){
            countMonth = countMonth+ 1;
            currentDepositAmount = (initialDepositAmount + currentDepositAmount);
            currentDepositAmount = currentDepositAmount + currentDepositAmount*percent;
            System.out.println("Сумма накоплений после " + countMonth + " месяца равна " + currentDepositAmount);
        }
        System.out.println("Василию нужно будет копить " + countMonth + " месяцев, чтобы накопить 2 миллиона 459 тысяч рублей.");
        System.out.println();

        //Задание 2.
        System.out.println("Задание 2.");
        int countNumbers = 0;
        while (countNumbers < 10){
            countNumbers++;
            System.out.print(countNumbers + " ");
        }
        System.out.println();
        for (; countNumbers > 0; countNumbers--){
            System.out.print(countNumbers + " ");
        }
        System.out.println();

        //Задание 3.
        System.out.println("Задание 3.");
        int population = 12_000_000;
        int currentPopulation = population;
        int birthRatePerYear = 17;//Рождаемость за год на 1000 человек населения.
        int deathRatePerYear = 8;//Смертность за год на 1000 человек населения.
        int currentYear = 2022;
        for (; currentYear < (2022 + 10) ; currentYear++){
            currentPopulation = currentPopulation + population/1000*birthRatePerYear - population/1000*deathRatePerYear;
        }
        System.out.println("Год " + currentYear + " население составляет " + currentPopulation);
        System.out.println();

        System.out.println("Домашняя работа - 2.");
        System.out.println("Задание 1.");
        double targetAmountForDeposit2 = 12_000_000;
        double currentDepositAmount2 = initialDepositAmount;
        double percent2 = 0.07;
        int currentMonth = 0;
        while (currentDepositAmount2 < targetAmountForDeposit2){
            currentMonth = currentMonth+ 1;
            currentDepositAmount2 = currentDepositAmount2 + currentDepositAmount2*percent2;
            System.out.println("Сумма накоплений после " + currentMonth + " месяца равна " + currentDepositAmount2);
        }
        System.out.println("Василию нужно будет копить " + currentMonth + " месяцев, чтобы накопить 12 миллионов рублей");
        System.out.println();

        System.out.println("Задание 2.");
        double currentDepositAmount3 = initialDepositAmount;
        currentMonth = 0;
        while (currentDepositAmount3 < targetAmountForDeposit2){
            currentMonth = currentMonth+ 1;
            currentDepositAmount3 = currentDepositAmount3 + currentDepositAmount3*percent2;
            if (currentMonth%6 == 0) {
                System.out.println("Сумма накоплений после " + currentMonth + " месяца равна " + currentDepositAmount3);
            }
        }
        System.out.println("Василию нужно будет копить " + currentMonth + " месяцев, чтобы накопить 12 миллионов рублей");
        System.out.println();

        System.out.println("Задание 3.");
        double currentDepositAmount4 = initialDepositAmount;
        for (currentMonth = 1; currentMonth <= 96; currentMonth++){
            currentDepositAmount4 = currentDepositAmount4 + currentDepositAmount4*percent2;
            if (currentMonth%6 == 0){
                System.out.println("Сумма накоплений после " + currentMonth + " месяца равна " + currentDepositAmount4);
            }
        }
        System.out.println();

        //Домашняя работа - 3.
        //Задание 1.
        System.out.println("Домашняя работа - 3.");
        System.out.println("Задание 1.");
        int dayOfFirstFriday = 7;
        System.out.println("Сегодня пятница " + dayOfFirstFriday + "-е число. Необходимо подготовить отчет.");
        while (dayOfFirstFriday <= (31-7)) {
            dayOfFirstFriday = dayOfFirstFriday + 7;
            System.out.println("Сегодня пятница " + dayOfFirstFriday + "-е число. Необходимо подготовить отчет.");
        }
        System.out.println();

        //Домашняя работа - 3.
        //Задание 2.
        System.out.println("Домашняя работа - 3.");
        System.out.println("Задание 2.");
        int dayOfFlight = 0;
        while (dayOfFlight <= 2022){
            dayOfFlight = dayOfFlight + 79;
            if (dayOfFlight >= (2022 - 200)){
                System.out.println(dayOfFlight);
            }
        }
        System.out.println();

        //Домашняя работа - 3.
        //Задание 3.
        System.out.println("Домашняя работа - 3.");
        System.out.println("Задание 3.");
        for(int k = 1; k <= 10; k++){
            System.out.println("2*" + k + "=" + (2*k));
        }

    }
}