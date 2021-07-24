package com.pack;

public class EmployeeService {
	 private String message;

	   public void setMessage(String message){
	      this.message = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	   public void init()
	   {
	      System.out.println("bean inside init ");
	   }
	   public void destroy() {
	      System.out.println("bean in destroy method");
	   }
}
