public class TipCalculator {
    private int numOfPeople;
    private double tipPercentage;
    private double billAmountBeforeTip;

    public TipCalculator(int numOfPeople, double tipPercentage) {
        this.numOfPeople= numOfPeople;
        this.tipPercentage= tipPercentage;
        billAmountBeforeTip= 0;
    }

    public double getTotalBillBeforeTip() {
        return billAmountBeforeTip;
    }

    public double getTipPercentage() {

        return tipPercentage;
    }

    public void addMeal(double cost) {

        billAmountBeforeTip= cost+billAmountBeforeTip;
    }

    public double tipAmount() {
        double tip= billAmountBeforeTip * (tipPercentage/100);
        return tip;
    }

    public double totalBill() {
        double total= billAmountBeforeTip + tipAmount();
        return total;
    }

    public double perPersonCostBeforeTip() {
        double perPerson = billAmountBeforeTip / numOfPeople;
        return perPerson;
    }

    public double perPersonTipAmount() {
        double perPerson = tipAmount() / numOfPeople;
        return perPerson;
    }

    public double perPersonTotalCost() {
        double perPerson= totalBill()/numOfPeople;
        return perPerson;
    }



    }

