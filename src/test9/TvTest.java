package test9;

public class TvTest {
	public static void main(String[] args) {
		Tv tv[] = new Tv[3];
		tv[0] = new Tv("INFINIA",1500000,"LED TV");
		tv[1] = new Tv("XCANVAS",1000000,"LCD TV");
		tv[2] = new Tv("CINEM",2000000,"3D TV");
		
		Tv big = new Tv();
		Tv small = new Tv();
		small.setPrice(Integer.MAX_VALUE);
		for (int i = 0; i < tv.length; i++) {
			System.out.println(tv[i].toString());
			if(big.getPrice() < tv[i].getPrice())
				big = tv[i];
			if(big.getPrice() > tv[i].getPrice())
				small = tv[i];
		}
		System.out.println("가장 비싼 제품 : "+big.getName());
		System.out.println("가장 저렴한 제품 : "+small.getName());
	}
}
