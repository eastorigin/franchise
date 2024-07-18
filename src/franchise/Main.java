package franchise;

public class Main {

	public static void main (String[] args) {
		
		Coffee iceAmericano = new Coffee("아이스 아메리카노", 2500);
		Coffee hotAmericano = new Coffee("아메리카노", 2000);
		
		CoffeeShop coffeShop = new CoffeeShop(iceAmericano, hotAmericano);
		
		int totalPrice = coffeShop.orderCoffee("아이스 아메리카노", 15);
		System.out.println(totalPrice);
		
		Coffee iceLatte = new Coffee("아이스 라떼", 2500);
		Coffee hotLatte = new Coffee("따뜻한 라떼", 2000);
		
		CoffeeShop megaCoffee = new CoffeeShop(iceLatte, hotLatte);
		
	}
}
