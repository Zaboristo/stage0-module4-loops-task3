package school.mjc.stage0.loops.task3;

import org.w3c.dom.ls.LSOutput;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int res = 0;
        for(int i = 0; i<lengthOfLastNumber; i++){
            int count = 0;
            for (int j = 0; j<=i; j++){
                count = (count*10) + 9;
            }
            res += count;
            }
        System.out.println(res);
        }

    }
