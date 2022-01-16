package peoples;
import exception.MovingException;
import factory.CasioFactory;
import watches.OrdinaryWatch;

public abstract class Human  {
    protected String name= new String();
    private String moving= new String();
    private String job;
    protected String condition= new String();

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
        if(s.isEmpty()==false){
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

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return  name;
    }
}
