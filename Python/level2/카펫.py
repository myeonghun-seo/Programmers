def solution(brown, yellow):
    w = (brown / 2) + 1
    h = 1
    while w >= h:
        if (w - 2) * (h - 2) == yellow:
            print(2*w + 2*h)
            return [w, h]
        w -= 1
        h += 1
