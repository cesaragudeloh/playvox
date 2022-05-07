#language:en
#author: César Agudelo H

  Feature: Get the cat information

    @HappyPath
    Scenario: Get the Votes Information
      Given the user wants to get the votes information
      When he executes the query
      Then the user gets the votes information