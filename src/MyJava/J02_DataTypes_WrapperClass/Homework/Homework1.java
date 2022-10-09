package j02_DataTypes_WrapperClass.Homework;

public class Homework1 {

    public static void main(String[] args) {

        /*
        /* java escape special characters -> https://www.w3schools.com/java/java_strings_specchars.asp

	  \n (or \r): starts from a new line : metni bir alt satırdan itibaren yazdırır.
	          \t:  horizontal tab : metni yatayda 1 tab miktarı kaydırır.
	          \\: prints a back slash :\ (ters slash) yazdırır
	          \': prints single quote :' tek tırnak yazdırır.
	          \": prints double quote :"" Çift tırnak yazdırır.



        public static void main(String[] args) {
            //  Soru-1 :   konsola      "Hello ", "World  \ /"        seklinde yazdırınız


            // Soru-2 : Pazartesi kelimesini her harfini ayrı bir satira gelecek sekilde yazdırınız.


            //Soru-3 : "Java" ile hayat cok 'afilli'   yazdırınız


            //Soru-4 : "Basari" gayrete
            // 'asiktir'  yazdırınız sonraki "Clarusway ile java cok kolay ..." ifadesi  3 satır sonra ve satır basından 1 tab ileride yazılsın.


         */

        System.out.println("\"Hello \", \"World  \\ /\"");
        System.out.println("P\na\nz\na\nr\nt\ne\ns\ni");
        System.out.println("\"Java\" ile hayat cok \'afilli\'");
        System.out.println("\"Basari\" gayrete \n\'asiktir\'\n\n\n\n\t\"Clarusway ile java cok kolay ...\"");
        System.out.println("ilker \n180\n75\nsatranç ve müzik");

        /*
        TASK:
		 * Sadece System.out.println kullanarak bu işlemleri yapınız.
         *    Herhangi bir değişken kullanmayın.
         * 1. Adım : İsim ve Soyismiminizi ekrana yazdırın.
         * 2. Adım : Satır atlayarak boyunuzu ekrana yazdırın.
         * 3. Adım : Satır atlayarak kilonu ekrana yazdırın.
         * 4. Adım : Satır atlayarak hobilerinizi ekrana yazdırın.

	             OUTPUT :
	             Haluk Bilgin
	             190
	             99
	             Yuzme FUTBOL Java ...
		 */
        System.out.println("Ad Soyad : Haluk Bilgin\nBoy : 1,90 \nKilo : 99\nHobiler:  Yuzme FUTBOL Java ...");
    }
}
