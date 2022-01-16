package exception;

public class Exceptions {
    public void moveException(String s) throws MovingException{
    if(s.isEmpty()){
        throw new MovingException("Объект уже находится в пути");
    }
    }

}
