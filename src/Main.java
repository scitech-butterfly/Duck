// Main.java

// Name: Kashvi Singh
// PRN: 23070126057
// Batch: AIML A3

public class Main {
    public static void main(String[] args) {
        MallardDuck md  = new MallardDuck();
        System.out.println("---------------");
        md.display();
        md.performQuack();
        md.performSwim();
        md.performFly();
        System.out.println("---------------");
        RubberDuck rd  = new RubberDuck();
        System.out.println("---------------");
        rd.display();
        rd.performQuack();
        rd.performSwim();
        rd.performFly();
        System.out.println("---------------");
        RedheadDuck rhd  = new RedheadDuck();
        System.out.println("---------------");
        rhd.display();
        rhd.performQuack();
        rhd.performSwim();
        rhd.performFly();
        System.out.println("---------------");
        DecoyDuck dcd  = new DecoyDuck();
        System.out.println("---------------");
        dcd.display();
        dcd.performQuack();
        dcd.performSwim();
        dcd.performFly();
        System.out.println("---------------");
    }
}
