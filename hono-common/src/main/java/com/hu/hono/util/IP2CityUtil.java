package com.hu.hono.util;

import cn.hutool.core.util.StrUtil;
import org.lionsoul.ip2region.xdb.Searcher;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;

/**
 * @author hlh
 * @version v1.0
 * @title IP2CityUtil
 * @projectName hono
 * @description
 * @date 2023/1/31 12:10
 */
public class IP2CityUtil {
    private static Logger logger = LoggerFactory.getLogger(IP2CityUtil.class);

    public static String getCityInfo(String ip) {
        try {
            ClassPathResource classPathResource = new ClassPathResource("ip2region.xdb");
            String dbPath = classPathResource.getFile().getPath();
            byte[] vIndex;
            vIndex = Searcher.loadVectorIndexFromFile(dbPath);
            Searcher searcher = Searcher.newWithVectorIndex(dbPath, vIndex);
            String region = searcher.search(ip);
            String[] split = region.split("\\|");
            searcher.close();
            return StrUtil.format("{}.{}.{}.{}", split[0], split[2], split[3], split[4]);
        } catch (Exception e) {
            logger.info("ip解析出现错误！", e);
        }
        return null;
    }
}
