package data;

import java.util.ArrayList;

public class Student extends Person {

	private int sj;

	private static ArrayList<Student> studentenListe = new ArrayList<>();

	public Student() {

	}

	public int getSj() {
		return sj;
	}

	public void setSj(int sj) {
		this.sj = sj;
	}

	public String toString() {
		return super.toString() + " inskripiert im SJ " + getSj();
	}

	public static ArrayList<Student> getStudentenListe() {
		return studentenListe;
	}

}
