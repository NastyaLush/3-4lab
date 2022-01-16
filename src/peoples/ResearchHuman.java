package peoples;

public abstract class ResearchHuman extends Human implements Engineer {
    private String name;
    private String[] innovations ;
    private int numberOfInnovations=0;
    private double imoganation;

    public ResearchHuman(){}

    public void setImoganation(double imoganation) {
        this.imoganation = imoganation;
    }
    public ResearchHuman(String name){super(name);this.name=name;}
    public String researching(){
        if (condition.isEmpty()) {
            condition = name + " в поиске решений";
            return name + " в поиске решений";
        }
        else {
            condition = name + " в поиске решений";
            return "состояние изменилось: " + name + " в поиске решений";
        }
    }
    public String createInnovation(String innovation){
        innovations[numberOfInnovations]=innovation;
        numberOfInnovations++;
        return "создан"+ innovation;
    }

    public  String watch(String object, String thoughts){
        if(Math.random()<=imoganation){
            return name+" наблюдал(и) за"+ object+" и эти мысли помогли им создать что-то новое: "+thoughts;
        }
        else return name+ " не повезло, новых идей не возникло";
    }

    public String[] getInnovations() {
        return innovations;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfInnovations() {
        return numberOfInnovations;
    }
}
