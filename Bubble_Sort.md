### Bubble Sort

[4,2,11,3]

- [11]
- [4, 11]
- [3, 4, 11]
- [2, 3, 4, 11]

[4,2,11,3]
step: 1 - first loop
compare and if greater than, switch
[2,4,11,3]
[2,4,11,3]
[2,4,3,11] => last element - 11

step 2:
[2,4,3]
[2,4,3]
[2,3,4] => 4, 11

step 3:
[2,3]

done: 2,3,4,11

---

[50, 20, 11, 3, 45, 2]

```java
for i = 0; i < arr.length; // last item
  for j =0; j < i;  // comparison
```

j=0
[20, 50, 11, 3, 45, 2]

j=1
[20, 11, 50, 3, 45, 2]

j=2
[20, 11, 3, 50, 45, 2]

j=3
[20, 11, 3, 45, 50, 2]

j=4
[20, 11, 3, 45, 2, 50]

---

i=1
j=arr.length - i
[20, 11, 3, 45, 2]
[11, 20, 3, 45, 2]
[11, 3, 20, 45, 2]
[11, 3, 20, 45, 2]
[11, 3, 20, 2, 45]

[11,3,20,2], [45,50]

---

[11,3,20,2]
[3,11,20,2]
[3,11,20,2]
[3,11,2,20] , [20,45,50]

---

[3,11,2]
[3,11,2]
[3,2,11] , [11,20,45,50]

---

[3,2]
[2,3] , [2,3,11,20,45,50]

---

Algorithm draft:

- i => arr.length - 1
- j => arr.length - i

---

```pseudo
bubbleSort(array)
for i <- 1 to sizeOfArray - 1
for j <- 1 to sizeOfArray - 1 - i
if leftElement > rightElement
swap leftElement and rightElement
end bubbleSort
```
