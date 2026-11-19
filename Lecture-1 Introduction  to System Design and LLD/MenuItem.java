public class MenuItem{
    String name;
    double price;
    boolean isVeg;

    MenuItem(String name, double price, boolean isVeg){
        // name = name; // will print null
        this.name = name;
        this.price = price;
        this.isVeg = isVeg;
    }

    // Print the object of this class
    @Override public String toString(){
        return "Menuitem - " + this.name + " price - " + this.price + " isVeg - " + this.isVeg;
    }
}
