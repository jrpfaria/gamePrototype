public class Player{
    
    private double hp;
    private final double damage;
    private final double armor;
    private double damagebuff;
    private final double[] damagebuffs = {0.1, 0.25, 0.5, 0.75, 1, 1.33, 1.5, 1.66, 1.75, 2};
    private double armorbuff;
    private final double[] armorbuffs = {0.1, 0.25, 0.5, 0.75, 1, 1.5, 2, 2,5, 3, 4};
    
    public Player(){
        this.hp = 100;
        this.damage = 20;
        this.armor = 10;
        this.damagebuff = 1;
        this.armorbuff = 1;
    }
    
    // receiving damage
    public void getDamaged(double life){
        hp -= life;
    }
    
    // access the stats
    public double hp(){
        return hp;
    }

    public double damage(){
        return damage;
    }

    public double armor(){
        return armor;
    }
    
    public double damagebuff(){
        return damagebuff;
    }
    
    public double armorbuff(){
        return armorbuff;
    }
    
    // change the stats during the game
    public void getDamaged(int damage){
        hp -= damage;
    }
    
    public void changeDamageMulti(int buff){
        damagebuff = damagebuffs[buff];
    }
    
    public void changeArmorMulti(int buff){
        armorbuff = armorbuffs[buff];
    }
    
    public void heal(){
        if (hp+33 <= 100) hp += 33;
        else hp = 100;
    }
}
