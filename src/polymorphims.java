
public class polymorphims {

	/**
	 * @param args
	 */
	void go(int x, int y){ //����� � �������������� �����������
		System.out.println(" �������� - " + x + " " + y + " " );
	}
	
	void go(String value){//����� �� ��������� ���������
		System.out.println(" �������� - " + value );
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
 		
		polymorphims P = new polymorphims();
		P.go(10,29);      // ���� ����� - 2 ������ ����������
		P.go("������ ");
		
	}

}
