Feature: Inventory functionalities
  Scenario Outline:stock inventory
   Given I have a stock inventory
   When I place <stock> sell order
   Then I will get the <result>
    
        Examples: 
           | stock   | result  |
    		   |     100 | success |
    		   |     500 | fail    |
    		   |     101 | fail    |
           |     99  | success |