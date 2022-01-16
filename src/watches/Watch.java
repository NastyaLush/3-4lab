package watches;

import exception.BrokenWatchesException;

public interface Watch {
    Condition getCondition();
    int getImpactResistance();
    void changeCondition(Condition condition);


    default String showTime() throws BrokenWatchesException {
        if(this.getCondition().equals(Condition.SERVICEABLE)) {
            class Time {
                private long currentMinute = (System.currentTimeMillis() / 60000) % 60;
                private long currentHour = (System.currentTimeMillis() / 3600000) % 24;
                public String getTime(){
                    return this.currentHour + ":" + this.currentMinute;
                }
            }
            return new Time().getTime();
        }
        else throw new BrokenWatchesException("Упс! Часы сломаны и время не показывают!");
    }

    default void getHit(){
        if(Math.random() >= this.getImpactResistance()/100) this.changeCondition(Condition.FAULTY);
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
