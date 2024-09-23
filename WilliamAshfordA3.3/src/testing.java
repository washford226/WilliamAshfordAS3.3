public class testing {
    public static void main(String[] args) {
        //Making an instance of the hardSkill class and calling the identify skill method
        HardSkill hs = new HardSkill("Programing", "Hard", 6);
        hs.identifySkill();
        //Making an instance of the softSkill class and calling the identify skill method
        SoftSkill ss = new SoftSkill("communication", "Soft", 4);
        ss.identifySkill();
        //Making an instance of the GiftSkill class and calling the identify skill method
        GiftSkill gs = new GiftSkill("Mercy", "Gift", 9);
        gs.identifySkill();
        //Making an instance of the TalentSkill class and calling the identify skill method
        TalentSkill ts = new TalentSkill("organization", "Talent", 8);
        ts.identifySkill();
    }
}
