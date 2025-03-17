#!/usr/bin/env dotnet-script

using System;
using System.Collections.Generic;
using System.Threading.Tasks;

// These classes are intentionally empty for the purpose of this example. They are simply marker classes for the purpose of demonstration, contain no properties, and serve no other purpose.
internal class Bacon { }
internal class Coffee { }
internal class Egg { }
internal class Juice { }
internal class Toast { }

static async Task<Toast> MakeToastWithButterAndJamAsync(int number)
{
    var toast = await ToastBreadAsync(number);
    ApplyButter(toast);
    ApplyJam(toast);

    return toast;
}

private static Juice PourOJ()
{
    Console.WriteLine("PourOJ: Pouring orange juice");
    return new Juice();
}

private static void ApplyJam(Toast toast) =>
    Console.WriteLine("ApplyJam: Putting jam on the toast");

private static void ApplyButter(Toast toast) =>
    Console.WriteLine("ApplyJam: Putting butter on the toast");

private static async Task<Toast> ToastBreadAsync(int slices)
{
    for (int slice = 0; slice < slices; slice++)
    {
        Console.WriteLine("ToastBreadAsync: Putting a slice of bread in the toaster");
    }
    Console.WriteLine("ToastBreadAsync: Start toasting...");
    await Task.Delay(3000);
    Console.WriteLine("ToastBreadAsync: Remove toast from toaster");

    return new Toast();
}

private static async Task<Bacon> FryBaconAsync(int slices)
{
    Console.WriteLine($"FryBaconAsync: putting {slices} slices of bacon in the pan");
    Console.WriteLine("FryBaconAsync: cooking first side of bacon...");
    await Task.Delay(3000);
    for (int slice = 0; slice < slices; slice++)
    {
        Console.WriteLine("FryBaconAsync: flipping a slice of bacon");
    }
    Console.WriteLine("FryBaconAsync: cooking the second side of bacon...");
    await Task.Delay(3000);
    Console.WriteLine("FryBaconAsync: Put bacon on plate");

    return new Bacon();
}

private static async Task<Egg> FryEggsAsync(int howMany)
{
    Console.WriteLine("FryEggsAsync: Warming the egg pan...");
    await Task.Delay(3000);
    Console.WriteLine($"FryEggsAsync: cracking {howMany} eggs");
    Console.WriteLine("FryEggsAsync: cooking the eggs ...");
    await Task.Delay(3000);
    Console.WriteLine("FryEggsAsync: Put eggs on plate");

    return new Egg();
}

private static Coffee PourCoffee()
{
    Console.WriteLine("PourCoffee: Pouring coffee");
    return new Coffee();
}

// Execution:
Coffee cup = PourCoffee();
Console.WriteLine("PourCoffee: coffee is ready");

var eggsTask = FryEggsAsync(2);
var baconTask = FryBaconAsync(3);
var toastTask = MakeToastWithButterAndJamAsync(2);

var breakfastTasks = new List<Task> { eggsTask, baconTask, toastTask };
while (breakfastTasks.Count > 0)
{
    Task finishedTask = await Task.WhenAny(breakfastTasks);
    if (finishedTask == eggsTask)
    {
        Console.WriteLine("eggs are ready");
    }
    else if (finishedTask == baconTask)
    {
        Console.WriteLine("bacon is ready");
    }
    else if (finishedTask == toastTask)
    {
        Console.WriteLine("toast is ready");
    }
    await finishedTask;
    breakfastTasks.Remove(finishedTask);
}

Juice oj = PourOJ();
Console.WriteLine("oj is ready");
Console.WriteLine("Breakfast is ready!");