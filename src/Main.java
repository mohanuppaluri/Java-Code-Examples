public class Main{

    public static void main(String[] args) {

        int m=0;

        System.out.println("Before the loop");

        while(m<4){

            System.out.println("Inside the loop");
            System.out.println("Value of the m " + m);
            m+=1;
        }

        System.out.println("After the loop");
    }
}