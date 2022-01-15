package watches;

import exception.BrokenWatchesException;

public interface Watch {
    default String showTime() throws BrokenWatchesException {
        if(this.getCondition().equals(Condition.SERVICEABLE)) {
            long totalMinutes = System.currentTimeMillis() / 60000;
            long currentMinute = totalMinutes % 60;
            long currentHour = (totalMinutes / 60) % 24;
            return currentHour + ":" + currentMinute;
        }
        else throw new BrokenWatchesException("Упс! Часы сломаны и время не показывают!");
    }
    Condition getCondition();
    void crash();
    public enum Condition{
        SERVICEABLE,
        FAULTY
    }
}
