
public class book {

	// ������ ���� ������ ���� ������
	  String name;
	  String author;
	
	
	}

	
	 class bookTestDrive extends book{
	public static void main(String[] args){
		
		
		
	    book[]B = new book[3];// ������� ������ �� 3 ������
	    B[0] = new book();// ����� � ������ ������� ������ ���
	    B[1] = new book(); 
	    B[2] = new book();
	    
		B[0].name = "����� 1"; // ����� ������� �������� � ����� name
		B[1].name = "����� 11";  /** ������ ������������*/
		B[2].name = "����� 1111";
		
		B[0].author = "-- theMuny"; // ����� ������� �������� � ����� author
		B[1].author = "-- theMuny"; /** ������ ������������*/
		B[2].author = "-- theMuny";
		int x = 0; // ���������� ������� ��� �����
		while(x<3){ // ���� ������� ������� �� ������� ��� � ������ �������
			System.out.println(B[x].name+" " + " "+B[x].author );
			x++;
		}
	}
}