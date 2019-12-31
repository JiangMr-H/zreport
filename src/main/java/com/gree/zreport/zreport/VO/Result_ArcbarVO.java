/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ArcbarVO
 * Author:   891649
 * Date:     2019/12/19 14:16
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.zreport.zreport.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2019/12/19
 * @since 1.0.0
 */
@Data
public class Result_ArcbarVO<T> {
    /**
     * 柱状图
     */
    @JsonProperty("Column")
    private T Column;

    /**
     * 柱状图
     */
    @JsonProperty("ColumnB")
    private T ColumnB;

    /**
     *
     */
    @JsonProperty("ColumnMeter")
    private T  ColumnMeter;

    /**
     *
     */
    @JsonProperty("ColumnStack")
    private T  ColumnStack;

    /**
     * 混合
     */
    @JsonProperty("Mix")
    private T Mix;

    /**
     * 折线
     */
    @JsonProperty("LineA")
    private T LineA;

    /**
     * 折线
     */
    @JsonProperty("LineB")
    private T LineB;

    /**
     *
     */
    @JsonProperty("Area")
    private T Area;

    /**
     * 饼状图
     */
    @JsonProperty("Pie")
    private T Pie;

    /**
     *
     */
    @JsonProperty("Ring")
    private T Ring;

    /**
     *
     */
    @JsonProperty("Radar")
    private T Radar;

    /**
     * 环1
     */
    @JsonProperty("Arcbar1")
    private T Arcbar;

    /**
     * 环2
     */
    @JsonProperty("Arcbar2")
    private T Arcbar2;

    /**
     * 环3
     */
    @JsonProperty("Arcbar3")
    private T Arcbar3;

    /**
     *
     */
    @JsonProperty("Gauge")
    private T Gauge;

    /**
     *
     */
    @JsonProperty("Candle")
    private T Candle;

    /**
     *
     */
    @JsonProperty("CandleColumn")
    private T CandleColumn;












}