public class Cat extends Pet
{
    public Cat(String name) {
        super(name);
    }

    public boolean isHappy() {
        if(isFed() && !(isWalked() || isPetted()))
        {
            return true;
        }
        else{
            return false;   
        }
    }


    //Mood
    public String talk()
    {
        if(isHappy()) {
            return "meow";
        }else {
            return "hiss";
        }
    }
}