public class IceCreamFactory {
    public static IceCream iceCream(String type, String name, double price) {
        switch (type.toLowerCase()) {
            case "icecreameflavour":
                return new IceCreamFlavour(type, name, price);
            case "icecreamtoppings":
                return new IceCreamToppings(type, name, price);
            default:
                throw new IllegalArgumentException("Invalid product type: " +type);
        }
    }
}
