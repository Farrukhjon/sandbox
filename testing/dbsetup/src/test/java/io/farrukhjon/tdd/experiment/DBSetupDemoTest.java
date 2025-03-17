package io.github.farrukhjon.tdd.experiment;

import com.ninja_squad.dbsetup.DbSetup;
import com.ninja_squad.dbsetup.Operations;
import com.ninja_squad.dbsetup.destination.DataSourceDestination;
import com.ninja_squad.dbsetup.operation.DeleteAll;
import com.ninja_squad.dbsetup.operation.Insert;
import com.ninja_squad.dbsetup.operation.Operation;
import org.h2.jdbcx.JdbcDataSource;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class DBSetupDemoTest extends JdbcDataSourceInit {

    @BeforeEach
    public void setUp() {
        Operation deleteAllOp = Operations.deleteAllFrom("account");
        Operation insertOp = Insert
                .into("account")
                .columns("id", "account_name")
                .values(1L, "test-account")
                .build();
        DbSetup dbSetup = new DbSetup(new DataSourceDestination(getDataSource()), insertOp);
        dbSetup.launch();
    }


    @Test
    void testQueryAccounts() {
        Operation selectOp = Operations.sql("select * from account");
        DbSetup dbSetup = new DbSetup(new DataSourceDestination(getDataSource()), selectOp);
        dbSetup.launch();
    }
}
