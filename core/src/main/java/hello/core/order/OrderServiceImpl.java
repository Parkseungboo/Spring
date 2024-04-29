package hello.core.order;

import hello.core.discount.DisCountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.member.Member;
import hello.core.member.MemberRepository;
import hello.core.member.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    MemberRepository memberRepository = new MemoryMemberRepository();

    DisCountPolicy disCountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice) {

        // 회원 id - > 회원 등급 조회 -> 할인 정책 적용

        // 회원 조회
        Member member = memberRepository.findById(memberId);

        int discountPrice = disCountPolicy.discount(member, itemPrice);

        // Order order = new Order(memberId, itemName, itemPrice, discountPrice);

        // return order;

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
