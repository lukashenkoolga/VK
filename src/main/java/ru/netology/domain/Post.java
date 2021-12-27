package ru.netology.domain;


import ru.netology.info.CommentsInfo;
import ru.netology.info.LikesInfo;
import ru.netology.info.RepostInfo;
import ru.netology.info.ViewsInfo;

public class Post {
    private int id;
    private int ownerId; // поле из документации
    private int date;
    private String text;
    private CommentsInfo commentsInfo; // в документации он типа object, под такой тип объекта мы создали отдельный класс CommentsInfo
    private LikesInfo likesInfo;
    private RepostInfo repostInfo;
    private ViewsInfo viewsInfo;
}