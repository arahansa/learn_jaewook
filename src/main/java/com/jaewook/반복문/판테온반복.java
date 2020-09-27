package com.jaewook.반복문;

import com.jaewook.마스터이;

public class 판테온반복 {

    int 체력 = 100;
    int 공격횟수 = 0;
    int 공격력 = 10;

    void 공격(마스터이 마스터이구현객체){
        System.out.println("판테온이 마스터이를 공격합니다.");
        마스터이구현객체.체력 = 마스터이구현객체.체력 - 공격력;
        System.out.println("판테온이 공격을할때마다 숫자가 늘어나?");
        공격횟수 = 공격횟수+1;
    }

    public static void main(String[] args) {
        마스터이 마스터이1=new 마스터이();
        마스터이1.현재상태();

        판테온반복 판테온1=new 판테온반복();

        while (판테온1.공격횟수 < 10) {
            판테온1.공격(마스터이1);
        }

        마스터이1.현재상태();
        판테온1.공격횟수출력();
    }

    private void 공격횟수출력() {
        System.out.println("판테온공격횟수"+공격횟수);
    }
}
