package peoples;
import exception.Exceptions;
import exception.MovingException;
import watches.OrdinaryWatch;
import watches.Watch;

public abstract class Human extends Exceptions {
    // воображение, метод смотреть
    private String name=null;
    private String moving=null;
    private String gifts=null;
    protected String condition=null;

    Human(){}
    Human(String name){this.name=name;}

    // может сможет принимать фабрику как класс
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
// может часы наследуются от пасивных обьектов и тогда в аргументе будет принимать их
    // просто надо же как-то сказать что часы уронили и они разбились
    // мб метод часам падать а там и повреждения будут а я его просто вызову
    // ронять можно что угодно надо переделать мб абстрактный класс по пусть пока так
    public String dropWatch(OrdinaryWatch watch){
         watch.getHit();
         return this.name + " уронил(а) часы и они получили удар";
    }

    public String giveAGift(Human recipient, String gift){
        gifts=gift;
        return this.name+" подарил"+ recipient.name +"подарок: "+ gift;
    }
    // ошибка если кондитион не пуст пусть говорит о смене состояния
    public String watch(String object){
        condition="смотрит на"+ object;
        return condition;
    }

    public String getName() {
        return name;
    }

    public String getMoving() {
        return moving;
    }

    public String getGifts() {
        return gifts;
    }

    public String getCondition() {
        return condition;
    }

    @Override
    public String toString() {
        return "Human:name= " + name +
                ", moving= " + moving +
                ", condition=" + condition ;
    }
}
