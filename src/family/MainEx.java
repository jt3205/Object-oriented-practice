package family;

class  MainEx{
	public static void main(String[] args) {
		Family fam[] = new Family[3];
		fam[0] = new Father("홍길동");
		fam[1] = new Mother("정예진");
		fam[2] = new Son("박형진");
		
		for (Family family : fam) {
			System.out.println(family);
		}
	}
}