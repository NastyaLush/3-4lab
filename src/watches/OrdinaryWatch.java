package watches;

public class OrdinaryWatch extends Watch{
    private final static int impactResistance = 30;
    public OrdinaryWatch(){
        super(impactResistance);
    }
    public String toString(){
        return "Обычные часы";
    }
}
