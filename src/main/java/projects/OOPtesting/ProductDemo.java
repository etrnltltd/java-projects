package projects.OOPtesting;

class ProductDemo {
    public static void main(String[] args) {
        Product milk = new Product("milk");
        milk.setRegularPrice(1.35);
        milk.setDiscount(0.20);
        milk.printInformation();
    }
}
