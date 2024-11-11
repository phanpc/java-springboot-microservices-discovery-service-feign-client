package com.phanpc.springboot.microservice.eureka.naming.server;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest  //Đây là annotation để tạo ra ApplicationContext cho môi trường test
public class EurekaNamingServerAppTests {

    //Kiểm tra xem context có được load không (có chạy được microservice này không)
    @Test
    public void contextLoads() {
    }

}
