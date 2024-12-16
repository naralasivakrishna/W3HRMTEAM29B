Feature: Login Functionality

  @smoke
  Scenario: verify the login functionality with valid credential
    Given user open browser
    And user open the application
    When enter user Email id and password
    And user click the login button
    Then user should be login successfully completed
    And user should be w3hrm dash board page
