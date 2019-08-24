Feature: test extent with multiple examples as tests


@ExtentTest 
Scenario Outline: test multiple examples 

	Given i call service one "<Testname>"
	Then i call service two "<Testname>"
	Then i call service three "<Testname>"
	
	Examples: 
		|Testname|
		|test1	 |
		|test2	 |
		|test3	 |