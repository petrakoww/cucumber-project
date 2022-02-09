package uni.fmi.models;

public class Comment {

	private String title;
	private String content;
	private User user;
	private Message message;

	public Comment(String title, String content, User user, Message message) {
        this.title = title;
        this.content = content;
        this.user = user;
        this.message = message;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}