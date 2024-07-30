Feature: Getting Text from the Flipcart page

  Scenario: Verify the text that should present in bottom of page
    Given User launch flipkart application
    When User can get text from Flipkart page
    And user should verify the text by assertion
    Then user can close the webpage

  Scenario: Verify all the list of products present in page
    Given User launch flipkart application
    When User can get text from Flipkart page
    And user should verify the text by assertion
    Then user can close the webpage

  Scenario Outline: Take Screenshot of Add to cart module
    Given User launch flipkart application
    When User search "<search product>"
    And User select the Product from search results
    Then User Moves to new window and click add to cart on the selected product
    When User switch in to search result page and select another product
    Then User Moves to new window and click add to cart on the second selected product
    When User switch in to search result page and Click Cart Option
    Then User get Screenshot on this page

    Examples: 
      | browser type | search product |
      | browser      | Apple 15       |
