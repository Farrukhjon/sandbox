namespace Xunit.Experiment;
using System;
using System.IO;
using Xunit;
using Xunit.Abstractions;

public class PrintContextDirectories
{

    private readonly ITestOutputHelper _testOutputHelper;

    public PrintContextDirectories(ITestOutputHelper testOutputHelper)
    {
        _testOutputHelper = testOutputHelper;
    }

    [Fact]
    public void Test()
    {
        // This will get the current WORKING directory (i.e. \bin\Debug)
        string workingDirectory = Environment.CurrentDirectory;
        // or: Directory.GetCurrentDirectory() gives the same result
        _testOutputHelper.WriteLine("Environment.CurrentDirectory: {0}", workingDirectory);

        // This will get the current PROJECT bin directory (ie ../bin/)
        string projectDirectory = Directory.GetParent(workingDirectory).Parent.FullName;
        _testOutputHelper.WriteLine("Directory.GetParent(workingDirectory).Parent.FullName: {0}", projectDirectory);
        // This will get the current PROJECT directory
        string currentProjectDirectory = Directory.GetParent(workingDirectory).Parent.Parent.FullName;
        _testOutputHelper.WriteLine("Directory.GetParent(workingDirectory).Parent.Parent.FullName: {0}", currentProjectDirectory);
    }

}