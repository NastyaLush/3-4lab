import factory.CasioFactory;
import peoples.FatherIbe;
import peoples.Human;
import peoples.KikuoIbe;
import watches.OrdinaryWatch;

public class Main {
    public static void main(String [] args){

        CasioFactory casioFactory = new CasioFactory();
        KikuoIbe kikuoIbe = KikuoIbe.getInstance();
        OrdinaryWatch ordinaryWatch= new OrdinaryWatch(kikuoIbe);
        FatherIbe fatherIbe = FatherIbe.createFatherIbe();
        kikuoIbe.getAJobICasioFactory(casioFactory);
        System.out.println(kikuoIbe.goToWork());
        System.out.println(kikuoIbe.dropWatch(ordinaryWatch));

        fatherIbe.giftWatch(ordinaryWatch, kikuoIbe);


        System.out.println(casioFactory.getNumberOfEmployees());
        casioFactory.deleteEmployee(kikuoIbe);
        System.out.println(casioFactory.getNumberOfEmployees());
        casioFactory.deleteEmployee(kikuoIbe);
        System.out.println(casioFactory.getNumberOfEmployees());


    }
}
