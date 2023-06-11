package model;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {

	String studentID;
	private String fullName;
	private String sex;
	private float assignment, progressTest, workShop, practicalExam, finalExam;

	public Student(String studentID, String fullName, String sex, float assignment, float progressTest, float workShop,
			float practicalExam, float finalExam) {
		this.studentID = studentID;
		this.fullName = fullName;
		this.sex = sex;
		this.assignment = assignment;
		this.progressTest = progressTest;
		this.workShop = workShop;
		this.practicalExam = practicalExam;
		this.finalExam = finalExam;
	}

	public Student() {
	}

	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public float getAssignment() {
		return assignment;
	}

	public void setAssignment(float assignment) {
		this.assignment = assignment;
	}

	public float getProgressTest() {
		return progressTest;
	}

	public void setProgressTest(float progressTest) {
		this.progressTest = progressTest;
	}

	public float getWorkShop() {
		return workShop;
	}

	public void setWorkShop(float workShop) {
		this.workShop = workShop;
	}

	public float getPracticalExam() {
		return practicalExam;
	}

	public void setPracticalExam(float practicalExam) {
		this.practicalExam = practicalExam;
	}

	public float getFinalExam() {
		return finalExam;
	}

	public void setFinalExam(float finalExam) {
		this.finalExam = finalExam;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", fullName=" + fullName + ", sex=" + sex + ", assignment="
				+ assignment + ", progressTest=" + progressTest + ", workShop=" + workShop + ", practicalExam="
				+ practicalExam + ", finalExam=" + finalExam + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(assignment, finalExam, fullName, practicalExam, progressTest, sex, studentID, workShop);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Float.floatToIntBits(assignment) == Float.floatToIntBits(other.assignment)
				&& Float.floatToIntBits(finalExam) == Float.floatToIntBits(other.finalExam)
				&& Objects.equals(fullName, other.fullName)
				&& Float.floatToIntBits(practicalExam) == Float.floatToIntBits(other.practicalExam)
				&& Float.floatToIntBits(progressTest) == Float.floatToIntBits(other.progressTest)
				&& Objects.equals(sex, other.sex) && Objects.equals(studentID, other.studentID)
				&& Float.floatToIntBits(workShop) == Float.floatToIntBits(other.workShop);
	}
	
}

