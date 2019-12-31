/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: ArcbarRepository
 * Author:   891649
 * Date:     2019/12/19 8:39
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package com.gree.zreport.zreport.repository;

import com.gree.zreport.zreport.dataobject.Z_REPORT_ARCBAR;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author 891649
 * @create 2019/12/19
 * @since 1.0.0
 */
public interface ArcbarRepository extends JpaRepository<Z_REPORT_ARCBAR,Integer> {

     List<Z_REPORT_ARCBAR> findByState(Integer state);

}