
public class Clock {
	//������� � �������
	String time;
	
	void settime(String t){
		time = t;
		
	}
	 String gettime(){	/*� ������� ��� ������������� ��������	  
	      ������� �����
		  ����������� ������ */
		
		return time;
	}
}
	class ClockTestDrive{
		public static void main(String[] args){
			Clock C = new Clock();
			C.settime("12:12");
			String tod = C.gettime();
			System.out.println("����� - " + tod);
		}
	}

