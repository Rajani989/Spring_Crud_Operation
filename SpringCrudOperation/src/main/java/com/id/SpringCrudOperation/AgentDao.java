package com.id.SpringCrudOperation;

import org.springframework.jdbc.core.JdbcTemplate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AgentDao {
	  private JdbcTemplate jdbcTemplate;
	  
	  public int saveAgent(Agent a) {
	    	String query="Insert into agent(id,name,area,commission) values(?,?,?,?)";
	    	return jdbcTemplate.update(query,a.getId(),a.getName(),a.getArea(),a.getCommission());
	    }
	
	 public int updateAgent(Agent a) {
		 String query="update agent set commission='"+a.getCommission()+"', name='"+a.getName()+"',area='"+a.getArea()+"' where id='"+a.getId()+"'";
	    	return jdbcTemplate.update(query);
	    }
	 public int deleteAgent(Agent a) {
		 String query="delete from agent where id='"+a.getId()+"'";
	    	return jdbcTemplate.update(query);
	    }
	
}
