public class MenuItem2 {
    String name;
    double price;
    boolean isVeg;
    private boolean isExpensive;
    
    MenuItem2(){}

    MenuItem2(String name, int rate){
        this.price = rate;
    }

    MenuItem2(String name, double price){
        this.name = name;
        this.price = price;
    }

    MenuItem2(String name, double price, boolean isVeg){
        this.name = name;
        this.price = price;
        this.isVeg = isVeg;
    }
    MenuItem2(String name){
        this.name = name;
    }
    public String toString(){
        return "Name - " + this.name + " Price - " + this.price + " IsVeg - " + this.isVeg;
    }
}

