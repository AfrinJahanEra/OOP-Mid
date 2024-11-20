public class waffleCone extends Order{

    @Override
    public double subPrice(double price) {
        throw new UnsupportedOperationException("Unimplemented method 'price'");
    }

    @Override
    public double tax(String type) {
        
        throw new UnsupportedOperationException("Unimplemented method 'tax'");
    }

    @Override
    public double TotalPrice() {
      
        throw new UnsupportedOperationException("Unimplemented method 'TotalPrice'");
    }

    @Override
    protected Order[] getItems() {
     
        throw new UnsupportedOperationException("Unimplemented method 'getItems'");
    }
    
}
