package watches;

import exception.BrokenWatchesException;

public interface Watch {
    default String showTime() throws BrokenWatchesException {
        if(this.getCondition().equals(Condition.SERVICEABLE)) {
            long currentMinute = (System.currentTimeMillis() / 60000) % 60;
            long currentHour = (System.currentTimeMillis() / 3600000) % 24;
            return currentHour + ":" + currentMinute;
        }
        else throw new BrokenWatchesException("Упс! Часы сломаны и время не показывают!");
    }
    Condition getCondition();
    int getImpactResistance();
    void changeCondition(Condition condition);
    default void getHit(){
        if(Math.random() <= this.getImpactResistance()/100) this.changeCondition(Condition.FAULTY);
    }
    enum Condition{
        SERVICEABLE("исправны"),
        FAULTY("неисправны");

        private String name;
        Condition(String name){
            this.name = name;
        }
        public String toString(){
            return "Часы " + name;
        }
    }
}
