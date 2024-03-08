package designPattern;

import org.junit.jupiter.api.Test;

public class GirlTest {
    @Test
    public void test_ICanUseInterface(){
        LekkiGuys dayo = new LekkiGuys();
        MushinGuys james = new MushinGuys();
        YabaGuys cane = new YabaGuys();

        Girl girl1 = new Girl(dayo);
        girl1.clean();
        Girl girl2 = new Girl(james);
        girl2.clean();
        Girl girl3 = new Girl(cane);
        girl3.spend();
        girl1.setProblem(dayo);
        dayo.clean();

    }
}
