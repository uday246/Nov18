ch="y"
while(ch=="y"):
  height = float(input("Input your height in meters: "))
  weight = float(input("Input your weight in kilogram: "))
  print("Your body mass index is: ", round(weight / (height * height), 2))
  ch=input("do you want to continue press y")