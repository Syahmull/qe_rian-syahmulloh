# Summary.md
# Post Processor
# Rian Syahmulloh

Post processor = bagian dari test plan yang merupakan sebuah aksi yang berjalan saat proses setelah di lakukan.
Proses sendiri maksudnya proses request ke sebuah alamat web
Proses yg dilakukan ini berfungsi untuk mengekstrak value  yang di dapat dari akses alamat web. Seperti data JSON

Post prosesor yg bisa di gunakan yaitu JSON extractor.  Pada tempat ini kita bisa gunakan json path untuk mengambil nilai yg terdapat pada data json yg di hasilkan dari respons saat request.

Aturan dalam JSON Path untuk ekstraksi JSON
    $=root element  (seluruh data json yg di dapat adalah$)
    . = ingin acxes cild dalam object
    [] = ambil child array dengan index
    .. = operasi reqursif. Mengambil objek dalam array
    *= akses secara keseluruhan
    [start:end]= memotong array dari index sekian sampai sekian.