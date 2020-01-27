public class TalkingCat extends Cat {
    String[] compliments = new String[]{"I Love you", "Your So Handsome", "Kiss me"};
    String[] insults = new String[]{"Shut Up", "I Hate You", "PooPoo Head"};
    
    public TalkingCat(String name) {
        super(name);
    }

    public String talk() {
        int i = (int)Math.random() * 3;
        if(isHappy()) {
            return compliments[i];
        }
        return insults[i];
    }
}