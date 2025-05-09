import greenfoot.*;

public class MyWorld extends World {
    private Score score;
    public MyWorld() {
        super(600, 400, 1);
        
        Hero baby = new Hero();
        addObject(baby, 100, 100);
        
        Bomb bomb = new Bomb();
        addObject(bomb, 600, 100);
        
        score = new Score();
        addObject(score, 100, 30); 
    }
    
    public Score getScore() {
    return score;
    }   
}
