import asyncio


class DataProvider:
    def __init__(self):
        pass

    async def get_data(self, id: int, sleep: int):
        print(f"Start of getting data for id: {id}")
        await asyncio.sleep(sleep)
        print(f"Data was retreived for id: {id}")
        return {"id": id, "data": f"Data for id: {id}"}


async def main():
    dataProvider = DataProvider()
    results = await asyncio.gather(
        dataProvider.get_data(1, 1),
        dataProvider.get_data(2, 3),
        dataProvider.get_data(3, 2)
    )
    for result in results:
        print(f"Result: {result}")

asyncio.run(main())
