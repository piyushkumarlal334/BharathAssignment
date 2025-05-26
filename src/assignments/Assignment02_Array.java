package assignments;

public class Assignment02_Array {

	public static void main(String[] args) {
		String[][][] studentData = new String[5][6][3];

		// --- Populate Data ---
		// Semester 1
		studentData[0][0] = new String[]{"Mathematics I", "Pass", "78"};
		studentData[0][1] = new String[]{"Physics", "Pass", "85"};
		studentData[0][2] = new String[]{"Chemistry", "Fail", "21"};
		studentData[0][3] = new String[]{"Computer Programming", "Pass", "74"};
		studentData[0][4] = new String[]{"Engineering Drawing", "Pass", "88"};
		studentData[0][5] = new String[]{"Basic Electrical Eng.", "Pass", "79"};

		// Semester 2
		studentData[1][0] = new String[]{"Mathematics II", "Pass", "82"};
		studentData[1][1] = new String[]{"Mechanics", "Pass", "77"};
		studentData[1][2] = new String[]{"Environmental Sci.", "Pass", "93"};
		studentData[1][3] = new String[]{"Basic Electronics", "Fail", "19"};
		studentData[1][4] = new String[]{"Engineering Physics", "Fail", "24"};
		studentData[1][5] = new String[]{"Engineering Graphics", "Pass", "90"};

		// Semester 3
		studentData[2][0] = new String[]{"Data Structures", "Pass", "88"};
		studentData[2][1] = new String[]{"Discrete Mathematics", "Pass", "81"};
		studentData[2][2] = new String[]{"Digital Electronics", "Pass", "76"};
		studentData[2][3] = new String[]{"Operating Systems", "Fail", "32"};
		studentData[2][4] = new String[]{"Signals and Systems", "Pass", "85"};
		studentData[2][5] = new String[]{"Object-Oriented Prog.", "Pass", "87"};

		// Semester 4
		studentData[3][0] = new String[]{"Algorithms", "Pass", "91"};
		studentData[3][1] = new String[]{"Computer Networks", "Pass", "73"};
		studentData[3][2] = new String[]{"Database Systems", "Fail", "19"};
		studentData[3][3] = new String[]{"Microprocessors", "Pass", "80"};
		studentData[3][4] = new String[]{"Communication Eng.", "Pass", "76"};
		studentData[3][5] = new String[]{"Software Engineering", "Pass", "87"};

		// Semester 5
		studentData[4][0] = new String[]{"Probability & Stats", "Pass", "86"};
		studentData[4][1] = new String[]{"Machine Learning", "Pass", "88"};
		studentData[4][2] = new String[]{"Compiler Design", "Pass", "84"};
		studentData[4][3] = new String[]{"Theory of Computation", "Pass", "95"};
		studentData[4][4] = new String[]{"Embedded Systems", "Pass", "73"};
		studentData[4][5] = new String[]{"Computer Graphics", "Pass", "90"};

		//Print Semester 2 Subject 4 and Subject 5 names.
		System.out.println("Semester 2 Subject 4 Name:- " + studentData[1][3][0]); // Semester 2 (index 1), Subject 4 (index 3), Name (index 0)
		System.out.println("Semester 2 Subject 5 Name:- " + studentData[1][4][0]);
		System.out.println();

		//Print the Status/Marks of Semester 4 Subject 3 and Subject 6.
		System.out.println("Semester 4 Subject 3 Status:- " + studentData[3][2][1] + ", Marks:- " + studentData[3][2][2]);
		System.out.println("Semester 4 Subject 6 Status:- " + studentData[3][5][1] + ", Marks:- " + studentData[3][5][2]);
		System.out.println();
	}

}
