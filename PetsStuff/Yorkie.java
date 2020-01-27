

public class Yorkie extends Dog
{
    private String name;
    private int numOfPets;

    public Yorkie(String name)
    {
        super(name);  
    }

  
    
    public void pet()
    {
        numOfPets++;

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