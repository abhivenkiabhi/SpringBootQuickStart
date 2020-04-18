package io.abhishek.springbootstarter.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String> {
	//object type and primary key type in CrudRepository
	//getAllTopics()
	//getTopic(String id)
	//updateTopic(Topic t)
	//deleteTopic(String id)
	
	public List<Course> findByTopicId(String topicId);
	
	

}
