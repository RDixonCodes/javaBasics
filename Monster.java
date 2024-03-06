
public class Monster extends MonsterDemo {
    

    public Monster(int powerLevel){
        super(powerLevel);
    }

    public void throwRock(){
        powerLevel -= 10;
        System.out.println("\nProjectile thrown!");
        System.out.println("Power level decreased to: " + this.powerLevel);
    }

    public void takeDamage(){
        powerLevel -= 5;
        System.out.println("\nYou've been hit!");
        System.out.println("Power level decreased to: " + this.powerLevel);
    }

    public void eatPowerPellet(){
        powerLevel += 5;
        System.out.println("\nPowering up!");
        System.out.println("Power level increased to: " + this.powerLevel);
    }

    public void powerBurst(){
        powerLevel -= 15;
        System.out.println("\nPower burst!");
        System.out.println("Power level decreased to: " + this.powerLevel);
    }
}
