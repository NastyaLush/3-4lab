package watches;

import peoples.Human;

public class CasioGShock {
    private Human owner;
    private Watch.Condition condition = Watch.Condition.SERVICEABLE;
    private final static int impactResistance = 90;
    public CasioGShock(Human owner){
        this.owner = owner;
    }
    public Watch.Condition getCondition() {
        return condition;
    }
    public void crash(){
        if(Math.random() <= impactResistance/100) condition = Watch.Condition.FAULTY;
    }
    // enum - описание характеристик
}
