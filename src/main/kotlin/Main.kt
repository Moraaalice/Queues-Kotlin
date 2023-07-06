 fun main(){
  var queue = Queue(5)
  queue.dequeue()
  queue.enqueue(1)
  queue.enqueue(2)
  queue.enqueue(3)
  queue.dequeue()
  queue.display()
  queue.enqueue(45)
  queue.enqueue(32)
  queue.enqueue(64)
  queue.enqueue(32)
  queue.display()

 }
 class Queue(var capacity:Int){
  var data = IntArray(capacity)
  var front = 0
  var rear = 0

  fun enqueue(value:Int){
   if (isFull()){
    println("Queue is full")
    return
   }
   data[rear] = value
   rear ++
  }
  fun dequeue():Int?{
   if (isEmpty()){
    println("Queue is empty ")
    return null
   }
   var removed = data[front]
   for (i in front until rear-1){
    data[i] = data[i + 1]
   }
   rear--
   return removed
  }

  fun peek():Int?{
   if (isEmpty()){
    return  null
   }
   return data[front]
  }


  fun isEmpty():Boolean{
   return  front==rear
  }

  fun isFull():Boolean{
   return rear== capacity
  }

  fun display(){
   if (isEmpty()){
    return
   }
   for (i in front until rear){
    println(data[i])
   }
  }

 }