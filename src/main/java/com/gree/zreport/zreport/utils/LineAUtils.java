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
public class LineAUtils {

    public static Result_LineA LineUtil(){

        //折线
        Result_LineA result_lineA = new Result_LineA();
        List s =new ArrayList();
        s.add("2012");
        s.add("2013");
        s.add("2014");
        s.add("2015");
        s.add("2016");
        s.add("2017");
        result_lineA.setLineCategories(s);


        List<LineA> lineList = new ArrayList<>();
        LineA line = new LineA();

        //第一条折线
        line.setLineNameA("2W1");
        List LineData = new ArrayList();
        LineData.add(1);
        LineData.add(2);
        LineData.add(3);
        LineData.add(4);
        LineData.add(5);
        LineData.add(6);
        line.setLineDataA(LineData);

        //第二条折线
        LineA line2 = new LineA();
        line2.setLineNameA("2W2");
        List LineData2 = new ArrayList();
        LineData2.add(1);
        LineData2.add(2);
        LineData2.add(3);
        LineData2.add(4);
        LineData2.add(5);
        LineData2.add(6);
        line2.setLineDataA(LineData2);

        //第三条折线
        LineA line3 = new LineA();
        line3.setLineNameA("2W3");
        List LineData3 = new ArrayList();
        LineData3.add(1);
        LineData3.add(2);
        LineData3.add(3);
        LineData3.add(4);
        LineData3.add(5);
        LineData3.add(6);
        line3.setLineDataA(LineData3);

        lineList.add(line);
        lineList.add(line2);
        lineList.add(line3);

        result_lineA.setLineSeries(lineList);

        return result_lineA;
    }


}