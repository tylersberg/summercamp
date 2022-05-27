package summercamp.app.record.hostrecord;

import java.time.ZonedDateTime;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import summercamp.app.user.User;

public class HostRecord {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	@OneToOne(optional=false)
	private User host;
	private ZonedDateTime start;
	private ZonedDateTime end;
	
	protected HostRecord() {}


}
