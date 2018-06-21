package com.example.exemplu2;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle3 implements ApplicationContextAware, BeanNameAware {
	public List<Point> points;
	public ApplicationContext context;
	
	public Triangle3() {
		
	}
	
	public void draw() {
		points.forEach((point) -> System.out.println(point));
	}
	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}
	
	
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.context = context;
	}
	@Override
	public void setBeanName(String beanName) {
		System.out.println("Bean name : "  + beanName);
		
	}
	
	
	
	
	
}
