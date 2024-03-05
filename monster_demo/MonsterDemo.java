package monster_demo;
public class MonsterDemo{

    protected int powerLevel = 100;

    public MonsterDemo(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public int displayPowerLevel(){
        System.out.println("Current Power Level: " + this.powerLevel);
        return powerLevel;
    }
} 