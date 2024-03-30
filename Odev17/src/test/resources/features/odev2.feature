Feature: Demoqa cucumber ikinci odev

  @ikinciTest
  Scenario: Goruntulenen mesaji okuma

    Given Open the browser and navigate to the demoqa website now
    When Click on the 'Add' button to add a new record
    And Fill in the form fields with the following data
    Then Verify the name field
    And Close the browser now