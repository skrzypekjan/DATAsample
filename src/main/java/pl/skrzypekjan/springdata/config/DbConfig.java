package pl.skrzypekjan.springdata.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@Configuration
public class DbConfig {

    private DataSource dataSource;

    @Autowired
    public DbConfig(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    //    @Bean
//    public DataSource getDataSource(){
//        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
//        dataSourceBuilder.url("jdbc:mysql://sql7.freemysqlhosting.net:3306/NAME");
//        dataSourceBuilder.username("USERNAME");
//        dataSourceBuilder.password("PASSWORD");
//        dataSourceBuilder.driverClassName("com.mysql.cj.jdbc.Driver");
//        return dataSourceBuilder.build();
//    }

    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(dataSource);
    } //getDataSource()

//    @EventListener(ApplicationReadyEvent.class)
//    public void init() {
//        String sql = "CREATE TABLE videos(video_id int, title varchar(255), PRIMARY KEY (video_id))";
//        getJdbcTemplate().update(sql);
//    }
}
