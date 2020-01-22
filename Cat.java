public class Cat 
{
    private String name;

    private boolean fed;
    private boolean walked;
    private boolean petted;
    private boolean happy;

    public Cat(String name) {
        this.name = name;
    }

    //Getters
    public boolean getFed() {
        return fed;
    }

    public boolean getWalked() {
        return walked;
    }

    public boolean getPetted() {
        return petted;
    }


    public boolean isHappy() {
        return happy;
    }

    //Interactions
    public String feed(boolean condition) {
        fed = condition;
        return getMood();
    }
    
    public String walk(boolean condition) {
        walked = condition;
        return getMood();
    }

    public String pet(boolean condition) {
        petted = condition;
        return getMood();
    }

    public boolean GetHappy() {
        return happy;
    }


    //Mood
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