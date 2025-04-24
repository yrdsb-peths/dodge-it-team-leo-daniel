import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        
        Daniel D1 = new Daniel();
        addObject(D1, 100, 300);
        
        Car C1 = new Car();
        addObject(C1, 500, 300);
    }
}
