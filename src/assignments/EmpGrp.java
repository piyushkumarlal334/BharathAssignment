package assignments;

public class EmpGrp extends Assignment03_Employee {

	public static void main(String[] args) {
		Assignment03_Employee emp=new Assignment03_Employee();

		//		String Names[]= {"Name1,Name2,Name3"};
		//		int EmpId[]= {EmpId1, };

		System.out.println("EmployeeName:-" +emp.EmployeeNames[0] + "," +"EmployeeID:-"+emp.EmployeeId[0]);
		System.out.println("EmployeeName:-" +emp.EmployeeNames[1] + "," +"EmployeeID:-"+emp.EmployeeId[1]);
		System.out.println("EmployeeName:-" +emp.EmployeeNames[2] + "," +"EmployeeID:-"+emp.EmployeeId[2]);
	}

}
