
public class skyScraper extends Building{

	@Override//annotation override here we change method of superclass
	public int getHeight() {//change
		if(height>5){
		System.out.println(height+" - this is skyScraper");
		}else{
		System.out.println("Height = " + height+ " Look like not enoght for  skyScraper ;-)");
		}
		return height;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		skyScraper S = new skyScraper();// create new object 
		S.setHeight(3);//set stage in our building
		S.getHeight();// get stage in our building
		
	}

}
