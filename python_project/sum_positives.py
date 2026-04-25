def sum_positive_numbers(numbers):
    total = 0
    for num in numbers:
        if num < 0:
            raise ValueError("Negative numbers are not allowed")
        total += num
    return total
