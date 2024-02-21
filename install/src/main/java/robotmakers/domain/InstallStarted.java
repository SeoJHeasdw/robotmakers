package robotmakers.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import robotmakers.domain.*;
import robotmakers.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class InstallStarted extends AbstractEvent {

    private Long id;

    public InstallStarted(Install aggregate) {
        super(aggregate);
    }

    public InstallStarted() {
        super();
    }
}
//>>> DDD / Domain Event
