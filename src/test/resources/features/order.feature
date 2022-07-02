@N11
Feature: Search and Favorite ADD/DELETE
  Scenario: As a customer, I should login to the site and search for a product and add it to my favorite list.
#@AC1 @N11
#  Scenario: As a customer, I should navigate to main and assert that I am on the main page
  Given User should navigate to url
  Then User should assert that land on main page
# @AC2 @N11
#   Scenario: As a customer, I should login with valid credentials
#    Given User should navigate to url
    Given User should click to "Giriş Yap"
    Then User should land login main page
    When User enters valid email and password
    Then User should assert that login is successful

# @AC1
#   Scenario: As a customer, I should search for a product
     Given User should click to search bar
     When User should write "Iphone" to the search bar
     Then User should click search button
     Then User should assert that search is successful
# @AC2
#   Scenario: As a customer, I should navigate "2" page
      Given User should click to "2" page
      Then User should assert that land on second page
# @AC3
#   Scenario: As a customer, I should add "3" product to favorite list
      Given User clicks on "3" product's favorite button
      Then User should see product added to favorite
# @AC4
#    Scenario: As a customer, I should navigate to favorite list
     Given User should hover over "Hesabım"
      When User clicks on "Favorilerim / Listelerim"
      Then User should assert that land on favorite list
      Then User should see favorite products
# @AC5
#     Scenario: As a customer, I should remove favorite product from favorite list
      Given User should click "Favorilerim" button
      Then User should see favorite products on favorite page
      When User clicks on product remove button
      Then User should assert that product is removed from favorite list
# @AC6
#  Scenario: As a customer, I should logout
    Given User should hover over "Hesabım"
    When User clicks on Çıkış Yap
    Then User should assert that logout is successful












