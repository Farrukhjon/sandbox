package io.github.farrukhjon.tdd.experiment;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.DbSetupTracker;
import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.destination.DataSourceDestination;
import com.ninja_squad.dbsetup.operation.DeleteAll;
import com.ninja_squad.dbsetup.operation.Operation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DbSetupTrackerDemoTest extends JdbcDataSourceInit {

    private static DbSetupTracker dbSetupTracker = new DbSetupTracker();

    @BeforeEach
    void setUp() {
        Operation operation =
                Operations.sequenceOf(
                        DeleteAll.from("CLIENT"),
                        Operations.insertInto("CLIENT")
                                  .columns("CLIENT_ID", "FIRST_NAME", "LAST_NAME", "DATE_OF_BIRTH", "COUNTRY_ID")
                                  .values(1L, "John", "Doe", "1975-07-19", 1L)
                                  .values(2L, "Jack", "Smith", "1969-08-22", 2L)
                                  .build());
        DbSetup dbSetup = new DbSetup(new DataSourceDestination(getDataSource()), operation);

        dbSetupTracker.launchIfNecessary(dbSetup);
    }

    @Test
    void readOnlyTest1() {
        dbSetupTracker.skipNextLaunch();
    }

}
