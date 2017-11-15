Feature: Regression Test
  @priya
  Scenario: Mainmenu

    Given    user is on the HomePage
    When      user click mainmenu option
    And       user select special option from the mainmenu
    Then     user can see the special offers page
  @priya
  Scenario:   Apparell and Accessories page
    Given user is on the HomePage
    When user clicks on Apparell and Accessories
    And user clicks on Shoes
    Then user can navigate to the details of the product

  @priya
  Scenario: Product is on the Product Listing Page
    Given user is on the HomePage
    When  user clicks on the Books on the product category page
    And user clicks on paperback
    Then user can see the related products
  @priya
  Scenario: user is on search option
    Given user is on the HomePage
    When user Type MEN on the search textbox
    And user clicks on search icon
    Then user can navigate on product details page
  @priya
  Scenario: Facebook
    Given user is on the HomePage
    When user clicks on facebook icon on the homepage
    Then user can see the facebook home page

