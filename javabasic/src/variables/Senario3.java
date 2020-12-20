package variables;

public class Senario3 {
 
  int salary;

	
	public static void main(String[] args) {
		Senario3 v1=new Senario3();
       v1.nahida();
		v1.ema();
		
		
	}
private  void nahida() {
salary=30;
System.out.println("nahida is"+salary);
}
public static void ema() {
	Senario3 v1=new Senario3();
	v1.salary=	35;
	System.out.println("ema is "+v1.salary);
			
}
}