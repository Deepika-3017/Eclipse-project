package com.wipro.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.model.Employee;
import com.wipro.model.Person;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=null;
		try {
			//IoC container 			
			//context= new ClassPathXmlApplicationContext("spring1.xml");
			
			//context= new ClassPathXmlApplicationContext("spring2.xml");
			
			context= new ClassPathXmlApplicationContext("spring3.xml");
//			
//			Employee employee1= (Employee) context.getBean("empBean1");
//			System.out.println(employee1);
//			
//			Employee employee2= (Employee) context.getBean("empBean2");
//			System.out.println(employee2);
			
			Person person=(Person) context.getBean("personBean");
			System.out.println(person);
			
			Person person1=(Person) context.getBean("personBean");
			System.out.println(person1);
			
			//default scope of the bean is singleton
			//if we want different hashcodes of the object then we have to make the scope
			//as prototype inxml file[in this case we have to make changes in spring3.xml]
			
			
			 //shutdown IoC 
			((AbstractApplicationContext)context).registerShutdownHook();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			((AbstractApplicationContext)context).close();
		}

    }
}
