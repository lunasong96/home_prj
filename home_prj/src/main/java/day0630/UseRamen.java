package day0630;

/**
 * 라면클래스를 사용하여 객채로 만들고 사용하기 위한 유저라면클래스
 * @author user
 */
public class UseRamen {

	public static void main(String[] args) {
		Ramen fire = new Ramen();
		fire.setName("열");
		System.out.println(fire.eat());
		System.out.println(fire.eat(2, 1));
		Ramen guri = new Ramen();
		guri.setName("너구리");
		System.out.println(guri.eat());
		System.out.println(guri.eat(500, 1));
		Ramen sin =new Ramen();
		sin.setName("");
		System.out.println(sin.eat());
		System.out.println(sin.eat(5, 10));
	}

}
