class Member implements Comparable<Member> { // Comparable ���ϴ�
	String name;
	int heigth;
	int weight;
	
	// Ű~�� ���� �� //
	
	public Member(String name, int heigth, int weight) {
		super();
		this.name = name;
		this.heigth = heigth;
		this.weight = weight;
	}

	@Override // ��Һ� ���ϴ� �������̵�
	public int compareTo(Member o) {
		return this.heigth - o.heigth;
	}
	
//	 public int compare (Member member) {
//		return heigth - member.heigth;
//	}
}



