
public class MonsterTest {
    
    public static void main(String [] args){

        Monster m1 = new Monster(100);
        System.out.println("\n--------LET THE BATTLE BEGIN!!!--------");
        m1.displayPowerLevel();
        m1.throwRock();
        m1.throwRock();
        m1.takeDamage();
        m1.powerBurst();
        m1.displayPowerLevel();
        m1.eatPowerPellet();

    }
}
