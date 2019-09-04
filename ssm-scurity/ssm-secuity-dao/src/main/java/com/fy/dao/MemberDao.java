package com.fy.dao;

import com.fy.domain.Member;
import org.apache.ibatis.annotations.Select;

/**
 * @author java
 * @desc
 * @ClassName
 **/
public interface MemberDao {
    @Select("select * from member where id=#{id}")
     Member findById(String id) throws Exception;
}
