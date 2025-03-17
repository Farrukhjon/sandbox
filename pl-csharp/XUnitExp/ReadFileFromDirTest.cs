
using System;
using System.IO;
using Xunit;

namespace Xunit.Experiment;
public class ReadFileFromDirTest
{
    [Fact]
    public void TestReadFileFromDir()
    {
        string currentDir = Directory.GetParent(Environment.CurrentDirectory)?.Parent?.Parent?.FullName;
        Assert.NotNull(currentDir);
        string path = System.IO.Path.Combine(currentDir, "resources/test1.txt");
        Assert.True(File.Exists(path));
    }
}
