
public class inheritance {

	public int i;
		
	void set(int set){// ����� ������
		i = set;
	}
	public int get(){// ����� ������
	  return i;
	}
}
//................................................................

class inheritanceTestDrive extends inheritance{//������� �������� inheritanceTestDrive 
	public static void main(String[] args){
	  inheritanceTestDrive in = new inheritanceTestDrive();/*
	  �������� ������� ������ inheritanceTestDrive*/
	  
	  in.set(2525);// ���������� ������ �� ������ inheritance
	  in.get();    // ���������� ������ �� ������ inheritance
	  System.out.println(in.get());
	  
	}
}