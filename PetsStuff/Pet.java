public class Pet {
    private String name;

    private boolean fed;
    private boolean walked;
    private boolean petted;
    
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
    public boolean dogIsHappy() {
        return isFed() && isWalked() && isPetted();
    }
    public boolean catIsHappy() {
        return isFed() && !(isWalked() || isPetted());
    }
}