package hello.core.order;

import hello.core.member.MemberService;

class OrderServiceTest {

    MemberService memberService = new MemberService();
    OrderService orderService = new OrderServiceImpl();

    @Test
    void createOrder(){

        // given
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        //when
        Order
    }

}
