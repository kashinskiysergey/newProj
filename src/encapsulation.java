
public class encapsulation {
	
	private int i; //������ ����������� private

void set(int now){
	i=now;
}
  int get(){
	  return i;
  }
}


class encapsulationTestDrive {
	public static void main(String[] args){
		encapsulation en = new encapsulation();
		en.set(6);
		System.out.println(en.get()); // ��� ��� � �������� ������������, ����������
		//����� ������� ������ �� ������ ���
	}
}