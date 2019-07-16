public class Person implements IObserver{
    
    
    String personName;
    
    
    public Person (String personName){
        this.personName = personName;
    }
    
    public String getProductName (){
        return personName;
    }
    
    public void setProductName(String personName){
        this.personName = personName;
    }
            

    @Override
    public void update(boolean state) {
        System.out.println("Hello "+personName+ " product is now "+state+" on flipkart");
    }

    
    
}
