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