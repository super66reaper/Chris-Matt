public class AnimalHouse{
    public static void main(String[]args){
        Cat alfred = new Cat("Alfred");
        Dog bruce = new Dog("Bruce");

        Pet []listOfPets = new Pet [2];

        listOfPets[0] = alfred;
        listOfPets[1] = bruce;

        PetOwner Dane = new PetOwner(listOfPets);

        System.out.println(Dane.getHappy());





    }
}