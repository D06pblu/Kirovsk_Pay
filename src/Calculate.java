public class Calculate {
    static int resultTS;

    public static int totalSumm(){

        for (int exp : ExpansesTable.expensesTable.values()){
            resultTS=resultTS+exp;
        }
        return resultTS;
    }
    public static void extraOrOverPayment(){
        int averagePayment = resultTS / ExpansesTable.expensesTable.size();
        System.out.println("Каждый участник должен потратить "+averagePayment);
        int i=0;
        for (int exp : ExpansesTable.expensesTable.values()){
            int extraPayment = averagePayment-exp;
            i++;
            System.out.println("Участник №"+i+" переплатил или недоплатил "+extraPayment);
        }
    }
}
