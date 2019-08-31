package idks.firstspringboot.app.Course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import idks.firstspringboot.app.Topic.Topics;

@Entity
public class Courses {
	
	@Id
	private String id;
	private String name;
	private String descrition;
	
	@ManyToOne
	private Topics topic;
	
	public Topics getTopic() {
		return topic;
	}

	public void setTopic(Topics topic) {
		this.topic = topic;
	}

	public Courses() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Courses(String id, String name, String descrition, String topicId) {
		super();
		this.name = name;
		this.id = id;
		this.descrition = descrition;
		//this.topic = new Topics(topicId,"","");
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDescrition() {
		return descrition;
	}
	public void setDescrition(String descrition) {
		this.descrition = descrition;
	}
	
	
}
