package adventure_game;
public class NPC extends Character{

    public NPC(String name, int health, int mana, int baseDamage, String description){
        super(name, health, mana, baseDamage, description);
    }

    @Override
    public void takeTurn(Character other){
        if(this.isStunned()){
            this.decreaseTurnsStunned();
            System.out.printf("%S is unable to take any actions this turn!", this.getName());
            return;
        }
        this.attack(other);
    }
}