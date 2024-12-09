In Java, Stack is indeed a 𝐋𝐚𝐬𝐭 𝐈𝐧 𝐅𝐢𝐫𝐬𝐭 𝐎𝐮𝐭 (𝐋𝐈𝐅𝐎) 𝐜𝐨𝐥𝐥𝐞𝐜𝐭𝐢𝐨𝐧. This means that the last element you've pushed (added) onto the stack is the first one to be popped (removed) when retrieving elements. 🔄

Stack does fall under the Java Collection hierarchy as a child class of Vector.

Vector extends AbstractList, and AbstractList implements List interface methods.

So, in the Java context, it's appropriate to say that Stack is an extension of List. 📚

When it comes to interacting with a Stack, here are the various methods that come into play:

𝐩𝐮𝐬𝐡(): To add an element to the top of the stack. 📤
𝐩𝐨𝐩(): To remove the element from the top of the stack. 📥
𝐩𝐞𝐞𝐤(): To observe the top value of the stack without removing it. 👀
𝐢𝐬𝐄𝐦𝐩𝐭𝐲(): To check whether the stack is empty or not. 🤔
𝐬𝐞𝐚𝐫𝐜𝐡(): To find the position of an element in the stack with respect to the top element. 🔍

Let us understand practically


𝐈𝐬 𝐒𝐭𝐚𝐜𝐤 𝐄𝐟𝐟𝐢𝐜𝐢𝐞𝐧𝐭?

Since Stack extends Vector and Vector's methods are synchronized, this could lead to some performance overhead, especially in single-threaded scenarios where thread safety is not a concern. 🐌

𝐀𝐥𝐭𝐞𝐫𝐧𝐚𝐭𝐢𝐯𝐞 𝐭𝐨 𝐒𝐭𝐚𝐜𝐤:
ArrayDeque is indeed a fantastic alternative! It's part of the Java Collections Framework and provides you with the flexibility to use it both as a stack and a queue, without the synchronized overhead—making it a popular choice for better performance. 💨

Cheers, and keep the joy of learning and coding alive! 😄🎉👨‍💻

Best regards,
PrinceAutomationDestination