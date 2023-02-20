package controlstatement;


class Batch { // parent class
	//parent class property { data member /variable
	int id;
	String name;
	double fees;
	//parent class cons
	Batch(int id, String name, double fees ) {
		this.id=id;
		this.name=name;
		this.fees=fees;
	}}
class BatchMember extends Batch{
	long phone_no;
	BatchMember(int id, String name, double fees,long phone_no){
		super (id,name,fees); //reusing parent cons
		this.phone_no=phone_no;
	}
	void show ()
	{
		System.out.println(id+" "+name +" "+phone_no);
	}
}
public class Delhi_Batch {
	public static void main(String[] args) {
		BatchMember obj = new BatchMember (1,"ritu",5000,95075034);
		obj.show();
	}
}
