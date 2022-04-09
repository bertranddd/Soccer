package main;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;





public class Main {
	Vector<Penyerang> dataStriker = new Vector<Penyerang>();
	Vector<Gelandang> dataMidFielder = new Vector<Gelandang>();
	Vector<Bek> dataDefender = new Vector<Bek>();
	Vector<Kiper> dataKiper = new Vector<Kiper>();
	
	
	Penyerang striker;
	Gelandang midfielder;
	Bek defender;
	Kiper keeper;
	
	String nama, club, position;
	int noPunggung, shooting, passing,skill, crossing, defending, goalkeeping;
	Scanner scanInt = new Scanner(System.in);
	Scanner scanStr = new Scanner(System.in);
	
	public Main() {
		int chooseMenu;
		do {
			System.out.println("1. View Pemain");
			System.out.println("2. Insert Pemain");
			System.out.println("3. Latih Pemain");
			System.out.println("4. Delete Pemain");
			System.out.println("5. Exit");
			System.out.print("Choose>> ");
			chooseMenu = scanInt.nextInt();
			switch (chooseMenu) {
			case 1:
				view();
				break;
			case 2:
				addPemain();
				break;
			case 3:
				train();
				break;
			case 4:
				delete();
				break;

			}
		} while (chooseMenu != 5);
	}
	
	private void train() {
        if(dataStriker.isEmpty()&&dataMidFielder.isEmpty()&&dataDefender.isEmpty()&&dataKiper.isEmpty()) {
            System.out.println("There is no player yet!");
            System.out.println("press enter...");
            scanStr.nextLine();
        }else {
            view();
            int index = 0;
			boolean flag = false;
			System.out.println("Insert nama to train : ");
			nama = scanStr.nextLine();
			for (Penyerang striker : dataStriker) {
				if (striker.getNama().equalsIgnoreCase(nama)) {
					flag = true;
					striker.latih();
					System.out.println("Sudah berlatih....");
					System.out.println("Silahkan Cek Kembali Attributnya");
					System.out.println("press enter...");
		            scanStr.nextLine();
					break;
				}
				index++;
			}
			index = 0;
			for (Gelandang mid : dataMidFielder) {
				if (mid.getNama().equalsIgnoreCase(nama)) {
					flag = true;
					mid.latih();
					System.out.println("Sudah berlatih....");
					System.out.println("Silahkan Cek Kembali Attributnya");
					System.out.println("press enter...");
		            scanStr.nextLine();
					break;
				}
				index++;
			}
			for (Bek bek : dataDefender) {
				if (bek.getNama().equalsIgnoreCase(nama)) {
					flag = true;
					bek.latih();
					System.out.println("Sudah berlatih....");
					System.out.println("Silahkan Cek Kembali Attributnya");
					System.out.println("press enter...");
		            scanStr.nextLine();
					break;
				}
				index++;
			}
			for (Kiper kiper : dataKiper) {
				if (kiper.getNama().equalsIgnoreCase(nama)) {
					flag = true;
					kiper.latih();
					System.out.println("Sudah berlatih....");
					System.out.println("Silahkan Cek Kembali Attributnya");
					System.out.println("press enter...");
		            scanStr.nextLine();
					break;
				}
				index++;
			}
			if (flag == false) {
				System.out.println("Weapon not Found!");
				System.out.println("Click Enter to Continue....");
				scanStr.nextLine();
			}
    }	
		
	}

