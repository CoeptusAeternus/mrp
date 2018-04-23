package prog;

import data.Person;
import data.Student;

public class TestProg {

	public static void main(String[] args) {
		new TestProg();
	}

	TestProg() {

		Person p1 = new Person();
		p1.setVorname("Anna");
		p1.setNachname("Meier");
		p1.setFemale(true);

		Person.getPersonenListe().add(p1);

		Person p2 = new Person();
		p2.setVorname("Peter");
		p2.setNachname("Huber");
		p2.setFemale(false);

		Person.getPersonenListe().add(p2);

		Student s1 = new Student();
		s1.setVorname("Robert");
		s1.setNachname("Hauer");
		s1.setSj(2018);

		Student.getStudentenListe().add(s1);

		// Student s2 = (Student);
		// System.out.println(s2);

		if(s1 instanceof Person) {
			if(s1 instanceof Student) {
				
			}
		}
		
		Person p3 = s1;
		// System.out.println(p3);
		// System.out.println(p3 instanceof Student);
		// System.out.println(p3 instanceof Person);

		Person.getPersonenListe().add(p3);

		// System.out.println(p1);
		// System.out.println(p2);

		for (int i=0; i< Person.getPersonenListe().size(); i++)
			System.out.println(Person.getPersonenListe().get(i));

	}

}
