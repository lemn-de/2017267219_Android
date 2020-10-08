## standard模式

点击两次standard按钮，再按三次返回键退出程序

![image-20201008214405230](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20201008214405230.png)



## singleTop模式

运行程序![image-20201008214725271](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20201008214725271.png)

点击button2进入到SecondActivity再点击singletop又重新进入到了FirstActivity

![image-20201008215134841](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20201008215134841.png)

按返回键回到SecondActivity，再按返回键则退出程序

![image-20201008215301735](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20201008215301735.png)



## singleTask模式

重新运行程序，在FirstActivity界面点击button进入到SecondActivity，然后再SecondActivity界面点击按钮，又会重新进入到FirstActivity。按下一次返回键则退出程序

![image-20201008220040733](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20201008220040733.png)

## singleInstance模式

![image-20201008213256535](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20201008213256535.png)

点击button2：![image-20201008213318378](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20201008213318378.png)

![image-20201008213353931](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20201008213353931.png)

![image-20201008213422402](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20201008213422402.png)

再点击button3：

![image-20201008213509854](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20201008213509854.png)

可以看到，SecondActivity的Task id不同于FirstActivity和ThirdActivity，这说明SecondActivity确实是存放在一个单独的返回栈里的，而且这个栈中只有SecondActivity这一个活动。

按下返回键发现ThirdActivity直接返回到了FirstActivity，再按下返回到了SecondActivity，再按下返回则退出了程序

![image-20201008214005045](C:\Users\Administrator\AppData\Roaming\Typora\typora-user-images\image-20201008214005045.png)