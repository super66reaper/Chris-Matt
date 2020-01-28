public class AnimalHouse{
    public static void main(String[]args){
        Pet alfred = new Cat("Alfred");
        Pet bruce = new Dog("Bruce");
        Pet bob = new TalkingCat("Bob");
        Pet ben = new Yorkie("Ben");

        Pet []listOfPets = new Pet [4];

        listOfPets[0] = alfred;
        listOfPets[1] = bruce;
        listOfPets[2] = ben;
        listOfPets[4] = bob;

        PetOwner dane = new PetOwner(listOfPets);

        //Feeding Cat
        dane.feed(0);

    // Walking feeding and petting dog
        dane.pet(1);
        dane.walk(1);
        dane.feed(1);

        // Talking Cat
        System.out.println("Bob: " + bob.talk());
        dane.feed(2);
        System.out.println("Bob: " + bob.talk());
       
        
        
        //Walking feeding and petting yorkie
        for(int n = 0; n <= 10; n++)
        {
            dane.pet(2);
        }
        dane.walk(2);
        dane.feed(2);

        // testing if petowner is happy

        System.out.println(dane.getHappy());






    }
}