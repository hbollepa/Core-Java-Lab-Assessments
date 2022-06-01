package Lab5_Exception;

//packageName: "com.cg.eis.exception"

import java.util.Scanner;

public class Ex3_EmployeeException {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee Salary : ");
		int salary = sc.nextInt();

		try {
			if (salary < 3000) {
				throw new InvalidSalary_Ex3("EmployeeSalary is above 3000");
			} else {
				System.out.println("EmployeeSalary is Valid");
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
