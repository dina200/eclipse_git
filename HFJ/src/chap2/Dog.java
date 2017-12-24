package chap2;

public class Dog {
	int size;
	String breed;
	String name;
	
	public Dog(){}
	
	public Dog(int size, String breed, String name){
		this.size = size;
		this.breed = breed;
		this.name = name;
		
	}
	
	public void print(){
		System.out.println(this.size + " " + this.breed + " " + this.name);
	}
	public void bark(){
		System.out.print("Gav, gav!");
	}
}
