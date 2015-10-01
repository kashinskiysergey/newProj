import java.util.*;
public class DotComBust {
	
	
	  private int numOfGuesses = 0;// ���������� ���������� �����
	  private ArrayList<DotCom> DotComList = new ArrayList<DotCom>(); //������� ArrayList - DotComlist
	  private GameHelper helper = new GameHelper();// ������� ������ ������  GameHelper
	  
	  
	  
	  void setUpGame(){
		  DotCom D1 =new DotCom();          // ������� ������ ������ DotCom
		  D1.NameOfShip = "������ �������"; // ����������� ��� ������� (�������)
		  DotCom D2 =new DotCom();
		  D2.NameOfShip = "������ �������";
		  DotCom D3 =new DotCom();
		  D3.NameOfShip = "������ �������";
				  
		  DotComList.add(D1);         // ���������� ������� DotCom � DotComList
		  DotComList.add(D2);
		  DotComList.add(D3);
		  
		  System.out.println("����: �������� 3 ������� � ����������� ����������� �����");/*
		  ������� �� ������� ������� ���������� � ����*/
		  
		  for(DotCom DotComToSet: DotComList){// ��������� � ������ �������� DotCom � DotComList'e
		  ArrayList<String> newLocation = helper.placeDotCom(3);// ����������� � helper'a ������ �������
		  DotComToSet.setLocationCells(newLocation);/* �������� ������ �� ������� DotCom
		  ����� �������� ��� ������������� ������ ������� ������ ��� �������� ��  ������� helper*/
		  }
	  }
	  
	  
	  
	  void startPlaying(){
		  while(!DotComList.isEmpty()){// �� ��� ��� ���� ������ �������� DotCom �� ������ ������
			  String userGuess = helper.getUserInput("�������� ���!!!");// �������� ���������������� ���
			  checkUsersGuess(userGuess);// �������� ����� �������� ���� ������
		  }
		  finishGame();// �������� ����� ������������� ����
	  }
	  
	  void checkUsersGuess(String userGuess){
		  
		  numOfGuesses++;//������������� ���������� ���������� �����		  
		  String result = "����";// ������� ��������� ��������� ���������� - ��������� ����		  
	      for(DotCom DotComToTest : DotComList){ //��������� � ������ �������� DotCom � DotComList'e
		  result = DotComToTest.checkYourself(userGuess);/*��������� ��� ������������ 
		  ���� ��������� ��� ���������� */
		  
		  if(result.equals("�����")){// ��� ������ ���.. ������ ����� ���� �� ������ �������
			  break;// ��������� ������� �� �����
		  }
		  if(result.equals("�������")){
			  DotComList.remove(DotComToTest);//������� ������ DotCom �� ������ DotComList
			  break;// ��������� ������� �� �����
		  }
	  }  
	  System.out.println(result);// ������� ��������� � ���
	  }
	  
	  void finishGame(){// ������� ����������� ��������� �� ��������� ����
		  System.out.println("��� ������� ���������!");
		  if(numOfGuesses<=18){
			  System.out.println("��� ������ � ���� �����" + numOfGuesses + "�������");
		  }else{
			  System.out.println("��� ������ � ���� ����� ������� � ������ 18 �������");
		  }
	  }

	
	public static void main(String[] args) {
		// ������ ���� � ������� ������

		DotComBust Bust = new DotComBust();// ������� ������� ������ 
		Bust.setUpGame(); // ��������� �����  ��� �� ���� � ����
		Bust.startPlaying();// 	��������� ������ ����
		
		
		
	}

}
