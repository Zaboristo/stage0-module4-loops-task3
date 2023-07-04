package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String number = "";
        number += t;
        int res = 0;
        for(int i = 0; i<number.length();i++){
            if(number.charAt(i) == '-')
                i++;
            res += number.charAt(i) - 48;
        }
        System.out.println(res);
    }
}
