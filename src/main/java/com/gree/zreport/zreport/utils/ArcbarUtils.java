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
public class ArcbarUtils {

     public static Result_Arcbar ArcbarUtil(){
          //环
          Result_Arcbar result_arcbar = new Result_Arcbar();
          //环1
          List<Arcbar1> arcbarList = new ArrayList<>();
          Arcbar1 arcbar1 = new Arcbar1();
          arcbar1.setArcbar1Name("AX0003955");
          arcbar1.setArcbar1Data(0.29);
          arcbar1.setArcbar1Color("#2fc25b");
          arcbarList.add(arcbar1);
          result_arcbar.setArcbarSeries(arcbarList);
          return result_arcbar;
     }
     public static Result_Arcbar ArcbarUtil2(){
          //环
          Result_Arcbar result_arcbar2 = new Result_Arcbar();
          //环2
          List<Arcbar1> arcbarList2 = new ArrayList<>();
          Arcbar1 arcbar2 = new Arcbar1();
          arcbar2.setArcbar1Name("AC0007125");
          arcbar2.setArcbar1Data(0.65);
          arcbar2.setArcbar1Color("#f04864");
          arcbarList2.add(arcbar2);
          result_arcbar2.setArcbarSeries(arcbarList2);
          return result_arcbar2;
     }

     public static Result_Arcbar ArcbarUtil3(){
          //环
          Result_Arcbar result_arcbar3 = new Result_Arcbar();
          //环3
          List<Arcbar1> arcbarList3 = new ArrayList<>();
          Arcbar1 arcbar3 = new Arcbar1();
          arcbar3.setArcbar1Name("AA0009125");
          arcbar3.setArcbar1Data(0.85);
          arcbar3.setArcbar1Color("#1890ff");
          arcbarList3.add(arcbar3);
          result_arcbar3.setArcbarSeries(arcbarList3);
          return result_arcbar3;
     }


}