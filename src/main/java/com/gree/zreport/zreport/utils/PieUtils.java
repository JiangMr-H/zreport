/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: PieUtils
 * Author:   891649
 * Date:     2019/12/19 16:57
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.zreport.zreport.utils;

import com.gree.zreport.zreport.VO.Pie.Pie;
import com.gree.zreport.zreport.VO.Pie.Result_Pie;

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
public class PieUtils {

    public static Result_Pie PieUtil(){

        //饼状图
        Result_Pie result_pie = new Result_Pie();

        List<Pie> pieList = new ArrayList<>();

         Pie pie = new Pie();
         pie.setPieName("2W1");
         pie.setPieData(12);

        Pie pie2 = new Pie();
        pie2.setPieName("2W1");
        pie2.setPieData(12);

        Pie pie3 = new Pie();
        pie3.setPieName("2W1");
        pie3.setPieData(12);

        Pie pie4 = new Pie();
        pie4.setPieName("2W1");
        pie4.setPieData(12);

        Pie pie5 = new Pie();
        pie5.setPieName("2W1");
        pie5.setPieData(12);

        pieList.add(pie);
        pieList.add(pie2);
        pieList.add(pie3);
        pieList.add(pie4);
        pieList.add(pie5);

        result_pie.setPieSeries(pieList);




        return result_pie;
    }

}