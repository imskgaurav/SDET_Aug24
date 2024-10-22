package com.testAutomationCentral.in;

public class Animal {
private String type;
	
	private boolean canJump;
	private boolean canSwim;
	public Animal(String type, boolean canJump, boolean canSwim) {

		this.type = type;
		this.canJump = canJump;
		this.canSwim = canSwim;
	}
	

	
	public boolean canSwim() {
		
		
		return canSwim;
	}

	
	public String type() {
		
		
		return type;
	}

	public boolean canJump() {
		// TODO Auto-generated method stub
		return canJump;
	}
}
