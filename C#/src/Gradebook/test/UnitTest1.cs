using System;
using Xunit;

namespace Gradebook.Test;

public class BookTests
{
    [Fact]
    public void Test1()
    {
        //arrange
        var book = new Book("");
        book.AddGrade(89.1);
        book.AddGrade(90.5);
        book.AddGrade(77.3);
        //act
        var result = book.ShowStats();

        //assert
        Assert.Equal(85.6, result.Average);


    }
}