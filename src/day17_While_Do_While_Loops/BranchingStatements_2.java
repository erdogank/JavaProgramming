package day17_While_Do_While_Loops;

public class BranchingStatements_2 {
    public static void main(String[] args) {


        for (char i = 'A'; i <='E' ; i++) {

            if (i=='C'){
                //break;
                continue;//skip C
            }

            System.out.println(i);

        }
        System.out.println("************************");

        for (int i = 0; i <11 ; i++) {
            if(i%2==1){
                continue;
            }System.out.print(i+" ");

        }

    }
}
