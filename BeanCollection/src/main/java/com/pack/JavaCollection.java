package com.pack;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
	private List<String> email;
    public JavaCollection() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Set<String> phonenumber;
    private Map<String,String> maps;
	public List<String> getEmail() {
		return email;
	}
	public void setEmail(List<String> email) {
		this.email = email;
	}
	public Set<String> getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Set<String> phonenumber) {
		this.phonenumber = phonenumber;
	}
	public Map<String, String> getMaps() {
		return maps;
	}
	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}
	public JavaCollection(List<String> email, Set<String> phonenumber, Map<String, String> maps) {
		super();
		this.email = email;
		this.phonenumber = phonenumber;
		this.maps = maps;
	}
  
	
    

}
