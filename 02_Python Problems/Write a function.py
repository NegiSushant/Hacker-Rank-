#https://www.hackerrank.com/challenges/write-a-function/problem
# Task--->>>

#           Given a year, determine whether it is a leap year. If it is a leap year, return the Boolean True, otherwise return False.
          
#           Note that the code stub provided reads from STDIN and passes arguments to the is_leap function. It is only necessary to complete the is_leap function.

year = int(input("Please enter the year: "))
if year % 4==0:
  if year % 100 ==0:
    if year % 400 ==0:
      print("Leap Year.")
    else:
      print("Not Leap Year.")
  else:
    print("Not Leap Year.")
else:
  print("Not Leap Year.")
