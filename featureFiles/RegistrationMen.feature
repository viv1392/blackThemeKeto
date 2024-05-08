Feature: keto balack theme
   Background:
   Given User goes on gender selection page after hitting given url
   @menRegistrationNonVeg
  Scenario Outline: Men registration non veg
    Then user selects gender man
    And user selects current body type as extra
    Then user selects target body type as Bulk
    And user selects what he wants to achieve
    Then user selects his target zone
    And user selets his last happy time
    Then user selects his meal preparation time
    And usesr selects himself as non veg
    Then user selects veggies he eats
    And user selects other custom foods for himself
    Then user selects how active he is
    And user choses how he spends day
    Then user selects his lifestyle preferences
    And user selects whats apply for himself
    Then user enters his height in cm <height>
    And user enters his current weight <currentWeight> in Kg
    Then user enters his target weight <targetWeight> in Kg
    And user enters his current age <age>
    Then user selects his event
    And user enetrs his email
    Then user selects his plan
    
    
    Examples:
    | height | currentWeight|targetWeight|age|
    |175     |098           |085         |32 |
    |195     |100           |075         |46 |
   