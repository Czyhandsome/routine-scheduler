package ink.czyhandsome.routinescheduler.application.routine;

import ink.czyhandsome.routinescheduler.domain.routine.Routine;
import ink.czyhandsome.routinescheduler.domain.routine.RoutineRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;
import java.util.Objects;

import static java.util.stream.Collectors.toList;

/**
 * 日程服务类
 *
 * @author 曹子钰, 2018/10/21
 */
@Service
public class RoutineService {
    private static final Logger logger = LoggerFactory.getLogger(RoutineService.class);

    //********** 依赖注入 **********//
    private final RoutineRepository routineRepository;

    public RoutineService(RoutineRepository routineRepository) {
        this.routineRepository = routineRepository;
    }

    /**
     * 读取所有的日程
     */
    public List<RoutineView> findAll() {
        return routineRepository.findAll()
                .stream()
                .map(RoutineView::fromEntity)
                .filter(Objects::nonNull)
                .collect(toList());
    }

    /**
     * 创建一个日程
     */
    public void addRoutine(AddRoutineRequest addRoutineRequest) {
        Routine routine = new Routine(
                addRoutineRequest.getInfo(),
                Instant.ofEpochMilli(addRoutineRequest.getDueTime())
        );
        this.routineRepository.save(routine);
        logger.info("创建日程: {}", routine);
    }
}
