package problem17;

public class Dog extends Animal{
	 public Dog(String data) {
         super(data);
     }
     
     @Override
     public String toString(){
         return this.data;
     }
}
