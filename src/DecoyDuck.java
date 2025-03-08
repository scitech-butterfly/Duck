//DecoyDuck.java
public class DecoyDuck extends Duck{
    public DecoyDuck(){
        quackBehaviour = new Quack();
        swimBehaviour = new Swimming();
        flyBehaviour = new CannotFly();
    }

    @Override
    public void display() {
        System.out.println("I am Decoy Duck..");
    }
}
