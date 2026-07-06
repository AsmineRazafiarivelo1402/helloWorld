package school.hei.course.endpoint.event.consumer.model;

import school.hei.course.PojaGenerated;
import school.hei.course.endpoint.event.model.PojaEvent;

@PojaGenerated
public record TypedEvent(String typeName, PojaEvent payload) {}
