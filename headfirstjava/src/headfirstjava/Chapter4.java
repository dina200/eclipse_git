package headfirstjava;

public class Chapter4 {
	
	public static int setLocale(){
		System.out.println("Fresh");
		return 34;
	}
	
	public int[] array(int k){
		int[] arr = new int[k];
		for(int i = 0; i < k; i++){
			arr[i] = i+1;	
			System.out.println(arr[i]);
		}
		System.out.println("----------------");
		return arr;
	}
	
	public static void main (String[] args){
//		int k = Chapter4.setLocale();
//		System.out.println(k);
//		
//		Chapter4 ch = new Chapter4();
//		int[] arr = ch.array(10);
//		for(int i = 0; i < arr.length; i++){
//			arr[i] = i+1;	
//			System.out.println(arr[i]);
//		}
		int count = 0;
		Mix4 [] m4a = new Mix4[20];
		int x = 0;
		while (x < 19){
			m4a[x] = new Mix4();
			m4a[x].counter = m4a[x].counter + 1;
			count = count + 1;
			count = count + m4a[x].maybeNew(x);
			x = x + 1;		
		}
		System.out.println(count + " " + m4a[1].counter);
	}

}