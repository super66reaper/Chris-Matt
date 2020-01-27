public class Pet {
    private String name;

    private boolean fed = false;
    private boolean walked = false;
    private boolean petted = false;
    
    public Pet(String name) {
        this.name = name;
    }

    //Getters
    public String getName() {
        return name;
    }
    
    public boolean isFed() {
        return fed;
    }

    public boolean isWalked() {
        return walked;
    }

    public boolean isPetted() {
        return petted;
    }

    //Setters
    public void SetFed(boolean condition) {
        fed = condition;
    }

    public void SetWalked(boolean condition) {
        walked = condition;
    }

    public void SetPetted(boolean condition) {
        petted = condition;
    }
    

    //Interactions
    public void feed()
    {
        fed = true;
    }

    public void walk()
    {
        walked = true;
    }

    public void pet()
    {
        petted = true;
    }

    public boolean isHappy()
    {

        if(isFed() && isWalked() && isPetted())
        {
            return true;
        }
        else{
            return false;
        }
       
    }
    
    
}