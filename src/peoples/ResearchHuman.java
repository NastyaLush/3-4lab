package peoples;

public abstract class ResearchHuman extends Human implements Engineer {
    private String name;
    private String[] innovations ;
    private int numberOfInnovations=0;
    private double imoganation;

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
    public String createInnovation(String innovation){
        innovations[numberOfInnovations]=innovation;
        numberOfInnovations++;
        return "создан"+ innovation;
    }

    public  String watch(String object, String thoughts){
        if(Math.random()<imoganation){
            return name+" наблюдал(и) за"+ object+" и эти мысли помогли им создать что-то новое: "+thoughts;
        }
        else return name+"не повезло, новых идей не возникло";
    }

    public String[] getInnovations() {
        return innovations;
    }
}
