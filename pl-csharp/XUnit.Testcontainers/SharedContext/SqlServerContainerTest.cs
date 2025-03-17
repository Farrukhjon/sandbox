namespace XUnit.Testcontainers.Experiment.SharedContext;

using System.Threading.Tasks;
using Microsoft.Data.SqlClient;
using Xunit;

public class SqlServerContainerTest : IClassFixture<SqlServerContainerFixture>
{
    private readonly SqlServerContainerFixture _sqlServerContainerFixture;

    public SqlServerContainerTest(SqlServerContainerFixture sqlServerFixture)
    {
        _sqlServerContainerFixture = sqlServerFixture;
    }

    [Fact]
    public async Task ReadFromMsSqlDatabase()
    {
        await using var connection = new SqlConnection(_sqlServerContainerFixture.GetConnectionString());
        await connection.OpenAsync();

        await using var command = connection.CreateCommand();
        command.CommandText = "SELECT 1;";

        var actual = await command.ExecuteScalarAsync() as int?;
        Assert.Equal(1, actual.GetValueOrDefault());
    }


}