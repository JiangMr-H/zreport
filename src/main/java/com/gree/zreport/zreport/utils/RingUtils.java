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
import com.gree.zreport.zreport.VO.Ring.Result_Ring;
import com.gree.zreport.zreport.VO.Ring.Ring;

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
public class RingUtils {

    public static Result_Ring RingUtils(){
        Result_Ring result_ring = new Result_Ring();
        List<Ring> ringList = new ArrayList<>();
         Ring r = new Ring();
         r.setRingName("一班");
         r.setRingData(30);

        Ring r2 = new Ring();
        r2.setRingName("二班");
        r2.setRingData(20);

        Ring r3 = new Ring();
        r3.setRingName("三班");
        r3.setRingData(60);

        Ring r4 = new Ring();
        r4.setRingName("四班");
        r4.setRingData(40);

        Ring r5 = new Ring();
        r5.setRingName("五班");
        r5.setRingData(90);

         ringList.add(r);
        ringList.add(r2);
        ringList.add(r3);
        ringList.add(r4);
        ringList.add(r5);

        result_ring.setRingSeries(ringList);

        return result_ring;
    }


}