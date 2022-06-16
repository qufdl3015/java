
public class Array2 {

	public static void main(String[] args) {
		// 로또번호 생성기
		int[] lotto = new int[45]; // 배열 변수 생성 이름은 lotto 방은 45개 0으로 셋팅	
		int temp = 0, j=0;
		//1~45까지의 로또번호 생성 배열 변수에 넣기
		for(int i =0; i<lotto.length; i++) {
			lotto[i] = i+1;
			//System.out.println(lotto[i]);
		}
		
		//로또 번호 섞기
		for(int i = 0; i<100; i++) {
			j = (int)(Math.random() * 45); //0~44 정수값 반환
			temp = lotto[0];
			lotto[0] = lotto[j];
			lotto[j] = temp;
		}
		
		// 당첨 번호 추첨
		for(int i =0; i<6; i++) {
			j = (int)(Math.random() * 45);
			System.out.println(lotto[j]);
		}
	}

}
