package com.jaewook;

public class 김재욱팔 {

    // 변수들 (상태를 저장할 수 있다)
    int 길이 = 10;
    String 이름;
    String 상태 = "힘없다";

    // 메서드들 ( 기능을 정의함 )
    public void 현재상태는(){
        System.out.println(이름+":"+상태);
    }

    public void 현재길이는(){
        System.out.println(이름+"의 현재길이:"+길이);
    }

    public void 자라나라(){
        System.out.println(이름+"가 자라났다");
        길이 = 길이 + 5;
    }
    // main 이라는 특수한 메서드
    public static void main(String[] args) {
        System.out.println("sorry");

        김재욱팔 왼팔 = new 김재욱팔();
        왼팔.이름 = "힘드러";
        왼팔.현재상태는();
        왼팔.현재길이는();
        왼팔.자라나라();
        왼팔.자라나라();
        왼팔.현재길이는();

        김재욱팔 오른팔 = new 김재욱팔();
        오른팔.상태 = "거들뿐";
        오른팔.이름 = "졸려";
        오른팔.현재상태는();
        오른팔.현재길이는();
    }
}
