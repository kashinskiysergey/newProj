
public class SeaFightDotCom {// ����� ��� ���� ������� ��� � �������� ������ Arraylist

	int[] locationCells;
	int numsOfHits = 0;
	
	public void setLocationCells(int[]locs){
		locationCells=locs;
	}
	public String checkYourself(String stringGuess){
		int guess = Integer.parseInt(stringGuess);
		String result = "����";
	
	
	for(int cell : locationCells){
		if(guess == cell){
			result = "�����";
			numsOfHits++;
			break;
		}		
	}
	if (numsOfHits == locationCells.length){
		result = "�������";
	}
	System.out.println(result);
	return result;
	}
}
