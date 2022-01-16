import factory.CasioFactory;
import peoples.FatherIbe;
import peoples.Human;
import peoples.KikuoIbe;
import watches.OrdinaryWatch;

public class Main {
    public static void main(String [] args){

        CasioFactory casioFactory = new CasioFactory();
        KikuoIbe kikuoIbe = KikuoIbe.getInstance();
        FatherIbe fatherIbe = FatherIbe.createFatherIbe();
        OrdinaryWatch ordinaryWatch= new OrdinaryWatch(fatherIbe);
        fatherIbe.giftWatch(ordinaryWatch, kikuoIbe);

        kikuoIbe.getAJobICasioFactory(casioFactory);
        System.out.println(kikuoIbe.goToWork());
        System.out.println(kikuoIbe.dropWatch(ordinaryWatch));
        System.out.println(ordinaryWatch.getCondition());

        
    }
}
