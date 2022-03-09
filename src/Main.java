import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       ExpansesTable.expAdding();
        Calculate.totalSumm();
        System.out.println("Всего за шабаш потрачено - "+Calculate.resultTS);
        Calculate.extraOrOverPayment();
    }
}
