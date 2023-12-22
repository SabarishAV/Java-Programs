public class Main
{
	public static void main(String[] args) {
		try{
		    int result = divide(10,0);
		    System.out.println("Result: "+result);
		}catch(ArithmeticException e){
		    System.out.println("An arithmetic exception occured "+e.getMessage());
		}finally{
		    System.out.println("Finally block executed");
		}
}

public static int divide(int divident,int divisor) throws ArithmeticException{
		    if(divisor==0){
		        throw new ArithmeticException("Division by zero not allowed");
		    }
		    return divident/divisor;
		}
	}
