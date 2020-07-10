package pl.skrzypekjan.springdata.dao;

import pl.skrzypekjan.springdata.model.Video;

import java.util.List;

//CRUD
public interface VideoDao {

    void saveVideo(long id, String title);

    void updateVideo(Video newVideo);

    void deleteVideo(long id);

    List<Video> findAll();
}
