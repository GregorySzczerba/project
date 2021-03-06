package pl.cms.post;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;
import pl.cms.category.Category;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    Post findPostById(Long id);

    List<Post> findAllByCategoryId(Long id);

    List<Post> findAllByUserEmailAndModeratedIsTrue(String email);

    List<Post> findAllByUserEmail(String email);

    List<Post> findAllByUserEmailAndModeratedIsFalse(String email);

    List<Post> findAllByModeratedIsFalse();

    List<Post> findAllByModeratedIsTrue();

    List<Post> findAllByCategoryIdAndModeratedIsTrue(Long id);

    List<Post> findAllByUserId(Long id);

}
