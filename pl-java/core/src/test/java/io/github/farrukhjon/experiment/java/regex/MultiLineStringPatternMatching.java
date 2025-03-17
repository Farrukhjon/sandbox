package io.github.farrukhjon.experiment.java.regex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author fsattorov
 */
public class MultiLineStringPatternMatching {
  @Test
  void testMultilineStringPattern() {

    var actualStr = """
        "source": {
         "version": "2.7.3.Final",
         "connector": "sqlserver",
         "name": "server1",
         "ts_ms": 1729238029104,
         "snapshot": "true",
         "db": "LocusTestIT",
         "sequence": null,
         "ts_us": 1729238029104000,
         "ts_ns": 1729238029104000000,
         "schema": "dbo",
         "table": "BASIC_ENTRIES",
         "change_lsn": null,
         "commit_lsn": "00000025:00000448:0003",
         "event_serial_no": null
        }
        """;

    var regexJson = """
        "source": \\{
         "version": "2.7.3.Final",
         "connector": "sqlserver",
         "name": "server1",
         "ts_ms": \\d+,
         "snapshot": "true",
         "db": "LocusTestIT",
         "sequence": null,
         "ts_us": \\d+,
         "ts_ns": \\d+,
         "schema": "dbo",
         "table": "BASIC_ENTRIES",
         "change_lsn": null,
         "commit_lsn": "00000025:00000448:0003",
         "event_serial_no": null
        }
        """;
    Matcher matcher = Pattern.compile(regexJson, Pattern.MULTILINE).matcher(actualStr);
    boolean matches = matcher.matches();
    Assertions.assertTrue(matches);
  }
}
