
abstract  class IceCream {
    String type;
    String IceCreamename;
    double price;

    public IceCream(String type,String IceCreamename,double price){
        this.type=type;
        this.IceCreamename=IceCreamename;
        this.price=price;
    }

    public String getType(){
        return this.type;
    }
    public String getIceCreamename(){
        return this.IceCreamename;
    }
    public double price(){
        return this.price;
    }
}
