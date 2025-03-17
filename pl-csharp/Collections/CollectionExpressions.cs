using System.Collections.Generic;
namespace Collections;
public class CollectionExpressions
{

    [Fact]
    public void TestListCollectionExpression()
    {

        List<string> names = ["Ali", "Vali", "Sami", "Gani"];

        Assert.Equal(4, names.Count);
    }


}
