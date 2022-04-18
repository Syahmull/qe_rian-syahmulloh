summary.md
Review Web UI Testing with Serenity
Rian Syahmulloh


Serenity BDD merupakan library open source yang membantu tester dalam menulis automation acceptance test yang terstruktur dan lebih terawat dengan baik dan juga menghasilkan laporan pengujian yang kaya makna (yang biasa dikenal dengan istilah “living documentation” atau dokumentasi hidup) yang tidak hanya melaporkan pada hasil pengujian, tetapi juga fitur apa yang telah diuji.

Serenity BDD memiliki arsitektur sebagai
berikut:
    Pages
    Steps
    Requirments
    Test
    Report

BBD Framework with cucumber.
    JBehave = frame fork untuk bdd yang di tulis dalam bahasa java dan memiliki beberapa kelebihan bdd merupakan pengembangan dari bdd. Frame work ini tersedia hanya dalam bahasa java.
    Ada 5 Langkah dalam JbeHace
        1. Write Story = membuat scenario dalam bahasa gherkin
            Given = initial condition
            When = aksi yang akan di lakukan
            Then = untuk validasai
        2. Configure Stories = menentukan tes mana yang akan di jalankan
        3. Browser Interaction = melakukan maping story yang dilakukan dengan logic automationdengan java
        4. Run Stories = jalankan story dengan menggunakan junit atau maven
        5. View Reports

