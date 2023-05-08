package com.callor.classes;

public class AnimalDto {

private	String anName;
private	String anKind;
private	String anAge;
private int number;

public int getNumber() {
	return number;
}
public void setNumber(int number) {
	this.number = number;
}
public AnimalDto() { // 기본생성자
	super();
}
public AnimalDto(String anName, String anKind, String anAge, 
		int number) { // 임의생성자
	super();
	this.anName = anName;
	this.anKind = anKind;
	this.anAge = anAge;
	this.number= number;

}
public String getAnName() { 
	return anName;
}
public void setAnName(String anName) {
	this.anName = anName;
}
public String getAnKind() {
	return anKind;
}
public void setAnKind(String anKind) {
	this.anKind = anKind;
}
public String getAnAge() {
	return anAge;
}
public void setAnAge(String anAge) {
	this.anAge = anAge;
}
@Override
public String toString() {
	return "AnimalDto [anName=" + anName + ", anKind=" + anKind + ", anAge=" + anAge + ", number=" + number + "]";
}
	
	
	
	
	
}
