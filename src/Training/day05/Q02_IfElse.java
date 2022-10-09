package Training.day05;

public class Q02_IfElse {
    /*
    60 değerinde bir int oluşturun.
    Eğer int 9'a bölününce kalan 0 ise ve 5 e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın.
    Eğer int 4'a bölününce kalan 0 ise ve 5 e bölününce kalan 0 ise "Able to divide by 4 and 5" yazdırın.

    */
    public static void main(String[] args) {

        int a=60;
        if (a%9==0 && a%5==0) {
            System.out.println("Able to divide by 9 and 5");
        }
        else if (a%4==0 && a%5==0){
            System.out.println("Able to divide by 4 and 5");
        }
        else System.out.println("it is not convenient any conditionals");

    }
}
