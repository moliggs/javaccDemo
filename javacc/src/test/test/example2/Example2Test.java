package example2;

import org.junit.Test;

import java.io.StringReader;

/**
 * @Description: test
 * @Create by: 陌离
 * @Date: 2022/5/27 14:43
 */
public class Example2Test {

    @Test
    public void test() throws ParseException {
        StringBuffer sb = new StringBuffer();
        sb.append("{}");
        StringReader reader = new StringReader(sb.toString());
        Example2 parser = new Example2(reader);
        parser.Input();
    }
    @Test
    public void test1() throws ParseException {
        StringBuffer sb = new StringBuffer();
        sb.append("{{}{{}}{}}");
        StringReader reader = new StringReader(sb.toString());
        Example2 parser = new Example2(reader);
        parser.Input();
    }
}
