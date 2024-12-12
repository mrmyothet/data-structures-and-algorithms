- stake frame
- continuouslly allocated
- element address

1 item - 4 byte

1, 2, 3, 4, 5

- 0010
- 0014
- 0018
- 0022

formula

- array index -> first element memory + (index \* size of element)
- arr [2] = 10 + (2 \* 4) = 14

index -> fast

Array - Power - by using index

search by element - should not use Array - slow

---

number guessing game
(0 - 10)
random -> num = 3

user input what is your guess

- 5

actual num = 3
guess = 5

your number is too high

0-4

input = 2

your number is too low

- num > 2
- num < 5

will use guessing game logic.

### Binary Search

[1,4,6,13,21,50]

Array must be already sorted.

item to find = 4

start = 0;
end = 5

middle = (start + end) / 2;

(0 + 5) / 2 = 2

arr[2] = 6

middle > item -> left side

end = middle - 1

start = 0
end = 2 - 1 = 1

middle = = (0 + 1) / 2 = 0

arr[0] = 1

middle < item => right side

start = middle + 1
start = 0 + 1 = 1

start = 1
end = 1
middle = (1 + 1) / 2 = 1

arr[1] = 4

- it is high level abstration

item to find = 10 -- worst case - cannot find item

start = 0
end = 5
middle = 5/2 = 2; arr[2] = 6

start = middle + 1; 3
end = 5
middle = 8/2 = 4= arr[4] = 21

end = middle - 1 = 3
start = 3
end = 3
middle = 6/2 = 3; arr[3] = 13

end = middle-1 = 2
start = 3

start > end - not find - exit condition

overall steps = 4 steps
O(log n)

---

start = 0
end = length - 1
middle = (start + end) / 2

```
while (start <= middle)
{
    if arr[middle] == item => found

    if (arr[middle] > item ) => move left
        end = middle - 1

    if (arr[middle] < item) => move right
        start = middle + 1

}
```
