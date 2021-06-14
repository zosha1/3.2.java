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

    public String getId() {
        return id;
    }

    public String getAuthorId() {
        return authorId;
    }

    public String getDate() {
        return date;
    }

    public String getText() {
        return text;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public LikeInfo getLikeInfo() {
        return likeInfo;
    }

    public int getViewCount() {
        return viewCount;
    }

    public int getRepostCount() {
        return repostCount;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public void setLikeInfo(LikeInfo likeInfo) {
        this.likeInfo = likeInfo;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    public void setRepostCount(int repostCount) {
        this.repostCount = repostCount;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }
}
