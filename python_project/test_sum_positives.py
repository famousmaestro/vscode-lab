import pytest
from sum_positives import sum_positive_numbers


def test_sum_positive_numbers():
    assert sum_positive_numbers([1, 2, 3]) == 6
    assert sum_positive_numbers([]) == 0
    assert sum_positive_numbers([10]) == 10


def test_sum_positive_numbers_raises():
    with pytest.raises(ValueError):
        sum_positive_numbers([1, -2, 3])
