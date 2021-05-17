package th.ku.message.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import th.ku.message.model.Message;


@Repository
public interface MessageRepository extends JpaRepository<Message,Long> {

}
