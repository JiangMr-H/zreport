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

import	java.util.ArrayList;

import com.gree.zreport.zreport.VO.ColumnMeter.ColumnMeter;
import com.gree.zreport.zreport.VO.ColumnMeter.Result_ColumnMeter;

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
public class ColumnMeterUtils {

     public static Result_ColumnMeter ColumnMeterUtils(){

          Result_ColumnMeter result_aColumnMeter = new Result_ColumnMeter();
          List ColumnMeterList = new ArrayList();
         ColumnMeterList.add("2013");
         ColumnMeterList.add("2014");
         ColumnMeterList.add("2015");
         ColumnMeterList.add("2016");
         ColumnMeterList.add("2017");
         ColumnMeterList.add("2018");
         result_aColumnMeter.setColumnMeterCategories(ColumnMeterList);

         List<ColumnMeter> columnMetersList = new ArrayList<>();

         ColumnMeter columnMeter =new ColumnMeter();
         columnMeter.setColumnMeterName("目标值");
         List cList = new ArrayList();
         cList.add(5);
         cList.add(34);
         cList.add(17);
         cList.add(25);
         cList.add(337);
         cList.add(47);
         columnMeter.setColumnMeterData(cList);
         columnMeter.setColumnMeterColor("#2fc25b");

         ColumnMeter columnMeter2 =new ColumnMeter();
         columnMeter2.setColumnMeterName("目标值");
         List cList2 = new ArrayList();
         cList2.add(25);
         cList2.add(4);
         cList2.add(7);
         cList2.add(5);
         cList2.add(37);
         cList2.add(7);
         columnMeter2.setColumnMeterData(cList);
         columnMeter2.setColumnMeterColor("#2fc25b");

         columnMetersList.add(columnMeter);
         columnMetersList.add(columnMeter2);

          result_aColumnMeter.setColumnMeterSeries(columnMetersList);

          return result_aColumnMeter;
     }

}