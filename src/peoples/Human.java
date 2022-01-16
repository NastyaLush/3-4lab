package peoples;
import exception.Exceptions;
import exception.MovingException;
import factory.CasioFactory;
import watches.OrdinaryWatch;

public abstract class Human extends Exceptions {
    private String name= new String();
    private String moving= new String();
    private String job;
    protected String condition= new String();

    Human(){}
    Human(String name){this.name=name;}
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

        /*for (Human employee: casioFactory.getEmployees()) {
            if (employee.equals(this)) {
                return name + "уже работает на фабрике Casio";
            }
        }*/
        casioFactory.addEmployee(Human.this);
        job= Location.CASIO_FACTORY.toString();
        //return name + " теперь работает на фабрике Casio";
    }
    public String goToWork( ){
    try {
        moveException(getMoving());
        moving = "ходить на работу";
        return this.name + " ходит на работу в" + job;
    }
    catch (MovingException e){
        return e.getMessage()+ "на работу";
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

    public String getJob() {
        return job;
    }

    @Override
    public String toString() {
        return  name + moving + condition ;
    }
}
