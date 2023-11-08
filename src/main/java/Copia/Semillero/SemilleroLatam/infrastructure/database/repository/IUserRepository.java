package Copia.Semillero.SemilleroLatam.infrastructure.database.repository;

import Copia.Semillero.SemilleroLatam.infrastructure.database.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository <UserEntity, Long> {

}
