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

import com.gree.zreport.zreport.VO.Gauge.Gauge;
import com.gree.zreport.zreport.VO.Gauge.GaugeC;
import com.gree.zreport.zreport.VO.Gauge.Result_Gauge;
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
public class GaugeUtils {

    public static Result_Gauge GaugeUtils(){
        Result_Gauge result_gauge = new Result_Gauge();

        List<GaugeC> gaugeCSList = new ArrayList<>();

         GaugeC gaugeC = new GaugeC();
         gaugeC.setGaugeValue(0.3);
         gaugeC.setGaugeColor("#1890ff");

        GaugeC gaugeC2 = new GaugeC();
        gaugeC2.setGaugeValue(0.3);
        gaugeC2.setGaugeColor("#1890ff");

        GaugeC gaugeC3 = new GaugeC();
        gaugeC3.setGaugeValue(0.3);
        gaugeC3.setGaugeColor("#1890ff");

        gaugeCSList.add(gaugeC);
        gaugeCSList.add(gaugeC2);
        gaugeCSList.add(gaugeC3);
        result_gauge.setGaugeCategories(gaugeCSList);

        Gauge gauge = new Gauge();
        gauge.setGaugeName("完成率");
        gauge.setGaugeData(0.66);
        result_gauge.setGaugeSeries(gauge);



        return result_gauge;
    }


}