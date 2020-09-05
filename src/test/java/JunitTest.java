import com.type.system.constant.BreakWorldConstants;
import com.type.system.factory.DictinoryFactory;
import com.type.system.factory.WordBreakFactory;
import com.type.system.enums.ResultEnum;
import com.type.system.itf.WordBreakService;
import com.type.system.utils.ArrayUtils;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;


public class JunitTest {
    private WordBreakService wordBreakService;

    @Before
    public void before() {
        wordBreakService = WordBreakFactory.getWordBreakService();
    }

    @Test
    public void test1() throws Exception {
        String word = "ilikeicecreamandmango";
        DictinoryFactory.productDictionry(null, BreakWorldConstants.DEFUAL);
        wordBreakService.wordBreakService(word);
    }

    @Test
    public void test2() throws Exception {
       String[] dict = new String[]{"i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "man go"};
        String word = "ilikesamsungmobile";
        check(dict,word);
        DictinoryFactory.productDictionry(ArrayUtils.arrayToList(dict), BreakWorldConstants.TWO_DICT);
        wordBreakService.wordBreakService(word);
    }

    @Test
    public void test3() throws Exception {
        String[] dict = new String[]{"i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "man go"};
        String word = "ilikesamsungmobile";
        check(dict,word);
        DictinoryFactory.productDictionry(ArrayUtils.arrayToList(dict), BreakWorldConstants.THREE_DICT);
        wordBreakService.wordBreakService(word);
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
