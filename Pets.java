package petcode;

public class Pets {
    //Declare a private name variable.
    private String name;
//Define a constructor that takes a name as input and initializes the name variable.
    public Pets(String name) {
        this.name = name;
    }
//Provide a getter method to retrieve the pet's name.
    public String getName() {
        return name;
    }

public void speak(){
    System.out.println("the animal speaks");
}
    }
