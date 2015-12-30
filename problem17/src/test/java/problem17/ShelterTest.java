package problem17;

import static org.junit.Assert.*;
import org.junit.Test;

public class ShelterTest {

	@Test
	public void test() {
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
	        
	        String expectedResult = "dogQueue:d1,d2,d3,d4,d5,d6,\ncatQueue:c5,c6,\n";
	        
	        assertEquals(expectedResult, shelter.printToString());
	}

}
