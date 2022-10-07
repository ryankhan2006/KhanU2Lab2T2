import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main (String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("Bill: ");
        double billAmount= input.nextDouble();
        System.out.print("What percentage of tip do you want to give? ");
        double tipPercentage= input.nextDouble();
        System.out.print("How many people are involved? ");
        int amountPeople= input.nextInt();

        TipCalculator optionOne= new TipCalculator (amountPeople, tipPercentage);

        System.out.println("-----------------");

        optionOne.addMeal(billAmount);
        billAmount= optionOne.getTotalBillBeforeTip();
        System.out.println("Total bill amount before tip: " + billAmount);

        tipPercentage= optionOne.getTipPercentage();
        System.out.println("Tip percentage: " + tipPercentage);

        double tipAmount= optionOne.tipAmount();
        System.out.println("Total tip amount: " + tipAmount);
    }

}
