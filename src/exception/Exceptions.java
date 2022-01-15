package exception;

public class Exceptions {
    public void moveException(String s) throws MovingException{
    if(s!=null){
        throw new MovingException("Объект уже находится в пути");
    }
    }

}
