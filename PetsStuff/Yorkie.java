

public class Yorkie extends Dog
{
    private String name;
    private int numOfPets = 0;

    public Yorkie(String name)
    {
        super(name);  
    }
    public boolean isHappy()
    {
        if(isFed() && isWalked() && this.numOfPets >= 10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void pet()
    {

        numOfPets++;
    }
}