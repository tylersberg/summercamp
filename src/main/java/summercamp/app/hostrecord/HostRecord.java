package summercamp.app.hostrecord;

import java.time.ZonedDateTime;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import summercamp.app.user.User;

@Entity
public class HostRecord {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@OneToOne(optional=false)
	private User host;
	@OneToMany(mappedBy="hostRecord", cascade=CascadeType.ALL)
	Set<TipSplit> splits;
	private ZonedDateTime start;
	private ZonedDateTime end;
	
	protected HostRecord() {}

	public HostRecord(User host, ZonedDateTime start) {
		this.host = host;
		this.start = start;
	}

	public User getHost() {
		return host;
	}

	public Set<TipSplit> getSplits() {
		return splits;
	}

	public ZonedDateTime getStart() {
		return start;
	}

	public void setStart(ZonedDateTime start) {
		this.start = start;
	}

	public ZonedDateTime getEnd() {
		return end;
	}

	public void setEnd(ZonedDateTime end) {
		this.end = end;
	}
}
