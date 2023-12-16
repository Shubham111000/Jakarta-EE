package mypack;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class StudentDAOFileImpl implements StudentDAO {

	@Override
	public void addStudent(Student ref) {
		try {
			FileOutputStream fos=new FileOutputStream("F:\\Student.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(ref);
			System.out.println("Done With Student");			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
