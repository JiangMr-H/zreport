
/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: reportController
 * Author:   891649
 * Date:     2019/12/19 8:37
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.zreport.zreport.controller;

import com.gree.zreport.zreport.VO.CandleColumn.CandleColumn;
import com.gree.zreport.zreport.VO.ResultVO;
import com.gree.zreport.zreport.VO.Result_ArcbarVO;
import com.gree.zreport.zreport.utils.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2019/12/19
 * @since 1.0.0
 */
@RestController
@RequestMapping("/report")
public class reportController {

      @GetMapping("/find")
     public ResultVO find(){
          //最外层
          ResultVO resultVO = new ResultVO();
          resultVO.setSuccess(true);
          //图形分类层
          Result_ArcbarVO result_arcbarVO = new Result_ArcbarVO();
          result_arcbarVO.setArcbar(ArcbarUtils.ArcbarUtil());
          result_arcbarVO.setArcbar2(ArcbarUtils.ArcbarUtil2());
          result_arcbarVO.setArcbar3(ArcbarUtils.ArcbarUtil3());
          result_arcbarVO.setLineA(LineAUtils.LineUtil());
          result_arcbarVO.setLineB(LineBUtils.LineBUtils());
          result_arcbarVO.setPie(PieUtils.PieUtil());
          result_arcbarVO.setColumnB(ColumnBUtils.ColumnUtil());
          result_arcbarVO.setMix(MixUtils.MixUtil());

           result_arcbarVO.setColumn(ColumnUtils.ColumnUtil());
           result_arcbarVO.setColumnMeter(ColumnMeterUtils.ColumnMeterUtils());
           result_arcbarVO.setColumnStack(ColumnStackUtils.ColumnStackUtils());
           result_arcbarVO.setArea(AreaUtils.AreaUtils());
           result_arcbarVO.setRing(RingUtils.RingUtils());
           result_arcbarVO.setRadar(RadarUtils.RadarUtils());
           result_arcbarVO.setGauge(GaugeUtils.GaugeUtils());
           result_arcbarVO.setCandle(CandleUtils.CandleUtils());
           result_arcbarVO.setCandleColumn(CandleColumnUtils.CandleColumnUtils());


          resultVO.setData(result_arcbarVO);   //最外层

          return resultVO;
      }

}