Summary.md
Rian Syahmulloh 
Pengenalan RESTful API

API & REST API
    API = Sebuah penghubung antar aplikasi untuk saling berhubungan dan berbagi data. bertujuan untuk mempercepat proses development dengan fungsi terpisah.
    REST API = merupakan standard arsitektur komunikasi berbasis web yang sering di gunakan dan di terapkan. menggunakan HTTP untuk metode pertukaran data. 
    Jika API merupakan penghubung, maka REST API ini merupakan pengatur dalam sebuah web service.
        HTTP Methode = memungkinkan komunikasi antar client ke server.berfungsi sebagai protokol respons antar client dan server.
        GET = Mengambil informasi. tidak ada perubahan dalam mengambil dara
        PUT = menggganti atau memperbaiki data
        POST = Menngirim data baru 
        DELET = menghapus data yang sudah di tentukan
    Rest API Cipmponent
        Method 
        URL = kata kunci yang coba dilakukan ke server
        Header =  sekumpulan informasi yang di berikan bahwa pesan itu sah
        Body = parameter apa yang di kirim ke server
JASON(Java Script Object Notacion) = bahasa ideal pertukaran data pada aplikasi
HTTP Response Code.
    200 = Request sukses
    201 = sukses dan berhasil di buat
    400 = data tidak sesuai atau salah dalam format
    404 = resource ridak di temukan
    401 = karena tidak melakukan auntetifikasi
    405 =  salah http method
    500 = karena ada kesalahan di internal.

Testing API
    rangkaian test mengenai gambaran menganai respons dari aplikasi web tanpa GUI siap. bertujuan meluaskan cakupan testing yang kemudian di lakukan testing sedini mungkin
    Fungsionality = untuk memvalidasi suatufitur
    Load test = menguji kekuatan dari suatu system
    sucurity = menguji keamanan suatu sistem.

Unit test dilakukan developer. fungsi terpisah
API Test di uji oleh tester. end to end
