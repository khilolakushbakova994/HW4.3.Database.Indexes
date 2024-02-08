package HW43.Database.Indexes.repository;


import HW43.Database.Indexes.model.Avatar;
import org.springframework.data.jpa.repository.JpaRepository;


public interface AvatarRepository extends JpaRepository<Avatar, Long> {
     //Avatar findAvatarById (Long studentId);
}