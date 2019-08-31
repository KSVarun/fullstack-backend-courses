package idks.firstspringboot.app.Topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import idks.firstspringboot.app.Topic.TopicsRepo;
import idks.firstspringboot.app.Topic.Topics;

@Service
public class TopicsService {
	
	@Autowired
	private TopicsRepo topicRepo;
	
//	private List<Topics> topics = new ArrayList<>(Arrays.asList(
//			new Topics("Docker","idks/Docker","Docker rocks you should understand it well"),
//			new Topics("DS","DS AN","Long way to go")
//			));
	
	public Page<Topics> getAllTopics(Pageable pageable) {
//		
//		 
//		List<Topics> topics = new ArrayList<>();
//		topicRepo.findAll().forEach(topics::add);
		
		
		return topicRepo.findAll(pageable);
	}
	
	public Topics getTopic(String name) {
//	//	return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepo.findOneByName(name);
	}

	public void addTopic(Topics topic) {
		topicRepo.save(topic);
		
	}

	public void updateTopic(Long id,Topics topic) {
	//	for (int i=0; i < topics.size(); i++) {
	//		Topics t = topics.get(i);
	//		if(t.getId().equals(id)){
	//			topics.set(i, topic);
	//			return;
	//		}
	//	}
		topicRepo.save(topic);
		
	}

	public void deleteTopic(Long id) {
//	//	topics.removeIf(t -> t.getId().equals(id));
		topicRepo.delete(id);
	}
}
