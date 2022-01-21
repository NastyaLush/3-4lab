package peoples;

public class KikuoIbe extends ResearchHuman  {

    public static ProjectTeamTough projectTeamTough;
    private static KikuoIbe holder;

    public static KikuoIbe getInstance(){
        if(holder == null) holder = new KikuoIbe();
        return holder;

    }
    private KikuoIbe(){super("Кикуо Ибэ"); setImoganation(0.9);}
    public String createProjectTeam() {
        projectTeamTough = new ProjectTeamTough();
        projectTeamTough.setPurpose("Цель команды - создать идеально прочные часы: выдерживающие сильные удары, давление воды, перегрузки — и при этом долговечные");
        return "Создана " + projectTeamTough.toString();
    }

    public class ProjectTeamTough extends ResearchHuman{

        private String purpose;

        private ProjectTeamTough(){
            super("ProjectTeamTough");
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
