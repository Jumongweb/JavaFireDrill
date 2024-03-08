package designPattern;

import org.junit.jupiter.api.Test;

public class GirlTest {
    @Test
    public void test_ICanUseInterface(){
        LekkiGuys dayo = new LekkiGuys();
        MushinGuys james = new MushinGuys();
        YabaGuys cane = new YabaGuys();

        Girl girl1 = new Girl(dayo);
        Girl girl2 = new Girl(james);
        Girl girl3 = new Girl(cane);

        dayo.clean();
        System.out.println(girl1);
        System.out.println(girl2);
        System.out.println(girl3);
    }
}
