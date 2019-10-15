def first_D_digit_Fib(num):

    if (num == 0):
        return 0
    elif(num == 1):
           return 1
    
    return(first_D_digit_Fib(num - 1) + first_D_digit_Fib(num - 2))
 


print(first_D_digit_Fib(50))
