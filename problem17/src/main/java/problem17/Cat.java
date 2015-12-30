package problem17;

public class Cat extends Animal
{
    public Cat(String data) {
        super(data);
    }
    
    @Override
    public String toString() {
        return "Cat:[data:" + this.data + ",timestamp:" + this.timestamp + "]";
    }
}