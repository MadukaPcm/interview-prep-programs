public class LoanDeduction {

    public static void calculateLoanDeduction(){
        double load = 1000000;
        double salary = 100000;
        double deductionRate = 0.17;

        double deductedAmount = salary * deductionRate;
        double netSalary = salary - deductedAmount;

        System.out.println("My total loan is: "+load);
        System.out.println("Total deducted amount per month (17% of salary) is :"+deductedAmount);
        System.out.println("Net salary per month : "+netSalary);
    }
}
