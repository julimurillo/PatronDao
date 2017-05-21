package DAO;

public class Main {
	public static void main(String[] args) {
		StudentDAO student = new StudentDAO();
		Student alok = new Student();
		alok.setName("Alok");
		alok.setNo(8);
		alok.setCourse("MBA");
		alok.setAddress("Ranchi");
		Student tinkoo = new Student();
		tinkoo.setName("Arvind");
		tinkoo.setNo(6);
		student.add(alok);
		student.delete(7);
		student.update(tinkoo);
		student.findAll();
	}

}
