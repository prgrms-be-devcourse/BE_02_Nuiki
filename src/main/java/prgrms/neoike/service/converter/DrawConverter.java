package prgrms.neoike.service.converter;

import org.springframework.stereotype.Component;
import prgrms.neoike.domain.draw.Draw;
import prgrms.neoike.service.dto.drawdto.DrawResponse;
import prgrms.neoike.service.dto.drawdto.ServiceDrawSaveDto;
import prgrms.neoike.service.dto.drawticketdto.DrawTicketResponse;

@Component
public class DrawConverter {
    public Draw toDraw(ServiceDrawSaveDto drawSaveRequest) {
        return Draw.builder()
                .startDate(drawSaveRequest.startDate())
                .endDate(drawSaveRequest.endDate())
                .winningDate(drawSaveRequest.winningDate())
                .quantity(drawSaveRequest.quantity())
                .build();
    }

    public DrawResponse toDrawResponseDto(Long id) {
        return new DrawResponse(id);
    }

    public DrawTicketResponse toDrawTicketResponse(Long id) {
        return new DrawTicketResponse(id);
    }

}
