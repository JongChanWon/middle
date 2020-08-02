package kr.or.ddit.shop.view.join;

public class AES256Main {
	
	public static void main(String[] args) throws Exception {
		
		AES256 ee = new AES256();
		String str = "챠니네오까게";
		
		String encode =ee.aesEncode(str);
		System.out.println("암호화대상 : "+ str);
		
		System.out.println("==============================================");
		System.out.println("-암호화당-");
		System.out.println(encode);
		System.out.println("==============================================");
		
		String decode = ee.aesDecode(encode);
		System.out.println("-복호화당-");
		System.out.println(decode);
		System.out.println("==============================================");



	}
	
	
}
