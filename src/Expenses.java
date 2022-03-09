import java.util.Scanner;

public class Expenses {
    int value;
    int summ =0;

    public int fill(){
        while (true){
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()){
                value = scanner.nextInt();
                summ = summ+value;
            }
            else
                break;
        }
        return summ;
    }
}
