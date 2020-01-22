public class Dog extends Pet
{
    public Dog(String name){
        super(name);
    }

    public boolean isHappy() {
        return isFed() && isWalked() && isPet();
    }

    //Mood
    public String talk()
    {
        if(isHappy()) {
            return "WOOF!";
        }else {
            return "woof";
        }
    }
}