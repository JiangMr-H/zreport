/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ArcbarUtil
 * Author:   891649
 * Date:     2019/12/19 16:32
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.zreport.zreport.utils;

import com.gree.zreport.zreport.VO.CandleColumn.CandleColumn;
import com.gree.zreport.zreport.VO.CandleColumn.Result_CandleColumn;
import com.gree.zreport.zreport.VO.LineA.LineA;
import com.gree.zreport.zreport.VO.LineA.Result_LineA;

import java.util.ArrayList;
import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2019/12/19
 * @since 1.0.0
 */
public class CandleColumnUtils {

    public static Result_CandleColumn CandleColumnUtils(){
        Result_CandleColumn result_candleColumn = new Result_CandleColumn();

        List list = new ArrayList();
        list.add("2013/1/24");
        list.add("2013/1/24");
        list.add("2013/1/24");
        list.add("2013/1/24");
        list.add("2013/1/24");
        list.add("2013/1/24");
        list.add("2013/1/24");
        list.add("2013/1/24");
        list.add("2013/1/24");
        list.add("2013/1/24");
        list.add("2013/1/24");
        list.add("2013/1/24");
        list.add("2013/1/24");
        list.add("2013/1/24");
        list.add("2013/1/24");
        list.add("2013/1/24");
        list.add("2013/1/24");
        result_candleColumn.setCandleColumnCategories(list);

        List<CandleColumn> candleColumnsList = new ArrayList<>();
        CandleColumn candleColumn = new CandleColumn();
         candleColumn.setCandleColumnName("成交量1");
         List dataList = new ArrayList();
        dataList.add(15);
        dataList.add(45);
        dataList.add(25);
        dataList.add(55);
        dataList.add(55);
        dataList.add(57);
        dataList.add(8);
        dataList.add(98);
        dataList.add(154);
        dataList.add(45);
         candleColumn.setCandleColumnData(dataList);
        candleColumnsList.add(candleColumn);
        result_candleColumn.setCandleColumnColumnSeries(candleColumnsList);
        return result_candleColumn;
    }


}