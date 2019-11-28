package util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.annotation.Resource;
import javax.sql.DataSource;

import org.springframework.stereotype.Component;
@Component("jdb")
public class JDB {
	@Resource(name="ds")
	private DataSource dataSource;
	//封装获取连接对象的代码
	public Connection getConn() {
		//4.从连接池中获取连接对象  
		try {
			return dataSource.getConnection();//从连接池中获取重用的连接，若连接池满了，则等待，如果有连接归还，则获取重用的连接
		} catch (Exception e) {
			//记日志(保留现场)
			e.printStackTrace();
			/**
			 * 看异常能否恢复，如果能够恢复，则立即恢复
			 * 如果不能够恢复，比如数据库停止服务，提示用户稍后重试
			 */
			throw new RuntimeException(e); //注意此行要手动进行跑出异常 如果怎样都有异常那么就这样处理
		}
	}

	//关闭资源
	public void close(ResultSet rs,Statement stat, Connection conn) {
		try {
			//避免空指针异常
			if(rs!=null) {
				rs.close();//释放查询结果
			}
			if(stat!=null) {
				stat.close();//释放语句对象
			}
			if(conn!=null) {
				conn.close();//将用过的连接归还给连接池
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//数据回滚
	public void rollback(Connection conn) {
		if(conn!=null) {
			try {
				conn.rollback();//事务的回滚一般在这里进行 
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
	}
}
