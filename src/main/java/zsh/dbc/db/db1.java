package zsh.dbc.db;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

import javax.sql.DataSource;
import java.io.InputStream;

public class db1 {

    /**
     * 使用xml做构建SqlSessionFactory
     * @throws Exception
     */
    public static void n1() throws Exception{
        String resource = "";//mybatis配置文件
        InputStream is = Resources.getResourceAsStream(resource);
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(is);
    }

    /**
     * 不使用 XML 构建 SqlSessionFactory
     */
    public void n2(){
        DataSource ds = BlogDataSourceFactory.getBlogDataSource();
        TransactionFactory tf = new JdbcTransactionFactory();
        Environment env = new Environment("dev", tf, ds);
        Configuration conf = new Configuration(env);
        conf.addMapper(BlogMapper.class);
        SqlSessionFactory ssf = new SqlSessionFactoryBuilder().build(conf);
    }

    //旧版本获取SqlSession
    public void n3(){
        try(SqlSession session = sqlSessionFactory.openSession()){
            Blog blog = (Blog) session.selectOne("org.mybatis.example.BlogMapper.selectBlog", 101);
        }
    }

    public void n4(){
        try(SqlSession session = ssf.openSession()){
            BlogMapper mapper = session.getMapper(BlgoMapper.class);
            Blog blog = mapper.selectBlog(101);
        }
    }
}
