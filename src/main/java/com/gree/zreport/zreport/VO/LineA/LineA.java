/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Line
 * Author:   891649
 * Date:     2019/12/19 15:26
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.zreport.zreport.VO.LineA;

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
public class LineA {
    @JsonProperty("name")
    private String LineNameA;
    @JsonProperty("data")
    private List LineDataA;
}