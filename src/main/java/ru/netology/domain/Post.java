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
    private CommentsInfo commentsInfo;
    private int ownerId;
    private int createdBy;
    private int replyOwnerId;
    private int replyPostId;
    private boolean friendsOnly;
    private String postType;
    private PostSource postSource;
    private int signerId;
    private boolean canPin;
    private boolean canDelete;
    private boolean canEdit;
    private boolean isPinned;
    private boolean markedAsAds;
    private boolean isFavorite;
    private Donut donut;
    private int postponedId;

    // + get/set на все поля
}
