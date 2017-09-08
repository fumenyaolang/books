package com.fmyl.books.handler.service.impl;

import com.fmyl.books.handler.constant.Keys;
import com.fmyl.books.handler.constant.Paths;
import com.fmyl.books.handler.service.SearchService;
import com.fmyl.books.handler.utils.PropertiesUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

/**
 * Created by fuzq on 17/9/7.
 */
@Service
public class SearchPropertiseServiceImpl extends BaseService implements SearchService {

    /**
     * get url by book menu
     *
     * @return
     */
    public List<String> getHomeUrlPath() {
        try {
            Properties properties = PropertiesUtils.getProperties(Paths.getPropertiesPath());
            String list = (String) properties.get(Keys.BOOK_LIST);
            if (StringUtils.isBlank(list)) {
                logger.info("no data");
                return new ArrayList<String>(0);
            }
            return Arrays.asList(list.split(Keys.BOOK_LIST_FIRST_SPLIT));
        } catch (IOException e) {
            logger.error("", e);
        }
        return new ArrayList<String>(0);
    }

}
