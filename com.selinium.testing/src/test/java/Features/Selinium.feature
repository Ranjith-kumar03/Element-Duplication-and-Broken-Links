#Author: your.email@your.domain.com
Feature: Selinium Learning

 

  Scenario Outline: Check Duplicate and Hidden Elements 
  Given Kndly open the sites "<website>"
    Then find elements in page
    Then close the webdriver

 

    Examples: 
      | website                |
      | https://www.amazon.in/ |

      

 

  Scenario Outline: Check Broken Links
  Given Kndly open the sites "<website>"
    Then check for broken links
    Then close the webdriver

 

    Examples: 
      | website                |
      | https://www.amazon.in/ |