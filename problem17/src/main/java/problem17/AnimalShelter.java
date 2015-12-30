package problem17;

	public  class AnimalShelter {
        Queue<Dog> dogQ;
        Queue<Cat> catQ;
        long timestamp;
        
        public AnimalShelter() {
            dogQ = new Queue<Dog>();
            catQ = new Queue<Cat>();
            timestamp = 0;
        }
        
        public void enqueue(Animal animal) {
            if (animal instanceof Dog) {
                dogQ.enqueue((Dog) animal);
            } else if (animal instanceof Cat) 
                catQ.enqueue((Cat) animal);
        }
        
        public Animal dequeueAny() {
            if (dogQ.isEmpty() && dogQ.isEmpty()) {
                return null;
            }
            if (dogQ.isEmpty()) {
                return dequeueCat();
            }
            if (catQ.isEmpty()) {
                return dequeueDog();
            }
            Dog dog = dogQ.peek();
            Cat cat = catQ.peek();
            if (dog.timestamp < cat.timestamp) {
                return dequeueDog();
            } else {
                return dequeueCat();
            }
        }
        
        public Dog dequeueDog() {
            return dogQ.dequeue();
        }
        
        public Cat dequeueCat() {
            return catQ.dequeue();
        }
        
        public void print() {
            System.out.println("dogQ:");
            dogQ.print();
            System.out.println("catQ:");
            catQ.print();
        }

    private static <E> Queue<E> newQueue(E ... elements) {
        Queue<E> queue = new Queue<E>();
        for (E e : elements) {
            queue.enqueue(e);
        }
        return queue;
    }
}