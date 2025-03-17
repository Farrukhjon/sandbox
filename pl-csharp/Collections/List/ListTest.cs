using System;
using System.Linq;
using System.Collections.Generic;

namespace Collections.List;
public class ListTest
{

    [Fact]
    public void AddElementsToList()
    {
        List<int> ints = new();
        ints.Add(1);
        ints.Add(2);
        ints.Add(3);
        ints.Add(4);
        ints.Add(5);

        Assert.Equal([1, 2, 3, 4, 5], ints);
    }

    [Fact]
    public void AddElementsToListViaForLop()
    {
        List<int> ints = [];
        for (int i = 1; i <= 100; i++)
        {
            ints.Add(i);
        }

        Assert.Equal(100, ints.Count);
    }

    [Fact]
    public void AddElementsToListViaEnumerableRange()
    {
        List<int> ints = Enumerable.Range(1, 100).ToList();

        Assert.Equal(100, ints.Count);
    }

    [Fact]
    public void CountList()
    {
        List<int> ints = [1, 2, 3, 4, 5];

        Assert.Equal(5, ints.Count);
    }
    [Fact]
    public void FilterList()
    {
        List<int> ints = [1, 2, 3, 4, 5];

        var evenInts = ints.Where(i => i % 2 == 0);

        Assert.Equal([2, 4], evenInts);
    }
}