package idks.firstspringboot.app.Topic;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TopicsRepo extends JpaRepository<Topics, Long> 	{
	Topics findOneByName(String name);
}



