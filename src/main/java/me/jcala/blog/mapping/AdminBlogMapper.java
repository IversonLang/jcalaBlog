package me.jcala.blog.mapping;

import me.jcala.blog.domain.BlogView;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


/**
 * Created by Administrator on 2016/9/3.
 */
@Repository
@Mapper
public interface AdminBlogMapper {
      @Insert("insert into blog_view (date,title,article,tags) values(#{bv.date},#{bv.title},#{bv.article},#{bv.tags})")
      void addBlog(@Param("bv") BlogView blogView) throws Exception;

      //SELECT distinct(`lcontent`) FROM `caiji_ym_liuyan`


}
