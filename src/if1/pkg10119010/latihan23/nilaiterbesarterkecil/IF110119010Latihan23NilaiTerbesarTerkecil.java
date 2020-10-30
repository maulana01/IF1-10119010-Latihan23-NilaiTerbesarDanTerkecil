/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119010.latihan23.nilaiterbesarterkecil;

import java.util.Scanner;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF1
 * NIM      : 10119010
 * Deskripsi Program : Program ini berisi program untuk membandingkan nilai
 *                     terbesar dan terkecil
 */
public class IF110119010Latihan23NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
Scanner scanner = new Scanner(System.in);
        String namaPetugas;
        int banyaknyaNilaiMahasiswa;
        int nilaiMahasiswa[];
        int nilaiTerkecil = 0;
        int nilaiTerbesar = 0;

        System.out.println("=====Program Nilai Terbesar dan Terkecil Mahasiswa=====");
        System.out.print("Masukkan Nama Petugas : ");
        namaPetugas = scanner.nextLine();

        System.out.print("Masukkan Banyaknya Jumlah Nilai Mahasiswa : ");
        banyaknyaNilaiMahasiswa = scanner.nextInt();

        nilaiMahasiswa = new int[banyaknyaNilaiMahasiswa];

        for (int i = 0; i < banyaknyaNilaiMahasiswa; i++) {
            System.out.print("Masukkan Nilai Mahasiswa Ke-" + (i + 1) + " = ");
            nilaiMahasiswa[i] = scanner.nextInt();
        }

        System.out.println("\n=====Hasil Nilai Mahasiswa=====");
        nilaiTerkecil = nilaiMahasiswa[0];
        for (int i = 0; i < banyaknyaNilaiMahasiswa; i++) {
            System.out.println("Nilai Mahasiswa Ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);

            if (nilaiMahasiswa[i] < nilaiTerkecil) {
                nilaiTerkecil = nilaiMahasiswa[i];
            }

            if (nilaiMahasiswa[i] > nilaiTerbesar) {
                nilaiTerbesar = nilaiMahasiswa[i];
            }
        }

        System.out.println();
        System.out.println("Nilai Terbesar adalah " + nilaiTerbesar);
        System.out.println("Nilai Terkecil adalah " + nilaiTerkecil);

        System.out.println("\nPetugas : " + namaPetugas);
    }
    
}
