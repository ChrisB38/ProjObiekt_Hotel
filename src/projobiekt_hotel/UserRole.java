package projobiekt_hotel;

public enum UserRole {
	GUEST, EMPLOYEE, MANAGER;
	
	public static UserRole fromString(String name){
		if(name.toLowerCase().equals("manager"))
			return MANAGER;
		else if(name.toLowerCase().equals("employee"))
			return EMPLOYEE;
		else
			return GUEST;
	}
	
	public static String toString(UserRole role){
		if(role == MANAGER)
			return "manager";
		else if(role == EMPLOYEE)
			return "employee";
		else
			return "guest";
	}
}
