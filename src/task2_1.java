/**
 * Created by Eugene on 07.07.2016.
 */
public class task2_1 {
    public static void main (String[] args){
        getSumm(0,100,2);
        getSumm2(100,2);
        getSumm3(0,100,3);
        getSumm4(100,3);
        getSumm5(0,100,5);
        getSumm6(100,5);
        getSumm7(0,100,7);
        getSumm8(100,7);

    }
   public static void getSumm(int start, int end, int fraction){
       int summ = 0;
                System.out.println("Кратные 2");
        for(int i = 0; i <end; i++){
            if(i%fraction==0){
                summ+=i;
            }
        }
        System.out.println(summ);
return;

    }
    static void getSumm2(int end, int fraction){
        for(int i = 0; i <end; i++){
            if(i%fraction==0){
                System.out.print(" "+i);

            }
        }
        System.out.println("");
    }
    static void getSumm3(int start, int end, int fraction){
        int summ = 0;
        System.out.println("Кратные 3");
        for(int i = 0; i <end; i++){
            if(i%fraction==0){
                summ+=i;

            }
        }
        System.out.println(summ);

    }
    static void getSumm4(int end, int fraction){
        for(int i = 0; i <end; i++){
            if(i%fraction==0){
                System.out.print(" "+i);

            }
        }
        System.out.println("");
    }
    static void getSumm5(int start, int end, int fraction){
        int summ = 0;
        System.out.println("Кратные 5");
        for(int i = 0; i <end; i++){
            if(i%fraction==0){
                summ+=i;

            }
        }
        System.out.println(summ);

    }
    static void getSumm6(int end, int fraction){
        for(int i = 0; i <end; i++){
            if(i%fraction==0){
                System.out.print(" "+i);

            }
        }
        System.out.println("");
    }
    static void getSumm7(int start, int end, int fraction){
        int summ = 0;
        System.out.println("Кратные 7");
        for(int i = 0; i <end; i++){
            if(i%fraction==0){
                summ+=i;
            }
        }
        System.out.println(summ);
    }
    static void getSumm8(int end, int fraction){
        for(int i = 0; i <end; i++){
            if(i%fraction==0){
                System.out.print(" "+i);

            }
        }
        System.out.println("");
    }
    public static void sum7DivSum2 (){
//        System.out.println(summ1 / summ7);
    }
}
