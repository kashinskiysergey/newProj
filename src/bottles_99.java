
public class bottles_99 {

	//99 ������� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 99;
		int count = 1;
		String word = "������� ����";
		String word2 = "������ ����, ����� �� ����� ";
		if(number>count){
			System.out.println(word+ " "+number);
			System.out.println(word2);
		       while (number>count){
				number= number-count;
				System.out.println(word+ " "+number);
				System.out.println(word2);
			}
		       
		}
		
		
	}

}
