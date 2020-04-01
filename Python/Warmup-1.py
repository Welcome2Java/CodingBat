def sleep_in(weekday, vacation):
    if not weekday or vacation:
        return True
    else:
        return False


def monkey_trouble(a_smile, b_smile):
    if a_smile and b_smile:
        return True
    if not a_smile and not b_smile:
        return True
    return False


def sum_double(a, b):
    if a == b:
        return (a + b) * 2
    return a + b


def diff21(n):
    if n > 21:
        return abs(21 - n) * 2
    return 21 - n


def makes10(a, b):
    if a == 10 or b == 10 or a + b == 10:
        return True
    return False

def parrot_trouble(talking, hour):
    if talking and hour < 7:
        return True

    if talking and hour > 20:
        return True

    return False

def near_hundred(n):
    if abs(100-n) <= 10 or abs(200-n)<= 10:
        return True
    else:
        return False

def pos_neg(a, b, negative):
    if negative:
        if a<0 and b<0:
            return True
        else:
            return False
    elif not negative:
        if a<0 and b<0:
            return False
        elif a<0 or b<0:
            return True
        elif a>0 and b>0:
            return False

def not_string(str):
    # len(str) gets the length of the string
    # len(str) >= 3 seeing the length of the string is greater or equal to 3
    # str[:3] goes from the start of the string up to but not
    # including index 3
    if len(str) >= 3 and str[:3] == "not":
        return str
    return ("not " + str)

def missing_char(str, n):
    length = len(str)
    first = str[:n]
    second = str[n+1:length]
    return first + second
