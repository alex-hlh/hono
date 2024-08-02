package com.hu.hono.enmu;

/**
 * @ClassName : DBKeywords
 * @Description ：数据语句关键字、函数
 * @Author : zxy
 * @Date : 2022/4/22 9:58
 * @Version : 1.0
 */
public enum DBKeywords {

    AND(" AND ","并且"),
    OR(" OR ","或者"),
    NOT(" NOT ","不存在"),
    IN(" IN ","存在"),
    NOT_IN(" NOT IN ","不存在"),
    LIKE(" LIKE ","包含/模糊，WEB"),
    NOT_LIKE(" NOT LIKE ","不包含，WEB"),
    EQ(" = ","等于/相等，WEB"),
    NE(" <> ","不等于，WEB"),
    GT(" > ","大于，WEB"),
    GTE(" >= ","大于等于，WEB"),
    LT(" < ","小于，WEB"),
    LTE(" <= ","小于等于，WEB"),
    IS_NULL(" IS NULL ","为空"),
    IS_NOT_NULL(" IS NOT NULL ","不为空"),
    GROUP_BY(" GROUP BY ","分组"),
    HAVING(" HAVING ","分组筛选"),
    ORDER_BY(" ORDER BY ","排序"),
    EXISTS(" EXISTS ","存在"),
    NOT_EXISTS(" NOT EXISTS ","不存在"),
    BETWEEN(" BETWEEN ","区间"),
    NOT_BETWEEN(" NOT BETWEEN ","不在区间内"),
    ASC(" ASC ","升序"),
    DESC(" DESC ","倒序"),
    ON(" ON ","连表ON"),
    LEFT_JOIN(" LEFT JOIN ","左连接"),
    INNER_JOIN(" INNER JOIN ","内连接"),
    SELECT(" SELECT ","查询"),
    FROM(" FROM ","指向"),
    COUNT(" COUNT(0) ","查询数量");

    private final String keyword;
    private final String desc;

    public String getSqlSegment() {
        return this.keyword;
    }

    public String getkey() {
        return keyword;
    }

    DBKeywords(final String keyword, final String desc) {
        this.keyword = keyword;
        this.desc = desc;
    }

    /**
     * @Description : 得到枚举
     * @Author : zxy
     * @Date : 2022/4/26 11:03
     * @return: null
     **/
    public static DBKeywords getByName(String name) {
        for (DBKeywords keyword : values()) {
            if (keyword.equals(keyword.name())) {
                return keyword;
            }
        }
        return null;
    }
}
