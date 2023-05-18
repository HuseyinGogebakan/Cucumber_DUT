Feature: orange data tabel
  Background: Orange page
    Given Orange page

  Scenario: datatable
    When enter credentials
    |Username|Password|
    |Admin   |admin123|


    Scenario:
      When  user credentials with errors verify
      |admin|admin_password| error_message|
      |Admin1|admin123!    |Invalid Credentials|
      |Admina | admin123a  |Invalid Credentials|
