package main;

import java.util.Random;

public class Penyerang extends Pemain{
	Random rand = new Random();
	private String position;
    private String tugas;
    private int skill;

    public Penyerang(String nama, int nopunggung, String club, int shooting, int passing, int skill) {
        super(nama, nopunggung, club, shooting, passing);
        // TODO Auto-generated constructor stub
        this.position = "depan";
        this.tugas = "mencetak goal";
        this.skill = skill;
    }

	public String getPosition() {
		return position;
	}
	
	
	public int getSkill() {
		return skill;
	}


	public String getTugas() {
		return tugas;
	}

	@Override
	void latih() {
		// TODO Auto-generated method stub
		this.skill = skill + rand.nextInt(10) + super.getShooting()/10;
	}

    
    
}
