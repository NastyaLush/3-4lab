package watches;


import exception.AlreadyRealesedWatchException;
import exception.NotRealesedWatchModelException;
import peoples.Engineer;

public class CasioGShock {
   private Watch.Condition condition = Watch.Condition.SERVICEABLE;
    private final static int impactResistance = 90;
    private static int releaseYear;
    private static Engineer creator;
    private static boolean isReleased = false;

    private CasioGShock(){}
    public int getImpactResistance(){
        return impactResistance;
    }
    public Watch.Condition getCondition() {
        return condition;
    }
    public int getReleaseYear(){
        return releaseYear;
    }
    public Engineer getCreator(){
        return creator;
    }
    public void getHit(){
        if(Math.random() <= impactResistance/100) condition = Watch.Condition.FAULTY;
    }
    public CasioGShock(Engineer creator, int releaseYear) throws AlreadyRealesedWatchException{
        if(!isReleased ) {
            this.releaseYear = releaseYear;
            isReleased = true;
            this.creator = creator;
            System.out.println("Была изобретена модель часов Casio G-Shock. Изобретатель: " + creator.toString() + ". Год: " + releaseYear);
        }
        else throw new AlreadyRealesedWatchException("Упс! Такая модель уже существует");
    }
    public static CasioGShock createCasioGShockInstance() throws NotRealesedWatchModelException{
        if(isReleased) return new CasioGShock();
        else throw new NotRealesedWatchModelException("Невозможно создать экземпляр");
    }
    public String toString(){
        return "Часы модели Casio GShock";
    }
}
