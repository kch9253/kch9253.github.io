import java.sql.SQLException;
import java.util.List;

import person.Person;
import person.PersonDAO;

// person 값을 넣고 테스트하기위한
public class TestDAO {
	public static void main(String[] args) {
		PersonDAO dao = new PersonDAO();

		try {
			int result = dao.insert(new Person("f", "l", 10, "em"));
			System.out.println(result);
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		List<Person> list = null;
		try {
			list = dao.selectAll();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println(list);
	}
}