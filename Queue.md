First in First Out

Head
Tail

- Enqueue -> Insert into Tail
- Dequeue -> Pop from Head

head = 0
tail = 0

[, , , , , ]

enqueue 10
[10, , , , ]
head = 0
tail = 10

enqueue 20
[10, 20, , , ]
head = 0
tail = 10

enqueue 30
[10, 20, 30, , ]
head = 0
tail = 10

enqueue 40
[10, 20, 30, 40, ]
head = 0
tail = 10

dequeue
head =
tail =
[, 20, 30, 40, ]

dequeue
head =
tail =
[, , 30, 40, ]
