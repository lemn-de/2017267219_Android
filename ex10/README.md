## 服务

### 启动和停止服务

![image-20201203231602328](res/image-20201203231602328.png)

启动服务：

![image-20201203231615697](res/image-20201203231615697.png)

在设置中可以找到

![image-20201203231840557](res/image-20201203231840557.png)

点击停止服务：

![image-20201203231925924](res/image-20201203231925924.png)



### 服务代码运行在显示子线程

![image-20201213195651591](res/image-20201213195651591.png)

点击start intentservice

![image-20201213195743865](res/image-20201213195743865.png)

可以看到，MyIntentService和MainActivity所在的线程id不一样。



### 子服务的绑定，子服务代码运行在异步任务

![image-20201213213820920](res/image-20201213213820920.png)

绑定服务

![image-20201213213709186](res/image-20201213213709186.png)

![image-20201213213855359](res/image-20201213213855359.png)

点击bind service

![image-20201213213924477](res/image-20201213213924477.png)

![image-20201213213933212](res/image-20201213213933212.png)

可以看到，首先是MyService的onCreate()方法得到了执行，然后startDownload()和getProgress()方法都得到了执行。

点击unbind service:

![image-20201213214129635](res/image-20201213214129635.png)

服务被取消绑定