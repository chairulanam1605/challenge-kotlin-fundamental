import java.awt.SystemColor.menu
import java.util.Scanner;

public var input = Scanner(System.`in`)

fun main() {
    //membuat objek scanner
    val input = Scanner(System.`in`)

    //Menginputkan Identitas
    println("================================")
    print("Nama: ")
    val nama: String? = input.nextLine()
    if(nama.isNullOrEmpty()){
        println("Harap diisi")
        main()
    }
    print("Kelas: ")
    val kelas: String? = input.nextLine()
    if(kelas.isNullOrEmpty()){
        println("Jangan Lupa Diisi")
        main()
    }
    print("Nomor Absen: ")
    val absen: String? = input.nextLine()
    println("=================================")
    println("\t")

    println("<<<<MENGHITUNG VOLUME BANGUN RUANG>>>>")
    println("1. Volume Balok")
    println("2. Volume Bola")
    print("Masukan Menu Pilihan : ")
    val menu = readLine()

    when (menu) {
        "1" -> {
            println("\t")
            println("<<<<Hitung Balok>>>>")
            println("=================================")
            print("Masukan Panjang Balok : ")
            val p: Double = input.nextDouble()
            print("Masukan Lebar Balok : ")
            val l: Double = input.nextDouble()
            print("Masukan Tinggi Balok : ")
            val t: Double = input.nextDouble()

            //menghitung Balok
            val vt: Double = p * l * t;

            //cetak hasil
            println("Volume Balok adalah = $vt ")
            println("=================================")

            //kembali ke menu
            println("Kembali ke menu [Y/N] : ")
            val next2 = readLine()
            if(next2=="Y" || next2=="y"){
                main()
            }
            else{
                println("Press Enter Key To Exit")
            }

        }
        "2" -> {
            println("\t")
            println("<<<<Hitung Bola>>>>")
            println("=================================")
            print("Masukan jari-jari Bola : ")
            val r: Double = input.nextDouble()

            //menghitung Bola
            val vb: Double = 4/3 * Math.PI * r * r * r;

            //cetak hasil
            println("Volume Bola adalah = $vb ")
            println("=================================")

            //kembali ke menu
            println("Kembali ke menu [Y/N] : ")
            val next1 = readLine()
            if(next1=="Y" || next1=="y"){
                main()
            }
            else{
                println("Press Enter Key To Exit")
            }

        }
        else-> {
            println("Menu Tidak Tersedia")
        }
    }
}