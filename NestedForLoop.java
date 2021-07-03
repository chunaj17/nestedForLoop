package exampleOne;

public class IterationDemo {
public static void main(String []args) {
	//System.out.println("hello world: -");
	for(int i=0;i<4;i++) {
		for(int j=0;j<4;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	System.out.println();
	for(int i=1;i<7;i++) {
		for(int j=1;j<=i;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	System.out.println("____________________________________________________________");
	for(int i=65;i<68;i++) {
		for(char j=65;j<=i;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
	}
	System.out.println("=========================================================");
	for(int i=0;i<5;i++) {
		if(i==0 || i==4) {
		for(int j=0;j<5;j++) {
			System.out.print("$ ");
		}
		}else if(i==1 || i==2 || i==3) {
			for(int j=0;j<5;j++) {
				if(j==0 || j==4) {
					System.out.print("$ ");	
				}else System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
