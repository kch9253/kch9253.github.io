class Member implements Comparable<Member> { // Comparable 비교하는
	String name;
	int heigth;
	int weight;
	
	// 키~를 기준 비교 //
	
	public Member(String name, int heigth, int weight) {
		super();
		this.name = name;
		this.heigth = heigth;
		this.weight = weight;
	}

	@Override // 대소비교 비교하는 오버라이드
	public int compareTo(Member o) {
		return this.heigth - o.heigth;
	}
	
//	 public int compare (Member member) {
//		return heigth - member.heigth;
//	}
}



