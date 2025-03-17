using System;
using System.Linq;
using System.Collections.Generic;

namespace Collections.Linq;
public class LinqTest
{

    [Fact]
    public void AllMatch()
    {
        List<object> inst = [1, null, 2, 33, null];
        var result = inst.All(i => i != null);
        Assert.False(result);
        inst = [1, 2, 3, 4];
        result = inst.All(i => i != null);
        Assert.True(result);
    }

    [Fact]
    public void AnyMatch()
    {
        List<object> inst = [1, null, 2, 33, null];
        var result = inst.Any(i => i != null);
        Assert.True(result);

    }

}