	private void delete(){
        if(dataStriker.isEmpty()&&dataMidFielder.isEmpty()&&dataDefender.isEmpty()&&dataKiper.isEmpty()) {
            System.out.println("There is no player yet!");
            System.out.println("press enter...");
        }else {
            view();
            int index = 0;
			boolean flag = false;
			System.out.println("Insert nama to Remove : ");
			nama = scanStr.nextLine();
			for (Penyerang striker : dataStriker) {
				if (striker.getNama().equalsIgnoreCase(nama)) {
					flag = true;
					dataStriker.remove(index);
					break;
				}
				index++;
			}
			index = 0;
			for (Gelandang mid : dataMidFielder) {
				if (mid.getNama().equalsIgnoreCase(nama)) {
					flag = true;
					dataMidFielder.remove(index);
					break;
				}
				index++;
			}
			for (Bek bek : dataDefender) {
				if (bek.getNama().equalsIgnoreCase(nama)) {
					flag = true;
					dataDefender.remove(index);
					break;
				}
				index++;
			}
			for (Kiper kiper : dataKiper) {
				if (kiper.getNama().equalsIgnoreCase(nama)) {
					flag = true;
					dataKiper.remove(index);
					break;
				}
				index++;
			}
			if (flag == false) {
				System.out.println("Weapon not Found!");
				System.out.println("Click Enter to Continue....");
				scanStr.nextLine();
			}
    }	
}
	
private void addPemain() {
		do {
			System.out.print("Masukan Nama Pemain Baru [length 4-20]: ");
			nama = scanStr.nextLine();
		} while (nama.length() < 4 || nama.length() > 20);
		do {
			System.out.print("Masukan Nama Club Pemain Baru [length 4-20]: ");
			club = scanStr.nextLine();
		} while (club.length() < 4 || club.length() > 20);
		do {
			System.out.print("Masukan Shooting Poin Pemain Baru [1-99]: ");
			shooting = scanInt.nextInt();
		} while (shooting<1||shooting>99);
		do {
			System.out.print("Masukan Passing Poin Pemain Baru [1-99]: ");
			passing = scanInt.nextInt();
		} while (passing<1||passing>99);
		Random rand = new Random();
        noPunggung = rand.nextInt(10) + rand.nextInt(10);
		do {
			System.out.print("Masukan posisi pemain [depan|tengah|belakang|gawang]: ");
			position = scanStr.nextLine();
		} while (!position.equalsIgnoreCase("depan") && !position.equalsIgnoreCase("tengah") && !position.equalsIgnoreCase("belakang")
				&& !position.equalsIgnoreCase("gawang"));
		if(position.equalsIgnoreCase("depan")) {
			do {
				System.out.print("Masukan Skill Poin Pemain Baru [1-99]: ");
				skill = scanInt.nextInt();
			} while (skill<1||skill>99);
			striker = new Penyerang(nama, noPunggung, club, shooting, passing, skill);
			dataStriker.add(striker);
		}else if(position.equalsIgnoreCase("tengah")){	
			do {
				System.out.print("Masukan Crossing Poin Pemain Baru [1-99]: ");
				crossing = scanInt.nextInt();
			} while (crossing<1||crossing>99);
			midfielder = new Gelandang(nama, noPunggung, club, shooting, passing, crossing);
			dataMidFielder.add(midfielder);
		}else if(position.equalsIgnoreCase("belakang")) {
			do {
				System.out.print("Masukan Defending Poin Pemain Baru [1-99]: ");
				defending = scanInt.nextInt();
			} while (defending<1||defending>99);	
			defender = new Bek(nama, noPunggung, club, shooting, passing, defending);
			dataDefender.add(defender);
		}else if(position.equalsIgnoreCase("gawang")) {
			do {
				System.out.print("Masukan GoalKeeping Poin Pemain Baru [1-99]: ");
				goalkeeping = scanInt.nextInt();
			} while(goalkeeping<1||goalkeeping>99);
			keeper = new Kiper(nama, noPunggung, club, shooting, passing, goalkeeping);
			dataKiper.add(keeper);
		}
		
	}
	
	private void view() {
		
		System.out.println("List Pemain\n");
		System.out.println("====================================");
		System.out.println("Penyerang");
		System.out.println("====================================");
		for (Penyerang striker : dataStriker) {
			System.out.println( "Nama        : " + striker.getNama());
			System.out.println( "No Punggung : " + striker.getNoPunggung());
			System.out.println( "Position    : " + striker.getPosition());
			System.out.println( "Tugas       : " + striker.getTugas());
			System.out.println( "Club        : " + striker.getClub());
			System.out.println( "Shooting    : " + striker.getShooting());
			System.out.println( "Passing     : " + striker.getPassing());
			System.out.println( "Skill       : " + striker.getSkill());
			System.out.println("====================================\n");
		}

		System.out.println("====================================");
		System.out.println("Gelandang");
		System.out.println("====================================");
		for (Gelandang mid : dataMidFielder) {
			System.out.println( "Nama        : " + mid.getNama());
			System.out.println( "No Punggung : " + mid.getNoPunggung());
			System.out.println( "Position    : " + mid.getPosition());
			System.out.println( "Tugas       : " + mid.getTugas());
			System.out.println( "Club        : " + mid.getClub());
			System.out.println( "Shooting    : " + mid.getShooting());
			System.out.println( "Passing     : " + mid.getPassing());
			System.out.println( "Defense     : " + mid.getCrossing());
			System.out.println("====================================\n");
		}

		System.out.println("====================================");
		System.out.println("Bek");
		System.out.println("====================================");
		for (Bek back : dataDefender) {
			System.out.println( "Nama        : " + back.getNama());
			System.out.println( "No Punggung : " + back.getNoPunggung());
			System.out.println( "Position    : " + back.getPosition());
			System.out.println( "Tugas       : " + back.getTugas());
			System.out.println( "Club        : " + back.getClub());
			System.out.println( "Shooting    : " + back.getShooting());
			System.out.println( "Passing     : " + back.getPassing());
			System.out.println( "Defense     : " + back.getDefending());
			System.out.println("====================================\n");
		}
		
		System.out.println("====================================\n");
		System.out.println("Kiper");
		System.out.println("====================================");
		for (Kiper keeper : dataKiper) {
			System.out.println( "Nama        : " + keeper.getNama());
			System.out.println( "No Punggung : " + keeper.getNoPunggung());
			System.out.println( "Position    : " + keeper.getPosition());
			System.out.println( "Tugas       : " + keeper.getTugas());
			System.out.println( "Club        : " + keeper.getClub());
			System.out.println( "Goalkeeping : " + keeper.getGoalKeeping());
			System.out.println("====================================\n");
		}
		
	}

	public static void main(String[] args) {
		new Main();
	}

}
