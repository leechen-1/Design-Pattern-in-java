package com.ibeifeng.news;

public class MainClass {
	public static void main(String[] args) {
		BlogUser user = new BlogUser();
		user.addObserver(new MyObServer());
		user.publishBlog("哈哈，博客上线了", "大家多来访问");
	}
}
