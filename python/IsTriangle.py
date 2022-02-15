# 7 kyu Is this a triangle?

def is_triangle(a, b, c):
    return (a+b>c) and (b+c>a) and (c+a>b)