class Employee{  
 String name = "Arpit Pardesi";    
}  
class Company{  
 Employee emp;//aggregation  
 int ID = 59128;   
 void details(){  
   emp=new Employee();  
   System.out.println(emp.name);
   System.out.println(ID);
 }  
 
 
public static void main(String args[]){ 
		 Company z=new Company();  
         z.details();
 }  
}  