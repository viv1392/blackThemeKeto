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
    And user selects how he spends days
    Then user selects life style preferences 
    And user delects which diseases applies on her
    Then user selects how tall she is <cm>
    And user selects curr weight in lbs
    Then user selects target weight in lbs
    And user selects her age
    Then user selects as no event
    And user enters her email
    Then user on plan pages selects plan
    Examples:
    |cm |
    |129| 
    |130| 
    |175| 
    |190| 
    |220| 
    
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
    And user selects how he spends days
    Then user selects life style preferences
    And user delects which diseases applies on her
    When user selects height in Feet and inches <feet> and <inch>
    And user selects curr weight in lbs
    Then user selects target weight in lbs
    And user selects her age
    Then user selects as no event
    And user enters her email
    Then user on plan pages selects plan
    
     Examples:
    |feet | inch |
    | 2   | 09   |
    |03   | 11   |
    | 4   | 09   |
    | 5   | 10   |
    | 6   | 01   |
    | 7   | 00   | 
    
    @WomenRegistrationVegan
    Scenario Outline: Women registration vegan
    Then user selects gender female
    And user selects current body type as average
    Then user selects target body type as bulk
    And user selects what she wants to achieve
    Then user selects target zones
    And user selcts last happy time zone
    Then user selects meal preparation time
    And user on meat page selects diet type as vegan herself
    Then user selects veggis as eat all
    And user selects all items in other food items
    Then user selects activity level
    And user selects how he spends days
    Then user selects life style preferences
    And user delects which diseases applies on her
    Then user selects in static manner height
    And user selects current weight in lbs in flexible manner <lb>
    Then user selects target weight in lbs instatic manner
    And user selects her age
    Then user selects as no event
    And user enters her email
    Then user on plan pages selects plan
    
     Examples:
    |lb    |
    | 083  | 
    | 099  |
    | 180  |
    | 250  | 
    | 210  | 
    | 480  | 
    
     @WomenRegistrationNonVegVariableTargetWeight
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
    And user selects how he spends days
    Then user selects life style preferences 
    And user delects which diseases applies on her
    Then user selects in static manner height
    And user enters curr weight in lbs in static manner
    Then user enters target weight in lbs in flexible manner <lbs>
    And user selects her age
    Then user selects as no event
    And user enters her email
    Then user on plan pages selects plan
    Examples:
    |lbs|
    |089| 
    |093| 
    |170| 
    |200| 
    |250| 
    
     @WomenRegistrationNonVegAgeTesting
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
    And user selects how he spends days
    Then user selects life style preferences 
    And user delects which diseases applies on her
    Then user selects in static manner height
    And user selects curr weight in lbs
    Then user selects target weight in lbs
    And user selects her age in flexible mannaer <yrs>
    Then user selects as no event
    And user enters her email
    Then user on plan pages selects plan
    Examples:
    |yrs|
    |17 | 
    |18 | 
    |28 | 
    |38 | 
    |49 | 
    |60 |
    |61 |
    
    @WomenRegistrationVeganCurrWeightTestingKg
    Scenario Outline: Women registration vegan
    Then user selects gender female
    And user selects current body type as average
    Then user selects target body type as bulk
    And user selects what she wants to achieve
    Then user selects target zones
    And user selcts last happy time zone
    Then user selects meal preparation time
    And user on meat page selects diet type as vegan herself
    Then user selects veggis as eat all
    And user selects all items in other food items
    Then user selects activity level
    And user selects how he spends days
    Then user selects life style preferences
    And user delects which diseases applies on her
    Then user selects in static manner height
    And user enters current weight in kg in flexible manner <kg>
    Then user enters targeted weight in kg in static manner
    And user selects her age
    Then user selects as no event
    And user enters her email
    Then user on plan pages selects plan
    
     Examples:
    | kg   | 
    | 040  |
    | 099  | 
    | 110  | 
    | 180  | 
    | 190  | 
    
     @WomenRegistrationNonVegVariableTargetWeightTestInKG
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
    And user selects how he spends days
    Then user selects life style preferences 
    And user delects which diseases applies on her
    Then user selects in static manner height
    And user selects curr weight in kg in static manner
    Then user selects target weight in kg in flexible manner <KG>
    And user selects her age
    Then user selects as no event
    And user enters her email
    Then user on plan pages selects plan
    Examples:
    |KG  |
    |083 | 
    |093 | 
    |170 | 
     
   
     
    