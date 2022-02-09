package uni.fmi.models;

import java.util.HashSet;
import java.util.Set;


public class Topic {
	private String name;
	private Topic mainTopic;
	private Set<Message> messages = new HashSet<>();

	public Topic(String name) {
        this.name = name;
        this.mainTopic = this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Topic getTopic() {
        return mainTopic;
    }

    public void setTopic(Topic mainTopic) {
        this.mainTopic = mainTopic;
    }

    public Set<Message> getMessages() {
        return messages;
    }

    public void setMessages(Set<Message> messages) {
        this.messages = messages;
    }

    public void addMessage(Message messages) {
        this.messages.add(messages);
    }
}