package Task1;
import java.util.Scanner;

public class ComplexNum implements Cloneable {
	private double realPart;
	private double imaginaryPart;
	
	public ComplexNum(double a, double b){
		realPart = a;
		imaginaryPart = b;
	}
	
	public ComplexNum(){
		realPart = 0;
		imaginaryPart = 0;
	}
	
	public String toString(double compNum, double imaginNum) {
		if(imaginNum == 0) {
			String result = Double.toString(compNum); //basically, toString method in java returns the information or the value that the current object has into the string.
			return result;
		}else {
			return compNum + " + " + imaginNum + "i";
		}
	}
	
	public double getRealPart() {
		return this.realPart;
	}
	
	public double getImaginaryPart() {
		return this.imaginaryPart;
	}
	
	public void add(ComplexNum com2) {
		
		double realResult = this.getRealPart() + com2.getRealPart();
		double imaginaryResult = this.getImaginaryPart() + com2.getImaginaryPart();
		
		System.out.println("(" + this.toString(this.getRealPart(), this.getImaginaryPart()) + ") + (" + com2.toString(com2.getRealPart(), com2.getImaginaryPart()) + ") = " + realResult + " + " + imaginaryResult + "i");
	}

	public void substract(ComplexNum com2) {
		double realResult = this.getRealPart() - com2.getRealPart();
		double imaginaryResult = this.getImaginaryPart() - com2.getImaginaryPart();
		
		System.out.println("(" + this.toString(this.getRealPart(), this.getImaginaryPart()) + ") - (" + com2.toString(com2.getRealPart(), com2.getImaginaryPart()) + ") = " + realResult + " + " + imaginaryResult + "i");
	}
	
	public void multiply(ComplexNum com2) {
		double realResult = this.getRealPart() * com2.getRealPart() - this.getImaginaryPart() * com2.getImaginaryPart();
		double imaginaryResult = this.getImaginaryPart() * com2.getRealPart() + this.getRealPart() * com2.getImaginaryPart();
		
		System.out.println("(" + this.toString(this.getRealPart(), this.getImaginaryPart()) + ") * (" + com2.toString(com2.getRealPart(), com2.getImaginaryPart()) + ") = " + realResult + " + " + imaginaryResult + "i");
	}
	
	public void divide(ComplexNum com2) {
		double power = Math.pow(com2.getRealPart(), 2) + Math.pow(com2.getImaginaryPart(), 2);
		double realResult = (this.getRealPart() * com2.getRealPart() + this.getImaginaryPart() * com2.getImaginaryPart()) / power;
		double imaginaryResult = (this.getImaginaryPart() * com2.getRealPart() - this.getRealPart() * com2.getImaginaryPart())	/ power;
		
		System.out.println("(" + this.toString(this.getRealPart(), this.getImaginaryPart()) + ") / (" + com2.toString(com2.getRealPart(), com2.getImaginaryPart()) + ") = " + Math.floor(10000*realResult)/10000 + " + " + Math.floor(10000*imaginaryResult)/10000 + "i");
	}
	
	public void abs() {
		double result = Math.sqrt(Math.pow(this.getRealPart(), 2) + Math.pow(this.getImaginaryPart(), 2));
		
		System.out.println("|(" + this.toString(this.getRealPart(), this.getImaginaryPart()) + ")| = " + result);
	}
	
	

}