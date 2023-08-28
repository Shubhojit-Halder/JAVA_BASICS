import java.util.ArrayList;
import java.util.Scanner;

class Item {
    private String name;
    private double price;
    private int quantity;

    Item(String n, double p, int q) {
        name = n;
        price = p;
        quantity = q;
    }

    // setters
    void setName(String name) {
        this.name = name;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // getter
    double getPrice() {
        return price;
    }

    int getQuantity() {
        return quantity;
    }

    String getName() {
        return name;
    }
}

class ShoppingCart {
    private ArrayList<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(String itemName) {
        items.removeIf(item -> item.getName().equals(itemName));
    }

    public void updateQuantity(String itemName, int newQ) {
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                item.setQuantity(newQ);
                break;
            }
        }
    }

    public double calculateTotalPrice() {
        double totalPrice=0;
        for(Item item:items){
            totalPrice+=item.getPrice()*item.getQuantity();
        }
        return totalPrice;
    }

    public void displayCart(){
        System.out.println("Shopping Cart");
        for(Item item:items){
            System.out.println(item.getName()+"-Quantity:"+item.getQuantity()+"-Price: $"+item.getPrice());
        }
        System.out.println("Total Price: $"+calculateTotalPrice());
    }
}

public class Main {
    public static void main(String[] args){
        Item item1=new Item("P1",100,1);
        Item item2=new Item("P2",150,1);
        ShoppingCart cart = new ShoppingCart();
        while(true)
        {
            System.out.println("1.To add new product\n 2.update cart\n 3.display cart\n 4.remove cart");
            Scanner sc=new Scanner(System.in);
            int x=sc.nextInt();
            switch (x) {
                case 1:
                    System.out.println("Press 1 to add item1\nPress 2 to add item2");
                    int a=sc.nextInt();
                    if(a==1)
                        cart.addItem(item1);
                    else if(a==2)
                        cart.addItem(item2);
                    else
                        System.out.println("Press a valid number!!");
                    break;
                case 2:
                    String name=sc.nextLine();
                    int newQ=sc.nextInt();
                    cart.updateQuantity(name, newQ);
                    break;
                case 3:
                    cart.displayCart();
                case 4:
                    String nm=sc.nextLine();
                    cart.removeItem(nm);
                case 5:
                    System.exit(0);
                default:
                    break;
            }
        }
        // Item item1=new Item("product 1", 108.00,2);
        // ShoppingCart cart =new ShoppingCart();
        // cart.addItem(item1);

        // cart.displayCart();
        // cart.updateQuantity("product 1",3);

        // cart.displayCart();

        // cart.removeItem("product 1");
        // cart.displayCart();
    }
}
