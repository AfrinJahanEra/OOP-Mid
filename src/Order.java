import java.util.List;

abstract class Order {
    List<IceCreamFlavour> IceCreamFlavour;
    List<IceCreamToppings> iceCreamToppings;

    int numberOfScope;

    public abstract double subPrice(double price);
    public abstract double tax(String type);
    public abstract double TotalPrice();
}
