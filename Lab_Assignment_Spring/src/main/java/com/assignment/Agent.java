/* Entity class Agent */

package com.assignment;

/* Importing lombok package to use certain annotations */
import lombok.AllArgsConstructor;
import lombok.Data;


@Data    /* Using this annotation all the required methods will be created automatically */

@AllArgsConstructor     /* Using this annotation parameterized constructor will be generated */
public class Agent {
	
	public Agent(int i)   //Single-valued constructor
	{
		this.id=i;
	}
	
	
	/*  Field Name */
	private int id;
	private String name;
	private String area;
	private int agent_commission;

}
