package 문제6;

import java.util.function.Supplier;

public class AnimalTest {
	public static void soundAnimal(Supplier<Animal> s) {
		s.get().sound();
	}
    
	public static void main(String[] args) {
		Animal[] animalsList = { new Animal(), new Dog() };
		for (Animal animal : animalsList) {
			Supplier<Animal> dSupplier3 = () -> animal;
			soundAnimal(dSupplier3);
		}
	}
}
