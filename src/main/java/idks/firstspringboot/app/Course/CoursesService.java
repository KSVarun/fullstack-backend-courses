package idks.firstspringboot.app.Course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idks.firstspringboot.app.Topic.TopicsRepo;
import idks.firstspringboot.app.Topic.Topics;

@Service
public class CoursesService {
	
	@Autowired
	private CoursesRepo coursesRepo;
	
	//private List<Topics> topics = new ArrayList<>(Arrays.asList(
	//		new Topics("Docker","idks/Docker","Docker rocks you should understand it well"),
	//		new Topics("DS","DS AN","Long way to go")
	//		));
	
//	public List<Courses> getAllCourses(String id) {
//		List<Courses> courses = new ArrayList<>();
//		coursesRepo.findByTopicId(id).forEach(courses::add);
//		
//		return courses;
//	}
	
//	public Courses getCourse(String id) {
//	//	return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
//		return coursesRepo.findOne(id);
//	}
//
//	public void addCourse(Courses course) {
//		coursesRepo.save(course);
//		
//	}
//
//	public void updateCourse(Courses course) {
//	//	for (int i=0; i < topics.size(); i++) {
//	//		Topics t = topics.get(i);
//	//		if(t.getId().equals(id)){
//	//			topics.set(i, topic);
//	//			return;
//	//		}
//	//	}
//		coursesRepo.save(course);
//		
//	}
//
//	public void deleteCourse(String id) {
//	//	topics.removeIf(t -> t.getId().equals(id));
//		coursesRepo.delete(id);
//	}
}
