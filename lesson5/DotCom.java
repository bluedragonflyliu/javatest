import java.util.ArrayList;

public class DotCom{
	//private int numOfHits= 0;
	private ArrayList<String> locationCells;
	public void setLocationCells(ArrayList<String> loc) {
		locationCells = loc;
	}
	public String checkYourSelf(String stringGuess) {
		int guess = Integer.parseInt(StringGuess);
		String result = "miss";
		int index = locationCells.indexof(userInput)
		/*
		for(int cell : locationCells) {
			if(guess == cell) {
				result = "hit";
				numOfHits++;
				break;
			}_
		}
		if(numOfHits == locationCells.length) {
			result = "kill"
		}
		*/
		if(index >=0 ) {
			locationCells.remove(index);
			if(locationCells.isEmpty()){

			}
		}
		
		System.out.println(result);
		return result;
	}
}