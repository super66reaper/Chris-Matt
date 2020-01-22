public class Cat {
    private String name;

    private boolean fed;
    private boolean walked;
    private boolean petted;
    private boolean happy;

    public Cat(String name) {
        this.name = name;
    }

    public boolean getFed() {
        return fed;
    }

    public boolean getWalked() {
        return walked;
    }

    public boolean getPetted() {
        return petted;
    }

    public boolean getHappy() {
        return happy;
    }

    public String feed(boolean condition) {
        fed = condition;
        return CheckMood;
    }
    
    public String walk(boolean condition) {
        walked = condition;
        return CheckMood;
    }

    public String pet(boolean condition) {
        petted = condition;
        return CheckMood;
    }

    public boolean GetHappy() {
        return happy;
    }

    public String getMood() {
        if(fed && !walked && !petted) {
            happy = true;
            return "Meow";
        }else {
            happy = false;
            return "Hiss";
        }
    }
}