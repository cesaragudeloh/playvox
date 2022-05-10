#language:en
#author:cesar.agudelo.h@gmail.com

Feature: Customize your dream journey to space

  Scenario: Trying to buy a ticket to travel to a planet in space
    Given that Cesar enter the Space and Beyond web site
      | username | password    |
      | cesar123 | clave_sitio |
    When he enters the data to buy the ticket to travel to space
      | name          | emailAddress    | socialSecurityNumber | phoneNumber |
      | Cesar Agudelo | cesar@gmail.com | 443-87-0636          | 18009359935 |
    Then ticket purchase is successful