package example03;

public class RandomEx {

	public static void main(String[] args) {
		
		
		// Math random ()���� 0.0000~0.999999���� ��
		// System.out.println(Math.random()); 
		
		
		// �ֻ��� ���� ���� �߻�
		int num = (int) (Math.random()*6)+1;
		System.out.println(num);
		
		
		
//		if(num == 1 ) {
//			System.out.println("1����");
//		}
//		else if (num == 2) {
//			System.out.println("2����");
//		}
//		else if (num == 3) {
//			System.out.println("3����");
//		}
//		else if (num == 4) {
//			System.out.println("4����");
//		}
//		else if (num == 5) {
//			System.out.println("5����");
//		}
//		else {
//			System.out.println("6����");
//		}
		
		
		switch(num) {
		case 1: 
			System.out.println("1����");
			break;
		case 2: 
			System.out.println("2����");
			break;
		case 3: 
			System.out.println("3����");
			break;
		case 4: 
			System.out.println("4����");
			break;
		case 5: 
			System.out.println("5����");
			break;
			default:
				System.out.println("6����");
		
		}
	}
	
	

}
