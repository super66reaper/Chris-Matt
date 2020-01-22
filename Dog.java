
public class Dog
{
    private String name;
    private boolean fed;
    private boolean walked;
    private boolean petted;
    private boolean happy;

    public dog(String name){
        this.name = name;
    }
    public bool getFed(){
        return fed;
    }
    public bool getWalked(){
        return walked;    
    }
    public bool getPetted(){
        return petted;
    }
    public void feed(boolean condition){
        this.fed = condition

    }
    public void walk(boolean condition){
        this.walked = condition;
    }
    public void pet(boolean condition){
        this.petted = condition;
    }

    public boolean isHappy(){
        return happy;
    }

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