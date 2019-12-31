/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Result_Ring
 * Author:   891649
 * Date:     2019/12/27 11:34
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.zreport.zreport.VO.Ring;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.gree.zreport.zreport.VO.Pie.Pie;
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
public class Result_Ring {
    @JsonProperty("series")
    private List<Ring> RingSeries;
}