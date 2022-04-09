package main;

import java.util.Random;

public class Kiper extends Pemain{
	
	Random rand = new Random();
	int goalKeeping;
	String tugas;
    String position;

    public Kiper(String nama, int nopunggung, String club, int shooting, int passing,  int goalKeeping) {
        super(nama, nopunggung, club, shooting, passing);
        // TODO Auto-generated constructor stub
        this.goalKeeping = goalKeeping;
        this.position = "Gawang";
        this.tugas = "Menjaga gawang dari striker musuh";
    }

	public int getGoalKeeping() {
		return goalKeeping;
	}


	public String getTugas() {
		return tugas;
	}

	public String getPosition() {
		return position;
	}

	@Override
	void latih() {
		this.goalKeeping = goalKeeping + rand.nextInt(10);
		
	}
    
}
