package chap2;

public class Dog {
	//int size;
	//String breed;
	String name;
	
	public Dog(){}
	
	public Dog(/*int size, String breed, */String name){
		//this.size = size;
		//this.breed = breed;
		this.name = name;		
	}
	public String getName(){
		return this.name;
	}
	
	/*public void print(){
		System.out.println(this.size + " " + this.breed + " " + this.name);
	}
	*/
	public void bark(){
		System.out.println("Gav, gav!");
	}
	public void eat(){
		
	}
	public void chaseCat(){
		
	}
}
