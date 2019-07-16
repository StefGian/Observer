
import java.util.ArrayList;
import java.util.Observer;


public class Product implements ISubject {
    
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String name;
    private int quantity;
    private String color;
    private int size;
    boolean state;

    public Product() {
    }

    public Product(String name, int quantity, String color, int size, boolean state) {
        this.name = name;
        this.quantity = quantity;
        this.color = color;
        this.size = size;
        this.state = state;
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public void setObservers(ArrayList<Observer> observers) {
        this.observers = observers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }
    
    

    @Override
    public void registerObserver(IObserver observer) {
        observers.add((Observer) observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notifying to all the subscribers when product became available");
        for (Observer ob : observers) {
        ob.update(this.state);
    }
   
}
}

    
    
    
    

