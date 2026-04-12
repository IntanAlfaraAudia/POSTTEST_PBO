# ── ⋆⋅☆⋅⋆ Sistem Penjualan Perhiasan ⋆⋅☆⋅⋆ ──

### Posttest 4 - Praktikum Pemrograman Berorientasi Objek (PBO)

---

## Deskripsi Program

Program **Sistem Penjualan Perhiasan** adalah aplikasi berbasis **console** yang dibuat menggunakan bahasa pemrograman **Java** dengan menerapkan konsep **Object-Oriented Programming (OOP)**.

Program ini digunakan untuk mengelola data **perhiasan dan transaksi penjualan** dengan fitur **CRUD (Create, Read, Update, Delete)**.

Pada **Posttest 4**, program ini merupakan pengembangan dari Posttest sebelumnya dengan menambahkan konsep **Polymorphism**, yaitu:

* **Overloading**
* **Overriding**

Sehingga program menjadi lebih fleksibel, dinamis, dan terstruktur.

---

## (˶˃𐃷˂˶) Tujuan Program

Tujuan dari pembuatan program ini adalah:

* Menerapkan konsep **Inheritance**
* Menerapkan konsep **Polymorphism**
* Mengelola data perhiasan dan transaksi menggunakan konsep **OOP**

---

##  Konsep OOP yang Digunakan

### 🔹 Inheritance

Program menggunakan hubungan **is-a**:

* `Perhiasan` → superclass
* `Emas`, `Perak`, `Berlian` → subclass

Contoh:

```java
class Emas extends Perhiasan
```

---

### 🔹 Polymorphism

#### 1. Overloading (Static Polymorphism)

Method dengan nama yang sama tetapi parameter berbeda.

Contoh:

```java
public double hitungTotal(double harga, int jumlah)
public double hitungTotal(double harga, int jumlah, double diskon)
public double hitungTotal(double harga, int jumlah, double diskon, double pajak)
```

Digunakan untuk menghitung total transaksi dengan kondisi berbeda.

---

#### 2. Overriding (Dynamic Polymorphism)

Method dari superclass ditulis ulang di subclass.

Contoh:

```java
// superclass
public void tampilInfo()

// subclass
@Override
public void tampilInfo()
```

Penjelasan:

* Emas → menampilkan kadar
* Perak → menampilkan kualitas
* Berlian → menampilkan karat

---

## (˶˃𐃷˂˶) Penjelasan Class

### 1️⃣ Main.java

Class utama untuk menjalankan program dan menampilkan menu.

---

### 2️⃣ Perhiasan.java (Superclass)

Menyimpan data umum:

* ID
* Nama
* Jenis
* Harga
* Stok

Memiliki method:

* `tampilInfo()` → dioverride oleh subclass

---

### 3️⃣ Emas.java (Subclass)

Menambahkan atribut:

* Kadar emas

Menerapkan:

* Inheritance
* Overriding

---

### 4️⃣ Perak.java (Subclass)

Menambahkan atribut:

* Kualitas perak

Menerapkan:

* Inheritance
* Overriding

---

### 5️⃣ Berlian.java (Subclass)

Menambahkan atribut:

* Karat berlian

Menerapkan:

* Inheritance
* Overriding

---

### 6️⃣ Transaksi.java

Menyimpan data transaksi:

* ID transaksi
* Nama pembeli
* Nama perhiasan
* Jumlah
* Total

Menerapkan:

* Overloading pada method `hitungTotal()`

---

## (˶˃𐃷˂˶) Tipe Inheritance yang Digunakan

Program ini menggunakan **Hierarchical Inheritance**, yaitu:

Satu superclass (`Perhiasan`) memiliki lebih dari satu subclass:

* Emas
* Perak
* Berlian

---

## ദ്ദി Fitur Program

Program memiliki **7 fitur utama**, yaitu:

1. **Tambah Data Perhiasan**
   Menambahkan data perhiasan baru ke sistem

2. **Lihat Data Perhiasan**
   Menampilkan seluruh data perhiasan

3. **Update Data Perhiasan**
   Mengubah data perhiasan berdasarkan ID

4. **Hapus Data Perhiasan**
   Menghapus data perhiasan

5. **Transaksi Penjualan**
   Melakukan pembelian perhiasan

6. **Lihat Data Transaksi**
   Menampilkan data transaksi

7. **Keluar Program**
   Mengakhiri program

---

## (*ᴗ͈ˬᴗ͈)ꕤ*.ﾟ Tampilan Program

### 💎 Tambah Data Perhiasan

![Tambah Data Perhiasan](gambar/DataPerhiasan.png)

### 💎 Lihat Data Perhiasan

![Lihat Data Perhiasan](gambar/LihatDataPerhiasan.png)

Penjelasan:
Menampilkan data perhiasan dengan informasi tambahan berbeda pada setiap jenis.

👉 Ini membuktikan **Overriding (Polymorphism)**

---

### 💰 Transaksi Penjualan

![Transaksi](gambar/DataTransaksiPerhiasan.png)

Penjelasan:
Pengguna melakukan pembelian berdasarkan ID perhiasan.
Total dihitung menggunakan method `hitungTotal()`.

👉 Ini membuktikan **Overloading**

---

### 📊 Lihat Data Transaksi

![Data Transaksi](gambar/LihatDataTransaksi.png)

Penjelasan:
Menampilkan seluruh transaksi yang telah dilakukan.

---

## 📌 Penjelasan Tambahan

Walaupun tidak semua fitur ditampilkan dalam screenshot, fitur seperti:

* Tambah data
* Update data
* Hapus data

Tetap berjalan dengan baik dalam program.

---

## 📌 Perkembangan dari Posttest 3 ke Posttest 4

### Posttest 3:

* Menggunakan Inheritance

### Posttest 4:

* Ditambahkan Polymorphism:

  * Overriding pada `tampilInfo()`
  * Overloading pada `hitungTotal()`

---

## (๑ᵔ⤙ᵔ๑) Kesimpulan

Program ini berhasil mengimplementasikan konsep:

* Inheritance
* Polymorphism

---

## ₍^. .^₎Ⳋ 

Nama : Intan Alfara Audia
NIM : 2409106008
Kelas : A1 24

**Posttest 4 Praktikum Pemrograman Berorientasi Objek (PBO)**

---
