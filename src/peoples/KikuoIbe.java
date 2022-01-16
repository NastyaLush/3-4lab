package peoples;

import factory.CasioFactory;

public class KikuoIbe extends ResearchHuman implements Engineer {
    //вынести методы в интерфейс?
    private static final String name = "Кикуо Ибэ";
    private String[] innovations;
    private double imoganation=0.9;
    private int numberOfInnovations = 0;
    private KikuoIbe(){}
    private static KikuoIbe holder;
    public static KikuoIbe getInstance(){
        if(holder == null) holder = new KikuoIbe();
        return holder;
    }


    public class ProjectTeamTough extends ResearchHuman{
        private String name="ProjectTeamTough";
        private String purpose=" создать идеально прочные часы: выдерживающие сильные удары, давление воды, перегрузки — и при этом долговечные";
        private double imoganation=0.68;
        private ProjectTeamTough(){}
        private ProjectTeamTough holder;
        public ProjectTeamTough getInstance(){
            if(holder == null) holder = new ProjectTeamTough();
            return holder;
        }

        @Override
        public String getName() {
            return name;
        }

        public String getPurpose() {
            return purpose;
        }
    }


    public String[] getInnovations() {
        return innovations;
    }
}
