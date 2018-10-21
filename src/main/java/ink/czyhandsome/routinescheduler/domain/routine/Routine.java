package ink.czyhandsome.routinescheduler.domain.routine;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.Instant;
import java.util.UUID;

/**
 * 日常安排类
 *
 * @author 曹子钰, 2018/10/21
 */
@Entity
public class Routine {
    // id
    @Id
    private String id;

    // 创建时间
    @Convert(converter = Jsr310JpaConverters.InstantConverter.class)
    private Instant createTime;

    // 信息
    private String info;

    // 日程时间
    @Convert(converter = Jsr310JpaConverters.InstantConverter.class)
    private Instant dueTime;

    //********** 构造器 **********//

    /**
     * 创建一个日程
     *
     * @param info    提示信息
     * @param dueTime 日程时间
     */
    public Routine(String info, Instant dueTime) {
        this.id = UUID.randomUUID().toString();
        this.createTime = Instant.now();
        this.info = info;
        this.dueTime = dueTime;
    }

    @SuppressWarnings("unused")
    private Routine() {
        // Required by JPA
    }

    //********** getter **********//
    public String getId() {
        return id;
    }

    public Instant getCreateTime() {
        return createTime;
    }

    public String getInfo() {
        return info;
    }

    public Instant getDueTime() {
        return dueTime;
    }
}
