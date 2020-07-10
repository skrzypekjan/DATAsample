package pl.skrzypekjan.springdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.skrzypekjan.springdata.dao.VideoDao;
import pl.skrzypekjan.springdata.model.Video;

@Component
public class Start {

    private VideoDao videoDao;

    @Autowired
    public Start(VideoDao videoDao) {
        this.videoDao = videoDao;
//        videoDao.saveVideo(1L, "Szybcy i Wściekli");
//        videoDao.saveVideo(2L, "Szybcy i Wściekli 2");
//        videoDao.saveVideo(3L, "Matrix");
//        videoDao.saveVideo(4L, "Kac Vegas");

//        videoDao.updateVideo(new Video(4L, "Kac Vegas 222"));
//        videoDao.deleteVideo(2L);
        videoDao.findAll().forEach(System.out::println);
    }
}
