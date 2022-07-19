import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;

public class TestRestaurantsDao {
	public static void main(String[] args) {
		RestaurantsDao dao = new RestaurantsDapImpl();
		
		try {
			int result = dao.create("테스트중", "1234-5555", "부산");
			System.out.println(result == 1);
			
//			System.out.println(dao.read());
//			System.out.println(dao.read(3));
			
			
			// 수정
//			int result = dao.update(1, "대대모골", "9874-1234", "부산");
//			System.out.println(result == 1);
//			System.out.println(dao.read(1));
			
			
			// 삭제
//			int result = dao.delete(4);
//			System.out.println(result == 1);
//			System.out.println(dao.read());
			
			// 반복
			
//			RestaurantsDapImpl impl = (RestaurantsDapImpl) dao;
//			int[] result = impl.create(Arrays.asList(
//					new Restaurant(0, "배치1", "0101-0202", "배치주소1")
//					,new Restaurant(0, "배치2", "0202-0202", "배치주소2")
//					,new Restaurant(0, "배치3", "0303-0202", "배치주소3")
//					,new Restaurant(0, "배치4", "0404-0202", "배치주소4")
//					));
//			System.out.println(Arrays.toString(result));
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
