package peoples;
import exception.MovingException;
import factory.CasioFactory;
import objects.Ownable;
import watches.OrdinaryWatch;

import java.util.ArrayList;

public abstract class Human  {
    protected String name= new String();
    private String moving= new String();
    private String job;
    protected String condition= new String();
    private ArrayList<Ownable> havings = new ArrayList<Ownable>();

    public Human(){}
    public Human(String name){ this.name=name;}
    enum Location {
        CASIO_FACTORY("Casio factory"),
        HOME("home"),
        ITMO("ITMO");

        private String name;
        Location(String name){this.name=name;}
        public String toString(){
            return name;
        }
    }
    private void getAGift(Ownable gift){
        havings.add(gift);
    }
    public void giveAGift(Ownable gift, Human person){
        if(havings.contains(gift)) {
            havings.remove(gift);
            person.getAGift(gift);
        }
    }
    public void buySonething(Ownable thing){
        havings.add(thing);
    }
    public String getHavings(){
        String a = "Имущество " + this.getName() + " на данный момент:";
        for(Ownable o:havings){
            a = a + "\n" + o.toString();
        }
        return a;
    }
    public void getAJobICasioFactory(CasioFactory casioFactory){
        casioFactory.addEmployee(Human.this);
        job= Location.CASIO_FACTORY.toString();
    }
    public String goToWork( ){
    try {
        moveException(getMoving());
        moving = "ходить на работу";
        return this.name + " ходит на работу в " + job;
    }
    catch (MovingException e){
        return e.getMessage()+ " на работу";
    }
    }
    public String comeToWork(Location locaton){
        if(moving.equals("ходить на работу")){
            moving="на работе "+ locaton;
            return this.name + "на работе "+ locaton;
        }
        else {
            return "для того чтобы прийти на работу нужно сначала выйти";
        }
    }
    public String dropWatch(OrdinaryWatch watch){
         watch.getHit();
         return this.name + " уронил часы ";
    }


    public String watch(String object){
        if(condition.isEmpty()){
        condition="смотрит на"+ object;
        return condition;}
        else {
            condition="смотрит на"+ object;
            return "состояние изменилось, теперь: "+condition;
        }
    }

    public void moveException(String s) throws MovingException{
        if(!s.isEmpty()){
            throw new MovingException("Объект уже находится в пути");
        }
    }
    public String getName() {
        return name;
    }

    public String getMoving() {
        return moving;
    }

    public String getCondition() {
        return condition;
    }

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return  name;
    }
}
