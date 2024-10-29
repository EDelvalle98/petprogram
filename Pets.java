package petcode;

public class Pets implements Comparable<Pets> {
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

    @Override
    public String toString() {
        return "Pets{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Pets o) {
        int petComparison = name.compareTo(o.name);
        if (petComparison != 0) {
        return petComparison;
    } else {
        return getClass().getName().compareTo(o.getClass().getName());
    }
}
}

