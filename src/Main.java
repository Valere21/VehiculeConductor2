import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		DrivingManager manager = new DrivingManager();

		System.out.println("Quel nom de licence ?");
		DrivingLicence licence = new DrivingLicence(scan.next());
		
		licence.addVehiculeToDrivingLicence("Twingo");
		licence.addVehiculeToDrivingLicence("Ferrari");
		manager.addDrivingLicence(licence);
		manager.displayDrivingLicenceList();
		scan.close();

	
	}

}