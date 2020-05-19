
class StudentData
{
	int stuID;
	String stuName;
	int stuAge;
	
	StudentData()
	{
		stuID = 9;
		stuName = "Het";
		stuAge = 19;
	}
	
	StudentData(int num1, String str, int num2)
	{
		stuID = num1;
		stuName = str;
		stuAge = num2;
	}
	
	public int getStuID() {
		return stuID;
	}
	public void setStuID(int stuID) {
		this.stuID = stuID;
	}
	
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
}
public class ConstructorOverloadingEX1 {

	public static void main(String[] args) {
		
		StudentData myobj = new StudentData();
		System.out.println("Student Name is: "+myobj.getStuName());
		System.out.println("Student Age is: "+myobj.getStuAge());
		System.out.println("Student ID is: "+myobj.getStuID());
	
		StudentData myobj2 = new StudentData(11,"Student",20);
		System.out.println("Student Name is: "+myobj2.getStuName());
		System.out.println("Student Age is: "+myobj2.getStuAge());
		System.out.println("Student ID is: "+myobj2.getStuID());
	}

}
