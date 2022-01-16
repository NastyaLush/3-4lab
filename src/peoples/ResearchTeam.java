package peoples;

public class ResearchTeam extends Human implements Engineer {
    private String name = "Группа исследователей";
    private String purpose = "Цели нет";
    private int numbers;
    private String[] innovations ;
    private int numberOfInnovations=0;
    ResearchTeam(){}
    ResearchTeam(String name){
        this.name=name;
    }
    ResearchTeam(String name, int numbers){
        this.name=name;
        this.numbers=numbers;
    }
    ResearchTeam(String name,String purpose){
        this.name=name;
        this.purpose=purpose;
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
    public String createInnovation(String innovation){
        innovations[numberOfInnovations]=innovation;
        numberOfInnovations++;
        return "создан"+ innovation;
    }

    public  String watch(String object, String thoughts){
        if(Math.random()<0.78){
            return name+" наблюдали за"+ object+" и эти мысли помогли им создать что-то новое: "+thoughts;
        }
        else return name+"не повезло, новых идей не возникло";
    }

    public String getPurpose() {
        return purpose;
    }

    public int getNumbers() {
        return numbers;
    }

    public String[] getInnovations() {
        return innovations;
    }
}
