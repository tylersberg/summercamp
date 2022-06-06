package summercamp.app.account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import summercamp.app.transaction.Transaction;
import summercamp.app.user.User;

@Entity
public class Account {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private BigDecimal balance;
	@OneToOne
	private User user;
	@OneToMany(mappedBy="recipient")
	private List<Transaction> credits = new ArrayList<>();
	@OneToMany(mappedBy="sender")
	private List<Transaction> debits = new ArrayList<>();

	protected Account() {}

	public Long getId() {
		return id;
	}

	public User getUser() {
		return user;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

}
