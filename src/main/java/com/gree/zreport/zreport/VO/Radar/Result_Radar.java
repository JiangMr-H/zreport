/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Result_Radar
 * Author:   891649
 * Date:     2019/12/27 11:36
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.zreport.zreport.VO.Radar;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gree.zreport.zreport.VO.LineB.LineB;
import lombok.Data;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2019/12/27
 * @since 1.0.0
 */
@Data
public class Result_Radar {

    @JsonProperty("categories")
    private List RadarCategories;

    @JsonProperty("series")
    private List<Radar> RadarSerie;

}