package peoples;

import factory.CasioFactory;

public class KikuoIbe extends Human implements Engineer {
    //вынести методы в интерфейс?
    private static final String name = "Кикуо Ибэ";
    private String[] innovations;
    private int numberOfInnovations = 0;
    private KikuoIbe(){
        super(name);
    };
    private static KikuoIbe holder;
    public static KikuoIbe getInstance(){
        if(holder == null) holder = new KikuoIbe();
        return holder;
    }
// ловить ошибку если уже работает
    public String getAJobICasioFactory(CasioFactory casioFactory){
        casioFactory.addEmployee(this);
        return name + " теперь работает на фабрике Casio";
    }
    // ловить ошибку если уже создана команда
    public ResearchTeam createResearchTeam(String name, String purpose){
        return new ResearchTeam(name, purpose);
    }
    //состояние должно меняться симвализировать о смене, если не пусто!
    public String researching(String mindProcess){
        condition=name+" в поиске"+mindProcess;
        return name+" в поиске"+mindProcess;
    }
    //должно отразиться изобретение, мб массив изобретений????
    public String watch(String object, String innovation){
        if(Math.random()%4==0){
            createInnovation(innovation);
            return name+" наблюдал за"+ object+" и эти мысли помогли им создать что-то новое: "+innovation;
        }
        else return name+"не повезло, новых идей не возникло";
    }
    public String createInnovation(String innovation){
        innovations[numberOfInnovations]=innovation;
        numberOfInnovations++;
        return "создан"+ innovation;
    }

    public String[] getInnovations() {
        return innovations;
    }
}
