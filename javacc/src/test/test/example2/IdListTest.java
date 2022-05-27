package example2;

import example4.Example4;
import idList.IdList;
import org.junit.Test;

import java.io.StringReader;

/**
 * @Description: test
 * @Create by: Moli
 * @Date: 2022/5/27 17:39
 */
public class IdListTest {
    @Test
    public void test() throws idList.ParseException {
        StringBuffer sb = new StringBuffer();
        sb.append("abc 123");
        StringReader reader = new StringReader(sb.toString());
        IdList parser = new IdList(reader);
        parser.Input();
    }
    @Test
    public void test1() throws idList.ParseException {
        StringBuffer sb = new StringBuffer();
        sb.append("abc");
        StringReader reader = new StringReader(sb.toString());
        IdList parser = new IdList(reader);
        parser.Input();
    }
}
