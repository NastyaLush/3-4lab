package peoples;

import factory.CasioFactory;

public class KikuoIbe extends Human implements Engineer {
    //вынести методы в интерфейс?
    private static final String name = "Кикуо Ибэ";
    private String[] innovations;
    private int numberOfInnovations = 0;
    private KikuoIbe(){
        super(name);
    }
    private static KikuoIbe holder;
    public static KikuoIbe getInstance(){
        if(holder == null) holder = new KikuoIbe();
        return holder;
    }


    public ResearchTeam createResearchTeam(String name, String purpose){
        return new ResearchTeam(name, purpose);
    }

    public String researching(String mindProcess){
        if (condition.isEmpty()) {
            condition = name + " в поиске" + mindProcess;
            return name + " в поиске" + mindProcess;
        }
        else {
            condition = name + " в поиске" + mindProcess;
            return "состояние изменилось:"+name + " в поиске" + mindProcess;
        }
    }
    public String watch(String object, String innovation){
        if(Math.random()<0.95){
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
