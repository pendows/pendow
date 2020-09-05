import com.type.system.constant.BreakWorldConstants;
import com.type.system.factory.DictinoryFactory;
import com.type.system.factory.WordBreakFactory;
import com.type.system.enums.ResultEnum;
import com.type.system.itf.WordBreakService;
import com.type.system.utils.ArrayUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class JunitTest {
    private WordBreakService wordBreakService;

    @Before
    public void before() {
        //通过业务接口，获取具体对象
        wordBreakService = WordBreakFactory.getWordBreakService();
    }

    /**
     * 题目：
     * Given a valid sentence without any spaces between the words and a dictionary of valid English words,
     * find all possible ways to break the sentence in individual dictionary words.
     * Example:
     * Consider the following dictionary
     * { i, like, sam, sung, samsung, mobile, ice, cream, man go}
     * Input: "ilikesamsungmobile"
     * Output: i like sam sung mobile
     *         i like samsung mobile
     * Input: "ilikeicecreamandmango"
     * Output: i like ice cream and man go
     * @throws Exception
     */
    @Test
    public void test1() throws Exception {
        String word = "ilikeicecreamandmango";
        //开始通过默认类型获取字典
        DictinoryFactory.productDictionry(null, BreakWorldConstants.DEFUAL);
        String expected = "[i, like, ice, cream, and, mango]";
        assertEquals(expected,wordBreakService.wordBreakService(word).replaceFirst(",",""));
    }

    /**
     * 题目2：
     * #Stage 2 - new requirement to be implemented:
     * If user provide a customized dictionary of valid English words as additional input,
     * and the program will only find in the user customized dictionary
     * E.g.: the user customized dictionary
     * { i, like, sam, sung, mobile, icecream, man go, mango}
     * @throws Exception
     */
    @Test
    public void test2() throws Exception {
        String[] dict = new String[]{"i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "man go"};
        String expected = "[i, like, sam, sung, mobile],[i, like, samsung, mobile]";
        String word = "ilikesamsungmobile";
        check(dict,word);
        DictinoryFactory.productDictionry(ArrayUtils.arrayToList(dict), BreakWorldConstants.TWO_DICT);
        assertEquals(expected,wordBreakService.wordBreakService(word).replaceFirst(",",""));
    }

    /**
     * 题目3：
     * #Stage 3 - new requirement to be implemented:
     * If user provide a customized dictionary of valid English words as additional input,
     * and the program will find all the valid words in the both dictionaries
     * E.g.: the user customized dictionary
     * { i, like, sam, sung, mobile, icecream, man go, mango}
     * @throws Exception
     */
    @Test
    public void test3() throws Exception {
        String[] dict = new String[]{"i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "man go"};
        String expected = "[i, like, sam, sung, mobile],[i, like, samsung, mobile]";
        String word = "ilikesamsungmobile";
        check(dict,word);
        DictinoryFactory.productDictionry(ArrayUtils.arrayToList(dict), BreakWorldConstants.THREE_DICT);
        assertEquals(expected,wordBreakService.wordBreakService(word).replaceFirst(",",""));
        word = "ilikeicecreamandmango";
        expected = "[i, like, ice, cream, and, mango]";
        assertEquals(expected,wordBreakService.wordBreakService(word).replaceFirst(",",""));

    }

    @Test
    public void test4() throws Exception {
        String[] dict = new String[]{"i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "man go"};
        String word = "";
        check(dict,word);
        DictinoryFactory.productDictionry(ArrayUtils.arrayToList(dict), BreakWorldConstants.THREE_DICT);
        wordBreakService.wordBreakService(word);
    }

    @Test
    public void test5() throws Exception {
        String[] dict = null;
        String word = "ilikesamsungmobile";
        check(dict,word);
        DictinoryFactory.productDictionry(ArrayUtils.arrayToList(dict), BreakWorldConstants.THREE_DICT);
        wordBreakService.wordBreakService(word);
    }

    @Test
    public void test6() throws Exception {
        String[] dict = null;
        String word = "ilikesamsungmobile";
        check(dict,word);
        DictinoryFactory.productDictionry(ArrayUtils.arrayToList(dict), BreakWorldConstants.TWO_DICT);
        wordBreakService.wordBreakService(word);
    }

    @Test
    public void test7() throws Exception {
        String[] dict = new String[]{"i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "man go"};
        String word = "";
        check(dict,word);
        DictinoryFactory.productDictionry(ArrayUtils.arrayToList(dict), BreakWorldConstants.TWO_DICT);
        wordBreakService.wordBreakService(word);
    }

    @Test
    public void test8() throws Exception {
        String[] dict = new String[]{"i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "man go"};
        String word = "";
        check(dict,word);
        DictinoryFactory.productDictionry(ArrayUtils.arrayToList(dict), BreakWorldConstants.TWO_DICT);
        wordBreakService.wordBreakService(word);
    }

    public static void check(String[] dicts,String word) throws Exception {
        if(dicts == null || dicts.length <=0){
            throw new Exception(ResultEnum.DIC_NOT_NULL.getMessage(),null);
        }
        if(word !=null && "".equals(word)){
            throw new Exception(ResultEnum.WORD_NOT_NULL.getMessage(),null);
        }
    }
}
