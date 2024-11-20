public class IceCreamToppings extends IceCream{

    public IceCreamToppings(String type,String IceCreamename,double price){
        super(type, IceCreamename, price);
    }

    @Override
    public double getTotalPrice() {
        
        throw new UnsupportedOperationException("Unimplemented method 'getTotalPrice'");
    }
}
