import java.util.ArrayList;

public class Exceptions{

    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
            myList.add("13");
            myList.add("hello world");
            myList.add(48);
            myList.add("Goodbye World");

        
        for(int i = 0; i < myList.size(); i++) {
            try{
                Integer castedValue = (Integer) myList.get(i);
                System.out.println("The value on index " + i + " " + myList.get(i) + " has been casted to Integer");
            }
            catch (ClassCastException e){
                System.out.println("There has been an error on the index " + i + " with the value " + myList.get(i));
            }
            
        }
        
    

    }

}