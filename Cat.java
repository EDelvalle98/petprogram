package petcode;

public class Cat extends Pets {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void speak(){
        System.out.println("the cat meows");
    }
}
