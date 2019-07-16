public class WishList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Person person1 = new Person("Jonas");
        Person person2 = new Person ("Mary");
        
        Product ariel = new Product ("Ariel", 12, "white", 50, true);
        
        ariel.registerObserver(person1);
        ariel.registerObserver(person2);
        
        //Now product is available
        ariel.setState(true);
    }
    
}
