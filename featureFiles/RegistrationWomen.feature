Feature: keto balack theme
   Background:
   Given User lands on Gender Page after hitting url
   @WomenRegistrationNonVeg
  Scenario Outline: Women registration non veg
    Then user selects gender female
    And user selects current body type as volpotuous
    Then user selects target body type as fit
    And user selects what she wants to achieve
    Then user selects target zones
    And user selcts last happy time zone
    Then user selects meal preparation time
    And user on meat page selects diet type as non veg
    Then user selects veggis as eat all
    And user selects all items in other food items
    Then user selects activity level
    And user selects how she spends days
    Then user selects life style preferences 
    And user delects which diseases applies on her
    Then user selects how tall she is <cm>
    And user selects her curr weight in lbs <weightCurrLbs>
    Then user selects her target weight in lbs <weightTargetLbs>
    And user selects her age <yrs>
    Then user selects as no event
    And user enters her email
    Then user on plan pages selects plan
    Examples:
    |cm |weightCurrLbs|weightTargetLbs|yrs|
    |129| 210         |180            |23 |
    |130| 200         |170            |28 |
    |175| 240         |190            |33 |
    |190| 270         |220            |38 |
    |220| 210         |220            |42 |
    
    @WomenRegistrationVegetarian
    Scenario Outline: Women registration vegetarian
    Then user selects gender female
    And user selects current body type as average
    Then user selects target body type as bulk
    And user selects what she wants to achieve
    Then user selects target zones
    And user selcts last happy time zone
    Then user selects meal preparation time
    And user on meat page selects diet type as vegetarian
    Then user selects veggis as eat all
    And user selects all items in other food items
    Then user selects activity level
    And user selects how she spends days
    Then user selects life style preferences
    And user delects which diseases applies on her
    When user selects height in Feet and inches <feet> and <inch>
    And user selects her curr weight in kg <currKG>
    Then user selects her target weight in kg <tarKG>
    And user selects her age <yrs>
    Then user selects as no event
    And user enters her email
    Then user on plan pages selects plan
    
     Examples:
    |feet | inch |currKG|tarKG|yrs|
    | 2   | 09   |80    | 70  |20 |
    |03   | 11   |85    |74   |34 |
    | 4   | 09   |89    |75   |32 |
    | 5   | 10   |95    |80   |42 |
    | 6   | 01   |110   |95   |38 |
    | 7   | 00   |130   |100  |55 |
    
   
     
    