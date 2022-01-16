import factory.CasioFactory;
import peoples.KikuoIbe;

public class Main {
    public static void main(String [] args){
        CasioFactory casioFactory = new CasioFactory();
        KikuoIbe kikuoIbe = KikuoIbe.getInstance();
        kikuoIbe.getAJobICasioFactory(casioFactory);
        System.out.println(casioFactory.getNumberOfEmployees());
        casioFactory.deleteEmployee(kikuoIbe);
        System.out.println(casioFactory.getNumberOfEmployees());
    }
}
