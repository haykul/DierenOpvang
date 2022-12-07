package be.intecbrussel.animalshelter;

public class ShelterApp {
    public static void main(String[] args) {
        Cat cat1 = new Cat(false, 1, "Noodles", 8, true);
        Cat cat2 = new Cat(false, 4, "Poodles", 0, true);
        Animal cat3 = new Cat(false, 10, "Roodles", 0, true);
        Cat cat4 = new Cat(true, 10, "Bob", 0, true);
        cat3.getIsVaccinated();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        Dog dog4 = new Dog();

        Monkey monkey = new Monkey();
        Monkey monkey2 = new Monkey(false, 15, "Mankey", 1, true);

        AnimalShelter animalShelter = new AnimalShelter();

        animalShelter.addAnimal(cat1);
        animalShelter.addAnimal(cat2);
        animalShelter.addAnimal(cat3);
        animalShelter.addAnimal(cat4);
        animalShelter.addAnimal(dog1);
        animalShelter.addAnimal(dog2);
        animalShelter.addAnimal(dog3);
        animalShelter.addAnimal(dog4);
        animalShelter.addAnimal(monkey);
        animalShelter.addAnimal(monkey2);
        animalShelter.treatAnimal(0);
        System.out.println(animalShelter.findOldestAnimal());
        //  animalShelter.treatAnimal("Bob");
        animalShelter.sortAnimalsByAge();
        cat1.vaccinateAnimal(Disease.HEPATITISA);
        cat1.vaccinateAnimal(Disease.CHICKENPOCKS);
        cat1.vaccinateAnimal(Disease.FLUE);
        cat1.vaccinateAnimal(Disease.POLIO);
      //  System.out.println(animalShelter.findAnimal("Bo"));
        animalShelter.treatAnimal(1);
       animalShelter.findAnimal("Mankey");

        animalShelter.printAnimalsNotVaccinated(Disease.HEPATITISA);
        animalShelter.printAnimals();
    }
}
