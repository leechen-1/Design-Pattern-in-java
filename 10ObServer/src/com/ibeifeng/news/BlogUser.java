package com.ibeifeng.news;

import java.util.Observable;

public class BlogUser extends Observable {
	
	public void publishBlog(String articleTitle,String articleContent) {
		Article art = new Article();
		art.setArticleTitle(articleTitle);
		art.setArticleContent(articleContent);
		System.out.println("博主:发表新文章，文章标题:" + articleTitle + ",文章内容:" + articleContent);
		this.setChanged();
		this.notifyObservers(art);
	}
}
