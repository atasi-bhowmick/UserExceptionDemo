package com.ats.except;

public class studentRollException  extends RuntimeException{
 private long invalidRoll;
 public studentRollException(long invalidRoll) {
	super();
	this.invalidRoll = invalidRoll;
 }
 @Override
 public String toString() {
	return "studentRollException  for the invalid Roll no." + invalidRoll;
 }
 
}
