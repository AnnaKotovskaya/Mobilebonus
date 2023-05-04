public class Main {
    public static void main(String[] args) {

        int amountAccount = 600;
        int amountRefill = 1200;
        int bonus;

        if (amountRefill > 1000)
            bonus = amountRefill / 100;
        else {
            bonus = 0;
        }
        int total = amountAccount + amountRefill + bonus;

        System.out.println("Итоговый бонус: " + bonus);
        System.out.println("Итоговая сумма на счету: " + total);


    }
}