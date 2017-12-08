public class nested {

    private class user {
        private String nama = "umi";
        private int usia = 17;

        // private void proses() {
        //     System.out.println("Nama Saya: " + nama);
        //     System.out.println("Usia Saya: " + usia);
        // }
    }

    private class alamat {
        private String jalan = "raya pondok kelapa";
        private int nomor = 3;

        // private void prosesJl() {
        //     System.out.println("Jalan : " + jalan);
        //     System.out.println("Nomor : " + nomor);
        // }
    }

    public static void main(String[] args) {
        nested result = new nested();
        
        nested.user dataUser = result.new user();
        
        nested.alamat dataAlamat = result.new alamat();

        // dataUser.proses();
        // dataAlamat.prosesJl();
    }
}