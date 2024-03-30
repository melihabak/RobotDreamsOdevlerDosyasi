Feature: Demoqa cucumber birinci odev gpt

  @birinciTest
  Scenario: Goruntulenen mesaji okuma gpt

    Given Open the browser and navigate to the demoqa website
    When Click on the 'Buttons' element
    And Click on the 'Click Me' button
    Then Verify the displayed message
    And Close the browser