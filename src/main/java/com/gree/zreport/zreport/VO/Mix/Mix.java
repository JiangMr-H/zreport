/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Mix
 * Author:   891649
 * Date:     2019/12/19 17:40
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.zreport.zreport.VO.Mix;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2019/12/19
 * @since 1.0.0
 */
@Data
public class Mix<T> {

     @JsonProperty("name")
    private String MixName;
     @JsonProperty("data")
    private List MixData;
     @JsonProperty("type")
    private String MixType;
     @JsonProperty("style")
    private String MixStyle;
     @JsonProperty("color")
    private String MixColor;
     @JsonProperty("disableLegend")
    private Boolean MixDisableLegend;
}