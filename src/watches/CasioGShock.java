package watches;


import exception.AlreadyRealesedWatchException;
import peoples.Engineer;

public class CasioGShock {
   private Watch.Condition condition = Watch.Condition.SERVICEABLE;
    private final static int impactResistance = 90;
    private static int releaseYear;
    private static Engineer creator;
    private static boolean isReleased = false;

    public Watch.Condition getCondition() {
        return condition;
    }
    public void getHit(){
        if(Math.random() <= impactResistance/100) condition = Watch.Condition.FAULTY;
    }
    public CasioGShock createCasioGShockModel(Engineer creator, int releaseYear){
        if(isReleased == false) {
            this.releaseYear = releaseYear;
            isReleased = true;
            this.creator = creator;
            return  new CasioGShock();
        }
        else throw new AlreadyRealesedWatchException("Упс! Такая модель уже существует");
    }

    // enum - описание характеристик
}
