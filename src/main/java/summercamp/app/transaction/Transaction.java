
package summercamp.app.transaction;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import summercamp.app.account.Account;
import summercamp.app.user.User;

@Entity
public class Transaction {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@OneToOne
	private User authorizedBy;
	@ManyToOne
	private Account recipient;
	@ManyToOne
	private Account sender;
	private BigDecimal amount;

	protected Transaction() {}

	public BigDecimal getBalance() {
		return amount;
	}

	public void setBalance(BigDecimal balance) {
		this.amount = balance;
	}

	public User getAuthorizer() {
		return authorizedBy;
	}

	public Account getRecipient() {
		return recipient;
	}

	public Account getSender() {
		return sender;
	}

}
