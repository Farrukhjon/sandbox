namespace Model;
/// <summary>
/// Simple record represents data infromaton for Person.
/// </summary>
/// <param name="Id">Id of the person</param>
/// <param name="FirstName"></param>
/// <param name="MiddleName"></param>
/// <param name="LastName"></param>
/// <param name="Age"></param>
public record Person(int Id, string FirstName, string MiddleName, string LastName, int Age);