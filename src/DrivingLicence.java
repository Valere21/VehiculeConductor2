

public class DrivingLicence extends DrivingManager {

	DrivingLicence(){

	}

	DrivingLicence(String nom){
		this.name = nom;
	}

	DrivingLicence(String nom, String policeAssurance, int dateExpiration){
		this.name = nom;
		this.policy = policeAssurance;
		this.expirationDate = dateExpiration;				
	}
	
	void displayistVehicule() {
		for (int i = 0; i < listVehicule.size(); i++) {
			System.out.println(listVehicule.get(i));
		}
	}
	
	boolean changeFontPolicy(DrivingLicence licence, String newPolicy) {
		boolean flag = false;
		for (int i = 0; i < listDrivingLicence.size(); i++) {
			if (listDrivingLicence.get(i) == licence) {				
				listDrivingLicence.get(i).policy = newPolicy;
				if (listDrivingLicence.get(i).policy == newPolicy) {
					flag = true;
					break;
				}				
			}
		}
		return flag;
	}

	boolean deactiveDrivingLicence(DrivingLicence licence) {
		boolean flag = false;
		for (int i = 0; i < listDrivingLicence.size(); i++) {
			if (listDrivingLicence.get(i) == licence) {	
				if (listDrivingLicence.get(i).stateLicence)
					listDrivingLicence.get(i).stateLicence = false;
				if (!listDrivingLicence.get(i).stateLicence) {
					flag = true;
					break;
				}
			}
		}	
		return flag;
	}

	boolean renewDrivingLicence(DrivingLicence licence) {
		boolean flag = false;
		for (int i = 0; i < listDrivingLicence.size(); i++) {
			if (listDrivingLicence.get(i) == licence) {	
				if (!listDrivingLicence.get(i).stateLicence)
					listDrivingLicence.get(i).stateLicence = true;
				if (listDrivingLicence.get(i).stateLicence) {
					flag = true;
					break;
				}
			}
		}	
		return flag;
	}

	void addVehiculeToDrivingLicence(String vehicule){
		listVehicule.add(vehicule);
	}

	@SuppressWarnings("unused")
	void removeVehiculeToDrivingLicence(String vehicule){
		for (int i  = 0; i < listVehicule.size(); i++) {
			if (listVehicule.get(i) == vehicule)
				listVehicule.remove(i);
			return;
		}
	}
}