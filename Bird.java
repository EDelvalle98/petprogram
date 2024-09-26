package petcode;

public class Bird extends Pets {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void speak(){
        System.out.println("the bird chirps");
    }
}
