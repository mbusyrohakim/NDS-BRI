Feature: Personal Account Opening

  Scenario: PersonalAccountOpening
    Given user pilih kewarganegaraan
    When user pilih WNI
    Then user pilih jenis identitas utama
    And user pilih KTP
    And user input nomor identitas utama
    And user pilih KTP


