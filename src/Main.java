// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int starting = 500; //начальный счет
        int top = 2300; // итоговый счет
        int bonus = 0; // расчет бонуса
        int total = starting + top; // итоговая сумма

        if (top > 1000) {
            bonus = top / 100;

        }
        total = total + bonus;
        System.out.println("итоговый баланс: " + total + " рублей");
        System.out.println("бонус: " + bonus + " рублей");
    }
}