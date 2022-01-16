package peoples;
import exception.Exceptions;
import exception.MovingException;
import watches.OrdinaryWatch;
import watches.Watch;

public abstract class Human extends Exceptions {
    private String name= new String();
    private String moving= new String();
    protected String condition= new String();

    Human(){}
    Human(String name){this.name=name;}
    public String goToWork( String placeOfWork ){
    try {
        moveException(getMoving());
        moving = "ходить на работу";
        return this.name + " ходит на работу в" + placeOfWork;
    }
    catch (MovingException e){
        return e.getMessage()+ "на работу";
    }
    }
    public String comeToWork(String placeOfWork){
        if(moving.equals("ходить на работу")){
            moving="на работе "+ placeOfWork;
            return this.name + "на работе "+ placeOfWork;
        }
        else {
            return "для того чтобы прийти на работу нужно сначала выйти";
        }
    }
    public String dropWatch(OrdinaryWatch watch){
         watch.getHit();
         return this.name + " уронил(а) часы и они получили удар";
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

    public String getName() {
        return name;
    }

    public String getMoving() {
        return moving;
    }

    public String getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return  name + moving + condition ;
    }
}
