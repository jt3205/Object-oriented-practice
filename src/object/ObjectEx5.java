package object;

public class ObjectEx5 {
	public static void main(String[] args) {
		Sales sales = new Sales("맥북",30,1500000);
		System.out.println(sales.toString());
		
		System.out.println(sales.getItem() + "   "+sales.getCost()+"짜리 "+sales.getQty()+"개 구입하면 "+sales.getPrice()+"원이 필요함");
	}
}
