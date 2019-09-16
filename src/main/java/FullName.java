import javax.persistence.Embeddable;


//This class is embedded with the entity class for passing first name and last name values for players_data table
@Embeddable
public class FullName {
	
	
	private String FirstName;
	private String LastName;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public FullName(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}
	public FullName() {
		super();
	}

}
