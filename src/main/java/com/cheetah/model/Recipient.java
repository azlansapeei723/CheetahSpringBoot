package com.cheetah.model;

public class Recipient implements Comparable <Recipient> {

	int id;
	String name;
	String[] tags;
	
	public Recipient() {
		super();
	}
	
	public Recipient(int id, String name, String[] tags) {
		super();
		this.id = id;
		this.name = name;
		this.tags = tags;
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String[] getTags() {
		return tags;
	}
	public void setTags(String[] tags) {
		this.tags = tags;
	}
	
	public int compareTo(Recipient compareRecipient) {
		
		int compareId = ((Recipient) compareRecipient).getId();
		return this.id - compareId;	
		
	}
}

