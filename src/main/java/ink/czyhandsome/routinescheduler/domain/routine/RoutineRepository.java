package ink.czyhandsome.routinescheduler.domain.routine;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 日程仓库
 *
 * @author 曹子钰, 2018/10/21
 */
public interface RoutineRepository extends JpaRepository<Routine, String> {
}
