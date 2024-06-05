package app.asset;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{


	public static void main( String[] args )
    {
    	//this onetoone mapping -->unidirectional mapping
    	/*Asset a1= new Asset(1111,"mobile");
    	Asset a2= new Asset(2222,"loptop");
    	Asset a3= new Asset(3333,"tablet");
    	
     	Employee e1 = new Employee(101,"ankit",50000,a1);
    	Employee e2 = new Employee(102,"ayush",99000,a2);
    	Employee e3 = new Employee(103,"kushal",89000,a3);*/
		
		//onttoonemapping--->bidirectional mapping
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
         
		Asset a1= new Asset(1111,"mobile",e1);
		Asset a2= new Asset(2222,"loptop",e2);
		Asset a3= new Asset(3333,"tablet",e3);
   
		e1.setEmp_id(101);
		e1.setEmp_name("ankit");
		e1.setEmp_salary(50000);
		e1.setAsset(a1);
		
		e2.setEmp_id(102);
		e2.setEmp_name("ayush");
		e2.setEmp_salary(99000);
		e2.setAsset(a2);
		
		e3.setEmp_id(103);
		e3.setEmp_name("kushal");
		e3.setEmp_salary(89000);
		e3.setAsset(a3);
    	
    	Configuration cfg=new Configuration();
        cfg.configure();
        SessionFactory factory=cfg.buildSessionFactory();
        Session s=factory.openSession();
        Transaction t=s.beginTransaction();
        
        s.save(e1);
        s.save(e2);
        s.save(e3);
        s.save(a1);
        s.save(a2);
        s.save(a3);
        
        t.commit();

    }
}
