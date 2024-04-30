package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MemberServiceTest {

    MemberService memberService;

    @BeforeEach
    void setUp() {
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }
    @Test
    void join() {

        //given
        Member memberA = new Member(1L, "memberA", Grade.VIP);
        Member memberB = new Member(2L, "memberB", Grade.VIP);

        //when
        memberService.join(memberA);
        memberService.join(memberB);

        Member findmemberA = memberService.findMember(1L);
        Member findmemberB = memberService.findMember(2L);

        //then
        Assertions.assertThat(memberA).isEqualTo(findmemberA);
        Assertions.assertThat(memberB).isEqualTo(findmemberB);
    }

    @Test
    void findMember() {
    }
}