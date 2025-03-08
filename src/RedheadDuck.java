//RedheadDuck.java
public class RedheadDuck extends Duck{
    public RedheadDuck(){
        quackBehaviour = new Quack();
        swimBehaviour = new Swimming();
        flyBehaviour = new CanFly();
    }

    @Override
    public void display() {
        System.out.println("I am Redhead Duck.");
    }
}

