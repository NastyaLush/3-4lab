package peoples;

import watches.OrdinaryWatch;

public class FatherIbe extends Human {
    private FatherIbe objectHolder;
    private FatherIbe(){
        super("Отец Куикуе Ибе");
    }
    public FatherIbe createFatherIbe(){
        if(objectHolder == null) objectHolder = new FatherIbe();
        return objectHolder;
    }
    public void giftWatch(OrdinaryWatch watch, Human toWho){
        watch.changeOwner(toWho);
    }
}
