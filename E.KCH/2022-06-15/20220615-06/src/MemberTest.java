import java.util.Arrays;

public class MemberTest {
	public static void main(String[] args) {
		Member[] members = {new Member("Å°Å«³ğ", 190, 60)
				, new Member ("Å°ÀÛÀº³ğ", 130, 30)
				, new Member("Áß°£ÂêÀ½", 176, 65)
				};
		Arrays.sort(members); 
		System.out.println(members[0].heigth);
		System.out.println(members[1].heigth);
		System.out.println(members[2].heigth);
	}
}
