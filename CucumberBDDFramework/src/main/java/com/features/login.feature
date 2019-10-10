Feature: Flipkart Login Page

# without Example keyword

#Scenario: Login Test Scenario
#Given 	User is already on Login Page
#When 	title of login page is flipkart
#Then 	user is enters "9916410879" and "SantosH@2020"
#Then 	user clicks on login button
#Then 	user is in User account page


# Using Examples keyword
Scenario Outline: Login Test Scenario
Given 	User is already on Login Page
When 	title of login page is flipkart
Then 	user is enters "<username>" and "<password>"
Then 	user clicks on login button
Then 	user is in User account page
Then 	close the browser

Examples:
| username | password |
| santosh  | test123 |
| 9916410879  | SantosH@2020 |
| jhdgh    | jknddh   |