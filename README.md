# Queue - Data Structure

## 📌 Introduction
A **Queue** is a linear data structure that follows the **FIFO (First In First Out)** principle.  
The element inserted first is the one that is removed first.  

---

## 📚 Operations
1. **enqueue(x)** → Insert element `x` at the rear.
2. **dequeue()** → Remove element from the front.
3. **peek() / front()** → Get the element at the front without removing it.
4. **isEmpty()** → Check if the queue is empty.
5. **isFull()** → Check if the queue is full (for fixed-size queues).

---

## 🧾 Types of Queues
- **Simple Queue** → Basic FIFO structure.
- **Circular Queue** → Optimized queue with circular indexing.
- **Deque (Double-Ended Queue)** → Insertion & deletion from both ends.
- **Priority Queue** → Elements served based on priority instead of order.

---

## 🛠 Implementations
### Array-based Queue
- Easy but may waste space (linear queue).
- Use **circular queue** to optimize.

### Linked List-based Queue
- Dynamic memory allocation.
- No size limitation.

### Java Built-in Implementations
- `Queue` interface → (`LinkedList`, `PriorityQueue`)
- `Deque` interface → (`ArrayDeque`)

---

## 🚀 Applications
- CPU & Disk Scheduling
- Print Queue Management
- Breadth First Search (BFS) in Graphs
- Cache & Buffer handling
- Networking (data packets)

---

## 💡 Practice Problems
- Implement Queue using Arrays
- Implement Queue using Linked List
- Implement Circular Queue
- Queue using Stacks
- Stack using Queues
- Design a Circular Deque
- Sliding Window Maximum (LeetCode 239)
- Rotten Oranges (LeetCode 994)
- Generate Binary Numbers 1 to N using Queue
- LRU Cache

---
## 📖 References
-[Queues](https://www.youtube.com/watch?v=lXIcS3qXGMY&t=56s)
- [Java Queue Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html)
