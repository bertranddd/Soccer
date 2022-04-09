package main;

import java.util.Random;

public class Bek extends Pemain{
	
	Random rand = new Random();
	int defending;
	String tugas;
    String position;

    public Bek(String nama, int nopunggung, String club, int shooting, int passing, int defending) {
        super(nama, nopunggung, club, shooting, passing);
        // TODO Auto-generated constructor stub
        this.position = "Belakang";
        this.tugas = "Membantu Kiper dalam menjaga daerah belakang";
        this.defending = defending;

    }

	public int getDefending() {
		return defending;
	}

	public String getTugas() {
		return tugas;
	}

	public String getPosition() {
		return position;
	}

	@Override
	void latih() {
		this.defending = defending + rand.nextInt(10);
		
	}

    
    
}
