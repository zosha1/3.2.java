package ru.netology.domain;

public class Post {
    private String id;
    private String authorId;
    private String date;
    private String text;
    private String imageUrl;
    private String videoUrl;
    private LikeInfo likeInfo;
    private int viewCount;
    private int repostCount;
    private CommentsInfo commentsInfo;
}
