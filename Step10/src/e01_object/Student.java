package e01_object;

import java.util.Objects;

public class Student {
	private String stduentNo;
	private String studentName;
	private String majorName;
	private double score;

	public Student(String stduentNo, String studentName, String majorName, double score) {
		this.stduentNo = stduentNo;
		this.studentName = studentName;
		this.majorName = majorName;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [stduentNo=" + stduentNo + ", studentName=" + studentName + ", majorName=" + majorName
				+ ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(majorName, score, stduentNo, studentName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return Objects.equals(majorName, other.majorName)
				&& Double.doubleToLongBits(score) == Double.doubleToLongBits(other.score)
				&& Objects.equals(stduentNo, other.stduentNo) && Objects.equals(studentName, other.studentName);
	}

	

	



	
	
	
}




