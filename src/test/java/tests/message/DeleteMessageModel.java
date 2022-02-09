package tests.message;

import uni.fmi.models.*;
import uni.fmi.models.starter.Starter;

public class DeleteMessageModel {
    private String username;
    private String password;
    private String topicName;
    private String messageTitle;
    private String displayMessage;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getAnnouncementTitle() {
        return messageTitle;
    }

    public void setAnnouncementTitle(String announcementTitle) {
        this.messageTitle = announcementTitle;
    }

    public String getMessage() {
        return displayMessage;
    }

    public void setMessage(String message) {
        this.displayMessage = message;
    }

    public void clickDeleteButton() {
        Starter service = new Starter();
        User user = service.getUser(username, password);
        Topic topic = service.getTopic(user, topicName);
        Message announcement = service.getMessage(user, topic, messageTitle);
        displayMessage = service.deleteMessage(user,topic, announcement);
    }
}
