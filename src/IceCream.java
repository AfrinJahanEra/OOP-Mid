abstract class IceCream {
    private String type;
    private int IceCreamename;
    private double price;

    public IceCream(String type, int IceCreamename, double price) {
        this.type = type;
        this.IceCreamename = IceCreamename;
        this.price = price;
    }

    public String gettype() {
        return type;
    }

    public int getIceCreamename() {
        return IceCreamename;
    }

    public abstract double getTotalPrice() ;
}