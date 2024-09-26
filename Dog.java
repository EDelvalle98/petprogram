package petcode;

public class Dog extends Pets{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak(){
        System.out.println("the dog goes bark bark");
    }
}
