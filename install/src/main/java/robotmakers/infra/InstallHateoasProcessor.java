package robotmakers.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import robotmakers.domain.*;

@Component
public class InstallHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Install>> {

    @Override
    public EntityModel<Install> process(EntityModel<Install> model) {
        return model;
    }
}
