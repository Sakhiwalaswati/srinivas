package com.flp.fms.domain;

@Entity
public class Actor
{
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="actor_Id",nullable=false)
	private int actorId;
	
	@Column(name="First_Name",nullable=false)
	private String FirstName;
	
	@Column(name="Last_name",nullable=false)
	private String LastName;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = {CascadeType.ALL},mappedBy="Actor")
	private Set<Film> films=new HashSet<Film>();
	
	
	@Column(name="last_update",insertable = false, updatable = false,nullable=false,columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdate;
	public Actor()
	{
		
	}

	public int getActorId() {
		return actorId;
	}

	public void setActorId(int actorId) {
		this.actorId = actorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Film> getFilms() {
		return films;
	}

	public void setFilms(Set<Film> films) {
		this.films = films;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public String toString() {
		return "Actor [actorId=" + actorId + ", firstName=" + firstName + ", lastName=" + lastName + ", lastUpdate=" + lastUpdate + "]";
	}
}
