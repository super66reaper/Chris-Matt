public class Cat extends Pet
{
    public Cat(String name) {
        super(name);
    }

    public boolean catIsHappy() {
        return isFed() && !(isWalked() || isPetted());
    }

    //Mood
    public String talk()
    {
        if(catIsHappy()) {
            return "meow";
        }else {
            return "hiss";
        }
    }
}