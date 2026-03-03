package A09_Objects_And_Classes.Exercises;

public class Exercise09_02 {
    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        stock.previousClosingPrice = 34.5;
        stock.currentPrice = 34.35;

        System.out.println("Price change percentage: " + stock.getChangePercent());

    }
}

class Stock{
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;

    Stock(String Symbol, String Name){
        symbol = Symbol;
        name = Name;
        previousClosingPrice = 0.0;
        currentPrice = 0.0;
    }

    double getChangePercent(){
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }


}
