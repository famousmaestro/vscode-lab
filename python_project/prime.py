def is_prime(n):
    if n < 2:
        return False
    # Fixed the bug: Originally range(2, 2*n) which is wrong.
    for i in range(2, n):
        if n % i == 0:
            return False
    return True
