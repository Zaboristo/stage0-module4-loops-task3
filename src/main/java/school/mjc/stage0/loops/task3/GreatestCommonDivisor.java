package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if(first == 0) {
            System.out.println(second);
            return;
        }
        if(second==0){
            System.out.println(first);
            return;
        }
        if(first>second){
            int divisor = second;
            while(!(first%divisor == 0 && second%divisor ==0)){
                divisor--;
            }
            System.out.println(divisor);
        }
        else {
            int divisor = first;
            while (!(second%divisor == 0 && first%divisor== 0)) {
                divisor--;
            }
            System.out.println(divisor);
        }
    }
}
