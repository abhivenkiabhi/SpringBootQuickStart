package io.abhishek.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import io.abhishek.springbootstarter.topic.Topic;

@Entity
public class Course {
	
	@Id
	private String id;
	private String name;
	private String desc;
	@ManyToOne
	private Topic topic;

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public Course() {
		
	}
	
	public Course(String id, String name, String desc,String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.topic = new Topic(topicId,"","");
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	

}
