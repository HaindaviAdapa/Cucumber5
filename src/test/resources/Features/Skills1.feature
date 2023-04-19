Feature: Automating Add skills in Orangehrm

Background: Common reusable steps
       Given User launch Chromebrowser
       Then User opens url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
       
Scenario: Create Skills Record
      When user logins with username as "Admin" and password as "admin123"
      Then Add skills with skillname as "Selenium" and Skill desc as "Selenium desc"
      And click on logout
      Then Close the browser
      
      Scenario: Create jobs Record
      When user logins with username as "Admin" and password as "admin123"
      Then Add jobs record with job title as "Manager" , Job desc as "Manager desc" and Job note as "Managers note"
      And click on logout
      Then Close the browser
      