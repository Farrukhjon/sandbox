import json
from random import choice
from randomizer.str_randomizer import StringRandomizer

def meta_data_template(table_suffix, data_id, data_value):
    return {
        'meta': {
            'op': f'{(choice(['c', 'r', 'u', 'd']))}',
            'table': f'Table{table_suffix}'
        },
        'data': {
            'id': data_id,
            'value': data_value
        }
    }


class TestJson:

    def test_whether_items_of_a_buffer_is_json(self):
        tables_buff = bytearray()
        for i in range(1, 1024):
            meta_data = meta_data_template(i, i, StringRandomizer(i).generate_random_string(128))
            jsonl_bytes = json.dumps(meta_data).encode()
            tables_buff += jsonl_bytes + b'\n'
        mem_buff = memoryview(tables_buff)
        while True:
            b = mem_buff[0: 10]
            print(b.tobytes().decode())
