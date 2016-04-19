package org.springframework.boot.actuate.metrics.influxdb;

import org.junit.Assert;
import org.junit.Test;
import org.junit.matchers.JUnitMatchers;

import java.util.Date;

/**
 * Created by jgreen on 4/15/2016.
 */
public class InfluxDBDataTest {

    @Test
    public void testToString() {
        InfluxDBData data = new InfluxDBData();
        data.setMetric("com.example.some-app.some-service.some-indicator");
        data.setValue(1);
        data.setTimestamp(new Date().getTime());
        Assert.assertThat(data.toString(), JUnitMatchers.containsString("com.example.some-app.some-service.some-indicator ".replace(".", "_")));
        Assert.assertThat(data.toString(), JUnitMatchers.containsString("1i"));
    }
}
