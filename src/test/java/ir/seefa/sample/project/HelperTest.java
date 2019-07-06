package ir.seefa.sample.project;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

public class HelperTest {

    private Helper helper = new Helper();

    @Test
    public void testSayHello() {
        assertThat(helper.sayHello(), containsString("Hello"));
    }

}
