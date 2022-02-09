package uni.fmi.models;

import java.util.HashSet;
import java.util.Set;

public class User {
	private String username;
    private String password;
    private Set<Role> roles = new HashSet<>();
    private Set<Comment> comments = new HashSet<>();
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.roles.add(new Role("User"));
    }

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

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

    public void addRole(Role role) {
        this.roles.add(role);
    }

    public void setComments(Set<Comment> comments) {
        this.comments = comments;
    }

    public Set<Comment> getComments() {
        return comments;
    }

    public void createComment(Comment comment) {
        this.comments.add(comment);
    }
}