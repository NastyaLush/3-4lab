import exception.NotRealesedWatchModelException;
import factory.CasioFactory;
import objects.Ownable;
import peoples.FatherIbe;
import peoples.Human;
import peoples.KikuoIbe;
import watches.CasioGShock;
import watches.OrdinaryWatch;

public class Main {
    public static void main(String [] args){

        CasioFactory casioFactory = new CasioFactory();
        KikuoIbe kikuoIbe = KikuoIbe.getInstance();
        FatherIbe fatherIbe = FatherIbe.createFatherIbe();
        OrdinaryWatch ordinaryWatch= new OrdinaryWatch();
        fatherIbe.buySonething(ordinaryWatch);
        System.out.println(fatherIbe.getHavings());
        fatherIbe.giveAGift(ordinaryWatch, kikuoIbe);
        System.out.println(fatherIbe.getHavings());
        System.out.println(kikuoIbe.getHavings());

        kikuoIbe.getAJobICasioFactory(casioFactory);
        System.out.println(kikuoIbe.goToWork());
        System.out.println(kikuoIbe.dropWatch(ordinaryWatch));
        System.out.println(ordinaryWatch.getCondition());

        System.out.println(kikuoIbe.createProjectTeam());
        System.out.println(kikuoIbe.projectTeamTough.getPurpose());

        System.out.println(kikuoIbe.projectTeamTough.researching());
        System.out.println(kikuoIbe.watch("резиновый мяч", "амортизация корпуса часов"));

        try {
            CasioGShock casioGShock1 = casioFactory.makeCasioGShock();
            CasioGShock.realiseInnovation();
            CasioGShock casioGShock = casioFactory.makeCasioGShock();
        }catch (NotRealesedWatchModelException e){
            System.out.println(e.getMessage());
        }
    }
}
