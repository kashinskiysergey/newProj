import java.util.ArrayList; //����������� ������ ArrayList � ����� DotCom


public class DotCom {//�������� ������ "�������"
	
	private ArrayList<String> locationCells;/*��������� ���������� locationCells 
	��� ������ ������ ArrayList �������� �������� 	���� String */
	
	String NameOfShip;// ���������� �������� ����� ��������
	
	
	public void setLocationCells(ArrayList<String> loc){/* ��������� ����� set c ����������
	���������� �������� locationCells */
		locationCells=loc;// �������� ������ ��������� �������� �� ���������� locationCells
	}
	public String checkYourself(String userInput){/* ��������� ����� get �� ��������� ����������
	 � ����� ������������� �������� String*/
		 
	 String result ="����";/* ��������� ��������� ���������� - ���������, �� ��������� �� ��������� "����" */
	 
	 int index = locationCells.indexOf(userInput);/* ��������� ������������� ����������
	 index ����� ���������  �������� ��������� ������� �� ������� � locationCells	 */
	 
	 if (index >=0){//��������� ���������
		 locationCells.remove(index);// �� ���������� locationCells ��������� �������� �� �������
		 if(locationCells.isEmpty()){/* (���������� ����� isEmpty() ���� ��������� ��� �� ������� ���������)
			 ���� arraylist ���� ��� ���� ������� ���������*/
			 
			 result = "�������";
		//	 System.out.println("�� ������� - " + NameOfShip);
			 }else{// ���� �� ���� ��� ���� ������ ���������
				 result = "�����";
		 }
	 }
	 return result;// ���������� ���������
	}
}
