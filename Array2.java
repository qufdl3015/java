
public class Array2 {

	public static void main(String[] args) {
		// �ζǹ�ȣ ������
		int[] lotto = new int[45]; // �迭 ���� ���� �̸��� lotto ���� 45�� 0���� ����	
		int temp = 0, j=0;
		//1~45������ �ζǹ�ȣ ���� �迭 ������ �ֱ�
		for(int i =0; i<lotto.length; i++) {
			lotto[i] = i+1;
			//System.out.println(lotto[i]);
		}
		
		//�ζ� ��ȣ ����
		for(int i = 0; i<100; i++) {
			j = (int)(Math.random() * 45); //0~44 ������ ��ȯ
			temp = lotto[0];
			lotto[0] = lotto[j];
			lotto[j] = temp;
		}
		
		// ��÷ ��ȣ ��÷
		for(int i =0; i<6; i++) {
			j = (int)(Math.random() * 45);
			System.out.println(lotto[j]);
		}
	}

}
