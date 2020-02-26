package io.mtech.basic

class LoopingInGrtoovy {
    static  void main(String[] args){
        whileLoop()
        println()
        forLoop()
        println()
        forInLoop()
    }
/*While Loop*/
    private static void whileLoop() {
        def count = 0;
        while (count < 5) {
            count++;
            print("${count} ")
        }
    }
   /* For loop */
    private static void forLoop(){
        int count;
        for(count=0; count<5; count++) {
            print count+" "
        }
    }
    /*For in loop*/
    private  static void forInLoop(){
        int[] array = [1,2,3,4,5,6]
        for (int i in array){
            print("${i} ")
        }
    }
}
