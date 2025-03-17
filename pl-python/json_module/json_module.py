import json

tables = [
    {"meta": {"op": "c", "table": "Table1"}},
    {"meta": {"op": "c", "table": "Table2"}}
]
json_str = json.dumps(tables)
print(json_str)

str_json_list = list(map(lambda item: json.dumps(item).encode(), tables))
print(str_json_list)


