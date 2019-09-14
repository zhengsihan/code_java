package zsh.dbc.db;

import org.apache.ibatis.annotations.Select;

/**
 * Created by zhengsihan, on 2019-09-14
 */
public interface BlogMapper {
    @Select("SELECT * FROM blog WHERE id = #{id}")
    Blog selectBlog(int id);
}
