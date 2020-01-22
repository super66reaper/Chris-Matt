
public class Dog
{
    private String name;

    private boolean fed;
    private boolean walked;
    private boolean petted;
    private boolean happy;

    public Dog(String name){
        this.name = name;
    }

    //Getters
    public boolean getFed()
    {
        return fed;
    }

    public boolean getWalked()
    {
        return walked;    
    }

    public boolean getPetted()
    {
        return petted;
    }

    public boolean isHappy()
    {
        return happy;
    }

    //Interactions
    public String feed(boolean condition)
    {
        this.fed = condition
        return getMood();
    }
    public String walk(boolean condition)
    {
        this.walked = condition;
        return getMood();
    }
    public String pet(boolean condition)
    {
        this.petted = condition;
        return getMood();
    }

    //Mood
    public String getMood()
    {
        if(fed && walked && petted){
            happy = true;
            return "WOOF!";
            
        }
        else{
            happy = false;
            return "woof";
        }
    }
    

}