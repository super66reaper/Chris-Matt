
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
    public void feed(boolean condition)
    {
        this.fed = condition

    }
    public void walk(boolean condition)
    {
        this.walked = condition;

    }
    public void pet(boolean condition)
    {
        this.petted = condition;

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