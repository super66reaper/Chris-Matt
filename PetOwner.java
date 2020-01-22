public PetOwner {
    private Dog dog;
    private Cat cat;

    private boolean happy;

    public PetOwner(Dog dog, Cat cat) {
        this.dog = dog;
        this.cat = cat;
    }

    //Dog Interactions
    public void petDog() {
        System.out.println("Dog says: " + dog.pet(true));
    }

    public void walkDog() {
        System.out.println("Dog says: " + dog.walk(true));
    }

    public void feedDog() {
        System.out.println("Dog says: " + dog.feed(true));
    }

    //Cat Interactions
    public void petCat() {
        System.out.println("Cat says: " + cat.pet(true));
    }
    
    public void walkCat() {
        System.out.println("Cat says: " + cat.walk(true));
    }

    public void feedCat() {
        System.out.println("Cat says: " + cat.feed(true));
    }

    //Owner Mood
    public boolean getHappy() {
        if(dog.isHappy() && cat.isHappy()) {
            return true;
        }else {
            return false;
        }
    }
}