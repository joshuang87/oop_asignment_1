public class PhysicalBook extends Book {
    private double weight;
    PhysicalBook(String title,String author,double price,int quantity,double weight) {
        super(title, author, price, quantity);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double calculateShippingCost(double weight) {
        double x = (weight - 500) / 250;

        if(x < 1) {
            return 5.50;
        }
        else if(x >= 1) {
            return 5.50 + Math.floor(x);
        }
        else {
            return 0;
        }

    }

    public double getWeightInPounds(double weight) {
        this.weight = weight;

        return weight * 0.00220462262185;
    }

    // @Override
    // public String toString() {
    //     return super.toString() + "\nWeight" + weight;
    // }
}
