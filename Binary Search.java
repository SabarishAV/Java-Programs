import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int a[] = {1,2,3,4,5};
		int i=0;
		int j=4;
		int mid;
		System.out.println("Enter search key");
		int key = sc.nextInt();
		while(j>=i){
		    mid = (i+j)/2;
		    if(a[mid]==key){
		        System.out.println("Element found at "+mid);
		        break;
		    }else if(key<a[mid]){
		        j=mid-1;
		    }else if(key>a[mid]){
		        i = mid+1;
		    }
		}
		if(j<i){
		    System.out.println("Element not found");
		}
	}
}
