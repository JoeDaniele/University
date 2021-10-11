def quadratic_formula(a, b, c):
    d = b * b - 4 * a * c
    if d < 0 or a == 0:
        return None
    x1 = (-b + (d ** 0.5)) / (2 * a)
    x2 = (-b - (d ** 0.5)) / (2 * a)
    return x1, x2


if __name__ == '__main__':
    data = input().split()
    x = float(data[0])
    y = float(data[1])
    z = float(data[2])
    (x1, x2) = quadratic_formula(x, y, z)
    print('Solutions to {}x^2 + {}x + {} = 0'.format(x, y, z))
    print("x1 = {}".format(x1))
    print("x2 = {}".format(x2))