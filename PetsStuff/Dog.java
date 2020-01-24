public class Dog extends Pet
{
    public Dog(String name){
        super(name);
    }

    public boolean dogIsHappy() {
        return isFed() && isWalked() && isPetted();
    }

    //Mood
    public String talk()
    {
        if(dogIsHappy()) {
            return "WOOF!";
        }else {
            return "woof";
        }
    }
}