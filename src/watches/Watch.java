package watches;

import objects.Ownable;

public abstract class Watch implements Ownable {
    private Condition condition = Condition.SERVICEABLE;
    private int impactResistance;

    public Watch(int impactResistance) {
        this.impactResistance = impactResistance;
    }

    public Condition getCondition() {
        return condition;
    }

    public int getImpactResistance() {
        return impactResistance;
    }

    public void setCondition(Condition condition) {
        this.condition = condition;
    }

    public String showTime() throws BrokenWatchesException {
        if (this.getCondition().equals(Condition.SERVICEABLE)) {
            class Time {
                private long currentMinute = (System.currentTimeMillis() / 60000) % 60;
                private long currentHour = (System.currentTimeMillis() / 3600000) % 24;

                public String getTime() {
                    return this.currentHour + ":" + this.currentMinute;
                }
            }
            return new Time().getTime();
        } else throw new BrokenWatchesException();
    }

    public void getHit() {
        if (Math.random() >= this.getImpactResistance() / 100) this.setCondition(Condition.FAULTY);
    }

    enum Condition {
        SERVICEABLE("исправны"),
        FAULTY("неисправны");

        private String name;

        Condition(String name) {
            this.name = name;
        }

        public String toString() {
            return "Часы " + name;
        }
    }
}
