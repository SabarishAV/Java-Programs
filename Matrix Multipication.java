import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int row1,row2,col1,col2,i,j,k;
		System.out.println("Enter the number or rows for first matrix");
		row1 = sc.nextInt();
		System.out.println("Enter the number or columns for first matrix");
		col1 = sc.nextInt();
		int a[][] = new int[row1][col1];
		System.out.println("Enter the first matrix");
		for(i=0;i<row1;i++){
		    for(j=0;j<col1;j++){
		        a[i][j] = sc.nextInt();
		    }
		}
		
		System.out.println("Enter the number or rows for second matrix");
		row2 = sc.nextInt();
		System.out.println("Enter the number or columns for second matrix");
		col2 = sc.nextInt();
		if(col1!=row2){
		    System.out.println("Matrix multiplication not possible");
		    return;
		}
		int b[][] = new int[row2][col2];
		System.out.println("Enter the second matrix");
		for(i=0;i<row1;i++){
		    for(j=0;j<col1;j++){
		        b[i][j] = sc.nextInt();
		    }
		}
		
		int c[][] = new int[row1][col2];
		for(i=0;i<row1;i++){
		    for(j=0;j<col2;j++){
		        for(k=0;k<col1;k++){
		            c[i][j] += a[i][k] * b[k][j];
		        }
		    }
		}
		
		System.out.println("First matrix =>");
		for(i=0;i<row1;i++){
		    for(j=0;j<col1;j++){
		        System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		}
		System.out.println("Second matrix =>");
		for(i=0;i<row1;i++){
		    for(j=0;j<col1;j++){
		        System.out.print(b[i][j]+" ");
		    }
		    System.out.println();
		}
		System.out.println("Result matrix =>");
		for(i=0;i<row2;i++){
		    for(j=0;j<col1;j++){
		        System.out.print(c[i][j]+" ");
		    }
		    System.out.println();
		}
		
}
}
