using System;
using System.Text.Json;
using Model;

namespace JSON;
public class JSONSerializationDeserialization
{
    [Fact]
    public void Test()
    {
        var aliObj = new Person(1, "Ali", "Vali", "Gani", 33);
        Console.WriteLine($"Record instance: {aliObj}");

        string aliJson = JsonSerializer.Serialize(aliObj);
        Console.WriteLine($"JSON serilized: {aliJson}");

        Person? newAliObj = JsonSerializer.Deserialize<Person>(aliJson);
        Console.WriteLine($"JSON deserialized: {newAliObj}");
    }
}
