package summercamp.app.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String role;

	protected Role() {}

	public Role(String role) {
		this.role = role;
	}

	public String getRole() {
		return role;
	}
}
