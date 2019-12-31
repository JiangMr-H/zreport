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

import com.gree.zreport.zreport.VO.Arcbar.Arcbar1;
import com.gree.zreport.zreport.VO.Arcbar.Result_Arcbar;
import com.gree.zreport.zreport.VO.ColumnStack.ColumnStack;
import com.gree.zreport.zreport.VO.ColumnStack.Result_ColumnStack;

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
public class ColumnStackUtils {

     public static Result_ColumnStack ColumnStackUtils() {

          Result_ColumnStack result_columnStack = new Result_ColumnStack();
          List ColumnStackList = new ArrayList();
          ColumnStackList.add("2013");
          ColumnStackList.add("2014");
          ColumnStackList.add("2015");
          ColumnStackList.add("2016");
          ColumnStackList.add("2017");
          ColumnStackList.add("2018");
          result_columnStack.setColumnStackCategories(ColumnStackList);

          List<ColumnStack> CoList =new ArrayList<>();

          ColumnStack columnStack = new ColumnStack();
          columnStack.setColumnStackName("新成交量3");
          List cList = new ArrayList();
          cList.add(5);
          cList.add(34);
          cList.add(17);
          cList.add(25);
          cList.add(337);
          cList.add(47);
          columnStack.setColumnStackData(cList);

          ColumnStack columnStack2 = new ColumnStack();
          columnStack2.setColumnStackName("新成交量4");
          List cList2 = new ArrayList();
          cList2.add(5);
          cList2.add(34);
          cList2.add(17);
          cList2.add(25);
          cList2.add(337);
          cList2.add(47);
          columnStack2.setColumnStackData(cList2);

          ColumnStack columnStack3 = new ColumnStack();
          columnStack3.setColumnStackName("新成交量5");
          List cList3 = new ArrayList();
          cList3.add(5);
          cList3.add(34);
          cList3.add(17);
          cList3.add(25);
          cList3.add(337);
          cList3.add(47);
          columnStack3.setColumnStackData(cList3);
          CoList.add(columnStack);
          CoList.add(columnStack2);
          CoList.add(columnStack3);

          result_columnStack.setColumnStackSeries(CoList);

      return result_columnStack;
     }


}