package peoples;

public class KikuoIbe extends ResearchHuman implements Engineer {
    //вынести методы в интерфейс?
    private static final String name = "Кикуо Ибэ";
    private String[] innovations;
    private double imoganation=0.9;
    private int numberOfInnovations = 0;
    public static ProjectTeamTough projectTeamTough;
    private static KikuoIbe holder;

    public static KikuoIbe getInstance(){
        if(holder == null) holder = new KikuoIbe();
        return holder;

    }
    private KikuoIbe(){super("Кикуо Ибэ");}
    public String createProjectTeam() {
        projectTeamTough = new ProjectTeamTough();
        projectTeamTough.setPurpose("Цель команды - создать идеально прочные часы: выдерживающие сильные удары, давление воды, перегрузки — и при этом долговечные");
        return "Создана " + projectTeamTough.toString();
    }

    public class ProjectTeamTough extends ResearchHuman{
        private final static String name="ProjectTeamTough";
        private String purpose;

        private ProjectTeamTough(){
            super(name);
            setImoganation(0.68);
        }
        public void setPurpose(String purpose){
            this.purpose = purpose;
        }
        public String getPurpose() {
            return purpose;
        }
        public String toString() {
            return "команда " + name;
        }
    }

}
