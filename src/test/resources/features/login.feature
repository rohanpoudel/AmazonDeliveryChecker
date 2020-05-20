@Login
Feature: Validate delivery availability on amazon prime now.
  
 @postcode_search
 Scenario: Check for delivery availability on amazon prime now.
   Given I am on the home page of amazon prime now "https://primenow.amazon.co.uk/"
   When I type in the post code - "G1 4RZ" and search
   And I select amazon as the provider
   Then I am validate the delivery availability banner