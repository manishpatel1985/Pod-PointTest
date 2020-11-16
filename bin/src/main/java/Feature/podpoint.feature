Feature: User checks and verify pod-point price while not eligable to claim the dealership discount



    Scenario: User checks and verify pod-point 7kw unit price for Mitsubishi Outlander

      Given User navigate to pod-point check out page
      Given User selects Mitsubishi Outlander as a Car Model
      And   User selects not eligible to claim dealership discount
      Then  User selects connection type as Universal Socket
      Then User selects power rating price for seven kilowatt unit

      Then User checks six compatible extras are shown and select any compatible extra
      Then User Verify/Ensure total price at the bottom right of the screen matches correctly


