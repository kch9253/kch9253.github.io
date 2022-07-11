import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main3 {
	public static void main(String[] args) throws IOException {
		List<Student> list = new ArrayList<>(Arrays.asList(
								new Student("ȫ�浿", 22, 2.5), 
									new Student("�Ѹ�", 33, 3.3), 
										new Student("�����", 44, 4.4)));

		DataOutputStream dos = null;

		try {
			dos = new DataOutputStream(new FileOutputStream(new File("d:\\filetest\\student.dat")));

			for (int i = 0; i < list.size(); i++) {
				Student s = list.get(0);

				dos.writeUTF(s.getName());
				dos.writeInt(s.getAge());
				dos.writeDouble(s.getScore());
			}
			dos.flush();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (dos != null) {
				try {
					dos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}
}