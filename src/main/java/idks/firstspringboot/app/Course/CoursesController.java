 package idks.firstspringboot.app.Course;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import idks.firstspringboot.app.Topic.Topics;


@RestController
public class CoursesController {
	
	@Autowired
	private CoursesService courseService;
	
	
	@RequestMapping("/greet")
	public String greet() {
		return "Hello";
	}
	
//	@RequestMapping("/topics/{id}/courses")
//	public List<Courses> getAllCourses(@PathVariable String id){
//		return courseService.getAllCourses(id);
//	}
	
//	@RequestMapping("/topics/{topicsId}/courses/{id}")
//	public Courses getCourse(@PathVariable String id) {
//		return courseService.getCourse(id);
//	}
	
//	@RequestMapping(method=RequestMethod.POST, value="/topics/{topicsId}/courses")
//	public void addCourse(@RequestBody Courses course, @PathVariable String topicsId) {
//		course.setTopic(new Topics(topicsId,"",""));
//		courseService.addCourse(course);
//	}
	
//	@RequestMapping(method=RequestMethod.PUT, value="/topics/{topicsId}/courses/{id}")
//	public void updateCourse(@PathVariable String id, @RequestBody Courses course, @PathVariable String topicsId) {
//		course.setTopic(new Topics(topicsId,"",""));
//		courseService.updateCourse(course);
//	}
	
//	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{topicsId}/courses/{id}")
//	public void deleteCourse(@PathVariable String id) {
//		courseService.deleteCourse(id);
//	}
	
		
}
