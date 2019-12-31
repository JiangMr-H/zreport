/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: Arcbar
 * Author:   891649
 * Date:     2019/12/19 8:38
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.zreport.zreport.dataobject;


import lombok.Data;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2019/12/19
 * @since 1.0.0
 */
@Data
@Entity
public class Z_REPORT_ARCBAR {

    @Id
    @GeneratedValue
    private Integer id;

    private String name;

    private Long data;

    private String color;

    private Date inserttime;

    private Integer state;
}