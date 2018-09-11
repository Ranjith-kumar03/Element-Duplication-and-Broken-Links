#Author: your.email@your.domain.com
Feature: Selinium Learning

 

  Scenario Outline: Check Duplicate and Hidden Elements
  Given Kndly open the site "<website>"
    Then find elements in pages
    Then close the driver

 

    Examples: 
      | website                |
      | https://www.amazon.in/ |

      

 

  Scenario Outline: Check Broken Links
  Given Kndly open the site "<website>"
    Then check for broken link
    Then close the driver

 

    Examples: 
      | website                |
      | https://www.amazon.in/ |