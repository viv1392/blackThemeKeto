Feature: Keto black Theme
Background:
   Given User lands on gender page after hitting landing url

  @userRegistrationNonVeg
  Scenario Outline: User registration for black theme Women
  Then User selects user gender as Women
  And User selects user body as volputuous
  Then User selects body type user wants
  And User choose what he wants achieve
  Then User choose target zone
  And User choses when user were last happy
  Then User Selects meal preparation time
  When User selects diet type meat
  And User choses all veggies to eat
  Then User choses All other foods to eat
  When User selects activity one two times a week
  Then User selects his day how it goes
  And User selects lifestyle preferences
  When User selects None diseases
  Then User selects height in Cm
  And User eneters current weight in <lbs>
  Then User eneters target weight in <lbs1>
  And User enters valid age
  Then User selects event as NO
  And User enters valid email
  Then User goes plan page and click on chose plan button
  
   Examples: 
      | lbs | lbs1 |
      | 099 | 090 |
      |210  | 180 |
      
      
    @userRegistrationVeg
  Scenario Outline: User registration for black theme Man
  Then User selects user gender as Man
  And User selects user body as Extra
  Then User selects body type user wants
  And User choose what he wants achieve
  Then User choose target zone
  And User choses when user were last happy
  Then User Selects meal preparation time
  When User selects diet Veg
  And User choses all veggies to eat
  Then User choses All other foods to eat
  When User selects activity one two times a week
  Then User selects his day how it goes
  And User selects lifestyle preferences
  When User selects None diseases
  Then User selects height in ft
  And User current weight in kg <kg>
  Then User target weight in kg  <kg1>
  And User enters valid age
  Then User selects event as NO
  And User enters valid email
  Then User goes plan page and click on chose plan button
  
   Examples: 
      | kg  | kg1|
      | 095 | 080|
      | 100 | 90 | 
