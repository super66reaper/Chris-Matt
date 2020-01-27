public class AnimalHouse{
    public static void main(String[]args){
        Pet alfred = new Cat("Alfred");
        Pet bruce = new Dog("Bruce");
        Pet bob = new TalkingCat("Bob");

        Pet []listOfPets = new Pet [3];

        listOfPets[0] = alfred;
        listOfPets[1] = bruce;
        listOfPets[2] = bob;

        PetOwner dane = new PetOwner(listOfPets);

        dane.feed(0);
        
        dane.pet(1);
        dane.walk(1);
        dane.feed(1);

        System.out.println("Bob: " + bob.talk());
        dane.feed(2);
        System.out.println("Bob: " + bob.talk());


        // System.out.println(alfred.isFed());
        // System.out.println(alfred.isWalked());
        // System.out.println(alfred.isPetted());

        // System.out.println(bruce.isFed());
        // System.out.println(bruce.isWalked());
        // System.out.println(bruce.isPetted());

        // System.out.println(alfred.isHappy());
        // System.out.println(bruce.isHappy());    


        System.out.println(dane.getHappy());






    }
}