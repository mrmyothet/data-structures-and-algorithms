- factorial concept - number of combinations

```
2! = 2 * 1
3! = 3 * 2 * 1
4! = 4 * 3 * 2 * 1

0! = 1

n! = n * (n-1)!

```

### Characteristics of Recursion

- base case
- input
- divide and conquer method

---

```
fact(0)
1 * fact(0)
2 * fact(1)
3 * fact(2)
4 * fact(3)


```

### Downsize of recursive

when depth is big

- stack frame ကြီးသွားနိုင်တယ်
- stack overflow
- space complexity will up

### Iterative vs Recursive

- functional programming languages use recursion instead of iterative
- tail call recursion

### Binary Search Algorithm

sorted array

[1,3,6,9,10, 15, 34]

left = 0
right = n-1

middle = (left + right) / 2

left < right
