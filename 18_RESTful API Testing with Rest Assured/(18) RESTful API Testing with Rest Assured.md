Summary.md
RESTful API Testing with Rest Assured
Rian Syahmulloh H

Konsep API
User diberikan request ke pelayan lalu kepada chef (server/system) kemudian akan diberi respon ke pelayan, lalu dari pelayan kepada pelanggan/user.

Fundamental API
Test Process
    1.Record define API information = definisikan API yg kita test
    2.Parsing, filter, or recording API Data And then extract
    3.Reconstruction API Calls, and sent them from a simulate client
    4.Test validation


Test Piramid
    jumlah test akan berkurang kalau naik kategori. semakin ke atas, semakin berkurang testnya. karena biaya yang semakin mahal.
    1.UI = yang paling dekat dgn interaksi pengguna.
    2.Integration = pengujian dari hasil penggabungan banyak unit di software.
    3.Component = pengujian apa dilakukan baik perkomponen individu ataupun secara terpisah
    4.Unit = nguji tiap komponen, pada masa pengembangan/penulisan kode program. dilakukan oleh dev. di testnya method, function, prosedur, object dll. supaya bisa berjalan.