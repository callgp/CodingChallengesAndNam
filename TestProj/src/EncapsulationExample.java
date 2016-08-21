class CricketScorer{
	private int score=0;

	public int getScore() {
		return score;
	}

	public void addRuns(int score) {
		this.score = this.score+score;
	}
	
	public void six(){
		addRuns(6);
	}
	public void four(){
		addRuns(6);
	}
	public void printScore(){
		System.out.println("==="+score);
	}
}
public class EncapsulationExample {
public static void main(String[] args) {
	CricketScorer s=new CricketScorer();
	s.addRuns(44);
	s.addRuns(40);
	s.addRuns(8);
	s.six();
	s.four();
	s.printScore();
}
}
