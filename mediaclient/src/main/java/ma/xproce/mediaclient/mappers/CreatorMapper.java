package ma.xproce.mediaclient.mappers;

import ma.xproce.mediaclient.dtos.CreatorDto;
import ma.xproce.mediaclient.dtos.VideoDto;
import org.modelmapper.ModelMapper;
import org.xproce.lab.Creator;
import org.xproce.lab.UploadVideoRequest;
import org.xproce.lab.Video;

public class CreatorMapper {
    private ModelMapper mapper = new ModelMapper();

    public CreatorDto fromCreatorProtoToCreatorDto(Creator creator) {
        return this.mapper.map(creator, CreatorDto.class);
    }
}
