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
import com.gree.zreport.zreport.VO.Radar.Radar;
import com.gree.zreport.zreport.VO.Radar.Result_Radar;

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
public class RadarUtils {

    public static Result_Radar RadarUtils(){
        Result_Radar result_radar = new Result_Radar();

        List  list = new ArrayList();
        list.add("维度1");
        list.add("维度2");
        list.add("维度3");
        list.add("维度4");
        list.add("维度5");
        list.add("维度6");
        result_radar.setRadarCategories(list);

        List<Radar> radars = new ArrayList<>();

        Radar radar = new Radar();
        radar.setRadarName("成交量1");
        List  radarList = new ArrayList();
        radarList.add(34);
        radarList.add(67);
        radarList.add(26);
        radarList.add(44);
        radarList.add(88);
        radarList.add(74);
        radar.setRadarData(radarList);

        Radar radar2 = new Radar();
        radar2.setRadarName("成交量2");
        List  radarList2 = new ArrayList();
        radarList2.add(34);
        radarList2.add(67);
        radarList2.add(26);
        radarList2.add(44);
        radarList2.add(88);
        radarList2.add(74);
        radar2.setRadarData(radarList2);

        radars.add(radar);
        radars.add(radar2);
        result_radar.setRadarSerie(radars);


        return result_radar;
    }


}