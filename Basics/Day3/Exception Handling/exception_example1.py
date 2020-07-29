# divisor example


try:
    numerator = int(input("Numerator: "))
    denominator = int(input("Denominator: "))
    result = numerator/denominator
    print(result)
except ZeroDivisionError:
    print("Division by zero")
except ValueError:
    print("Denominator should be only number ")
