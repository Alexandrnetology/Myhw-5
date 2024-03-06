package ru.netology.myhw5.vacationservices;

public class VacationServices {
    public int calculate(int income, int expenses, int threshould) {
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            count++;
            if (money >= threshould) {
                System.out.println("Месяц " + count + ". Денег " + money + ". Буду отдыхать." + " Потратил -" + expenses + ". затем еще -" + (money - expenses - (money - expenses) / 3));
                money = (money - expenses) / 3;
            } else {
                System.out.println("Месяц " + count + ". Денег " + money + ". Придется работать." + "Заработал +" + income + ". Потратил -" + expenses);
                money = money + income - expenses;
            }
        }
        return count;
    }
}
