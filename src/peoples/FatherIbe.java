package peoples;

import watches.OrdinaryWatch;

public class FatherIbe extends Human {
    private static FatherIbe objectHolder;
    private FatherIbe(){
        super("Отец Куикуе Ибе");
    }
    public static FatherIbe createFatherIbe(){
        if(objectHolder == null) objectHolder = new FatherIbe();
        return objectHolder;
    }
    public void giftWatch(OrdinaryWatch watch, Human toWho){
        watch.changeOwner(toWho);
    }
}
