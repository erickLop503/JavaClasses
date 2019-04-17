package com.class24;

public class TestDegree extends Degree{

	public static void main(String[] args) {
		
		Degree degree= new Degree();
		Undergraduate under= new Undergraduate();
		Postgraduate post= new Postgraduate();
		
		degree.getDegree();
		under.getDegree();
		post.getDegree();
	}
}
