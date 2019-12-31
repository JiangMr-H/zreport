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
import com.gree.zreport.zreport.VO.LineB.LineB;
import com.gree.zreport.zreport.VO.LineB.Result_LineB;

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
public class LineBUtils {

    public static Result_LineB LineBUtils(){

        //折线
        Result_LineB result_lineB = new Result_LineB();
        List s1 =new ArrayList();
        s1.add("2012");
        s1.add("2013");
        s1.add("2014");
        s1.add("2015");
        s1.add("2016");
        s1.add("2017");
        result_lineB.setLineCategories(s1);


        List<LineB> lineList = new ArrayList<>();
        LineB line = new LineB();

        //第一条折线
        line.setLineNameB("2W1");
        List LineData = new ArrayList();
        LineData.add(1);
        LineData.add(2);
        LineData.add(3);
        LineData.add(4);
        LineData.add(5);
        LineData.add(6);
        line.setLineDataB(LineData);

        //第二条折线
        LineB line2 = new LineB();
        line2.setLineNameB("2W2");
        List LineData2 = new ArrayList();
        LineData2.add(1);
        LineData2.add(2);
        LineData2.add(3);
        LineData2.add(4);
        LineData2.add(5);
        LineData2.add(6);
        line2.setLineDataB(LineData2);

        //第三条折线
        LineB line3 = new LineB();
        line3.setLineNameB("2W3");
        List LineData3 = new ArrayList();
        LineData3.add(1);
        LineData3.add(2);
        LineData3.add(3);
        LineData3.add(4);
        LineData3.add(5);
        LineData3.add(6);
        line3.setLineDataB(LineData3);

        lineList.add(line);
        lineList.add(line2);
        lineList.add(line3);
        result_lineB.setLineSerieB(lineList);

        return result_lineB;
    }


}