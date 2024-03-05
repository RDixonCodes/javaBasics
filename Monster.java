
public class Monster extends MonsterDemo {
    

    public Monster(int powerLevel){
        super(powerLevel);
    }

    public void throwRock(){
        powerLevel -= 10;
        System.out.println("\nProjectile thrown!");
        System.out.println("\nPower level decreased to: " + this.powerLevel);
    }

    public void takeDamage(){
        powerLevel -= 5;
        System.out.println("You've been hit!");
        System.out.println("\nPower level decreased to: " + this.powerLevel);
    }

    public void eatPowerPellet(){
        powerLevel += 5;
        System.out.println("Powering up!");
        System.out.println("\nPower level increased to: " + this.powerLevel);
    }

    public void powerBurst(){
        powerLevel -= 15;
        System.out.println("Power burst!");
        System.out.println("\nPower level decreased to: " + this.powerLevel);
    }
}
