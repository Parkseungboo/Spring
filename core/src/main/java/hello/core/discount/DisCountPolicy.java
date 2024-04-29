package hello.core.discount;

import hello.core.member.Member;

public interface DisCountPolicy {


    int discount(Member member, int price);

}
