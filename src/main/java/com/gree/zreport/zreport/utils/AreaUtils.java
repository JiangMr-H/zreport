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

import com.gree.zreport.zreport.VO.Area.Area;
import com.gree.zreport.zreport.VO.Area.Result_Area;
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
public class AreaUtils {

    public static Result_Area AreaUtils(){

        Result_Area  result_area = new Result_Area();
        List list = new ArrayList();
        list.add("2012");
        list.add("2013");
        list.add("2014");
        list.add("2015");
        list.add("2016");
        list.add("2017");
        result_area.setAreaCategories(list);

        List<Area> AreaList = new ArrayList<> ();

        Area area = new Area();
        area.setAreaName("成交量A");
        List Alist = new ArrayList();
        Alist.add(10);
        Alist.add(43);
        Alist.add(2);
        Alist.add(3);
        Alist.add(4);
        Alist.add(6);
        area.setAreaData(Alist);
        area.setAreaColor("#facc14");

        Area area2 = new Area();
        area2.setAreaName("成交量A");
        List Alist2 = new ArrayList();
        Alist2.add(10);
        Alist2.add(43);
        Alist2.add(2);
        Alist2.add(3);
        Alist2.add(4);
        Alist2.add(6);
        area2.setAreaData(Alist2);
        area2.setAreaColor("#facc14");

        Area area3 = new Area();
        area3.setAreaName("成交量A");
        List Alist3 = new ArrayList();
        Alist3.add(10);
        Alist3.add(43);
        Alist3.add(2);
        Alist3.add(3);
        Alist3.add(4);
        Alist3.add(6);
        area3.setAreaData(Alist3);
        area3.setAreaColor("#facc14");

        AreaList.add(area);
        AreaList.add(area2);
        AreaList.add(area3);
        result_area.setAreaSeries(AreaList);



        return result_area;
    }


}