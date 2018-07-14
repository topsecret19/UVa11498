import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int a,b,x,y,n;
		Scanner sc = new Scanner(System.in);
		n= sc.nextInt();
		while(n!=0) {
			x=sc.nextInt();
			y=sc.nextInt();
			for(int i=0; i<n; i++) {
				a=sc.nextInt();
				b=sc.nextInt();
				if(a>x&&b>y) {
					System.out.println("NE");
				}else if(a<x&&b>y) {
					System.out.println("NO");
				}else if(a>x&&b<y) {
					System.out.println("SE");
				}else if(a<x&&b<y) {
					System.out.println("SO");
				}else {
					System.out.println("divisa");
				}
			}
			n=sc.nextInt();
		}
	}

}
