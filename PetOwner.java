public PetOwner {
    private Dog dog;
    private Cat cat;

    private boolean happy;

    public PetOwner(Dog dog, Cat cat) {
        this.dog = dog;
        this.cat = cat;
    }

    public void petDog() {
        System.out.println("Dog is: " + dog.pet(true));
    }

    public void walkDog() {
        System.out.println("Dog is: " + dog.walk(true));
    }

    public void feedDog() {
        System.out.println("Dog is: " + dog.feed(true));
    }

    public void petCat() {
        System.out.println("Cat is: " + cat.pet(true));
    }
    
    public void walkCat() {
        System.out.println("Cat is: " + cat.walk(true));
    }

    public void feedCat() {
        System.out.println("Cat is: " + cat.feed(true));
    }

    public boolean getHappy() {
        if(alfred.getMood().equals("Meow") && joe.getMood().equals("WOOF")) {
            return true;
        }else {
            return false;
        }
    }
}