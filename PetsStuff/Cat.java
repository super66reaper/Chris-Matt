public class Cat extends Pet
{
    public Cat(String name) {
        super(name);
    }

    public boolean isHappy() {
        return isFed() && !(isWalked() || isPet());
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