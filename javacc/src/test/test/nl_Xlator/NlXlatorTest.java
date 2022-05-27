package nl_Xlator;

import idList.IdList;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringReader;

/**
 * @Description: test
 * @Create by: Moli
 * @Date: 2022/5/27 17:48
 */
public class NlXlatorTest {
    @Test
    public void test() throws  ParseException {
        StringBuffer sb = new StringBuffer();
        sb.append("a + b;");
        sb.append("a * b;");
        StringReader reader = new StringReader(sb.toString());
        NL_Xlator parser = new NL_Xlator(reader);
        parser.ExpressionList();
    }
    @Test
    public void test1() throws   ParseException {
        StringBuffer sb = new StringBuffer();
        sb.append("a + b + c;");

        StringReader reader = new StringReader(sb.toString());
        NL_Xlator parser = new NL_Xlator(reader);
        parser.ExpressionList();
    }
    @Test
    public void test2() throws ParseException {
        StringBuffer sb = new StringBuffer();
        sb.append("2aLibv * b * c;");
        showToken(sb.toString());
        StringReader reader = new StringReader(sb.toString());
        NL_Xlator parser = new NL_Xlator(reader);
        parser.ExpressionList();
    }
    public void showToken(String sqlStr) throws ParseException {

        System.out.println(sqlStr);
        StringReader stringReader = new StringReader(sqlStr);
        SimpleCharStream jj_input_stream = new SimpleCharStream(stringReader, 1, 1);
        NL_XlatorTokenManager token_source = new NL_XlatorTokenManager(jj_input_stream);
        Token nextToken = token_source.getNextToken();
        while (nextToken.kind != NL_XlatorConstants.EOF) {
            System.out.println(nextToken.image + ":" + NL_XlatorConstants.tokenImage[nextToken.kind]);
            nextToken = token_source.getNextToken();
        }

    }
}
