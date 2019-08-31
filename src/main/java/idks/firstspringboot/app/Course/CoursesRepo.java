package idks.firstspringboot.app.Course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CoursesRepo extends CrudRepository<Courses, String> 	{
	public List<Courses> findByTopicId(String id);
}
