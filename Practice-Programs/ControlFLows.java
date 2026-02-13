public class ControlFlows{
	public static void main(String [] args){
		
		System.out.println("For loop example");
		
		for(int i = 0; i <= 5; i++){
			for(int j = 1; j <= 5; j++){
				System.out.print(" * ");
				
			}
			
			System.out.println();
			
		}
		
		System.out.println("While loop example");
		
		int i = 1;
		while(i <= 20) {
			System.out.println(i+ " " );
			i++;
		}
		
		System.out.println("do While loop example");
		
		
		int j = 0;
		do{
			System.out.println(j);
			j++;
		}
		while(j <= 20);
		
		System.out.println("For - each loop example ");
		
		int arr[] = {10,20,30,40};
		
		for(int num: arr){
			System.out.println(num);
			
		}
		
	}
	
}

/*
for(Datatype variable : Collection){
	Statements
}
*/