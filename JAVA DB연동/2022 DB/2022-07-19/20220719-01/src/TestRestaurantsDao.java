import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

public class TestRestaurantsDao {
	public static void main(String[] args) {
		RestaurantsDao dao = new RestaurantsDapImpl();
		
		try {
			int result = dao.create("�׽�Ʈ��", "1234-5555", "�λ�");
			System.out.println(result == 1);
			
//			System.out.println(dao.read());
//			System.out.println(dao.read(3));
			
			
			// ����
//			int result = dao.update(1, "�����", "9874-1234", "�λ�");
//			System.out.println(result == 1);
//			System.out.println(dao.read(1));
			
			
			// ����
//			int result = dao.delete(4);
//			System.out.println(result == 1);
//			System.out.println(dao.read());
			
			// �ݺ�
			
//			RestaurantsDapImpl impl = (RestaurantsDapImpl) dao;
//			int[] result = impl.create(Arrays.asList(
//					new Restaurant(0, "��ġ1", "0101-0202", "��ġ�ּ�1")
//					,new Restaurant(0, "��ġ2", "0202-0202", "��ġ�ּ�2")
//					,new Restaurant(0, "��ġ3", "0303-0202", "��ġ�ּ�3")
//					,new Restaurant(0, "��ġ4", "0404-0202", "��ġ�ּ�4")
//					));
//			System.out.println(Arrays.toString(result));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
