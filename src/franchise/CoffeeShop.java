package franchise;

public class CoffeeShop {

	Coffee iceAmericano;
	Coffee hotAmericano;
	Coffee iceLatte;
	Coffee hotLatte;
	
	public CoffeeShop(Coffee iceAmericano, Coffee hotAmericano) {
		this.iceAmericano = iceAmericano;
		this.hotAmericano = hotAmericano;
	}
	
	/**
	 * 커피숍에서 음료를 주문한다
	 * @param menu 주문할 음료의 번호 1 - 아이스 아메리카노, 0 - 따듯한 아메리카노
	 * @param quantity 주문할 수량
	 * @return 주문 총액
	 */
	public int orderCoffee(String menuName, int quantity) {
		if(this.iceAmericano.name == menuName) {
			System.out.println(this.iceAmericano.name + "을 주문합니다");
			return this.iceAmericano.price * quantity;
		}else if(this.hotAmericano.name == menuName) {
			return this.hotAmericano.price * quantity;
		}else if(this.iceLatte.name == menuName) {
			return this.iceLatte.price * quantity;
		}
	}
}
