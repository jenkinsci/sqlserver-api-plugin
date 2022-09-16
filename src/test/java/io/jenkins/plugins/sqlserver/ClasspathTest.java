package io.jenkins.plugins.sqlserver;

import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import com.microsoft.sqlserver.jdbc.SQLServerException;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

public class ClasspathTest {
    @Test
    public void testClasspath() throws ClassNotFoundException {
        assertThat(Class.forName(SQLServerDriver.class.getName()), notNullValue());
    }

    @Test
    public void testDriver() throws SQLServerException {
        SQLServerDriver driver = new SQLServerDriver();
        assertThat(driver.acceptsURL("jdbc:sqlserver://localhost:1433;databaseName=postgres"), is(true));
    }
}
