# spring-boot-actuator-influxdb
A Spring MetricsWriter implementation for InfluxDB

Basically a clone of the OpenTSDB writer then bent toward InfluxDB compatibility.

Note that with InfluxDB there are both tags and fields that are conceptually similar
and yet extensions to standard metrics.

InfluxDB requires at least one field, so this is written as `value` with the value of the `Metric` value.

For tags we currently re-use the OpenTSDB naming strategy.
