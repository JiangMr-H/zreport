/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ColumnUtils
 * Author:   891649
 * Date:     2019/12/19 17:21
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.zreport.zreport.utils;

import java.util.ArrayList;
import	java.util.List;

import com.gree.zreport.zreport.VO.ColumnB.ColumnB;
import com.gree.zreport.zreport.VO.ColumnB.Result_ColumnB;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2019/12/19
 * @since 1.0.0
 */
public class ColumnBUtils {

    //柱状图
    public static Result_ColumnB ColumnUtil(){
        Result_ColumnB result_columnB = new Result_ColumnB();
        List list = new ArrayList();
        list.add("2012");
        list.add("2013");
        list.add("2014");
        list.add("2015");
        list.add("2016");
        list.add("2017");
        result_columnB.setColumnCategories(list);

        List<ColumnB> columnBList = new ArrayList<>();

        ColumnB columnB = new ColumnB();
        columnB.setColumnName("2W1");
        List listdata = new ArrayList();
        listdata.add(12);
        listdata.add(54);
        listdata.add(672);
        listdata.add(5);
        listdata.add(88);
        listdata.add(13);
        columnB.setColumnData(listdata);

        ColumnB columnB2 = new ColumnB();
        columnB2.setColumnName("2W2");
        List listdata2 = new ArrayList();
        listdata2.add(92);
        listdata2.add(514);
        listdata2.add(62);
        listdata2.add(51);
        listdata2.add(52);
        listdata2.add(19);
        columnB2.setColumnData(listdata2);

        columnBList.add(columnB);
        columnBList.add(columnB2);
        result_columnB.setColumnBSeries(columnBList);
        return result_columnB;

    }

}