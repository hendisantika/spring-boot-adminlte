package com.hendisantika.adminlte;

import org.junit.jupiter.api.Test;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-adminlte
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/25/24
 * Time: 23:59
 * To change this template use File | Settings | File Templates.
 */
@Testcontainers
public class DatasourceHealthTests {

    // will be started before and stopped after each test method
    @Container
    private final MySQLContainer mySQLContainer = new MySQLContainer("mysql:8.4.0")
            .withDatabaseName("users")
            .withUsername("yuji")
            .withPassword("S3cret");

    @Test
    void test() {
        assertThat(mySQLContainer.isRunning()).isTrue();
        assertThat(mySQLContainer.isRunning()).isTrue();
    }
}
