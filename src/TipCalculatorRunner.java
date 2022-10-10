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
        System.out.printf("Total bill amount before tip: $"+"%.2f\n",billAmount);

        double ppcbt= optionOne.perPersonCostBeforeTip();
        System.out.printf("This is cost per person before tip: $" +"%.2f\n",ppcbt);

        tipPercentage= optionOne.getTipPercentage();
        System.out.printf("Tip percentage: $"+"%.2f\n", tipPercentage);

        double tipAmount= optionOne.tipAmount();
        System.out.printf("Total tip amount: $"+"%.2f\n", tipAmount);

        double total= optionOne.totalBill();
        System.out.printf("This is the total bill: $"+"%.2f\n", total);

        double ppta= optionOne.perPersonTipAmount();
        System.out.printf("Tip per person: $"+"%.2f\n",ppta);

        double pptc= optionOne.perPersonTotalCost();
        System.out.printf("Total cost per person: $"+"%.2f\n",pptc);

        System.out.println("-----------------");




    }

}
