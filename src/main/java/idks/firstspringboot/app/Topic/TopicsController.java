 package idks.firstspringboot.app.Topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


//@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TopicsController {
	
	@Autowired
	private TopicsService topicService;
	
	
	@GetMapping("/topics")
	public Page<Topics> getAllTopics(@PageableDefault(value=3)Pageable pageable){
		return topicService.getAllTopics(pageable);
	}
	
	@RequestMapping("/topics/{name}")
	public Topics getTopic(@PathVariable String name) {
		return topicService.getTopic(name);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topics topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@PathVariable Long id, @RequestBody Topics topic) {
		topicService.updateTopic(id,topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@PathVariable Long id) {
		topicService.deleteTopic(id);
	}
	
		
}
