package pl.skrzypekjan.springdata.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.skrzypekjan.springdata.dao.VideoDao;

@Controller
@RequestMapping
public class VideoController {


    private final VideoDao videoDao;

    public VideoController(VideoDao videoDao) {
        this.videoDao = videoDao;
    }

    @GetMapping
    public String showList(Model model){
        model.addAttribute("videos", videoDao.findAll());
        return "video";
    }
}
