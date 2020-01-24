public class PetOwner {
    private Pet[] pets;

    private boolean happy;

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
            if(p instanceof Dog){
                if(!p.dogIsHappy()) {
                    return false;
                    }

            }
            if(p instanceof Cat)
            {
                if(!p.catIsHappy()) {
                    return false;
                    }
            }
                
                
        }
        return true;
    }
}