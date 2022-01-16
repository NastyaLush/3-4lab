package watches;

import peoples.Human;

public class OrdinaryWatch implements Watch{
    private Human owner;
    private Condition condition = Condition.SERVICEABLE;
    private final static int impactResistance = 50;
    public OrdinaryWatch(Human owner){
        this.owner = owner;
    }
    public Condition getCondition() {
        return condition;
    }
    public Human getOwner(){
        return owner;
    }
    public void changeOwner(Human newOwner){
        this.owner = newOwner;
    }
    public int getImpactResistance(){
        return impactResistance;
    }
    public void getHit(){
        if(Math.random() <= impactResistance/100) condition = Condition.FAULTY;
    }
}
