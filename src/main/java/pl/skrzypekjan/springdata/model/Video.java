package pl.skrzypekjan.springdata.model;

public class Video {

  private long videoId;
  private String title;

  public Video(long videoId, String title) {
    this.videoId = videoId;
    this.title = title;
  }

  public Video() {
  }

  public long getVideoId() {
    return videoId;
  }

  public void setVideoId(long videoId) {
    this.videoId = videoId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  @Override
  public String toString() {
    return "Video{" +
            "videoId=" + videoId +
            ", title='" + title + '\'' +
            '}';
  }

}
