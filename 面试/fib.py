#/bin/bash
#coding=utf-8

# 非递归求斐波那契数列的和
#  1 1 2 3 5
def fib(max):
    n,a,b,sum=0,0,1,0
    while(n<max):
        n,a,b=n+1,b,a+b
        sum+=a
    return sum

if __name__ == '__main__':
    print(fib(5))

