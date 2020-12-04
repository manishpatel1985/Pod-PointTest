$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("podpoint.feature");
formatter.feature({
  "line": 1,
  "name": "User checks and verify pod-point price while not eligable to claim the dealership discount",
  "description": "",
  "id": "user-checks-and-verify-pod-point-price-while-not-eligable-to-claim-the-dealership-discount",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigate to pod-point checkout page",
  "keyword": "Given "
});
formatter.match({
  "location": "PodpointJourney.user_navigate_to_pod_point_checkout_page()"
});
formatter.result({
  "duration": 8478850500,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User checks and verify pod-point 7kw unit price for Mitsubishi Outlander",
  "description": "",
  "id": "user-checks-and-verify-pod-point-price-while-not-eligable-to-claim-the-dealership-discount;user-checks-and-verify-pod-point-7kw-unit-price-for-mitsubishi-outlander",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "User selects Mitsubishi Outlander as a Car Model",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User selects not eligible to claim dealership discount",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User selects connection type as Universal Socket",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User selects power rating price for seven kilowatt unit",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User checks six compatible extras are shown and select any compatible extra",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User Verify/Ensure total price at the bottom right of the screen matches correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "PodpointJourney.user_selects_Mitsubishi_Outlander_as_a_Car_Model()"
});
formatter.result({
  "duration": 613392900,
  "status": "passed"
});
formatter.match({
  "location": "PodpointJourney.user_selects_not_eligible_to_claim_dealership_discount()"
});
formatter.result({
  "duration": 1455310200,
  "status": "passed"
});
formatter.match({
  "location": "PodpointJourney.user_selects_connection_type_as_Universal_Socket()"
});
formatter.result({
  "duration": 2854823700,
  "status": "passed"
});
formatter.match({
  "location": "PodpointJourney.user_selects_power_rating_price_for_seven_kilowatt_unit()"
});
formatter.result({
  "duration": 3307647100,
  "status": "passed"
});
formatter.match({
  "location": "PodpointJourney.user_checks_six_compatible_extras_are_shown_and_select_any_compatible_extra()"
});
formatter.result({
  "duration": 3632560800,
  "status": "passed"
});
formatter.match({
  "location": "PodpointJourney.user_Verify_Ensure_total_price_at_the_bottom_right_of_the_screen_matches_correctly()"
});
formatter.result({
  "duration": 5002105700,
  "status": "passed"
});
});