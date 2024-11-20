public class IceCreamFlavour extends IceCream{

    public IceCreamFlavour(String type,String IceCreamename,double price){
        super(type, IceCreamename, price);
    }

    @Override
    public double getTotalPrice() {
  
        throw new UnsupportedOperationException("Unimplemented method 'getTotalPrice'");
    }
    
}
