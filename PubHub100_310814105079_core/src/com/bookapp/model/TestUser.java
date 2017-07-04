package com.bookapp.model;

public class TestUser {

	public TestUser() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user= new User();
		user.setId(1);
		System.out.println(user.getId());
		user.setName("preethi");
		System.out.println(user.getName());
		user.setEmailId("preethi@gmail.com");
		System.out.println(user.getEmailId());
		user.setPassword("pass");
		System.out.println(user.getPassword());
		user.setActive(1);
		System.out.println(user.getActive());
		user.setPrice(100);
		System.out.println(user.getPrice());


	}

}
