Feature: Deleting message

Background:
Given Start

  Scenario: Success
    When Enter username: "Admin"
    And Enter password: "AdminPass"
    And Enter topic name: "Test Topic"
    And Enter message title: "Test Message"
    And Click delete
    Then Display message: "Success"

  Scenario: not admin
    When Enter username: "Username"
    And Enter password: "Password"
    And Enter topic name: "Test Topic"
    And Enter message title: "Test Message"
    And Click delete
    Then Display message: "You are not admin"

  Scenario: wrong user
    When Enter username: "Wrong"
    And Enter password: "WrongPass"
    And Enter topic name: "Test Topic"
    And Enter message title: "Test Message"
    And Click delete
    Then Display message: "No user"


  Scenario: wrong topic name
    When Enter username: "Admin"
    And Enter password: "AdminPass"
    And Enter topic name: "Wrong"
    And Enter message title: "Test Message"
    And Click delete
    Then Display message: "No topic"

  Scenario: wrong title
    When Enter username: "Admin"
    And Enter password: "AdminPass"
    And Enter topic name: "Test Topic"
    And Enter message title: "Wrong"
    And Click delete
    Then Display message: "No message"