import java.util.Scanner;

class Employee{
    public String name;
    public int age;
    public long phone;
    public String address;
    public double salary;
    
    public void printSalary(){
        System.out.println("Salary: "+salary);
    };
}
class Officer extends Employee{
    public String spec;
}
class Manager extends Employee{
    public String dep;
}


public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Officer o = new Officer();
		System.out.println("Enter Officer name");
		o.name = sc.nextLine();
		System.out.println("Enter Officer age");
		o.age = sc.nextInt();
		System.out.println("Enter Officer phone number");
		o.phone = sc.nextLong();
		sc.nextLine();
		System.out.println("Enter Officer address");
		o.address = sc.nextLine();
		System.out.println("Enter Officer salary");
		o.salary = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Officer specialisation");
		o.spec = sc.nextLine();
		
		System.out.println();
		System.out.println("Officer Details =>");
		System.out.println("Officer name : "+o.name);
		System.out.println("Officer age : "+o.age);
		System.out.println("Officer phone number : "+o.phone);
		System.out.println("Officer address : "+o.address);
		System.out.println("Officer specialisation : "+o.spec);
		o.printSalary();
	}
}
