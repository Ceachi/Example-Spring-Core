package com.example.exemplu2;


public class Triangle4 {
	
	private Point zeroPoint;
	private Point pointB;
	private Point pointC;
	
	//apel la constructorul beanului
	public void myInt() {
		System.out.println("s-a initializat beanul");
	}
	//apel la destructorul beanului
	public void cleanUp() {
		System.out.println("s-a distrus beanul");
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
		return "Triangle4 [zeroPoint=" + zeroPoint + ", pointB=" + pointB + ", pointC=" + pointC + "]";
	}
}
