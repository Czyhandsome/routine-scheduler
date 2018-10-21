package ink.czyhandsome.routinescheduler.application.routine;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

/**
 * 添加日程的命令
 *
 * @author 曹子钰, 2018/10/21
 */
public class AddRoutineRequest {

    @NotEmpty
    private String info;
    @NotNull
    private Long dueTime;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Long getDueTime() {
        return dueTime;
    }

    public void setDueTime(Long dueTime) {
        this.dueTime = dueTime;
    }
}
