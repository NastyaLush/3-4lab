package peoples;
import exception.Exceptions;
import exception.MovingException;

public abstract class Human extends Exceptions {
    // воображение, метод смотреть
    private String name;
    private String moving;
    // может сможет принимать фабрику как класс
    public String goToWork(Human human, String placeOfWork ){
    try {
        moveException(getMoving());
        moving = "ходить на работу";
        return human.getName() + " ходит на работу в" + placeOfWork;
    }
    catch (MovingException e){
        return e.getMessage()+ "на работу";
    }
    }
    public String comeToWork(Human human, String placeOfWork){
        if(moving.equals("ходить на работу")){
            moving="на работе "+ placeOfWork;
            return "на работе "+ placeOfWork;
        }
        else {
            return "для того чтобы прийти на работу нужно сначала выйти";
        }
    }

    public String getName() {
        return name;
    }

    public String getMoving() {
        return moving;
    }
}
