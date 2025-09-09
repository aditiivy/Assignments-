package fileio;

import java.io.*; 
import java.util.*; 

class Stu implements Serializable {
    String name;
    int roll;
    Stu(String n, int r) {
        name = n;
        roll = r;
    }
}
public class Task10 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ArrayList<Stu> list = new ArrayList<>();
        list.add(new Stu("A", 1));
        list.add(new Stu("B", 2));

        ObjectOutputStream oos = new ObjectOutputStream(
            new FileOutputStream("stu.ser"));
        oos.writeObject(list);
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(
            new FileInputStream("stu.ser"));
        ArrayList<Stu> students = (ArrayList<Stu>) ois.readObject();
        ois.close();

        for (Stu s : students) {
            System.out.println(s.name + " - " + s.roll);
        }
		
		

	}

}
