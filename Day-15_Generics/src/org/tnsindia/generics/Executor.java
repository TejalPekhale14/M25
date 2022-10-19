package org.tnsindia.generics;

public class Executor {

	public static void main(String[] args) {
		
        Sender<String>obj=new Sender<>();
        obj.setMessage("Generic class demo");
        obj.sendMessage();
        
        System.out.println();
        
        Email em=new Email();
        em.setFrom("abc@gmail.com");
        em.setTo("123@gmail.com");
        em.setSubject("Java full stack");
        em.setBody("About training and placement");
        System.out.println(em.getBody());
        Sender<Email>obj1=new Sender<Email>();
        obj1.setMessage(em);
        obj1.sendMessage();
	}

}
