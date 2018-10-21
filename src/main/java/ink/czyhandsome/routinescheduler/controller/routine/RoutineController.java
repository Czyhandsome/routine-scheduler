package ink.czyhandsome.routinescheduler.controller.routine;

import ink.czyhandsome.routinescheduler.application.routine.AddRoutineRequest;
import ink.czyhandsome.routinescheduler.application.routine.RoutineService;
import ink.czyhandsome.routinescheduler.application.routine.RoutineView;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * 日程控制器
 *
 * @author 曹子钰, 2018/10/21
 */
@RestController
@RequestMapping("/api/routines")
public class RoutineController {
    private final RoutineService routineService;

    public RoutineController(RoutineService routineService) {
        this.routineService = routineService;
    }

    /**
     * 获取所有日程
     */
    @GetMapping
    public List<RoutineView> getAll() {
        return this.routineService.findAll();
    }

    /**
     * 添加一个日程
     */
    @PostMapping
    public void createRoutine(@RequestBody @Valid @NotNull AddRoutineRequest addRoutineRequest) {
        routineService.addRoutine(addRoutineRequest);
    }
}
