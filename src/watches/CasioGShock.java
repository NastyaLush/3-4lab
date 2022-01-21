package watches;


import exception.AlreadyRealesedException;
import exception.NotRealesedWatchModelException;
import objects.Innovation;
import objects.Ownable;

public class CasioGShock extends Watch implements Innovation {
    private final static int impactResistance = 90;
    private static boolean isRealesed = false;
    private CasioGShock() {
        super(impactResistance);
    }
    public static boolean isRealesed(){
        return isRealesed;
    }
    public String toString(){
        return "Часы модели Casio G-Shock";
    }

    public static void realiseInnovation() {
        if (!CasioGShock.isRealesed()) isRealesed = true;
        else throw new AlreadyRealesedException("Упс! Похоже, такое изобретение уже существует..");
    }
    public static CasioGShock getInstanse(){
        if(CasioGShock.isRealesed()) return new CasioGShock();
        else throw new NotRealesedWatchModelException("Похоже, такие часы еще не придумали..");
    }
}
