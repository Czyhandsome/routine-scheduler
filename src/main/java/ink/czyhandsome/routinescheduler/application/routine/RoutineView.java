package ink.czyhandsome.routinescheduler.application.routine;

import ink.czyhandsome.routinescheduler.domain.routine.Routine;

/**
 * 日程视图
 *
 * @author 曹子钰, 2018/10/21
 */
public class RoutineView {

    private String id;
    private String createTime;
    private String dueTime;

    public static RoutineView fromEntity(Routine routine) {
        if (routine == null) {
            return null;
        }
        RoutineView view = new RoutineView();
        view.setId(routine.getId());
        view.setCreateTime(routine.getCreateTime().toString());
        view.setDueTime(routine.getDueTime().toString());
        return view;
    }

    //***** getter setter *****//
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getDueTime() {
        return dueTime;
    }

    public void setDueTime(String dueTime) {
        this.dueTime = dueTime;
    }
}
