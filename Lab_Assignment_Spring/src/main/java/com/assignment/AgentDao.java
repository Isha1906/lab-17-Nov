package com.assignment;

import org.springframework.jdbc.core.JdbcTemplate;


import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AgentDao {
	private JdbcTemplate jdbcTemplate;
	
	public int saveAgent(Agent a)
	{
		String query="insert into agent(id,name,area,agent_commission) values(?,?,?,?)";
		return jdbcTemplate.update(query,a.getId(),a.getName(),a.getArea(),a.getAgent_commission());
	}
	public int updateAgent(Agent a)
	{
		String query="update agent set name='"+a.getName()+"' , area='"+a.getArea()+"', agent_commission="+a.getAgent_commission()+" where id="+a.getId()+";";
		return jdbcTemplate.update(query);
	}
	public int deleteAgent(Agent a)
	{
		String query="delete from agent"+" where id="+a.getId()+";";
		return jdbcTemplate.update(query);
	}

}
