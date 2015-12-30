package problem17;

public class Cat extends Animal
{
    public Cat(String data) {
        super(data);
    }
    
    @Override
    public String toString() {
    	return this.data;
    }
}