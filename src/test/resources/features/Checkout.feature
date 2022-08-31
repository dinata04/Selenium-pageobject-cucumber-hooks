Feature: Checkout
 
  Scenario: User Chechout product
    When User go to web shop
    And User click button search
    And User enter product
    
    When User click product one
    And User select color
    And User select size
    And User click button add to chart
    Then User success add product one
    And User click view chart
    And User click button continue shopping
    
    When User click product two
    And User select color two
    And User select size two
    And User click button add to chart two
    Then User success add product two
		And User click view chart two
		
		When User click button checkout
		And User enter first name
		And User enter last name
		And User select region
		And User input address
		And User select city
		And User select province
		And User input postcode
		And User input phone
		And User input email
		And User ceklist term condition
		And User click button place order
		Then User success checkout
