/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: GaugeC
 * Author:   891649
 * Date:     2019/12/27 13:37
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.zreport.zreport.VO.Gauge;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2019/12/27
 * @since 1.0.0
 */
@Data
public class GaugeC {

    @JsonProperty("value")
    private Double GaugeValue;
    @JsonProperty("color")
    private String GaugeColor;

}