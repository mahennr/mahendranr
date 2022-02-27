class EmployeeCount {

	private int noOfEmployees = 0;

	public void setNoOfEmployees (int count)
		{
			noOfEmployees = count;
		}

	public int getNoOfEmployees ()
		{
			return noOfEmployees;
		}
	}

public class EncapsulationEx {

	public static void main(String args[])
	{
		EmployeeCount obj1 = new EmployeeCount();
		EmployeeCount obj2 = new EmployeeCount();

		obj1.setNoOfEmployees(5601);
		System.out.println("No Of Employees: "+(int)obj1.getNoOfEmployees());

		obj2.setNoOfEmployees(600);
		System.out.println("No Of Employees: "+(int)obj2.getNoOfEmployees());
	}
}

