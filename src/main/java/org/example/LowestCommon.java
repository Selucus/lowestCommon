package org.example;

public class LowestCommon {
    int lowestCommon(int a, int b){
        int index = 0;
        while(true){
            if(a <= 0 || b <= 0){
                break;
            }
            if((a & 1) == (b & 1)){
                return index;
            }
            index++;
            a = a >> 1;
            b = b >> 1;
        }
        return -1;
    };
}
