import java.util.ArrayList;
import java.util.List;
public class DrivingManager {

	void displayDrivingLicenceList(){
		for (int i = 0; i < listDrivingLicence.size(); i++) {
			System.out.println("name "+ listDrivingLicence.get(i).name);
			System.out.println("numéro "+ i);
			if (listDrivingLicence.get(i).stateLicence) System.out.println("licence active"); 
			else if (!listDrivingLicence.get(i).stateLicence) System.out.println("licence inactive");			
			System.out.println("police d'assurance "+ listDrivingLicence.get(i).policy);
			System.out.println("expiration du permis "+ listDrivingLicence.get(i).expirationDate);
			listDrivingLicence.get(i).displayistVehicule();
		}
	}

	boolean addDrivingLicence(DrivingLicence newLicence) {
		if (listDrivingLicence.add(newLicence))
			return true;
		return false;
	}

	boolean deleteDrivingLicence(DrivingLicence licenceToDelete) {
		boolean flag = false;
		for (int i = 0; i < listDrivingLicence.size(); i++) {
			if (listDrivingLicence.get(i) == licenceToDelete) {				
				listDrivingLicence.remove(i);
				for (int j = 0; j < listDrivingLicence.size(); j++) 
					if (listDrivingLicence.get(i) == licenceToDelete) {					
						flag = false;
						break;
					}
			}
		}
		return flag;
	}
	
	
	String name;
	String policy;
	int expirationDate;	
	boolean stateLicence;
	List<String> listVehicule = new ArrayList<String>(); 
	List<DrivingLicence> listDrivingLicence = new ArrayList<DrivingLicence>(); 

}