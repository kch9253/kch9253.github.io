
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface PlayListDao {

	public List<PlayList> PersonalPL(String userID) throws SQLException; // id검색
	// ------------------------------220726
	// 수정---------------------------------------------

	public void DeletePL(String userID, List<Integer> check) throws SQLException;

	// ------------------------------220726
	// 수정---------------------------------------------
	public void SetSaveCnt(int now_rank) throws SQLException;

	public String findUsersName(String user_id) throws SQLException;

	public void insertPL(String user_id, int now_rank) throws SQLException;

	public MusicPlayer printPlaylist(String user_id, Object[][] data, MusicPlayer mp) throws SQLException;

	public int findCnt(String user_id) throws SQLException;

	public int printMusicId(int i) throws SQLException;

	public void updateRank(int music_id, int rank) throws SQLException;

}
