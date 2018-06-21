package com.example.exemplu2;

public class Triangle2 {
	
	private Point zeroPoint;
	private Point pointB;
	private Point pointC;
	
	public Triangle2() {
		
	}
	
	
	public Triangle2(Point zeroPoint, Point pointB, Point pointC) {
		super();
		this.zeroPoint = zeroPoint;
		this.pointB = pointB;
		this.pointC = pointC;
	}
	public Point getZeroPoint() {
		return zeroPoint;
	}
	public void setZeroPoint(Point zeroPoint) {
		this.zeroPoint = zeroPoint;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	@Override
	public String toString() {
		return "Triangle2 [zeroPoint=" + zeroPoint + ", pointB=" + pointB + ", pointC=" + pointC + "]";
	}
	
	
	

	
	
	

}
