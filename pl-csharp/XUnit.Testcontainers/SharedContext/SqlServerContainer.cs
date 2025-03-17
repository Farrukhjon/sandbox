namespace XUnit.Testcontainers.Experiment.SharedContext;

using System;
using System.Threading.Tasks;
using global::Testcontainers.MsSql;

public class SqlServerContainerFixture : IAsyncLifetime
{
    private readonly MsSqlContainer _container = new MsSqlBuilder()
    .WithImage("mcr.microsoft.com/mssql/server:2019-latest")
    .Build();


    public Task InitializeAsync()
    {
        return _container.StartAsync();
    }

    public Task DisposeAsync()
    {
        return _container.DisposeAsync().AsTask();
    }

    internal string GetConnectionString()
    {
        return _container.GetConnectionString();
    }
}