import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int freq=0;
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String inp = sc.nextLine();
		System.out.println("Enter the character to count");
		char key = sc.next().charAt(0);
		for(int i=0;i<inp.length();i++){
		    if(key == inp.charAt(i)){
		        freq++;
		    }
		}
		System.out.println("Frequency of "+key+" is "+freq);
	}
}
