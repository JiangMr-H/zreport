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

import com.gree.zreport.zreport.VO.Candle.Candle;
import com.gree.zreport.zreport.VO.Candle.Result_Candle;
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
public class CandleUtils {

    public static Result_Candle CandleUtils(){
        Result_Candle result_candle = new Result_Candle();

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

        result_candle.setCandleCategories(list);

        Candle candle = new Candle();
        candle.setCandleName( "上证指数");

        List<Candle> list1 = new ArrayList<>();
        List calist = new ArrayList();
          List clist = new ArrayList();
        clist.add(2320.1);
        clist.add(2320.1);
        clist.add(2320.1);
        clist.add(2320.1);

        List clist2 = new ArrayList();
        clist2.add(2320.1);
        clist2.add(2320.1);
        clist2.add(2320.1);
        clist2.add(2320.1);

        List clist3 = new ArrayList();
        clist3.add(2320.1);
        clist3.add(2320.1);
        clist3.add(2320.1);
        clist3.add(2320.1);

        calist.add(clist);
        calist.add(clist2);
        calist.add(clist3);
        candle.setCandleData(calist);
        list1.add(candle);

        result_candle.setCandleSeries(list1);
        return result_candle;
    }


}