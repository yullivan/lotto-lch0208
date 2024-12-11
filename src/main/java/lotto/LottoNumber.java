package lotto;
//로또 번호 클라스 만들기.
//로또 구입금액 입력받는 코드생성하기.
//랜덤한 (1~45) 6자리 숫자를 구입금액에 따라 반복적으로 생성해야함.(Collections.shuffle()활용)
//1게임당 금액은 1,000원

import java.util.Collections;

public class LottoNumber {
    private int 로또번호;

    public LottoNumber(int 로또번호) {
        if(로또번호 < 1 || 로또번호 > 45){
           throw new IllegalArgumentException("번호는 1~45 숫자안에서 이루어짐");
        }

        this.로또번호 = 로또번호;
    }

}
