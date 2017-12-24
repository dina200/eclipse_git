package chapter3;

public class Triangle {

	float area;
	int height;
	int length;
	
	void setArea(){
		area = (height*length)/2;
	}
	public static void main(String[] args) {
		
		Triangle[] ta = new Triangle[4];
		int x = 0;
		while(x < 4){
			ta[x] = new Triangle();
			ta[x].height = (x + 1) * 2;
			ta[x].length = x + 4;
			ta[x].setArea();
			System.out.println("треугольник " + x + ", зона = " + ta[x].area);
			x++;		
		}
		int y = x;
		x = 27;
		Triangle t5 = ta[2];
		ta[2].area = 343;
		System.out.println("y = " + y + ", зона t5 = " + t5.area);
		
	}

}
