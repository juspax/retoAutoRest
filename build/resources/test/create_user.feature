@All
Feature: create user in pet shop
  as user
  I want to create a user in the pet store
  To verify that the user was obtained successfully

  Background: register on the pet shop platform


  @CaseOne
  Scenario Outline: Validate user creation
    When creation of a user
      | <id> | <username> | <firstName> | <lastName> | <email> | <password> | <phone> | <userStatus> |
    Then verify user creation with status 200
    Examples:
      | id | username | firstName | lastName | email              | password | phone       | userStatus |
      | 23 | Juan23   | Camilo    | Penuela  | juanC1@yopmail.com | juan123  | 30012345678 | 0          |

  @CaseTwo
  Scenario Outline: Place an order for a pet
    When creation of a pet request
      | <id> | <petId> | <quantity> | <shipDate> | <status> | <complete> |
    Then check in the body of the Json contains "<status>" and the status is <statusCode>
    Examples:
      | id | petId | quantity | shipDate                 | status | complete |statusCode|
      | 7  | 7     | 7      | 2023-03-21T16:55:12.523Z | placed | true     |200       |
