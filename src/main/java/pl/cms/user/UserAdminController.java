package pl.cms.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.cms.post.Post;
import pl.cms.post.PostRepository;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class UserAdminController {

    @Autowired
    private PostRepository postRepository;



}
