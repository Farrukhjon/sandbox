namespace Files;
public class Program
{
    [Fact]
    public void TestFileRead()
    {

        var path = "dir1/Lines.txt"; 
        var result = File.ReadAllText(path: path);

        Console.WriteLine($"Result: {result}");
    }
}


