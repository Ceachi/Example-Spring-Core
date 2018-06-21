package com.example.prezentareBogdan;


public class Triangle {
	
	public String type;
	public float height;
	public String name;
	
	public Triangle(String type, float height, String name) {
		super();
		this.type = type;
		this.height = height;
		this.name = name;
	}

	public Triangle() {
		
	}
	public Triangle(String type, float height) {
		super();
		this.type = type;
		this.height = height;
	}

	public Triangle(String type) {
		super();
		this.type = type;
	}

	public void draw() {
		System.out.println("afisam " + type + " height " + height + "name = " + name);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Triangle [type=" + type + ", height=" + height + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	
	
	
	
	
	
}
