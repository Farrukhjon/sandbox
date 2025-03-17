import json
import logging
from random import choice

from randomizer.str_randomizer import StringRandomizer


log = logging.getLogger(__name__)


def create_random_meta_data_jsonl_list(num_data, data_size) -> list[str]:
    return [create_random_meta_data_jsonl(data_size, idx) for idx in range(1, num_data + 1)]


def create_random_meta_data_jsonl(data_size, idx) -> str:
    randomizer = StringRandomizer(idx)
    data_value = randomizer.generate_random_string(data_size)
    meta_data_tmp = meta_data_template(idx, idx, data_value)
    generate_json_tmp_in_bytes = json.dumps(meta_data_tmp).encode()
    diff = len(generate_json_tmp_in_bytes) - data_size
    data_value = randomizer.generate_random_string(data_size - diff)
    meta_data = meta_data_template(idx, idx, data_value)
    return json.dumps(meta_data)


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


def is_jsonl(data: bytes) -> bool:
    try:
        json.loads(data)
    except Exception:
        return False
    else:
        return True
