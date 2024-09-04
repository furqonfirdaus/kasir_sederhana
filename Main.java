import java.util.Scanner;
    public class Main
    {
    public static void main(String[] args)
    {
        try (//      System.out.println("SELAMAT DATANG DI RESTAURANT Eror 404!");
    Scanner scan = new Scanner (System.in)) {
        int total, jumlah;
        int nomerMenu;
        int price = 0;
        int makanMinum;
        
        
        System.out.println("==SELAMAT DATANG DI RESTORANT Eror 404!==");
        System.out.println("1. Makan");
        System.out.println("2. Minum");
        for (String i = "Y"; i.equals("Y")||i.equals("y"); ){ //perulangan untuk melakukkan pemesanan lagi atau tidak
        System.out.print("Silahkan Pilih nomer menu : "); //print mencetak ke samping
        makanMinum = scan.nextInt(); //digunakan untuk menscan jawaban kita 
        if(makanMinum== 1){
            System.out.println("=====Restaurant Eror 404!=====");
            System.out.println("Ayam");
            System.out.println("1.Ayam Goreng Kremes-------------Rp.18.000");
            System.out.println("2.Ayam Bakar---------------------Rp.18.000");
            System.out.println("3.Ayam rica-rica-----------------Rp.20.000");
            System.out.println("4.Ayam Geprek--------------------Rp.15.000");
            System.out.println("5.Ayam Serundeng-----------------Rp.18.000");
            System.out.println("Bebek");
            System.out.println("6.Bebek Tulang Lepas-------------Rp.19.000");
            System.out.println("7.Bebek Geprek-------------------Rp.16.000");
            System.out.println("8.Bebek Bakar--------------------Rp.20.000");
            System.out.println("9.Bebek Rica-rica----------------Rp.22.000");
            System.out.println("Seafood");
            System.out.println("10.Kerang Asam Manis-------------Rp.12.000");
            System.out.println("11.Udang Asam Manis--------------Rp.15.000");
            System.out.println("12.Cumi Asam Manis---------------Rp.17.000");
            System.out.println("Nasi");
            System.out.println("13.Nasi Putih--------------------Rp.5.000");
            System.out.println("14.Nasi Merah--------------------Rp.7.000");
            System.out.println("15.Nasi Goreng Spesial-----------Rp.17.000");
            System.out.println("16.Nasi Goreng Bebek-------------Rp.18.000");
            System.out.println("17.Nasi Goreng Seafood-----------Rp.20.000");
            System.out.println("Menu Tambahan");
            System.out.println("18.Tahu Goreng/Bakar-------------Rp.5.000");
            System.out.println("19.Tempe Goreng/Bakar------------Rp.5.000");
            System.out.print("Silahkan Pilih Nomor Menu : ");
            nomerMenu = scan.nextInt();
            switch (nomerMenu){
                case 1:
                    int menuMakanA = 18000;
                    System.out.println("Anda memilih Ayam Goreng Kremes Rp.18.000");
                    price = price + menuMakanA;
                    
                    break;
                case 2:
                    int menuMakanB = 18000;
                    System.out.println("Anda memili Ayam Bakar Rp.18.000");
                    price = price + menuMakanB;
                    
                    break;
                case 3:
                    int menuMakanC = 20000;
                    System.out.println("Anda memilih Ayam rica-rica Rp.20.000");
                    price = price + menuMakanC;
                    
                    break;
                case 4:
                    int menuMakanD = 15000;
                    System.out.println("Anda memilih Ayam Geprek Rp.15.000");
                    price = price + menuMakanD;
                    
                    break;
                case 5:
                    int menuMakanE = 18000;
                    System.out.println("Anda memilih Ayam Serundeng Rp.18.000");
                    price = price + menuMakanE;
                    break;
                case 6:
                    int menuMakanF = 19000;
                    System.out.println("Anda memilih Bebek Tulang Lepas Rp.19.000");
                    price = price + menuMakanF;
                    break;
                case 7:
                    int menuMakanG = 16000;
                    System.out.println("Anda memilih bebek geprek Rp.16.000");
                    price = price + menuMakanG;
                    break;
                case 8:
                    int menuMakanH = 20000;
                    System.out.println("Anda memilih Bebek Bakar Rp.20.000");
                    price = price + menuMakanH;
                    break;
                case 9:
                    int menuMakanI = 22000;
                    System.out.println("Anda memilih Bebek Rica-rica Rp.22.000");
                    price = price + menuMakanI;
                    break;
                case 10:
                    int menuMakanJ = 12000;
                    System.out.println("Anda memilih Kerang Asam Manis Rp.12.000");
                    price = price + menuMakanJ;
                    break;
                case 11:
                    int menuMakanK = 15000;
                    System.out.println("Anda memilih Udang asam manis Rp.15.000");
                    price = price + menuMakanK;
                    break; 
                case 12:
                    int menuMakanL = 17000;
                    System.out.println("Anda memilih Cumi Asam Pedas Rp.17.000");
                    price = price + menuMakanL;
                    break;
                case 13:
                    int menuMakanM = 5000;
                    System.out.println("Anda memilih Nasi putih Rp.5.000");
                    price = price + menuMakanM;
                    break;
                case 14:
                    int menuMakanN = 7000;
                    System.out.println("Anda memilih Nasi Merah Rp.7.000");
                    price = price + menuMakanN;
                    break;
                case 15:
                    int menuMakanO = 17000;
                    System.out.println("Anda memilih Nasi goreng spesial Rp.17.000");
                    price = price + menuMakanO;
                    break;
                case 16:
                    int menuMakanP = 18000;
                    System.out.println("Anda memilih Nasi goreng bebek Rp.18.000");
                    price = price + menuMakanP;
                    break;
                case 17:
                    int menuMakanQ = 20000;
                    System.out.println("Anda memilih Nasi goreng Seafood Rp.20.000");
                    price = price + menuMakanQ;
                    break;
                case 18:
                    int menuMakanR = 5000;
                    System.out.println("Anda memilih Tahu Goreng/Bakar Rp.5.000");
                    price = price + menuMakanR;
                    break;
                case 19:
                    int menuMakanS = 5000;
                    System.out.println("Anda memilih Tempe goren/bakar Rp.5000");
                    price = price + menuMakanS;
                    break;
                
                    
                }
            }
            if(makanMinum== 2){
        System.out.println("=====Restaurant Eror 404!=====");
        System.out.println("1.Jus Wortel---------------------Rp.6.000");
        System.out.println("2.Sakura Fizz--------------------Rp.10.000");
        System.out.println("3.Teh Manis Hangat/Dingin--------Rp.5.000");
        System.out.println("4.Orange Jus---------------------Rp.7.000");
         System.out.println("5.milo--------------------------Rp.10.000");
        System.out.println("Note: Air Putih GRATISS!!");
        
            
            System.out.print("Silahkan Pilih Nomor Menu : ");
            nomerMenu = scan.nextInt();
            switch (nomerMenu){
                case 1:
                    int menuMinumA = 6000;
                    System.out.println("Anda memilih Jus Wortel Rp.6.000");
                    price = price + menuMinumA;
                    
                    break;
                case 2:
                    int menuMinumB = 10000;
                    System.out.println("Anda memilih Sakura Fizz Rp.10.000");
                    price = price + menuMinumB;
                    
                    break;
                case 3:
                    int menuMinumC = 5000;
                    System.out.println("Anda memilih Teh Manis Anget/Dingin Rp.5.000");
                    price = price + menuMinumC;
                    
                    break;
                case 4:
                    int menuMinumD = 7000;
                    System.out.println("Anda memilih Orange Jus Rp.7.000");
                    price = price + menuMinumD;
                    
                    break;
                    
                 case 5:
                    int menuMinumE = 10000;
                    System.out.println("Anda memilih Milo Rp.10.000");
                    price = price + menuMinumE;
                    break;
                    
                }
            }
            System.out.print(" Masukan Jumlah Pesanan = ");
               jumlah = scan.nextInt();{
               System.out.println();
//            User diperintahkan untuk memilih lagi atau tidak
                System.out.println("Apakah anda mau melanjutkan? Y/T");
                i = scan.next();
            }
            {
            total = price*jumlah; // melakukan proses perhitungan dari nilai
            System.out.println("_______________________");
            System.out.println("Total pembayaran sebesar " +total+".");
            System.out.println("Terimakasih atas kunjungannya.");
        }
}
    }
}
}