Summary.md
Behaviour Driven Development
Rian Syahmulloh H

Apa itu BDD?
    -TDD = penulisan tes case sebelum dev menuliskan codenya.
    -BDD => serupa dengan TDD, namun mamiliki fokus berbeda. kemudian muncil secenario yang akan di jelaskan pada behaviour sistem dari perspektif pengguna.

    -bertujuan untuk meningkatkan komunikasi dan kolaborasi antara seluruh stakeholder, tim bisnis maupun teknikal yang terlibat dlm pengembangan sistem.

    -prinsipnya mendeskripsikan behaviour dari sebuah sistem tampa melibatkan penjelasan implementasinya secara rinci. 

    -pada BDD, seluruh stakeholder, baik teknikal maupun non teknikal saling berkolaborasi untuk mendeskripsikan kebutuhan pengguna dan functional sistem melalui feature files.

BDD Format
    feature files ditulis menggunakan bahasa gherkin.non teknikal juga dapat memahami logic tersebut.
    -begitu pula sebaliknya, teknikal juga dapat memahami proses bisnisnya.
    -ada 3 tahapan tes BDD
        1.menentukan user story untuk menjelaskan kebutuhan pengguna dan functional system yg diharapkan. (As a (role) i want to (need), so that ()...))
        2.menuliskan scenario dalam feature files menggunakan  gherkin. sebuah feature file ada 1 atau lebih scenario yg menjelaskan apa aja yang harus dilakukan oleh sistem dalam durasi tertentu. 
        -ada 3 element utama, given, when (tindakan oleh user), then (outcome yg dihasilkan)
        3.mengimplementasikan tes script berdasarkan scenario.

-contoh
Feature: Search text as a user : Search So that I can search another account

  Scenario: As user i can search another account
    Given I am on a home page
    When I click search bar
    And I type another acount at search bar
    And I press my enter buttom
    Then I directed to another page with account data

Apa itu cucumber?
    -untuk melakukan serangkaian behaviour test, terdapat tools cucumber
    -cucumber adalah tools yg mendukung BDD
    -cucumber membaca ketentuan yg bisa dieksekusi,
    -ketentuan tersebut terdiri dari beberapa scenario.
    -selanjutnya membuat scenario dari serenity BDD