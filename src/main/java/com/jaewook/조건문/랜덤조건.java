package com.jaewook.조건문;

import com.jaewook.마스터이;

public class 랜덤조건 {


    public String get홀짝(){
        // 조건문
        if(Math.random() > 0.5){
            return "홀";
        }else{
            return "짝";
        }
    }

    public static void main(String[] args) {
        랜덤조건 랜덤 = new 랜덤조건();
        System.out.println(랜덤.get홀짝());
    }


}
