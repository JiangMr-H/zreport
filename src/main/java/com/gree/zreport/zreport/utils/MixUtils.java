/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: MixUtils
 * Author:   891649
 * Date:     2019/12/19 17:50
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.zreport.zreport.utils;

import com.gree.zreport.zreport.VO.Mix.Mix;
import com.gree.zreport.zreport.VO.Mix.Result_Mix;

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
public class MixUtils {

    public static Result_Mix MixUtil(){

        Result_Mix result_mix = new Result_Mix();
        List CateList = new ArrayList();
        CateList.add("2012");
        CateList.add("2013");
        CateList.add("2014");
        CateList.add("2015");
        CateList.add("2016");
        CateList.add("2017");
        result_mix.setMixCategories(CateList);

        List<Mix> MixList =new ArrayList<>();

        Mix mix = new Mix();
        mix.setMixName("曲面");
        List DataList = new ArrayList();
        DataList.add(23);
        DataList.add(13);
        DataList.add(44);
        DataList.add(45);
        DataList.add(32);
        DataList.add(14);
        mix.setMixData(DataList);
        mix.setMixType("area");
        mix.setMixStyle("curve");

        Mix mix2 = new Mix();
        mix2.setMixName("柱1");
        List DataList2 = new ArrayList();
        DataList2.add(23);
        DataList2.add(13);
        DataList2.add(44);
        DataList2.add(45);
        DataList2.add(32);
        DataList2.add(14);
        mix2.setMixData(DataList2);
        mix2.setMixStyle("column");

        Mix mix3 = new Mix();
        mix3.setMixName("柱2");
        List DataList3 = new ArrayList();
        DataList3.add(23);
        DataList3.add(13);
        DataList3.add(44);
        DataList3.add(45);
        DataList3.add(32);
        DataList3.add(14);
        mix3.setMixData(DataList3);
        mix3.setMixStyle("column");

        Mix mix4 = new Mix();
        mix4.setMixName("曲线");
        List DataList4 = new ArrayList();
        DataList4.add(23);
        DataList4.add(13);
        DataList4.add(44);
        DataList4.add(45);
        DataList4.add(32);
        DataList4.add(14);
        mix4.setMixData(DataList4);
        mix4.setMixType("line");
        mix4.setMixStyle("curve");
        mix4.setMixColor("#1890ff");
        mix4.setMixDisableLegend(true);

        Mix mix5 = new Mix();
        mix5.setMixName("折线");
        List DataList5 = new ArrayList();
        DataList5.add(23);
        DataList5.add(13);
        DataList5.add(44);
        DataList5.add(45);
        DataList5.add(32);
        DataList5.add(14);
        mix5.setMixData(DataList5);
        mix5.setMixType("line");
        mix5.setMixColor("#2fc25b");

        Mix mix6 = new Mix();
        mix6.setMixName("点");
        List DataList6 = new ArrayList();
        DataList6.add(23);
        DataList6.add(13);
        DataList6.add(44);
        DataList6.add(45);
        DataList6.add(32);
        DataList6.add(14);
        mix6.setMixData(DataList6);
        mix6.setMixType("point");
        mix6.setMixColor("#f04864");

        MixList.add(mix);
        MixList.add(mix2);
        MixList.add(mix3);
        MixList.add(mix4);
        MixList.add(mix5);
        MixList.add(mix6);

        result_mix.setMixServices(MixList);

        return result_mix;
    }

}