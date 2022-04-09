package main;

import java.util.Random;

public class Gelandang extends Pemain{
	Random rand = new Random();
	private int crossing;
    private String tugas;
    private String position;
    
	public Gelandang(String nama, int noPunggung, String club, int shooting, int passing,int crossing) {
		super(nama, noPunggung, club, shooting, passing);
		this.tugas = "Membantu striker dalam menyerang";
		this.position = "Tengah";
		this.crossing = crossing;
	}

	public String getTugas() {
		return tugas;
	}

	public int getCrossing() {
		return crossing;
	}


	public String getPosition() {
		return position;
	}

	@Override
	void latih() {
		this.crossing += rand.nextInt(10) + super.getPassing()/20;
		
	}

    
    
}
