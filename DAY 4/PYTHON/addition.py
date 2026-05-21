def finding_the_numeral(numbers, numeral):
    count = 0

    box = []

    for index in range(len(numbers)):

        for digit in range(index, len(numbers)):

            if numbers[index] + numbers[digit] == numeral:

                box = [numbers[index], numbers[digit]]

    return box
