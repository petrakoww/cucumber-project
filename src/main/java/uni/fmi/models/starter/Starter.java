package uni.fmi.models.starter;

import java.util.ArrayList;
import java.util.List;

import uni.fmi.models.*;

public class Starter {
	public List<User> usersDb = new ArrayList<>();
	public List<Topic> topicsDb = new ArrayList<>();
	public List<Role> rolesDb = new ArrayList<>();

	public Starter() {
		Role userRole = new Role("User");
		Role adminRole = new Role("Admin");
		rolesDb.add(userRole);
		rolesDb.add(adminRole);

		User user = new User("Username", "Password");
		User admin = new User("Admin", "AdminPass");
		admin.addRole(adminRole);
		usersDb.add(user);
		usersDb.add(admin);

		Topic topic = new Topic("Test Topic");
		Message message = new Message("Test Message", "Test Content", topic);
		Comment comment = new Comment("Test Comment", "Test Content", usersDb.get(0), message);
		topic.addMessage(message);
		message.addComment(comment);
		topicsDb.add(topic);
	}

	public Role getRole(String roles) {
		for (Role role : rolesDb) {
			if (role.getRole().equals(roles))
				return role;
		}
		return null;
	}

	public User getUser(String username, String password) {
		for (User user : usersDb) {
			if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return user;
			}
		}
		return null;
	}

	public Topic getTopic(User user, String name) {
		if (user == null || !usersDb.contains(user)) {
			return null;
		}
		for (Topic topic : topicsDb) {
			if (topic.getName().equals(name)) {
				return topic;
			}
		}
		return null;
	}

	public Message getMessage(User user, Topic topic, String title) {
		if (user == null || !usersDb.contains(user)) {
			return null;
		}
		if (topic == null || !topicsDb.contains(topic)) {
			return null;
		}
		for (Message message : topic.getMessages()) {
			if (message.getTitle().equals(title)) {
				return message;
			}
		}
		return null;
	}

	public String deleteMessage(User user, Topic topic, Message message) {
		if (user == null || !usersDb.contains(user)) {
			return "No user";
		}
		if (topic == null || !topicsDb.contains(topic)) {
			return "No topic";
		}
		if (message == null) {
			return "No message";
		}
		if (!user.getRoles().contains(getRole("Admin"))) {
			return "You are not admin";
		}
		boolean isDeleted = message.getTopic().getMessages().remove(message);
		return isDeleted ? "Success" : "Unsuccess";
	}


	
}
