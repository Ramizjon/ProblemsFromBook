package problem17;

import problem17.AnimalShelter;

public class Main {

	public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue(new Dog("d1"));
        shelter.enqueue(new Dog("d2"));
        shelter.enqueue(new Cat("c1"));
        shelter.enqueue(new Dog("d3"));
        shelter.enqueue(new Dog("d4"));
        shelter.enqueue(new Dog("d5"));
        shelter.enqueue(new Cat("c2"));
        shelter.enqueue(new Cat("c3"));
        shelter.enqueue(new Dog("d6"));
        shelter.enqueue(new Cat("c4"));
        shelter.enqueue(new Cat("c5"));
        shelter.enqueue(new Cat("c6"));
        shelter.print();
        shelter.dequeueAny();
        shelter.dequeueCat();
        shelter.dequeueCat();
        shelter.dequeueAny();
        shelter.print();

	}

}
