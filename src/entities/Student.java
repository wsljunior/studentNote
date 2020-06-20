package entities;

public class Student {
	public String name;
	public double firstNote;
	public double secondNote;
	public double thirdNote;
	public double finalGrade;

	public void finalGrade() {
		finalGrade = firstNote + secondNote + thirdNote;
	}

	public void verification() {
		if (finalGrade >= 0 && finalGrade <= 100) {
			System.out.println("\nFinalGrade: " + String.format("%.2f", finalGrade));
			if (finalGrade < 60) {
				System.out.println("FAILED");
				double missing = 60 - finalGrade;
				System.out.println("MISSING " + String.format("%.2f", missing) + " POINTS");
			} else {
				System.out.println("PASS");
			}
		} else {
			System.out.println("\nError!\nWrong values");
		}
	}
}
