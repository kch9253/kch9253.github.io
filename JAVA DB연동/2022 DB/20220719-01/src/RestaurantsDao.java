///*
// * restaurants ���̺� ���� db access�� �����ϴ� ��ü�� �ۼ��غ�����. �ۼ� �� �׽�Ʈ!!
// * 
// * �޼ҵ�(�Է°�) : ��ȯ��									throws ����
// * 
// * C(��ȣ��, ��ȭ��ȣ, �ּ�) or C(������) : �� ���� 				throws SQLException
// * R() : List<������> 									throws SQLException
// * R(pk) : ������											throws SQLException
// * U(pk, �� ��ȣ��, �� ��ȭ��ȣ, �� �ּ�) or U(������) : �� ���� 	throws SQLException
// * D(pk) : �� ���� 										throws SQLException
// * 
//  ----------------------------------------------------------
//  
//  ���� ���� ������ �߰�
// 


import java.sql.SQLException;
import java.util.List;

public interface RestaurantsDao {
	int create(String name, String phoneNumber, String address) throws SQLException;
	List<Restaurant> read() throws SQLException;
	Restaurant read(int id) throws SQLException;
	int update(int id, String name, String phoneNumber, String address) throws SQLException;
	int delete(int id) throws SQLException;
}

