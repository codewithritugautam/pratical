package Mypackage;

public class Write_Encap {
private String name;

public void setName(String name) {
	this.name = name;
}
public static void main(String[] args) {
	Write_Encap obj = new Write_Encap();
	// we can not get the value , there is no get method
//System.out.println(obj.setName("Name:"+obj.getName());
	System.out.println(obj.name);
}
}
