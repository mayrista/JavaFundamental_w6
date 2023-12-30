package com.juaracoding;

public class DataSoal3 {
    public static void main(String[] args) {
        String[] trailers = {
                ":T1:202112SOAL3:T2:SOAL3/2112/AB000000011 OD:0001234500CDE5432100 SOAL003 ABCDE12345 XAS SKILL TEST ESSAY.DT",
                ":T1:202111SOAL3:T2:SOAL3/2111/BC000011100 OD:0003452100EFG2451300 SOAL003 EFGHI25134 XAS SKILL TEST ESSAY.DT",
                ":T1:202110SOAL3:T2:SOAL3/2110/DE210031010 OD:0001524300HIJ2145300 SOAL003 JKLMN52431 XAS SKILL TEST ESSAY.DT"
        };

        for (String trailer : trailers) {
            String[] parts = trailer.split(":T2:");
            String trailerPart1 = parts[1].substring(18 * 2);  // Ambil karakter dari indeks ke-36 sampai akhir untuk Trailer 3, 4, 5
            String trailerPart2 = parts[1].substring(0, 18 * 2);  // Ambil karakter dari awal sampai indeks ke-36 untuk Trailer 1 dan 2
            String modifiedTrailer =  parts[0] + "\n:T2:" + trailerPart1 + trailerPart2;
            System.out.println(modifiedTrailer);
        }
    }
}
