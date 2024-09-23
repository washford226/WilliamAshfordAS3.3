public abstract class Skills {
    protected String name;
    protected String type;
    protected int skillLevel;

    //constructor for the Skills abstract class
    public Skills(String name, String type, int skillLevel)
    {
        this.name = name;
        this.type = type;
        this.skillLevel = skillLevel;
    }

    //Getter methods
    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }

    public int getSkillLevel()
    {
        return skillLevel;
    }

    //identifySkill method used to print ou the skill
    public void identifySkill()
    {
        System.out.println(type + " skill of " + name + " has a level of " + skillLevel);
    } 
}
