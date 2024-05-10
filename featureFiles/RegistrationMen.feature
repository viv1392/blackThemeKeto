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
    And user selects other custom foods for himself as non veg user
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
    |130     |89            |75          |25 |
    |184     |42            |75          |40 |
    |189     |86            |80          |25 |
    |166     |75            |66          |17 |
    |156     |80            |56          |18 |
    |195     |120           |90          |60 |
    |160     |86            |76          |61 |
    
     @menRegistrationVegan
   Scenario Outline: Men registration vegan
    Then user selects gender man
    And user selects current body type as extra
    Then user selects target body type as Bulk
    And user selects what he wants to achieve
    Then user selects his target zone
    And user selets his last happy time
    Then user selects his meal preparation time
    And usesr selects himself as vegan user
    Then user selects veggies he eats
    And user selects other custom vegan foods for himself
    Then user selects how active he is
    And user choses how he spends day
    Then user selects his lifestyle preferences
    And user selects whats apply for himself
    Then user enters his height in ft <Ft> and Inch <In>
    And user enters his current weight <CurrLbs>  in Lbs
    Then user enters his target weight <TarLbs> for achieving in lbs
    And user enters his current age <age>
    Then user selects his event
    And user enetrs his email
    Then user selects his plan
    
     Examples:
    | Ft |In    | CurrLbs      |TarLbs      |age|
    |2   |09    |120           |110         |32 |
    |03  |05    |190           |170         |46 |
    |4   |10    |198           |168         |25 |
    |05  |05    |220           |180         |40 |
    |5   |12    |240           |190         |25 |
    |6   |04    |260           |196         |36 |
    |7   |10    |180           |156         |18 |
    
    