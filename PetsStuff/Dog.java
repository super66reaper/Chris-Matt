public class Dog extends Pet
{
    public Dog(String name){
        super(name);
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