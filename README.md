# Java-Food-Ordering-App

## Projects
[Food Ordering App](https://github.com/YangTris/Java-Food-Ordering-App) 

|**Description project**| Food Ordering App: Your go-to solution for efficient order management and seamless food ordering. With its sleek interface and real-time updates, businesses can effortlessly handle orders and track their progress.|
|---------------------|----------------|
| **Technologies used** | Java, APIs (Firebase, Google Maps), Git, VS Code |
| **Team size**         |  3 members |
| **Time start - Time end**         |  Feb 2024 - Present |
| **My responsibility**      | • Payment with VnPay  <br> • Call to Firebase API <br> • Authentication <br> • Cloud Messaging <br> • CRUD API |
| **Learning from project** | • Learned how to use Java in conjunction with backend databases and APIs <br> • Integrated E-wallets API <br> • Integrated Google Maps API  |
| **Github**              |        [![View on GitHub](https://img.shields.io/badge/GitHub-View_on_GitHub-blue?logo=GitHub)](https://github.tcom/YangTris/Order-App)        |

## How to start?

- Clone the Repository

```
git clone https://github.com/YangTris/Java-Food-Ordering-App
```

- Start the Server

```
python server.py
```

- Start two players and enter the IP address. If both the players are on same host, use the loopback IP `127.0.0.1` or `localhost`.

  - Player 1

  ```
  python player.py
  pygame 2.5.2
  Hello from the pygame community. https://www.pygame.org/contribute.html
  You are player 1
  ```

  - Player 2

  ```
  python player.py
  pygame 2.5.2
  Hello from the pygame community. https://www.pygame.org/contribute.html
  You are player 2
  ```

- Now you can start playing Tic Tac Toe over a network.

---

## Report PDF

[Report pdf](ReportOSSD.pdf)

## The rule

Giống như Cờ Caro thông thường, Ultimate Tic-Tac-Toe là trò chơi dành cho 2 người chơi
(X và O), chơi theo lượt, bắt đầu với người chơi X. <br>

#### Trò chơi bắt đầu như thế nào? <br>

• Người chơi X được đánh dấu X của mình vào bất kỳ ô trống nào trong tổng số 81 ô trống
trên bàn cờ lớn. <br>
• Lượt tiếp theo, đối thủ (O) bị buộc phải đánh dấu vào ô trống trong bàn cờ nhỏ tương ứng
với vị trí mà X vừa đánh dấu trên bàn cờ lớn. Ví dụ: nếu X đánh dấu vào ô trống phía
trên bên phải của một bàn cờ nhỏ (3x3), thì O phải đánh dấu vào bàn cờ nhỏ nằm ở phía
trên bên phải của bàn cờ lớn. <br>
• Người chơi đánh dấu vào bất kỳ ô trống nào trong bàn cờ nhỏ được chọn sẽ xác định bàn
cờ nhỏ nào mà người chơi kia phải đánh dấu vào lượt tiếp theo.
Chiến thắng một ô nhỏ: <br>
• Nếu một nước đi tạo thành một hàng ngang, dọc hoặc chéo gồm 3 ký hiệu giống nhau theo
luật chơi của Cờ Caro thông thường trong một bàn cờ nhỏ, thì toàn bộ bàn cờ nhỏ đó được
đánh dấu là đã thắng bởi người chơi đó trên bàn cờ lớn. <br>
• Một khi một bàn cờ nhỏ đã được một người chơi thắng hoặc được đánh dấu đầy đủ, thì
không thể đánh thêm bất kỳ nước đi nào vào bàn cờ đó nữa. <br>

#### Nếu bị "gửi" đến một bàn cờ đã thắng hoặc đầy: <br>

Nếu một người chơi bị "gửi" đến một bàn cờ nhỏ đã được thắng hoặc đầy đủ, thì người chơi đó
có thể đánh dấu vào bất kỳ bàn cờ nhỏ nào khác trên bàn cờ lớn. <br>

#### Kết thúc trò chơi: <br>

Trò chơi kết thúc khi một trong hai người chơi thắng trên bàn cờ lớn (bằng cách tạo thành một
hàng ngang, dọc hoặc chéo gồm 3 bàn cờ nhỏ đã thắng của mình) hoặc không còn nước đi hợp
lệ nào còn lại. Trong trường hợp không còn nước đi hợp lệ, trò chơi được tuyên bố là hòa. <br>

## Screenshots

### Game play

![Game play](images/gameplay.png)

### X's win

![X's win](images/player1.png)

### O's win

![O's win](images/player2.png)

### Chat box

![Chat box](images/chatbox.png)

### Tie game

![Tie game](images/tiegame.jpg)
