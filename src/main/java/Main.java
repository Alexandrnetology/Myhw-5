import ru.netology.myhw5.vacationservices.VacationServices;

public class Main {

    public static void main(String[] args) {
        int income = 10000;
        int expenses = 3000;
        int threshould = 20000;
        VacationServices services = new VacationServices();
        int month = services.calculate(income, expenses, threshould);
        System.out.println(month);
    }
}