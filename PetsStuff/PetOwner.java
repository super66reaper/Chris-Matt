public class PetOwner {
    private Pet[] pets;


    public PetOwner(Pet[] pets) {
        this.pets = pets;
    }

    //Dog Interactions
    public void pet(int i) {
        pets[i].pet();
    }

    public void walk(int i) {
        pets[i].walk();
    }

    public void feed(int i) {
        pets[i].feed();
    }

    
    //Owner Mood
    public boolean getHappy() {
        for(Pet p:pets) 
        {
            if(!(p.isHappy()))
            {
                return false;
            }
            
            
                
        }
        return true;
    }
}