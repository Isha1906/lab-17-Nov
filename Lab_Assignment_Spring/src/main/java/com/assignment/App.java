//Author of this code - Isha Vats
//Define Agent Entity with field(id , name , area , agent_commission)
//Done this assignment using spring framework , lombok and other useful dependency

package com.assignment;


//importing springframework package for using necessary files
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )     //main() class
    {
    	
    	
    	/*  Making connection or specifying config.cml file for finding connection details with database   */
    	ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    	JdbcTemplate template=context.getBean("jdbcTemplate",JdbcTemplate.class);
    	
    	
    	/* creating object of AgentDao with reference to Bean id="ag" provided in the config.xml file*/
    	AgentDao a=(AgentDao)context.getBean("ag");
    	
    	
    	
    	/*  PERFORMING CRUD OPERATION  */
    	
    	/* inserting data into agent table */
    	int i=a.saveAgent(new Agent(1114,"Sanket","Gurgaon",10));
    	System.out.println(i);
    	
    	
    	/* updating data into agent table*/
        int i1=a.updateAgent(new Agent(1111,"Kavita Mandhiya","Haryana",30));
    	System.out.println(i1);
    	
    	/* delete record/data from agent table */
    	int i2=a.deleteAgent(new Agent(1111));
    	System.out.println(i2);
    	
    	
    }
}
