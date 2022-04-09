package main;

public abstract class Pemain {

	private String nama;
    private int noPunggung;
    private String club;
    private int shooting;
    private int passing;

    public Pemain(String nama, int noPunggung, String club, int shooting, int passing) {
        this.nama = nama;
        this.noPunggung = noPunggung;
        this.club = club;
        this.shooting = shooting;
        this.passing = passing;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNoPunggung() {
        return noPunggung;
    }

    public void setNopunggung(int noPunggung) {
        this.noPunggung = noPunggung;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getShooting() {
        return shooting;
    }

    public void setShooting(int shooting) {
        this.shooting = shooting;
    }

    public int getPassing() {
        return passing;
    }

    public void setPassing(int passing) {
        this.passing = passing;
    }

    abstract void latih();

}
