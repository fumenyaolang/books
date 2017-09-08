import com.fmyl.books.handler.Application;
import com.fmyl.books.handler.constant.Keys;
import com.fmyl.books.handler.constant.Paths;
import com.fmyl.books.handler.service.SearchService;
import com.fmyl.books.handler.utils.DownloadUtils;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

/**
 * Created by fuzq on 17/9/7.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class App extends BaseTest {

    @Autowired
    private SearchService searchService;

    @Test
    public void app() {
        try {
            List<String> list = searchService.getHomeUrlPath();
            for (String str : list) {
                if (StringUtils.isBlank(str)) {
                    continue;
                }
                String[] split = str.split(Keys.BOOK_LIST_SECOND_SPLIT);
                DownloadUtils.download(new URL(split[1]), Paths.getDownload(), split[0], "home.html");
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
