package com.example.exemplu3;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import com.example.exemplu2.Point;

@Component(value = "circle")
public class Circle {
	
	@Autowired
	@Qualifier("circleRelated")
	//@Resource(name = "pointB")
	private Point center;

	public Point getCenter() {
		return center;
	}
	
//	@Required
	public void setCenter(Point center) {
		this.center = center;
	}

	@Override
	public String toString() {
		return "Circle [center=" + center + "]";
	}
	
	
	
	
	
}
