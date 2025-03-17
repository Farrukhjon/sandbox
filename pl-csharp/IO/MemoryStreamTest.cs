
using System.IO;
using System.Text;
namespace IO;
public class MemoryStreamTest
{
    [Fact]
    public void TestMemoryStreamWriteByteMethod()
    {
        int capacity = 1024;
        MemoryStream memoryStream = new(capacity: capacity);
        for (int i = 97; i < 128; i++)
        {
            memoryStream.WriteByte((byte)i);
        }

        const int Expected = 128 - 97;
        Assert.Equal(capacity, memoryStream.Capacity);
        Assert.Equal(Expected, memoryStream.Length);
        Assert.Equal(Expected, memoryStream.Position);

        string str = "Hello World!";
        byte[] bytes = Encoding.ASCII.GetBytes(str);
        Assert.Equal(str.Length, bytes.Length);

        int counter = 0;
        while (counter < bytes.Length)
        {
            memoryStream.WriteByte(bytes[counter++]);
        }
        Assert.Equal(43, memoryStream.Length);
    }
    [Fact]
    public void TestMemoryStreamToArrayMethod()
    {
        string str = "Hello World!";
        int capacity = str.Length;
        MemoryStream memoryStream = new(capacity: capacity);

        byte[] bytes = Encoding.ASCII.GetBytes(str);
        Assert.Equal(str.Length, bytes.Length);
        byte[] result = memoryStream.ToArray();
        Assert.Equal(0, result.Length);

        int counter = 0;
        while (counter < capacity)
        {
            memoryStream.WriteByte(bytes[counter++]);
        }
        result = memoryStream.ToArray();
        Assert.Equal(bytes.Length, result.Length);

    }
}