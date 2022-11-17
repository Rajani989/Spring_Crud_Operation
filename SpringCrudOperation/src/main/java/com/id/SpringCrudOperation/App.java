package com.id.SpringCrudOperation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	AgentDao a=(AgentDao)context.getBean("a1");
    	//int st=a.saveAgent(new Agent(101,"Ram","Mechanical Enginner",20));
    	//int st=a.saveAgent(new Agent(102,"Rajiv","Networking Enginner",25));
    	//int st=a.saveAgent(new Agent(103,"Radha","Software Enginner",30));
    	  int st=a.saveAgent(new Agent(104,"Misha","Hardware Enginner",26));
    	
          int st1=a.updateAgent(new Agent(101,"Ram","Mechanical Enginner",200000));
    	
    	  int st2=a.deleteAgent(new Agent(101));
    	  System.out.println(st2);
    	  System.out.println("Hello world");
       
    }
}

