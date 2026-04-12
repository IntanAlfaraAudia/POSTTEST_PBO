# 💎 Sistem Penjualan Perhiasan (Java OOP)

## 📌 Deskripsi

Program ini merupakan aplikasi berbasis Java yang digunakan untuk mengelola data perhiasan dan transaksi penjualan. Program dibuat menggunakan konsep Object-Oriented Programming (OOP) dengan penerapan Inheritance dan Polymorphism.

---

## 🎯 Tujuan

1. Memahami konsep Inheritance dalam Java
2. Mengimplementasikan Polymorphism (Overriding & Overloading)
3. Membuat sistem sederhana berbasis OOP

---

## 🧩 Konsep OOP yang Digunakan

### 🔹 Inheritance

Class `Perhiasan` sebagai superclass diturunkan ke:

* `Emas`
* `Perak`
* `Berlian`

Relasi:

* Emas is a Perhiasan
* Perak is a Perhiasan
* Berlian is a Perhiasan

---

### 🔹 Polymorphism

#### Overriding (Dynamic Polymorphism)

Method:

```java
tampilInfo()
```

Setiap subclass memiliki isi method yang berbeda:

* Emas → menampilkan kadar
* Perak → menampilkan kualitas
* Berlian → menampilkan karat

---

#### Overloading (Static Polymorphism)

Method:

```java
hitungTotal()
```

Variasi:

* hitungTotal(harga, jumlah)
* hitungTotal(harga, jumlah, diskon)
* hitungTotal(harga, jumlah, diskon, pajak)

---

## ⚙️ Fitur Program

* Tambah data perhiasan
* Tampil data perhiasan
* Update data
* Hapus data
* Transaksi penjualan
* Tampil transaksi

---

## 📂 Struktur Project

```
src
│
└── PenjualanPerhiasan
    │
    ├── Main.java
    ├── Perhiasan.java      (Superclass)
    ├── Transaksi.java
    ├── Emas.java           (Subclass)
    ├── Perak.java          (Subclass)
    └── Berlian.java        (Subclass)
```

---

## ▶️ Cara Menjalankan Program

1. Buka project di IntelliJ / NetBeans
2. Jalankan file `Main.java`
3. Pilih menu sesuai kebutuhan

---

## 📸 Hasil Output

### 1. Menu Awal

Menampilkan menu utama program saat dijalankan.

### 2. Input Data Perhiasan

Menambahkan data minimal:

* 1 Emas
* 1 Perak
* 1 Berlian

Contoh input:

```
ID : P001
Nama : Kalung Emas
Harga : 1500000
Stok : 10
Kadar : 24
```

### 3. Tampil Data Perhiasan

Menampilkan seluruh data perhiasan.

Contoh output:

```
P001 Kalung Emas ...
Emas: Kadar 24K

P002 Gelang Perak ...
Perak: Kualitas Premium

P003 Cincin Berlian ...
Berlian: Karat 2
```

### 4. Transaksi

Melakukan pembelian perhiasan oleh user.

### 5. Tampil Data Transaksi

Menampilkan hasil transaksi.

Contoh:

```
T001 | Intan | Kalung Emas | 2 | 3000000
```

### 6. Polymorphism

Menampilkan perbedaan output method yang sama.

Contoh:

```
Emas:
Kadar 24K

Perak:
Kualitas Premium

Total tanpa diskon : 3000000
Total dengan diskon: 2900000
```

---

## 📌 Kesimpulan

Program ini berhasil menerapkan konsep Inheritance dan Polymorphism dengan baik. Method yang sama dapat menghasilkan output yang berbeda tergantung objek yang digunakan, sehingga program menjadi lebih fleksibel dan terstruktur.

---

## 👩‍💻 Author

Intan Alfara Audia
Informatika
