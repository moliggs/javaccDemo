package example2;

import example4.Example4;
import org.junit.Test;

import java.io.StringReader;

/**
 * @Description: test
 * @Create by: 陌离
 * @Date: 2022/5/27 15:55
 */
public class Example4Test {
    @Test
    public void test() throws ParseException, example4.ParseException {
        StringBuffer sb = new StringBuffer();
        sb.append("{{{{}{}{}{}{}}}{{}}{{}}}");
        StringReader reader = new StringReader(sb.toString());
        Example4 parser = new Example4(reader);
        parser.Input();
    }
}
