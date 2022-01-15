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
    public void getHit(){
        if(Math.random() <= impactResistance/100) condition = Condition.FAULTY;
    }
}
