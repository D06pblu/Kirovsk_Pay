import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ведите количетво участников шабаша");
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> expensesTable = new HashMap<>();

        int personsCount = scanner.nextInt();
        for (int i=0; i<personsCount; i++){
            System.out.println("Введите расходы участника №"+(i+1)+". После окончания ввода напишите end");
            Expenses addExpenses = new Expenses();
            addExpenses.fill();
            expensesTable.put(i, addExpenses.summ);
            System.out.println(expensesTable);
        }

    }
}
