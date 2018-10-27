package com.ibeifeng.news;

import java.util.Observable;
import java.util.Observer;

public class MyObServer implements Observer {

	public void update(Observable o, Object arg) {
		Article art = (Article)arg;
		
		System.out.println("博主发表了新的文章，快去看吧!");
		System.out.println("博客标题为：" + art.getArticleTitle());
		System.out.println("博客内容为:" + art.getArticleContent());
	}

}
