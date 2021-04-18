Feature:Withdraw Cash from account
  In order to pay for my dialy expenses
  As an account holder
  I want to winthdraw cash

  Scenario: Withdraw Cash from account in credit
    Given  I have a balance of $100 in my account.
    When  I request $20
    Then $20 should be dispensed