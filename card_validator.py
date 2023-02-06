card_number= list(input("please enter a card number: ")).strip())
#Remove the last digit from the card number
check_digit = card_number.pop()
#reverse the order of the remaining numbers
card_number.reverse()
processed_digit = []

for index, digit in
    enumerate(card_number):
    if index % 2 == 0:
       doubled_digit = int(digit) * 2
#substract 9 from any results that are greater than 9
    if doubled_digit > 9:
         doubled_digit = doubled_digit -9
         processed_digits.append(doubled_digit)
           else:
processed_digits.append(int(digit))

total = int(check_digit) + sum(processed_digits)
#verify that the sum of the digits is divisible by 10
if total % 10 == 0:
    print("valid")
else:
print("invalid!")