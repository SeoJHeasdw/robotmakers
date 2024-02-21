package robotmakers.domain;

import java.util.*;
import lombok.*;
import robotmakers.domain.*;
import robotmakers.infra.AbstractEvent;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long id;
}
