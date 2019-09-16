import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "Player_Data")
public class Players {
	
	@Id
	private int sno;
	private FullName name;
	@Column(name = "player_ratings")
	private int ratings;
	private String country;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	
	public FullName getName() {
		return name;
	}
	public void setName(FullName name) {
		this.name = name;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Players(int sno, FullName name, int ratings, String country) {
		super();
		this.sno = sno;
		this.name = name;
		this.ratings = ratings;
		this.country = country;
	}
	public Players() {
		super();
	}
	@Override
	public String toString() {
		return "Players [sno=" + sno + ", name=" + name + ", ratings=" + ratings + ", country=" + country + "]";
	}
	
	
	

}
